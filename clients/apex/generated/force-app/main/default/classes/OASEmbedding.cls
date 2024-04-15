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
 * Represents an embedding vector returned by embedding endpoint.\n
 */
public class OASEmbedding implements OAS.MappedProperties {
    /**
     * The index of the embedding in the list of embeddings.
     * @return index
     */
    public Integer index { get; set; }

    /**
     * The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).\n
     * @return embedding
     */
    public List<Double> embedding { get; set; }

    /**
     * The object type, which is always "embedding".
     */
    public enum RObjectEnum {
        EMBEDDING
    }

    /**
     * The object type, which is always "embedding".
     * @return r_object
     */
    public RObjectEnum r_object { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASEmbedding() {
        embedding = new List<Double>();
    }

    public static OASEmbedding getExample() {
        OASEmbedding embedding = new OASEmbedding();
          embedding.index = 0;
          embedding.embedding = new List<Double>{1.3579};
          embedding.r_object = RObjectEnum.EMBEDDING;
        return embedding;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASEmbedding) {           
            OASEmbedding embedding = (OASEmbedding) obj;
            return this.index == embedding.index
                && this.embedding == embedding.embedding
                && this.r_object == embedding.r_object;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (index == null ? 0 : System.hashCode(index));
        hashCode = (17 * hashCode) + (embedding == null ? 0 : System.hashCode(embedding));
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        return hashCode;
    }
}
