package com.bumptech.sdk;

import com.bumptech.sdk.ActivityHandler;
import com.bumptech.sdk.AdjustConfig;
import com.bumptech.sdk.IRunActivityHandler;
import com.bumptech.sdk.LogLevel;

/**
 * Created by pfms on 09/08/2016.
 */
public class StateActivityHandlerConstructor {
    AdjustConfig config;
    boolean startEnabled = true;
    boolean isToUpdatePackages = false;

    StateActivityHandlerConstructor(AdjustConfig config) {
        this.config = config;
    }
}
