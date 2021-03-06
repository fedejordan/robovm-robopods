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
package org.robovm.pods.firebase.remoteconfig;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FIRRemoteConfigSettings/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class FIRRemoteConfigSettingsPtr extends Ptr<FIRRemoteConfigSettings, FIRRemoteConfigSettingsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(FIRRemoteConfigSettings.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public FIRRemoteConfigSettings() {}
    protected FIRRemoteConfigSettings(Handle h, long handle) { super(h, handle); }
    protected FIRRemoteConfigSettings(SkipInit skipInit) { super(skipInit); }
    /**
     * @deprecated This no longer needs to be set during development. Refer to documentation for additional details.
     */
    @Deprecated
    @Method(selector = "initWithDeveloperModeEnabled:")
    public FIRRemoteConfigSettings(boolean developerModeEnabled) { super((SkipInit) null); initObject(init(developerModeEnabled)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "minimumFetchInterval")
    public native double getMinimumFetchInterval();
    @Property(selector = "setMinimumFetchInterval:")
    public native void setMinimumFetchInterval(double v);
    @Property(selector = "fetchTimeout")
    public native double getFetchTimeout();
    @Property(selector = "setFetchTimeout:")
    public native void setFetchTimeout(double v);
    /**
     * @deprecated This no longer needs to be set during development. Refer to documentation for additional details.
     */
    @Deprecated
    @Property(selector = "isDeveloperModeEnabled")
    public native boolean isDeveloperModeEnabled();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @deprecated This no longer needs to be set during development. Refer to documentation for additional details.
     */
    @Deprecated
    @Method(selector = "initWithDeveloperModeEnabled:")
    protected native @Pointer long init(boolean developerModeEnabled);
    /*</methods>*/
}
