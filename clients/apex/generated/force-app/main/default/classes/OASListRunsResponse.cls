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
 * OASListRunsResponse
 */
public class OASListRunsResponse implements OAS.MappedProperties {
    /**
     * Get r_object
     * @return r_object
     */
    public String r_object { get; set; }

    /**
     * Get data
     * @return data
     */
    public List<OASRunObject> data { get; set; }

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

    public OASListRunsResponse() {
        data = new List<OASRunObject>();
    }

    public static OASListRunsResponse getExample() {
        OASListRunsResponse listRunsResponse = new OASListRunsResponse();
          listRunsResponse.r_object = 'list';
          listRunsResponse.data = new List<OASRunObject>{OASRunObject.getExample()};
          listRunsResponse.firstId = 'run_abc123';
          listRunsResponse.lastId = 'run_abc456';
          listRunsResponse.hasMore = false;
        return listRunsResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASListRunsResponse) {           
            OASListRunsResponse listRunsResponse = (OASListRunsResponse) obj;
            return this.r_object == listRunsResponse.r_object
                && this.data == listRunsResponse.data
                && this.firstId == listRunsResponse.firstId
                && this.lastId == listRunsResponse.lastId
                && this.hasMore == listRunsResponse.hasMore;
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

