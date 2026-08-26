package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogApiKeyDeleted   {

    private String id;

    /**
     * Default constructor.
     */
    public AuditLogApiKeyDeleted() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogApiKeyDeleted.
     *
     * @param id The tracking ID of the API key.
     */
    public AuditLogApiKeyDeleted(
        String id
    ) {
        this.id = id;
    }



    /**
     * The tracking ID of the API key.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogApiKeyDeleted {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

