package com.sola.github.domain;

import rx.Scheduler;

/**
 * Created by slove
 * 2016/12/19.
 */
public interface UIExecutorThread {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    Scheduler getScheduler();

}