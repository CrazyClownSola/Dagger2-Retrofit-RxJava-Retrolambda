package com.sola.github.dagger2demo.di.base;

import com.sola.github.dagger2demo.di.subs.MainActivityComponent;
import com.sola.github.dagger2demo.di.scope.SubMapKey;
import com.sola.github.dagger2demo.di.subs.CompoundJumpActivityComponent;
import com.sola.github.dagger2demo.di.subs.DataBaseComponent;
import com.sola.github.dagger2demo.di.subs.TestActivityComponent;
import com.sola.github.dagger2demo.enums.ESubType;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by slove
 * 2016/12/14.
 * 作为Component组件绑定关系用的Module
 */
@Module(
        subcomponents = {
                TestActivityComponent.class,
                DataBaseComponent.class,
                MainActivityComponent.class,
                CompoundJumpActivityComponent.class
        }
)
@SuppressWarnings("unused")
public abstract class SubComponentBindingModule {
    // ===========================================================
    // Constants
    // ===========================================================

    // ===========================================================
    // Fields
    // ===========================================================

    // ===========================================================
    // Constructors
    // ===========================================================

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass/Interfaces
    // ===========================================================

    @IntoMap // 将这个实例绑定到 MainApplication所持有的实例Map中去
    @Binds
    @SubMapKey(type = ESubType.TYPE_DB, index = 1)
    abstract SubComponentBuilder dataBaseComponentBuilder(DataBaseComponent.Builder builder);

    @IntoMap // 将这个实例绑定到 MainApplication所持有的实例Map中去
    @Binds
    @SubMapKey(type = ESubType.TYPE_ACTIVITY, index = 1)
    abstract SubComponentBuilder testActivityComponentBuilder(TestActivityComponent.Builder builder);

    @IntoMap // 将这个实例绑定到 MainApplication所持有的实例Map中去
    @Binds
    @SubMapKey(type = ESubType.TYPE_ACTIVITY, index = 2)
    abstract SubComponentBuilder mainActivityComponentBuilder(MainActivityComponent.Builder builder);

    @IntoMap
    @Binds
    @SubMapKey(type = ESubType.TYPE_ACTIVITY, index = 3)
    abstract SubComponentBuilder compoundJumpComponentBuilder(CompoundJumpActivityComponent.Builder builder);

    // ===========================================================
    // Methods
    // ===========================================================

    // ===========================================================
    // Inner and Anonymous Classes
    // ===========================================================

}
