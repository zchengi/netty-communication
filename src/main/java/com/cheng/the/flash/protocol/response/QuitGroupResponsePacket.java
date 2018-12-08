package com.cheng.the.flash.protocol.response;

import com.cheng.the.flash.protocol.Packet;
import lombok.Data;
import lombok.EqualsAndHashCode;

import static com.cheng.the.flash.protocol.command.Command.QUIT_GROUP_RESPONSE;

/**
 * @author cheng
 *         2018/12/8 18:17
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class QuitGroupResponsePacket extends Packet {

    private String groupId;

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }
}
