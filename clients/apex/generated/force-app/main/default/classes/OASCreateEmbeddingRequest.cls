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
 * OASCreateEmbeddingRequest
 */
public class OASCreateEmbeddingRequest implements OAS.MappedProperties {
    /**
     * Get input
     * @return input
     */
    public OASCreateEmbeddingRequestInput input { get; set; }

    /**
     * Get model
     * @return model
     */
    public OASCreateEmbeddingRequestModel model { get; set; }

    /**
     * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     */
    public enum EncodingFormatEnum {
        FLOAT,
        BASE64
    }

    /**
     * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     * @return encodingFormat
     */
    public EncodingFormatEnum encodingFormat { get; set; }

    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models.\n
     * minimum: 1
     * @return dimensions
     */
    public Integer dimensions { get; set; }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).\n
     * @return user
     */
    public String user { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'encoding_format' => 'encodingFormat'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCreateEmbeddingRequest() {
        encodingFormat = EncodingFormatEnum.FLOAT;
    }

    public static OASCreateEmbeddingRequest getExample() {
        OASCreateEmbeddingRequest createEmbeddingRequest = new OASCreateEmbeddingRequest();
          createEmbeddingRequest.input = OASCreateEmbeddingRequestInput.getExample();
          createEmbeddingRequest.model = OASCreateEmbeddingRequestModel.getExample();
          createEmbeddingRequest.encodingFormat = EncodingFormatEnum.FLOAT;
          createEmbeddingRequest.dimensions = 0;
          createEmbeddingRequest.user = 'user-1234';
        return createEmbeddingRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateEmbeddingRequest) {           
            OASCreateEmbeddingRequest createEmbeddingRequest = (OASCreateEmbeddingRequest) obj;
            return this.input == createEmbeddingRequest.input
                && this.model == createEmbeddingRequest.model
                && this.encodingFormat == createEmbeddingRequest.encodingFormat
                && this.dimensions == createEmbeddingRequest.dimensions
                && this.user == createEmbeddingRequest.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (input == null ? 0 : System.hashCode(input));
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (encodingFormat == null ? 0 : System.hashCode(encodingFormat));
        hashCode = (17 * hashCode) + (dimensions == null ? 0 : System.hashCode(dimensions));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}
