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
package org.robovm.pods.facebook.places;

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
import org.robovm.apple.corelocation.*;
import org.robovm.pods.facebook.core.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/FBSDKPlacesResponseKey/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(FBSDKPlacesResponseKey.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCity", optional=true)
    public static native NSString City();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCityID", optional=true)
    public static native NSString CityID();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCountry", optional=true)
    public static native NSString Country();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyCountryCode", optional=true)
    public static native NSString CountryCode();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyLatitude", optional=true)
    public static native NSString Latitude();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyLongitude", optional=true)
    public static native NSString Longitude();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyRegion", optional=true)
    public static native NSString Region();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyRegionID", optional=true)
    public static native NSString RegionID();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyState", optional=true)
    public static native NSString State();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyStreet", optional=true)
    public static native NSString Street();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyZip", optional=true)
    public static native NSString Zip();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyMatchedCategories", optional=true)
    public static native NSString MatchedCategories();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyPhotoSource", optional=true)
    public static native NSString PhotoSource();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyData", optional=true)
    public static native NSString Data();
    @GlobalValue(symbol="FBSDKPlacesResponseKeyUrl", optional=true)
    public static native NSString Url();
    /*</methods>*/
}
