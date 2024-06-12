package com.bumptech.sdk.samsung;

import android.content.Context;

import com.bumptech.sdk.ILogger;
import com.bumptech.sdk.ReferrerDetails;

public class Util {
   public synchronized static ReferrerDetails getSamsungInstallReferrerDetails(Context context, ILogger logger) {
      if (!AdjustSamsungReferrer.shouldReadSamsungReferrer) {
         return null;
      }

      com.samsung.android.sdk.sinstallreferrer.api.ReferrerDetails referrerDetails =
              SamsungReferrerClient.getReferrer(context, logger, 3000);
      if (referrerDetails == null) {
         return null;
      }

      return new ReferrerDetails(referrerDetails.getInstallReferrer(),
                                 referrerDetails.getReferrerClickTimestampSeconds(),
                                 referrerDetails.getInstallBeginTimestampSeconds());
   }
}
