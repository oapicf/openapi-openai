package org.openapitools.server.model;

import org.openapitools.server.model.Error;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ErrorResponse   {

    private Error error;

    /**
     * Default constructor.
     */
    public ErrorResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ErrorResponse.
     *
     * @param error error
     */
    public ErrorResponse(
        Error error
    ) {
        this.error = error;
    }



    /**
     * Get error
     * @return error
     */
    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorResponse {\n");
        
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

