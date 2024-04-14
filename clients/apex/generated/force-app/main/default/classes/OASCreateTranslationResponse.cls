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
 * OASCreateTranslationResponse
 */
public class OASCreateTranslationResponse {
    /**
     * Get text
     * @return text
     */
    public String text { get; set; }

    public static OASCreateTranslationResponse getExample() {
        OASCreateTranslationResponse createTranslationResponse = new OASCreateTranslationResponse();
          createTranslationResponse.text = '';
        return createTranslationResponse;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateTranslationResponse) {           
            OASCreateTranslationResponse createTranslationResponse = (OASCreateTranslationResponse) obj;
            return this.text == createTranslationResponse.text;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (text == null ? 0 : System.hashCode(text));
        return hashCode;
    }
}
