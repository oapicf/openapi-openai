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
 * OASChatCompletionStreamResponseDelta
 */
public class OASChatCompletionStreamResponseDelta implements OAS.MappedProperties {
    /**
     * The role of the author of this message.
     */
    public enum RoleEnum {
        SYSTEM,
        USER,
        ASSISTANT,
        FUNCTION
    }

    /**
     * The role of the author of this message.
     * @return role
     */
    public RoleEnum role { get; set; }

    /**
     * The contents of the chunk message.
     * @return content
     */
    public String content { get; set; }

    /**
     * Get functionCall
     * @return functionCall
     */
    public OASChatCompletionRequestMessageFunct functionCall { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'function_call' => 'functionCall'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASChatCompletionStreamResponseDelta getExample() {
        OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = new OASChatCompletionStreamResponseDelta();
          chatCompletionStreamResponseDelta.role = RoleEnum.SYSTEM;
          chatCompletionStreamResponseDelta.content = '';
          chatCompletionStreamResponseDelta.functionCall = OASChatCompletionRequestMessageFunct.getExample();
        return chatCompletionStreamResponseDelta;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASChatCompletionStreamResponseDelta) {           
            OASChatCompletionStreamResponseDelta chatCompletionStreamResponseDelta = (OASChatCompletionStreamResponseDelta) obj;
            return this.role == chatCompletionStreamResponseDelta.role
                && this.content == chatCompletionStreamResponseDelta.content
                && this.functionCall == chatCompletionStreamResponseDelta.functionCall;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (role == null ? 0 : System.hashCode(role));
        hashCode = (17 * hashCode) + (content == null ? 0 : System.hashCode(content));
        hashCode = (17 * hashCode) + (functionCall == null ? 0 : System.hashCode(functionCall));
        return hashCode;
    }
}
