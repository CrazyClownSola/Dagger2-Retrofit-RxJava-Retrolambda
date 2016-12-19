package com.sola.github.data.entity.net;

import com.sola.github.data.entity.BaseResultEntity;

/**
 * Created by zhangluji
 * 2016/12/19.
 */
@SuppressWarnings("unused")
public class ABaseResponseEntity<T> extends BaseResultEntity {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    private T data;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    public T getData() {
        return data;
    }

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}