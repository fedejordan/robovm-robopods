/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.pods.applovinsdk;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/ALAdRewardDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements ALAdRewardDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("rewardValidationRequestForAd:didSucceedWithResponse:")
    public void didSucceed(ALAd ad, NSDictionary<?, ?> response) {}
    @NotImplemented("rewardValidationRequestForAd:didExceedQuotaWithResponse:")
    public void didExceedQuota(ALAd ad, NSDictionary<?, ?> response) {}
    @NotImplemented("rewardValidationRequestForAd:wasRejectedWithResponse:")
    public void wasRejected(ALAd ad, NSDictionary<?, ?> response) {}
    @NotImplemented("rewardValidationRequestForAd:didFailWithError:")
    public void didFail(ALAd ad, @MachineSizedSInt long responseCode) {}
    /**
     * @deprecated Users will no longer be able to receive rewarded video prompts.
     */
    @Deprecated
    @NotImplemented("userDeclinedToViewAd:")
    public void userDeclinedToViewAd(ALAd ad) {}
    /*</methods>*/
}
