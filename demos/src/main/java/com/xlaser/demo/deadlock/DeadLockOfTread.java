package com.xlaser.demo.deadlock;

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
@Slf4j
public class DeadLockOfTread {
	/**
	 * 锁对象A
	 */
	private static final Object LOCK_A = new Object();

	/**
	 * 锁对象B
	 */
	private static final Object LOCK_B = new Object();

	public static void main(String[] args) {
		// 线程执行后: 俩个线程互相需要a,b对象,造成死锁
		new TaskA().start();
		new TaskB().start();
	}

	/**
	 * 构建线程任务,先锁a对象,然后睡眠5s给线程b时间去锁b对象
	 */
	private static class TaskA extends Thread {
		@Override
		public void run() {
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
		}
	}

	/**
	 * 构建线程任务,先锁b对象,然后睡眠5s给线程a时间去锁a对象
	 */
	private static class TaskB extends Thread {
		@Override
		public void run() {
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
		}
	}
}
