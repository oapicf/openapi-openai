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
 * The delta containing the fields that have changed on the run step.
 */
public class OASRunStepDeltaObjectDelta implements OAS.MappedProperties {
    /**
     * Get stepDetails
     * @return stepDetails
     */
    public OASRunStepDeltaObjectDeltaStepDetail stepDetails { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'step_details' => 'stepDetails'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASRunStepDeltaObjectDelta getExample() {
        OASRunStepDeltaObjectDelta runStepDeltaObjectDelta = new OASRunStepDeltaObjectDelta();
          runStepDeltaObjectDelta.stepDetails = OASRunStepDeltaObjectDeltaStepDetail.getExample();
        return runStepDeltaObjectDelta;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunStepDeltaObjectDelta) {           
            OASRunStepDeltaObjectDelta runStepDeltaObjectDelta = (OASRunStepDeltaObjectDelta) obj;
            return this.stepDetails == runStepDeltaObjectDelta.stepDetails;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (stepDetails == null ? 0 : System.hashCode(stepDetails));
        return hashCode;
    }
}

