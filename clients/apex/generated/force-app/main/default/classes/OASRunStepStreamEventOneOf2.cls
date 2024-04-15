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
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 */
public class OASRunStepStreamEventOneOf2 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_STEP_DELTA
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
    public OASRunStepDeltaObject data { get; set; }

    public static OASRunStepStreamEventOneOf2 getExample() {
        OASRunStepStreamEventOneOf2 runStepStreamEventOneOf2 = new OASRunStepStreamEventOneOf2();
          runStepStreamEventOneOf2.event = EventEnum.THREAD_RUN_STEP_DELTA;
          runStepStreamEventOneOf2.data = OASRunStepDeltaObject.getExample();
        return runStepStreamEventOneOf2;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepStreamEventOneOf2) {           
            OASRunStepStreamEventOneOf2 runStepStreamEventOneOf2 = (OASRunStepStreamEventOneOf2) obj;
            return this.event == runStepStreamEventOneOf2.event
                && this.data == runStepStreamEventOneOf2.data;
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
