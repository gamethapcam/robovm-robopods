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
package org.robovm.pods.bolts;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library(Library.INTERNAL) @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BFTask/*</name>*/ <T>
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BFTaskPtr extends Ptr<BFTask, BFTaskPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BFTask.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public BFTask() {}
    protected BFTask(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    public T getResult() {
        return (T) getResult0();
    }
    /*<properties>*/
    @Property(selector = "result")
    protected native NSObject getResult0();
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "exception")
    public native NSException getException();
    @Property(selector = "isCancelled")
    public native boolean isCancelled();
    @Property(selector = "isFaulted")
    public native boolean isFaulted();
    @Property(selector = "isCompleted")
    public native boolean isCompleted();
    /*</properties>*/
    /*<members>*//*</members>*/
    public <TContinuationResult> BFTask<TContinuationResult> continueWith(final BFContinuation<T, TContinuationResult> continuation) {
        return continueWith(new Block1<BFTask, NSObject>() {
            @Override
            public NSObject invoke(BFTask task) {
                return (NSObject) continuation.then(task);
            }
        });
    }
    public <TContinuationResult> BFTask<TContinuationResult> continueWith(BFExecutor executor, final BFContinuation<T, TContinuationResult> continuation) {
        return continueWith(executor, new Block1<BFTask, NSObject>() {
            @Override
            public NSObject invoke(BFTask task) {
                return (NSObject) continuation.then(task);
            }
        });
    }
    public <TContinuationResult> BFTask<TContinuationResult> continueOnSuccess(final BFContinuation<T, TContinuationResult> continuation) {
        return continueOnSuccess(new Block1<BFTask, NSObject>() {
            @Override
            public NSObject invoke(BFTask task) {
                return (NSObject) continuation.then(task);
            }
        });
    }
    public <TContinuationResult> BFTask<TContinuationResult> continueOnSuccess(BFExecutor executor, final BFContinuation<T, TContinuationResult> continuation) {
        return continueOnSuccess(executor, new Block1<BFTask, NSObject>() {
            @Override
            public NSObject invoke(BFTask task) {
                return (NSObject) continuation.then(task);
            }
        });
    }
    
    public static <T> BFTask<T> createForResult(T result) {
        return createForResult((NSObject)result);
    }
    public static <T> BFTask<T> create(BFExecutor executor, Block0<T> block) {
        return create0(executor, (Block0<NSObject>) block);
    }
    /*<methods>*/
    @Method(selector = "continueWithBlock:")
    protected native <TContinuationResult> BFTask<TContinuationResult> continueWith(@Block Block1<BFTask, NSObject> block);
    @Method(selector = "continueWithExecutor:withBlock:")
    protected native <TContinuationResult> BFTask<TContinuationResult> continueWith(BFExecutor executor, @Block Block1<BFTask, NSObject> block);
    @Method(selector = "continueWithSuccessBlock:")
    protected native <TContinuationResult> BFTask<TContinuationResult> continueOnSuccess(@Block Block1<BFTask, NSObject> block);
    @Method(selector = "continueWithExecutor:withSuccessBlock:")
    protected native <TContinuationResult> BFTask<TContinuationResult> continueOnSuccess(BFExecutor executor, @Block Block1<BFTask, NSObject> block);
    @Method(selector = "waitUntilFinished")
    public native void waitUntilFinished();
    @Method(selector = "taskWithResult:")
    protected static native <T> BFTask<T> createForResult(NSObject result);
    @Method(selector = "taskWithError:")
    protected static native <T> BFTask<T> createForError(NSError error);
    @Method(selector = "taskWithException:")
    protected static native <T> BFTask<T> createForException(NSException exception);
    @Method(selector = "cancelledTask")
    public static native <T> BFTask<T> createCancelled();
    @Method(selector = "taskForCompletionOfAllTasks:")
    public static native <T> BFTask<Void> createForCompletionOfAllTasks(NSArray<BFTask<T>> tasks);
    @Method(selector = "taskForCompletionOfAllTasksWithResults:")
    public static native <T extends NSObject> BFTask<NSArray<T>> createForCompletionOfAllTasksWithResults(NSArray<BFTask<T>> tasks);
    @Method(selector = "taskWithDelay:")
    public static native BFTask<Void> createWithDelay(int millis);
    @Method(selector = "taskFromExecutor:withBlock:")
    protected static native <T> BFTask<T> create0(BFExecutor executor, @Block Block0<NSObject> block);
    /*</methods>*/
}
