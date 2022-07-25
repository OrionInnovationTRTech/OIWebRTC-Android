/*
 *  Copyright 2013 The WebRTC project authors. All Rights Reserved.
 *
 *  Use of this source code is governed by a BSD-style license
 *  that can be found in the LICENSE file in the root of the source
 *  tree. An additional intellectual property rights grant can be found
 *  in the file PATENTS.  All contributing project authors may
 *  be found in the AUTHORS file in the root of the source tree.
 */

package com.orioninnovation.tr.oiwebrtc;

/** Interface for observing Stats reports (see webrtc::StatsObservers). */
public interface StatsObserver {
  /** Called when the reports are ready.*/
  @CalledByNative public void onComplete(StatsReport[] reports);
}
