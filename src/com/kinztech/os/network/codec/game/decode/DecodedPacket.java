package com.kinztech.os.network.codec.game.decode;

import com.kinztech.os.game.node.entity.player.Player;
import com.kinztech.os.network.protocol.PacketDefinition;
import com.kinztech.os.utilities.RSBuffer;

/**
 * Created by Allen Kinzalow on 5/25/2015.
 */
public interface DecodedPacket {

    void decode(Player player, RSBuffer in,  PacketDefinition definition, int size);

}
