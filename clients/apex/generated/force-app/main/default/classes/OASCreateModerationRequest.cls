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
 * OASCreateModerationRequest
 */
public class OASCreateModerationRequest {
    /**
     * Get input
     * @return input
     */
    public OASCreateModerationRequestInput input { get; set; }

    /**
     * Get model
     * @return model
     */
    public OASCreateModerationRequestModel model { get; set; }

    public static OASCreateModerationRequest getExample() {
        OASCreateModerationRequest createModerationRequest = new OASCreateModerationRequest();
          createModerationRequest.input = OASCreateModerationRequestInput.getExample();
          createModerationRequest.model = OASCreateModerationRequestModel.getExample();
        return createModerationRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateModerationRequest) {           
            OASCreateModerationRequest createModerationRequest = (OASCreateModerationRequest) obj;
            return this.input == createModerationRequest.input
                && this.model == createModerationRequest.model;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (input == null ? 0 : System.hashCode(input));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        return hashCode;
    }
}
