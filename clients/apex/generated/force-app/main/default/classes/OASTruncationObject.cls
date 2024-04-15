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
 * OASTruncationObject
 */
public class OASTruncationObject implements OAS.MappedProperties {
    /**
     * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
     */
    public enum TypeEnum {
        AUTO,
        LAST_MESSAGES
    }

    /**
     * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
     * @return type
     */
    public TypeEnum type { get; set; }

    /**
     * The number of most recent messages from the thread when constructing the context for the run.
     * minimum: 1
     * @return lastMessages
     */
    public Integer lastMessages { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'last_messages' => 'lastMessages'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public static OASTruncationObject getExample() {
        OASTruncationObject truncationObject = new OASTruncationObject();
          truncationObject.type = TypeEnum.AUTO;
          truncationObject.lastMessages = 0;
        return truncationObject;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASTruncationObject) {           
            OASTruncationObject truncationObject = (OASTruncationObject) obj;
            return this.type == truncationObject.type
                && this.lastMessages == truncationObject.lastMessages;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        hashCode = (17 * hashCode) + (lastMessages == null ? 0 : System.hashCode(lastMessages));
        return hashCode;
    }
}
