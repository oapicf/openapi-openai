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
 * OASListAssistantFilesResponse
 */
public class OASListAssistantFilesResponse implements OAS.MappedProperties {
    /**
     * Get r_object
     * @return r_object
     */
    public String r_object { get; set; }

    /**
     * Get data
     * @return data
     */
    public List<OASAssistantFileObject> data { get; set; }

    /**
     * Get firstId
     * @return firstId
     */
    public String firstId { get; set; }

    /**
     * Get lastId
     * @return lastId
     */
    public String lastId { get; set; }

    /**
     * Get hasMore
     * @return hasMore
     */
    public Boolean hasMore { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'first_id' => 'firstId',
        'last_id' => 'lastId',
        'has_more' => 'hasMore'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'first_id' => 'firstId',
        'last_id' => 'lastId',
        'has_more' => 'hasMore'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'first_id' => 'firstId',
        'last_id' => 'lastId',
        'has_more' => 'hasMore'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object',
        'first_id' => 'firstId',
        'last_id' => 'lastId',
        'has_more' => 'hasMore'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASListAssistantFilesResponse() {
        data = new List<OASAssistantFileObject>();
    }

    public static OASListAssistantFilesResponse getExample() {
        OASListAssistantFilesResponse listAssistantFilesResponse = new OASListAssistantFilesResponse();
          listAssistantFilesResponse.r_object = 'list';
          listAssistantFilesResponse.data = new List<OASAssistantFileObject>{OASAssistantFileObject.getExample()};
          listAssistantFilesResponse.firstId = 'file-abc123';
          listAssistantFilesResponse.lastId = 'file-abc456';
          listAssistantFilesResponse.hasMore = false;
        return listAssistantFilesResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASListAssistantFilesResponse) {           
            OASListAssistantFilesResponse listAssistantFilesResponse = (OASListAssistantFilesResponse) obj;
            return this.r_object == listAssistantFilesResponse.r_object
                && this.data == listAssistantFilesResponse.data
                && this.firstId == listAssistantFilesResponse.firstId
                && this.lastId == listAssistantFilesResponse.lastId
                && this.hasMore == listAssistantFilesResponse.hasMore;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        hashCode = (17 * hashCode) + (data == null ? 0 : System.hashCode(data));
        hashCode = (17 * hashCode) + (firstId == null ? 0 : System.hashCode(firstId));
        hashCode = (17 * hashCode) + (lastId == null ? 0 : System.hashCode(lastId));
        hashCode = (17 * hashCode) + (hasMore == null ? 0 : System.hashCode(hasMore));
        return hashCode;
    }
}

