package com.example.elab_yang.bluetooth_attack01;

public class Device {

    String deviceName;
    String deviceAddress;

    public Device(String deviceName, String deviceAddress) {
        this.deviceName = deviceName;
        this.deviceAddress = deviceAddress;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceAddress() {
        return deviceAddress;
    }

    public void setDeviceAddress(String deviceAddress) {
        this.deviceAddress = deviceAddress;
    }
}
