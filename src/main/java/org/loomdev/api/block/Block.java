package org.loomdev.api.block;

import org.loomdev.api.world.Chunk;
import org.loomdev.api.world.World;

public interface Block {

    int getX();

    int getY();

    int getZ();

    Chunk getChunk();

    World getWorld();

    Material getMaterial();

    Material setMaterial();

}
