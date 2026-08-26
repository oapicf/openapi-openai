package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 */
public class FineTuningJobError   {

    private String code;
    private String message;
    private String param;

    /**
     * Default constructor.
     */
    public FineTuningJobError() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuningJobError.
     *
     * @param code A machine-readable error code.
     * @param message A human-readable error message.
     * @param param The parameter that was invalid, usually &#x60;training_file&#x60; or &#x60;validation_file&#x60;. This field will be null if the failure was not parameter-specific.
     */
    public FineTuningJobError(
        String code, 
        String message, 
        String param
    ) {
        this.code = code;
        this.message = message;
        this.param = param;
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
     * The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuningJobError {\n");
        
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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

