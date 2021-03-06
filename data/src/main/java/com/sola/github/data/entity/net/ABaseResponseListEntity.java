package com.sola.github.data.entity.net;

import com.sola.github.data.entity.BaseResultEntity;

import java.util.List;

/**
 * Created by Sola
 * 2016/12/19.
 */
@SuppressWarnings("unused")
public class ABaseResponseListEntity<T> extends BaseResultEntity {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    private List<T> data;

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    public List<T> getData() {
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
