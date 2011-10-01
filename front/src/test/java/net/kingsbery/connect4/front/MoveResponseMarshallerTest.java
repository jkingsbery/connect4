package net.kingsbery.connect4.front;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import net.kingsbery.connect4.engine.MoveResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;

public class MoveResponseMarshallerTest {

    private static final Log log = LogFactory.getLog(MoveResponseMarshallerTest.class);
    
    @Test
    public void test() throws IOException{
        MoveResponseMarshaller marshaller = new MoveResponseMarshaller();
        

        HttpOutputMessage outputMessage = mock(HttpOutputMessage.class);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        when(outputMessage.getBody()).thenReturn(baos);
        when(outputMessage.getHeaders()).thenReturn(new HttpHeaders());
        marshaller.write(new MoveResponse(2), MediaType.APPLICATION_JSON, outputMessage);
        String result = new String(baos.toByteArray());
        log.info(result);
        assertTrue(result.contains("\"move\":2"));
    }
}
