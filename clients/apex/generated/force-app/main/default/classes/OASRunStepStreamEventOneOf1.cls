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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
 */
public class OASRunStepStreamEventOneOf1 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_STEP_IN_PROGRESS
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

    public static OASRunStepStreamEventOneOf1 getExample() {
        OASRunStepStreamEventOneOf1 runStepStreamEventOneOf1 = new OASRunStepStreamEventOneOf1();
          runStepStreamEventOneOf1.event = EventEnum.THREAD_RUN_STEP_IN_PROGRESS;
          runStepStreamEventOneOf1.data = OASRunStepObject.getExample();
        return runStepStreamEventOneOf1;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepStreamEventOneOf1) {           
            OASRunStepStreamEventOneOf1 runStepStreamEventOneOf1 = (OASRunStepStreamEventOneOf1) obj;
            return this.event == runStepStreamEventOneOf1.event
                && this.data == runStepStreamEventOneOf1.data;
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

