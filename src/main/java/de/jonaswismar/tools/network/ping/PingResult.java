/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de.jonaswismar.tools.network.ping;

import java.net.InetAddress;

/**
 *
 * @author jonas
 */
public class PingResult {

    public final InetAddress ia;
    public boolean isReachable;
    public String error = null;
    public float timeTaken;
    public String fullString;
    public String result;

    public PingResult(InetAddress ia) {
        this.ia = ia;
    }

    public boolean isReachable() {
        return isReachable;
    }

    public boolean hasError() {
        return error != null;
    }

    public float getTimeTaken() {
        return timeTaken;
    }

    public String getError() {
        return error;
    }

    public InetAddress getAddress() {
        return ia;
    }

    @Override
    public String toString() {
        return "PingResult{"
                + "ia=" + ia
                + ", isReachable=" + isReachable
                + ", error='" + error + '\''
                + ", timeTaken=" + timeTaken
                + ", fullString='" + fullString + '\''
                + ", result='" + result + '\''
                + '}';
    }
}
