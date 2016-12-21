package com.sola.github.dagger2demo.ui.params;

import com.sola.github.tools.delegate.IRecyclerViewDelegate;
import com.sola.github.tools.utils.TypeBuilder;

/**
 * Created by zhangluji
 * 2016/12/20.
 */
abstract class BaseViewDTO<T> implements IRecyclerViewDelegate {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    protected T data;

    // ===========================================================
    // Constructors
    // ===========================================================

    BaseViewDTO(T data) {
        this.data = data;
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @Override
    public int getViewType(int position) {
        return TypeBuilder.getInstance().generateId();
    }

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
