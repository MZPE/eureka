package com.netflix.eureka2.server.channel;

import com.netflix.eureka2.protocol.replication.ReplicationHello;
import com.netflix.eureka2.protocol.replication.ReplicationHelloReply;
import com.netflix.eureka2.registry.instance.InstanceInfo;

import static com.netflix.eureka2.testkit.data.builder.SampleInstanceInfo.DiscoveryServer;
import static com.netflix.eureka2.testkit.data.builder.SampleInstanceInfo.ZuulServer;

/**
 * @author Tomasz Bak
 */
public abstract class AbstractReplicationChannelTest {
    protected static final String SENDER_ID = "senderId";

    protected static final String RECEIVER_ID = "receiverId";
    protected static final InstanceInfo RECEIVER_INFO = DiscoveryServer.builder().withId(RECEIVER_ID).build();

    protected static final ReplicationHello HELLO = new ReplicationHello(SENDER_ID, 0);
    protected static final ReplicationHelloReply HELLO_REPLY = new ReplicationHelloReply(RECEIVER_ID, false);

    protected static final InstanceInfo APP_INFO = ZuulServer.build();
}
