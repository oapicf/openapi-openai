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
 * OASRunStreamEvent
 */
public class OASRunStreamEvent implements OASRunStreamEventOneOf, OASRunStreamEventOneOf1, OASRunStreamEventOneOf2, OASRunStreamEventOneOf3, OASRunStreamEventOneOf4, OASRunStreamEventOneOf5, OASRunStreamEventOneOf6, OASRunStreamEventOneOf7, OASRunStreamEventOneOf8 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_EXPIRED
    }

    /**
     * Get event
     * @return event
     */
    public EventEnum event { get; set; }

    /**
     * Get data
     * @return data
     */
    public OASRunObject data { get; set; }

    public static OASRunStreamEvent getExample() {
        OASRunStreamEvent runStreamEvent = new OASRunStreamEvent();
          runStreamEvent.event = EventEnum.THREAD_RUN_EXPIRED;
          runStreamEvent.data = OASRunObject.getExample();
        return runStreamEvent;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStreamEvent) {           
            OASRunStreamEvent runStreamEvent = (OASRunStreamEvent) obj;
            return this.event == runStreamEvent.event
                && this.data == runStreamEvent.data;
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

