/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jonaswismar.tools.network.subnet;

import java.net.InetAddress;

/**
 *
 * @author jonas
 */
public class Device {

    public String ip;
    public String hostname;
    public String mac;
    public float time = 0;

    public Device(InetAddress ip) {
        this.ip = ip.getHostAddress();
        this.hostname = ip.getCanonicalHostName();
    }

    @Override
    public String toString() {
        return "Device{"
                + "ip='" + ip + '\''
                + ", hostname='" + hostname + '\''
                + ", mac='" + mac + '\''
                + ", time=" + time
                + '}';
    }
}
