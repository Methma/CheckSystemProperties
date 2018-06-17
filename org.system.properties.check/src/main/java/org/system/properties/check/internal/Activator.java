/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.system.properties.check.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.system.properties.check.ScheduledTask;

import java.util.Timer;

/**
 * This is a sample bundle activator class.
 *
 * @since 1.0.0
 */
public class Activator implements BundleActivator {

    Log log = LogFactory.getLog(ScheduledTask.class);
    private ScheduledTask scheduledTask;

    /**
     * This is called when the bundle is started.
     *
     * @param bundleContext BundleContext of this bundle
     * @throws Exception Could be thrown while bundle starting
     */
    public void start(BundleContext bundleContext) throws Exception {
        log.info("***** Starting OSGi");
        scheduledTask =  new ScheduledTask();
        Timer time = new Timer();
        time.schedule(scheduledTask, 0, 2000); //duration to check sys properties
    }

    /**
     * This is called when the bundle is stopped.
     *
     * @param bundleContext BundleContext of this bundle
     * @throws Exception Could be thrown while bundle stopping
     */
    public void stop(BundleContext bundleContext) throws Exception {
        log.info("**** Stopping OSGi");
    }
}
