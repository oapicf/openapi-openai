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
 * OASCreateChatCompletionResponseChoic
 */
public class OASCreateChatCompletionResponseChoic implements OAS.MappedProperties {
    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,\n`length` if the maximum number of tokens specified in the request was reached,\n`content_filter` if content was omitted due to a flag from our content filters,\n`tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.\n
     */
    public enum FinishReasonEnum {
        STOP,
        LENGTH,
        TOOL_CALLS,
        CONTENT_FILTER,
        FUNCTION_CALL
    }

    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence,\n`length` if the maximum number of tokens specified in the request was reached,\n`content_filter` if content was omitted due to a flag from our content filters,\n`tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function.\n
     * @return finishReason
     */
    public FinishReasonEnum finishReason { get; set; }

    /**
     * The index of the choice in the list of choices.
     * @return index
     */
    public Integer index { get; set; }

    /**
     * Get message
     * @return message
     */
    public OASChatCompletionResponseMessage message { get; set; }

    /**
     * Get logprobs
     * @return logprobs
     */
    public OASCreateChatCompletionResponseChoic logprobs { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'finish_reason' => 'finishReason'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCreateChatCompletionResponseChoic getExample() {
        OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner = new OASCreateChatCompletionResponseChoic();
          createChatCompletionResponseChoicesInner.finishReason = FinishReasonEnum.STOP;
          createChatCompletionResponseChoicesInner.index = 0;
          createChatCompletionResponseChoicesInner.message = OASChatCompletionResponseMessage.getExample();
          createChatCompletionResponseChoicesInner.logprobs = OASCreateChatCompletionResponseChoic.getExample();
        return createChatCompletionResponseChoicesInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateChatCompletionResponseChoic) {           
            OASCreateChatCompletionResponseChoic createChatCompletionResponseChoicesInner = (OASCreateChatCompletionResponseChoic) obj;
            return this.finishReason == createChatCompletionResponseChoicesInner.finishReason
                && this.index == createChatCompletionResponseChoicesInner.index
                && this.message == createChatCompletionResponseChoicesInner.message
                && this.logprobs == createChatCompletionResponseChoicesInner.logprobs;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (finishReason == null ? 0 : System.hashCode(finishReason));
        hashCode = (17 * hashCode) + (index == null ? 0 : System.hashCode(index));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        hashCode = (17 * hashCode) + (logprobs == null ? 0 : System.hashCode(logprobs));
        return hashCode;
    }
}
