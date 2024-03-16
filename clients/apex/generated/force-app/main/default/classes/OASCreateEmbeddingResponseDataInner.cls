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
 * OASCreateEmbeddingResponseDataInner
 */
public class OASCreateEmbeddingResponseDataInner implements OAS.MappedProperties {
    /**
     * Get index
     * @return index
     */
    public Integer index { get; set; }

    /**
     * Get r_object
     * @return r_object
     */
    public String r_object { get; set; }

    /**
     * Get embedding
     * @return embedding
     */
    public List<Double> embedding { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'object' => 'r_object'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCreateEmbeddingResponseDataInner() {
        embedding = new List<Double>();
    }

    public static OASCreateEmbeddingResponseDataInner getExample() {
        OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner = new OASCreateEmbeddingResponseDataInner();
          createEmbeddingResponseDataInner.index = 0;
          createEmbeddingResponseDataInner.r_object = '';
          createEmbeddingResponseDataInner.embedding = new List<Double>{1.3579};
        return createEmbeddingResponseDataInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateEmbeddingResponseDataInner) {           
            OASCreateEmbeddingResponseDataInner createEmbeddingResponseDataInner = (OASCreateEmbeddingResponseDataInner) obj;
            return this.index == createEmbeddingResponseDataInner.index
                && this.r_object == createEmbeddingResponseDataInner.r_object
                && this.embedding == createEmbeddingResponseDataInner.embedding;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (index == null ? 0 : System.hashCode(index));
        hashCode = (17 * hashCode) + (r_object == null ? 0 : System.hashCode(r_object));
        hashCode = (17 * hashCode) + (embedding == null ? 0 : System.hashCode(embedding));
        return hashCode;
    }
}
