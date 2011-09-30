package net.kingsbery.connect4.front;

import net.kingsbery.connect4.engine.ConnectFourAgent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MoveController {

    private ConnectFourAgent movers;

    @Autowired
    public void setMovers(ConnectFourAgent movers){
        this.movers=movers;
    }
}
