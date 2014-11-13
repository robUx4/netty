/*
 * Copyright 2014 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.channel.epoll;

/**
 * <p>
 * struct tcp_info
 * {
 *      __u8    tcpi_state;
 *      __u8    tcpi_ca_state;
 *      __u8    tcpi_retransmits;
 *      __u8    tcpi_probes;
 *      __u8    tcpi_backoff;
 *      __u8    tcpi_options;
 *      __u8    tcpi_snd_wscale : 4, tcpi_rcv_wscale : 4;
 *
 *      __u32   tcpi_rto;
 *      __u32   tcpi_ato;
 *      __u32   tcpi_snd_mss;
 *      __u32   tcpi_rcv_mss;
 *
 *      __u32   tcpi_unacked;
 *      __u32   tcpi_sacked;
 *      __u32   tcpi_lost;
 *      __u32   tcpi_retrans;
 *      __u32   tcpi_fackets;
 *
 *      __u32   tcpi_last_data_sent;
 *      __u32   tcpi_last_ack_sent;
 *      __u32   tcpi_last_data_recv;
 *      __u32   tcpi_last_ack_recv;
 *
 *      __u32   tcpi_pmtu;
 *      __u32   tcpi_rcv_ssthresh;
 *      __u32   tcpi_rtt;
 *      __u32   tcpi_rttvar;
 *      __u32   tcpi_snd_ssthresh;
 *      __u32   tcpi_snd_cwnd;
 *      __u32   tcpi_advmss;
 *      __u32   tcpi_reordering;
 *
 *      __u32   tcpi_rcv_rtt;
 *      __u32   tcpi_rcv_space;
 *
 *      __u32   tcpi_total_retrans;
 * };
 * </p>
 */
public final class TcpInfo {
    private final int[] info;

    TcpInfo(int[] info) {
        this.info = info;
    }

    public byte tcpiState() {
        return (byte) info[0];
    }

    public byte tcpiCaState() {
        return (byte) info[1];
    }

    public byte tcpiRetransmits() {
        return (byte) info[2];
    }

    public byte tcpiProbes() {
        return (byte) info[3];
    }

    public byte tcpiBackoff() {
        return (byte) info[4];
    }

    public byte tcpiOptions() {
        return (byte) info[5];
    }

    public byte tcpiSndWscale() {
        return (byte) info[6];
    }

    public byte tcpiRcvWscale() {
        return (byte) info[7];
    }

    public int tcpiRto() {
        return info[8];
    }

    public int tcpiAto() {
        return info[9];
    }

    public int tcpiSndMss() {
        return info[10];
    }

    public int tcpiRcvMss() {
        return info[11];
    }

    public int tcpiUnacked() {
        return info[12];
    }

    public int tcpiSacked() {
        return info[13];
    }

    public int tcpiLost() {
        return info[14];
    }

    public int tcpiRetrans() {
        return info[15];
    }

    public int tcpiFackets() {
        return info[16];
    }

    public int tcpiLastDataSent() {
        return info[17];
    }

    public int tcpiLastAckSent() {
        return info[18];
    }

    public int tcpiLastDataRecv() {
        return info[19];
    }

    public int tcpiLastAckRecv() {
        return info[20];
    }

    public int tcpiPmtu() {
        return info[21];
    }

    public int tcpiRcvSsthresh() {
        return info[22];
    }

    public int tcpiRtt() {
        return info[23];
    }

    public int tcpiRttvar() {
        return info[24];
    }

    public int tcpiSndSsthresh() {
        return info[25];
    }

    public int tcpiSndCwnd() {
        return info[26];
    }

    public int tcpiAdvmss() {
        return info[27];
    }

    public int tcpiReordering() {
        return info[28];
    }

    public int tcpiRcvRtt() {
        return info[29];
    }

    public int tcpiRcvSpace() {
        return info[30];
    }

    public int tcpiTotalRetrans() {
        return info[31];
    }
}
