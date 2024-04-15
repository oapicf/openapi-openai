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
 * Represents an &#x60;assistant&#x60; that can call the model and use tools.
 */
public class OASAssistantObject implements OAS.MappedProperties {
    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String id { get; set; }

    /**
     * The object type, which is always `assistant`.
     */
    public enum RObjectEnum {
        ASSISTANT
    }

    /**
     * The object type, which is always `assistant`.
     * @return r_object
     */
    public RObjectEnum r_object { get; set; }

    /**
     * The Unix timestamp (in seconds) for when the assistant was created.
     * @return createdAt
     */
    public Integer createdAt { get; set; }

    /**
     * The name of the assistant. The maximum length is 256 characters.\n
     * @return name
     */
    public String name { get; set; }

    /**
     * The description of the assistant. The maximum length is 512 characters.\n
     * @return description
     */
    public String description { get; set; }

    /**
     * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.\n
     * @return model
     */
    public String model { get; set; }

    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters.\n
     * @return instructions
     */
    public String instructions { get; set; }

    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.\n
     * @return tools
     */
    public List<OASAssistantObjectToolsInner> tools { get; set; }

    /**
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.\n
     * @return fileIds
     */
    public List<String> fileIds { get; set; }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.\n
     * @return metadata
     */
    public Object metadata { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'file_ids' => 'fileIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'file_ids' => 'fileIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'created_at' => 'createdAt',
        'file_ids' => 'fileIds'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASAssistantObject() {
        tools = new List<OASAssistantObjectToolsInner>();
        fileIds = new List<String>();
    }

    public static OASAssistantObject getExample() {
        OASAssistantObject assistantObject = new OASAssistantObject();
          assistantObject.id = '';
          assistantObject.r_object = RObjectEnum.ASSISTANT;
          assistantObject.createdAt = 0;
          assistantObject.name = '';
          assistantObject.description = '';
          assistantObject.model = '';
          assistantObject.instructions = '';
          assistantObject.tools = new List<OASAssistantObjectToolsInner>{OASAssistantObjectToolsInner.getExample()};
          assistantObject.fileIds = new List<String>{''};
          assistantObject.metadata = null;
        return assistantObject;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASAssistantObject) {           
            OASAssistantObject assistantObject = (OASAssistantObject) obj;
            return this.id == assistantObject.id
                && this.r_object == assistantObject.r_object
                && this.createdAt == assistantObject.createdAt
                && this.name == assistantObject.name
                && this.description == assistantObject.description
                && this.model == assistantObject.model
                && this.instructions == assistantObject.instructions
                && this.tools == assistantObject.tools
                && this.fileIds == assistantObject.fileIds
                && this.metadata == assistantObject.metadata;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (id == null ? 0 : System.hashCode(id));
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        hashCode = (17 * hashCode) + (createdAt == null ? 0 : System.hashCode(createdAt));
        hashCode = (17 * hashCode) + (name == null ? 0 : System.hashCode(name));
        hashCode = (17 * hashCode) + (description == null ? 0 : System.hashCode(description));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (instructions == null ? 0 : System.hashCode(instructions));
        hashCode = (17 * hashCode) + (tools == null ? 0 : System.hashCode(tools));
        hashCode = (17 * hashCode) + (fileIds == null ? 0 : System.hashCode(fileIds));
        hashCode = (17 * hashCode) + (metadata == null ? 0 : System.hashCode(metadata));
        return hashCode;
    }
}
