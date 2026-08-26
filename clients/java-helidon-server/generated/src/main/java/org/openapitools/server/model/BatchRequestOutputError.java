package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */
public class BatchRequestOutputError   {

    private String code;
    private String message;

    /**
     * Default constructor.
     */
    public BatchRequestOutputError() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchRequestOutputError.
     *
     * @param code A machine-readable error code.
     * @param message A human-readable error message.
     */
    public BatchRequestOutputError(
        String code, 
        String message
    ) {
        this.code = code;
        this.message = message;
    }



    /**
     * A machine-readable error code.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * A human-readable error message.
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
        sb.append("class BatchRequestOutputError {\n");
        
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

