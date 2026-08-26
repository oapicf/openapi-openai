package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogLoginFailed   {

    private String errorCode;
    private String errorMessage;

    /**
     * Default constructor.
     */
    public AuditLogLoginFailed() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogLoginFailed.
     *
     * @param errorCode The error code of the failure.
     * @param errorMessage The error message of the failure.
     */
    public AuditLogLoginFailed(
        String errorCode, 
        String errorMessage
    ) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }



    /**
     * The error code of the failure.
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * The error message of the failure.
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogLoginFailed {\n");
        
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

