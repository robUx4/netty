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

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.EventLoopGroup;
import org.junit.Assert;
import org.junit.Test;

import java.net.InetSocketAddress;

public class EpollSocketChannelTest {

    @Test
    public void testTcpInfo() throws Exception {
        EventLoopGroup group = new EpollEventLoopGroup(1);

        try {
            Bootstrap bootstrap = new Bootstrap();
            EpollSocketChannel ch = (EpollSocketChannel) bootstrap.group(group)
                    .channel(EpollSocketChannel.class)
                    .handler(new ChannelInboundHandlerAdapter())
                    .bind(new InetSocketAddress(0)).syncUninterruptibly().channel();
            TcpInfo info = ch.tcpInfo();
            Assert.assertNotNull(info);

            Assert.assertTrue(info.tcpiState() >= 0);
            Assert.assertTrue(info.tcpiCaState() >= 0);
            Assert.assertTrue(info.tcpiRetransmits() >= 0);
            Assert.assertTrue(info.tcpiProbes() >= 0);
            Assert.assertTrue(info.tcpiBackoff() >= 0);
            Assert.assertTrue(info.tcpiOptions() >= 0);
            Assert.assertTrue(info.tcpiSndWscale() >= 0);
            Assert.assertTrue(info.tcpiRcvWscale() >= 0);
            Assert.assertTrue(info.tcpiRto() >= 0);
            Assert.assertTrue(info.tcpiAto() >= 0);
            Assert.assertTrue(info.tcpiSndMss() >= 0);
            Assert.assertTrue(info.tcpiRcvMss() >= 0);
            Assert.assertTrue(info.tcpiUnacked() >= 0);
            Assert.assertTrue(info.tcpiSacked() >= 0);
            Assert.assertTrue(info.tcpiLost() >= 0);
            Assert.assertTrue(info.tcpiRetrans() >= 0);
            Assert.assertTrue(info.tcpiFackets() >= 0);
            Assert.assertTrue(info.tcpiLastDataSent() >= 0);
            Assert.assertTrue(info.tcpiLastAckSent() >= 0);
            Assert.assertTrue(info.tcpiLastDataRecv() >= 0);
            Assert.assertTrue(info.tcpiLastAckRecv() >= 0);
            Assert.assertTrue(info.tcpiPmtu() >= 0);
            Assert.assertTrue(info.tcpiRcvSsthresh() >= 0);
            Assert.assertTrue(info.tcpiRtt() >= 0);
            Assert.assertTrue(info.tcpiRttvar() >= 0);
            Assert.assertTrue(info.tcpiSndSsthresh() >= 0);
            Assert.assertTrue(info.tcpiSndCwnd() >= 0);
            Assert.assertTrue(info.tcpiAdvmss() >= 0);
            Assert.assertTrue(info.tcpiReordering() >= 0);
            Assert.assertTrue(info.tcpiRcvRtt() >= 0);
            Assert.assertTrue(info.tcpiRcvSpace() >= 0);
            Assert.assertTrue(info.tcpiTotalRetrans() >= 0);

            ch.close().syncUninterruptibly();
        } finally {
            group.shutdownGracefully();
        }
    }

}
