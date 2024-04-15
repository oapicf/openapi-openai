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
 * Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
 */
public class OASRunObjectRequiredAction implements OAS.MappedProperties {
    /**
     * For now, this is always `submit_tool_outputs`.
     */
    public enum TypeEnum {
        SUBMIT_TOOL_OUTPUTS
    }

    /**
     * For now, this is always `submit_tool_outputs`.
     * @return type
     */
    public TypeEnum type { get; set; }

    /**
     * Get submitToolOutputs
     * @return submitToolOutputs
     */
    public OASRunObjectRequiredActionSubmitTool submitToolOutputs { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'submit_tool_outputs' => 'submitToolOutputs'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASRunObjectRequiredAction getExample() {
        OASRunObjectRequiredAction runObjectRequiredAction = new OASRunObjectRequiredAction();
          runObjectRequiredAction.type = TypeEnum.SUBMIT_TOOL_OUTPUTS;
          runObjectRequiredAction.submitToolOutputs = OASRunObjectRequiredActionSubmitTool.getExample();
        return runObjectRequiredAction;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunObjectRequiredAction) {           
            OASRunObjectRequiredAction runObjectRequiredAction = (OASRunObjectRequiredAction) obj;
            return this.type == runObjectRequiredAction.type
                && this.submitToolOutputs == runObjectRequiredAction.submitToolOutputs;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (submitToolOutputs == null ? 0 : System.hashCode(submitToolOutputs));
        return hashCode;
    }
}
