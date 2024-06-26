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
 * OASListModelsResponse
 */
public class OASListModelsResponse implements OAS.MappedProperties {
    /**
     * Gets or Sets r_object
     */
    public enum RObjectEnum {
        LIST
    }

    /**
     * Get r_object
     * @return r_object
     */
    public RObjectEnum r_object { get; set; }

    /**
     * Get data
     * @return data
     */
    public List<OASModel> data { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASListModelsResponse() {
        data = new List<OASModel>();
    }

    public static OASListModelsResponse getExample() {
        OASListModelsResponse listModelsResponse = new OASListModelsResponse();
          listModelsResponse.r_object = RObjectEnum.LIST;
          listModelsResponse.data = new List<OASModel>{OASModel.getExample()};
        return listModelsResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASListModelsResponse) {           
            OASListModelsResponse listModelsResponse = (OASListModelsResponse) obj;
            return this.r_object == listModelsResponse.r_object
                && this.data == listModelsResponse.data;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        hashCode = (17 * hashCode) + (data == null ? 0 : System.hashCode(data));
        return hashCode;
    }
}

