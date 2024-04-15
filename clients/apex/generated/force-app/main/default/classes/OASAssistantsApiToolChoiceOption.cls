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
 * Controls which (if any) tool is called by the model.\n&#x60;none&#x60; means the model will not call any tools and instead generates a message.\n&#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool.\nSpecifying a particular tool like &#x60;{&quot;type&quot;: &quot;TOOL_TYPE&quot;}&#x60; or &#x60;{&quot;type&quot;: &quot;function&quot;, &quot;function&quot;: {&quot;name&quot;: &quot;my_function&quot;}}&#x60; forces the model to call that tool.\n
 */
public class OASAssistantsApiToolChoiceOption implements OASAssistantsApiNamedToolChoice {
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

    public static OASAssistantsApiToolChoiceOption getExample() {
        OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption = new OASAssistantsApiToolChoiceOption();
          assistantsApiToolChoiceOption.type = TypeEnum.FUNCTION;
          assistantsApiToolChoiceOption.function = OASChatCompletionNamedToolChoiceFunc.getExample();
        return assistantsApiToolChoiceOption;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAssistantsApiToolChoiceOption) {           
            OASAssistantsApiToolChoiceOption assistantsApiToolChoiceOption = (OASAssistantsApiToolChoiceOption) obj;
            return this.type == assistantsApiToolChoiceOption.type
                && this.function == assistantsApiToolChoiceOption.function;
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
