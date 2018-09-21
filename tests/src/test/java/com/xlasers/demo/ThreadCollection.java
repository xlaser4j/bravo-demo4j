package com.xlasers.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * The type Thread collection.
 *
 * @package: com.xlasers.demo
 * @author: Elijah.D
 * @time: CreateAt 2018/9/21 && 12:46
 * @description: 线程类demo
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
@Slf4j
class ThreadCollection {
    /**
     * Test case 1.
     *
     * <P>线程锁机制
     */
    @Test
    void testCase1() {
        Task task = new Task();
        (new Thread(task)).start();

        log.info("【thread-before】 flag: {}", task.isFlag());

        //发生死循环 TODO
        while (true) {
            if (task.isFlag()) {
                log.info("【thread-after】 flag: {}", task.isFlag());
                break;
            }
        }
    }

    /**
     * The type Task.
     */
    class Task implements Runnable {
        private boolean flag = false;

        /**
         * Is flag boolean.
         *
         * @return the boolean
         */
        public boolean isFlag() {
            return flag;
        }

        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            flag = true;
            log.info("【thread】 flag = {}", isFlag());
        }
    }
}
