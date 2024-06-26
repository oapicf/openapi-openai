/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * Occurs when a stream ends.
 */
public class OASDoneEvent {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        DONE
    }

    /**
     * Get event
     * @return event
     */
    public EventEnum event { get; set; }

    /**
     * Gets or Sets data
     */
    public enum DataEnum {
        _DONE_
    }

    /**
     * Get data
     * @return data
     */
    public DataEnum data { get; set; }

    public static OASDoneEvent getExample() {
        OASDoneEvent doneEvent = new OASDoneEvent();
          doneEvent.event = EventEnum.DONE;
          doneEvent.data = DataEnum._DONE_;
        return doneEvent;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDoneEvent) {           
            OASDoneEvent doneEvent = (OASDoneEvent) obj;
            return this.event == doneEvent.event
                && this.data == doneEvent.data;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (event == null ? 0 : System.hashCode(event));
        hashCode = (17 * hashCode) + (data == null ? 0 : System.hashCode(data));
        return hashCode;
    }
}

