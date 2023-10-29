import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("sample")
public class RestSample {

    private static final Log logger = LogFactory.getLog(RestSample.class);


    @GET
    public String getId() {

        logger.debug("we get the id");
        return "abcdefg";
    }
}
