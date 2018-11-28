package Rooms;

import Game.Runner;
import People.Person;

public class ToyRoom extends Room
{

    public ToyRoom(int x, int y) {
        super(x, y);

    }
    public void enterRoom(Person x) {

        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the Toy room! Good job :)");
        Runner.gameOff();
    }
}


