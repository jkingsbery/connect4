package net.kingsbery.connect4.front;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import net.kingsbery.connect4.engine.MoveResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class MoveResponseMarshaller implements HttpMessageConverter<MoveResponse> {

    private static final Log log = LogFactory.getLog(MoveResponseMarshaller.class);
    
    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        log.info(mediaType.toString());
        return (getSupportedMediaTypes().contains(mediaType) && clazz == MoveResponse.class);
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        log.info(mediaType.toString());
        return (getSupportedMediaTypes().contains(mediaType) && clazz == MoveResponse.class);
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return Arrays.asList(MediaType.ALL,MediaType.APPLICATION_JSON);
    }

    @Override
    public MoveResponse read(Class<? extends MoveResponse> clazz,
            HttpInputMessage inputMessage) throws IOException,
            HttpMessageNotReadableException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void write(MoveResponse t, MediaType contentType,
            HttpOutputMessage outputMessage) throws IOException,
            HttpMessageNotWritableException {
        ObjectMapper mapper = new ObjectMapper();
        outputMessage.getHeaders().setContentType(MediaType.APPLICATION_JSON);
        outputMessage.getBody().write("{\"move\":2}".getBytes());
//        mapper.writeValue(outputMessage.getBody(), t);
    }

}