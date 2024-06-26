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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
 */
public class OASRunStepStreamEventOneOf3 {
    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        THREAD_RUN_STEP_COMPLETED
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

    public static OASRunStepStreamEventOneOf3 getExample() {
        OASRunStepStreamEventOneOf3 runStepStreamEventOneOf3 = new OASRunStepStreamEventOneOf3();
          runStepStreamEventOneOf3.event = EventEnum.THREAD_RUN_STEP_COMPLETED;
          runStepStreamEventOneOf3.data = OASRunStepObject.getExample();
        return runStepStreamEventOneOf3;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepStreamEventOneOf3) {           
            OASRunStepStreamEventOneOf3 runStepStreamEventOneOf3 = (OASRunStepStreamEventOneOf3) obj;
            return this.event == runStepStreamEventOneOf3.event
                && this.data == runStepStreamEventOneOf3.data;
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

