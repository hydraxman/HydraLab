// Copyright (c) Microsoft Corporation.
// Licensed under the MIT License.
package com.microsoft.hydralab.common.entity.agent;

import com.microsoft.hydralab.common.entity.common.DeviceInfo;

import java.util.Set;
import java.util.concurrent.CountDownLatch;

public class DeviceTaskControl {
    public final CountDownLatch countDownLatch;
    public final Set<DeviceInfo> devices;

    public DeviceTaskControl(CountDownLatch countDownLatch, Set<DeviceInfo> devices) {
        this.countDownLatch = countDownLatch;
        this.devices = devices;
    }
}
