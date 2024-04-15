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
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
public class OASAssistantsApiNamedToolChoice {
    /**
     * The type of the tool. If type is `function`, the function name must be set
     */
    public enum TypeEnum {
        FUNCTION,
        CODE_INTERPRETER,
        RETRIEVAL
    }

    /**
     * The type of the tool. If type is `function`, the function name must be set
     * @return type
     */
    public TypeEnum type { get; set; }

    /**
     * Get function
     * @return function
     */
    public OASChatCompletionNamedToolChoiceFunc function { get; set; }

    public static OASAssistantsApiNamedToolChoice getExample() {
        OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice = new OASAssistantsApiNamedToolChoice();
          assistantsApiNamedToolChoice.type = TypeEnum.FUNCTION;
          assistantsApiNamedToolChoice.function = OASChatCompletionNamedToolChoiceFunc.getExample();
        return assistantsApiNamedToolChoice;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAssistantsApiNamedToolChoice) {           
            OASAssistantsApiNamedToolChoice assistantsApiNamedToolChoice = (OASAssistantsApiNamedToolChoice) obj;
            return this.type == assistantsApiNamedToolChoice.type
                && this.function == assistantsApiNamedToolChoice.function;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (function == null ? 0 : System.hashCode(function));
        return hashCode;
    }
}
