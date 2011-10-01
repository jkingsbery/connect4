package net.kingsbery.connect4.front;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import net.kingsbery.connect4.engine.Board;
import net.kingsbery.connect4.engine.Move;
import net.kingsbery.connect4.engine.MoveRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;

public class MoveMarshaller implements HttpMessageConverter<MoveRequest> {

    @Override
    public boolean canRead(Class<?> clazz, MediaType mediaType) {
        return (MediaType.APPLICATION_JSON.equals(mediaType) && clazz == MoveRequest.class);
    }

    @Override
    public boolean canWrite(Class<?> clazz, MediaType mediaType) {
        return (MediaType.APPLICATION_JSON.equals(mediaType) && clazz == MoveRequest.class);
    }

    @Override
    public List<MediaType> getSupportedMediaTypes() {
        return Collections.singletonList(MediaType.APPLICATION_JSON);
    }

    @Override
    public MoveRequest read(Class<? extends MoveRequest> clazz,
            HttpInputMessage inputMessage) throws IOException,
            HttpMessageNotReadableException {
        ObjectMapper mapper = new ObjectMapper();
        Map<String, Object> result = mapper.readValue(inputMessage.getBody(),
                Map.class);
        Integer columns = (Integer) result.get("cols");
        Integer rows = (Integer) result.get("rows");
        int chips[][] = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                chips[i][j] = (Integer) ((List) ((List) result.get("board"))
                        .get(i)).get(rows - j - 1);
            }
        }
        Board board = new Board(columns, rows, chips);
        Map<String, Object> lastMove = (Map<String, Object>) result
                .get("lastMove");
        return new MoveRequest(board, (Integer) result.get("moveNumber"),
                (Integer) result.get("currentTurn"), new Move(
                        (Integer) lastMove.get("row"),
                        (Integer) lastMove.get("col"),
                        (Integer) lastMove.get("player"),
                        (Integer) lastMove.get("moves")));
    }

    @Override
    public void write(MoveRequest t, MediaType contentType,
            HttpOutputMessage outputMessage) throws IOException,
            HttpMessageNotWritableException {
        // TODO Auto-generated method stub

    }

}
