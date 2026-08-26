package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The last error associated with this vector store file. Will be `null` if there are no errors.
 */
public class VectorStoreFileObjectLastError   {


    /**
    * One of `server_error` or `rate_limit_exceeded`.
    */
    public enum CodeEnum {
        SERVER_ERROR("server_error"),
        UNSUPPORTED_FILE("unsupported_file"),
        INVALID_FILE("invalid_file");

        private String value;

        CodeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static CodeEnum fromValue(String text) {
            for (CodeEnum b : CodeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private CodeEnum code;
    private String message;

    /**
     * Default constructor.
     */
    public VectorStoreFileObjectLastError() {
    // JSON-B / Jackson
    }

    /**
     * Create VectorStoreFileObjectLastError.
     *
     * @param code One of &#x60;server_error&#x60; or &#x60;rate_limit_exceeded&#x60;.
     * @param message A human-readable description of the error.
     */
    public VectorStoreFileObjectLastError(
        CodeEnum code, 
        String message
    ) {
        this.code = code;
        this.message = message;
    }



    /**
     * One of `server_error` or `rate_limit_exceeded`.
     * @return code
     */
    public CodeEnum getCode() {
        return code;
    }

    public void setCode(CodeEnum code) {
        this.code = code;
    }

    /**
     * A human-readable description of the error.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VectorStoreFileObjectLastError {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

