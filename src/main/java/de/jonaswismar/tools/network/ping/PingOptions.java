/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jonaswismar.tools.network.ping;

/**
 *
 * @author jonas
 */
public class PingOptions {

    private int timeoutMillis;
    private int timeToLive;

    public PingOptions() {
        timeToLive = 128;
        timeoutMillis = 1000;
    }

    public int getTimeoutMillis() {
        return timeoutMillis;
    }

    public void setTimeoutMillis(int timeoutMillis) {
        this.timeoutMillis = Math.max(timeoutMillis, 1000);
    }

    public int getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(int timeToLive) {
        this.timeToLive = Math.max(timeToLive, 1);
    }
}
