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
package org.robovm.pods.pollfish;

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
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL)/*</annotations>*/
public enum /*<name>*/MaritalStatus/*</name>*/ implements ValuedEnum {
    /*<values>*/
    SINGLE(0L),
    MARRIED(1L),
    DIVORCED(2L),
    LIVING_WITH_PARTNER(3L),
    SEPARATED(4L),
    WIDOWED(5L),
    PREFER_NOT_TO_SAY(6L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(MaritalStatus.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    @Bridge(symbol="MARITAL_STATUS", optional=true)
    protected static native NSString asString0(MaritalStatus marital_status);
    /*</methods>*/

    public NSString asString() {
        return asString0(this);
    }

    private final long n;

    private /*<name>*/MaritalStatus/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MaritalStatus/*</name>*/ valueOf(long n) {
        for (/*<name>*/MaritalStatus/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MaritalStatus/*</name>*/.class.getName());
    }
}
