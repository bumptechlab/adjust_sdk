package com.bumptech.sdk.network;

import com.bumptech.sdk.ActivityPackage;
import com.bumptech.sdk.ResponseData;

import java.util.Map;

public interface IActivityPackageSender {
    interface ResponseDataCallbackSubscriber {
        void onResponseDataCallback(ResponseData responseData);
    }

    void sendActivityPackage(ActivityPackage activityPackage,
                             Map<String, String> sendingParameters,
                             ResponseDataCallbackSubscriber responseCallback);

    ResponseData sendActivityPackageSync(ActivityPackage activityPackage,
                             Map<String, String> sendingParameters);
}
