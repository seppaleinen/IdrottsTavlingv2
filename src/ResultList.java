/**
 * Created by SimonSchwieler on 2016-04-07.
 */

//rodi0231_sisc7379_arho2993
import java.util.ArrayList;

public class ResultList {

    private Result result;
    private Event event;

    public ResultList(Event e, Result r) {
        this.event = e;
        this.result = r;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }


}

