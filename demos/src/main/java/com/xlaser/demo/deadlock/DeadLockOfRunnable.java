package com.xlaser.demo.deadlock;

import java.util.concurrent.*;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 一个死锁小demo
 * </p>
 *
 * <code>通过jps查找进程id,然后jstack -l pid查看死锁信息</code>
 *
 * <code>通过jvisualvm命令,图形化界面查看你对应进程的死锁信息</code>
 *
 * @package: com.xlaser.demo.deadlock
 * @author: Elijah.D
 * @time: CreateAt 2019/5/21 && 10:50
 * @description: java程序手动创造死锁
 * @copyright: Copyright © 2018 xlaser
 * @version: V1.0
 * @modified: Elijah.D
 */
@SuppressWarnings("Duplicates")
@Slf4j
public class DeadLockOfRunnable {
	/**
	 * 锁对象A
	 */
	private static final Object LOCK_A = new Object();

	/**
	 * 锁对象B
	 */
	private static final Object LOCK_B = new Object();

	private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().setNameFormat("demo-pool-%d").build();

	/**
	 * 此处要想发生死锁,线程池核心数必须大于2
	 */
	private static ExecutorService fixThreadPool = new ThreadPoolExecutor(2, 3, 500L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
	//private ScheduledThreadPoolExecutor columnExecutor = new ScheduledThreadPoolExecutor(100, new BasicThreadFactory.Builder().namingPattern("Column-Thread-%d").build());

	public static void main(String[] args) {
		run();
	}

	/**
	 * 线程执行后: 俩个线程互相需要a,b对象,造成死锁
	 */
	private static void run() {
		fixThreadPool.execute(() -> {
			try {
				synchronized (LOCK_A) {
					log.info("{}-获取锁对象A !", Thread.currentThread());
					Thread.sleep(5000);
					log.info("{}-睡眠结束 !", Thread.currentThread());
					synchronized (LOCK_B) {
						log.info("{}-获取锁对象B !", Thread.currentThread());
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		fixThreadPool.execute(() -> {
			try {
				synchronized (LOCK_B) {
					log.info("{}-获取锁对象B !", Thread.currentThread());
					Thread.sleep(5000);
					log.info("{}-睡眠结束 !", Thread.currentThread());
					synchronized (LOCK_A) {
						log.info("{}-获取锁对象A !", Thread.currentThread());
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});

		fixThreadPool.shutdown();
	}
}
