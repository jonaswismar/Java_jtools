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
public class PingStats {

    private final InetAddress ia;
    private final long noPings;
    private final long packetsLost;
    private final float averageTimeTaken;
    private final float minTimeTaken;
    private final float maxTimeTaken;
    private final boolean isReachable;

    public PingStats(InetAddress ia, long noPings, long packetsLost, float totalTimeTaken, float minTimeTaken, float maxTimeTaken) {
        this.ia = ia;
        this.noPings = noPings;
        this.packetsLost = packetsLost;
        this.averageTimeTaken = totalTimeTaken / noPings;
        this.minTimeTaken = minTimeTaken;
        this.maxTimeTaken = maxTimeTaken;
        this.isReachable = noPings - packetsLost > 0;
    }

    public InetAddress getAddress() {
        return ia;
    }

    public long getNoPings() {
        return noPings;
    }

    public long getPacketsLost() {
        return packetsLost;
    }

    public float getAverageTimeTaken() {
        return averageTimeTaken;
    }

    public float getMinTimeTaken() {
        return minTimeTaken;
    }

    public float getMaxTimeTaken() {
        return maxTimeTaken;
    }

    public boolean isReachable() {
        return isReachable;
    }

    public long getAverageTimeTakenMillis() {
        return (long) (averageTimeTaken * 1000);
    }

    public long getMinTimeTakenMillis() {
        return (long) (minTimeTaken * 1000);
    }

    public long getMaxTimeTakenMillis() {
        return (long) (maxTimeTaken * 1000);
    }

    @Override
    public String toString() {
        return "PingStats{"
                + "ia=" + ia
                + ", noPings=" + noPings
                + ", packetsLost=" + packetsLost
                + ", averageTimeTaken=" + averageTimeTaken
                + ", minTimeTaken=" + minTimeTaken
                + ", maxTimeTaken=" + maxTimeTaken
                + '}';
    }
}
