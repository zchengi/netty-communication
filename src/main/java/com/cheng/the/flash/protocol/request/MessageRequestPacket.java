package com.cheng.the.flash.protocol.request;

import com.cheng.the.flash.protocol.Packet;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static com.cheng.the.flash.protocol.command.Command.MESSAGE_REQUEST;

/**
 * 收消息对象
 *
 * @author cheng
 *         2018/12/6 16:03
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class MessageRequestPacket extends Packet {

    private String toUserId;

    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
