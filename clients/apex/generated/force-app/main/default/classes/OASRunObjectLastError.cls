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
 * The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
 */
public class OASRunObjectLastError {
    /**
     * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
     */
    public enum CodeEnum {
        SERVER_ERROR,
        RATE_LIMIT_EXCEEDED,
        INVALID_PROMPT
    }

    /**
     * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
     * @return code
     */
    public CodeEnum code { get; set; }

    /**
     * A human-readable description of the error.
     * @return message
     */
    public String message { get; set; }

    public static OASRunObjectLastError getExample() {
        OASRunObjectLastError runObjectLastError = new OASRunObjectLastError();
          runObjectLastError.code = CodeEnum.SERVER_ERROR;
          runObjectLastError.message = '';
        return runObjectLastError;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASRunObjectLastError) {           
            OASRunObjectLastError runObjectLastError = (OASRunObjectLastError) obj;
            return this.code == runObjectLastError.code
                && this.message == runObjectLastError.message;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (code == null ? 0 : System.hashCode(code));
        hashCode = (17 * hashCode) + (message == null ? 0 : System.hashCode(message));
        return hashCode;
    }
}
