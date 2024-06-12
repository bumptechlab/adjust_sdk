package com.bumptech.sdk.vivo;

import android.content.Context;

import com.bumptech.sdk.ILogger;
import com.bumptech.sdk.ReferrerDetails;

public class Util {
   public synchronized static ReferrerDetails getVivoInstallReferrerDetails(Context context, ILogger logger) {
      if (!AdjustVivoReferrer.shouldReadVivoReferrer) {
         return null;
      }

      return VivoReferrerClient.getReferrer(context, logger);
   }
}
