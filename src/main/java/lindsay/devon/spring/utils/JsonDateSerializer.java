package lindsay.devon.spring.utils;

/**
 * Created by devon on 10/23/16.
 */

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class JsonDateSerializer extends JsonSerializer<Date> {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public void serialize(Date date, JsonGenerator generator, SerializerProvider provider)
        throws IOException,JsonProcessingException {
        String formattedDate = dateFormat.format(date);

        //writes Object to the current object output stream
        // InputStream is used for reading,
        // OutputStream for writing.
        // They are connected as decorators to one another such that you can read/write all different
        // types of data from all different types of sources.
        // A buffer improves efficiency
        generator.writeString(formattedDate);
    }

}
