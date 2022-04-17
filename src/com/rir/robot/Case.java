package com.rir.robot;

import com.rir.player.Direction;

public class Case {
    private CaseType type;
    private Token token;
    private Tile tile;
    private Robot robot;

    public Case(){

    }

    public boolean isObstacle(){
        if (type == CaseType.OBJECTIVE)
            return true;
        return false;
    }
}
