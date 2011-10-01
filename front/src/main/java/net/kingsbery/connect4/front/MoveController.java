package net.kingsbery.connect4.front;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import net.kingsbery.connect4.engine.ConnectFourAgent;
import net.kingsbery.connect4.engine.MoveRequest;
import net.kingsbery.connect4.engine.MoveResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MoveController {

    private Map<String,ConnectFourAgent> movers;

    private static final Log log = LogFactory.getLog(MoveController.class);
    
    @Autowired
    public void setMovers(Set<ConnectFourAgent> movers){
        this.movers=new HashMap<String,ConnectFourAgent>();
        for(ConnectFourAgent agent : movers){
            this.movers.put(agent.getClass().getSimpleName().replace("Agent", "").toLowerCase(),agent);
        }
    }
    
    @RequestMapping(value="/{mover}", method=RequestMethod.POST)
    public @ResponseBody MoveResponse handle(@RequestBody MoveRequest request,@PathVariable String mover){
        System.out.println(request.getBoard());
        MoveResponse moveResponse = new MoveResponse(this.movers.get(mover).getNextMove(request));
        log.info(moveResponse);
        return moveResponse;
    }
    
    @RequestMapping(value="/foo")
    public @ResponseBody String foo(@RequestBody String str){
        throw new RuntimeException();
    }
    
    
}
