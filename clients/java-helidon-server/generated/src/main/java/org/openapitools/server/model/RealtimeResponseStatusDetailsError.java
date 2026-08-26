package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 */
public class RealtimeResponseStatusDetailsError   {

    private String type;
    private String code;

    /**
     * Default constructor.
     */
    public RealtimeResponseStatusDetailsError() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeResponseStatusDetailsError.
     *
     * @param type The type of error.
     * @param code Error code, if any.
     */
    public RealtimeResponseStatusDetailsError(
        String type, 
        String code
    ) {
        this.type = type;
        this.code = code;
    }



    /**
     * The type of error.
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Error code, if any.
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeResponseStatusDetailsError {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

