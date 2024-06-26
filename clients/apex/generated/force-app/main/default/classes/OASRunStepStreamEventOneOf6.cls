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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
 */
public class OASRunStepStreamEventOneOf6 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_STEP_EXPIRED
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
    public OASRunStepObject data { get; set; }

    public static OASRunStepStreamEventOneOf6 getExample() {
        OASRunStepStreamEventOneOf6 runStepStreamEventOneOf6 = new OASRunStepStreamEventOneOf6();
          runStepStreamEventOneOf6.event = EventEnum.THREAD_RUN_STEP_EXPIRED;
          runStepStreamEventOneOf6.data = OASRunStepObject.getExample();
        return runStepStreamEventOneOf6;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepStreamEventOneOf6) {           
            OASRunStepStreamEventOneOf6 runStepStreamEventOneOf6 = (OASRunStepStreamEventOneOf6) obj;
            return this.event == runStepStreamEventOneOf6.event
                && this.data == runStepStreamEventOneOf6.data;
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

