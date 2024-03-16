/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASCreateChatCompletionStreamRespons
 */
public class OASCreateChatCompletionStreamRespons implements OAS.MappedProperties {
    /**
     * Get index
     * @return index
     */
    public Integer index { get; set; }

    /**
     * Get delta
     * @return delta
     */
    public OASChatCompletionStreamResponseDelta delta { get; set; }

    /**
     * Gets or Sets finishReason
     */
    public enum FinishReasonEnum {
        STOP,
        LENGTH,
        FUNCTION_CALL
    }

    /**
     * Get finishReason
     * @return finishReason
     */
    public FinishReasonEnum finishReason { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'finish_reason' => 'finishReason'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASCreateChatCompletionStreamRespons getExample() {
        OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner = new OASCreateChatCompletionStreamRespons();
          createChatCompletionStreamResponseChoicesInner.index = 0;
          createChatCompletionStreamResponseChoicesInner.delta = OASChatCompletionStreamResponseDelta.getExample();
          createChatCompletionStreamResponseChoicesInner.finishReason = FinishReasonEnum.STOP;
        return createChatCompletionStreamResponseChoicesInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateChatCompletionStreamRespons) {           
            OASCreateChatCompletionStreamRespons createChatCompletionStreamResponseChoicesInner = (OASCreateChatCompletionStreamRespons) obj;
            return this.index == createChatCompletionStreamResponseChoicesInner.index
                && this.delta == createChatCompletionStreamResponseChoicesInner.delta
                && this.finishReason == createChatCompletionStreamResponseChoicesInner.finishReason;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (index == null ? 0 : System.hashCode(index));
        hashCode = (17 * hashCode) + (delta == null ? 0 : System.hashCode(delta));
        hashCode = (17 * hashCode) + (finishReason == null ? 0 : System.hashCode(finishReason));
        return hashCode;
    }
}
