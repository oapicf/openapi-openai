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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
 */
public class OASRunStreamEventOneOf2 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_IN_PROGRESS
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

    public static OASRunStreamEventOneOf2 getExample() {
        OASRunStreamEventOneOf2 runStreamEventOneOf2 = new OASRunStreamEventOneOf2();
          runStreamEventOneOf2.event = EventEnum.THREAD_RUN_IN_PROGRESS;
          runStreamEventOneOf2.data = OASRunObject.getExample();
        return runStreamEventOneOf2;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStreamEventOneOf2) {           
            OASRunStreamEventOneOf2 runStreamEventOneOf2 = (OASRunStreamEventOneOf2) obj;
            return this.event == runStreamEventOneOf2.event
                && this.data == runStreamEventOneOf2.data;
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

