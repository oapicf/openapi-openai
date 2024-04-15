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
 * OASError
 */
public class OASError {
    /**
     * Get code
     * @return code
     */
    public String code { get; set; }

    /**
     * Get message
     * @return message
     */
    public String message { get; set; }

    /**
     * Get param
     * @return param
     */
    public String param { get; set; }

    /**
     * Get type
     * @return type
     */
    public String type { get; set; }

    public static OASError getExample() {
        OASError error = new OASError();
          error.code = '';
          error.message = '';
          error.param = '';
          error.type = '';
        return error;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASError) {           
            OASError error = (OASError) obj;
            return this.code == error.code
                && this.message == error.message
                && this.param == error.param
                && this.type == error.type;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        hashCode = (17 * hashCode) + (param == null ? 0 : System.hashCode(param));
        hashCode = (17 * hashCode) + (type == null ? 0 : System.hashCode(type));
        return hashCode;
    }
}
