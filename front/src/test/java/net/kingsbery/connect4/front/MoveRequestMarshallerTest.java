package net.kingsbery.connect4.front;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import net.kingsbery.connect4.engine.MoveRequest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.HttpInputMessage;

public class MoveRequestMarshallerTest {

    private MoveRequest request;

    @Before
    public void setup() throws IOException{
        MoveMarshaller marshaller = new MoveMarshaller();
        HttpInputMessage inputMessage = mock(HttpInputMessage.class);
        String input = "{\"rows\":6,\"cols\":7,\"board\":[[0,0,0,1,2,2],[0,0,0,0,0,1],[0,0,0,0,0,0],[0,0,0,0,0,1],[0,0,0,0,0,2],[0,0,0,0,1,1],[0,0,0,0,0,2]],\"lastMove\":{\"row\":3,\"col\":0,\"player\":1,\"moves\":9},\"currentTurn\":2,\"moveNumber\":9}";
        when(inputMessage.getBody()).thenReturn(new ByteArrayInputStream(input.getBytes()));
        request = marshaller.read(MoveRequest.class, inputMessage );
    }
    
    @Test
    public void playerShouldMatch(){
        assertEquals(2,request.getPlayerToMove());
    }
    
    @Test
    public void moveNumberShouldMatch(){
        assertEquals(9,request.getMoveNumber());
    }
    
    @Test
    public void rowCountShouldMatch(){
        assertEquals(6,request.getBoard().getRows());
    }
    
    @Test
    public void columnCountShouldMatch(){
        assertEquals(7,request.getBoard().getColumns());
    }
    
    @Test
    public void columnHeightShouldMatch(){
        assertEquals(3,request.getBoard().getHeight(0));        
    }
    
//    @Test
    public void lastMovePlayerShouldMatch(){
        assertEquals(1,request.getLastMove().getPlayer());
    }
}
