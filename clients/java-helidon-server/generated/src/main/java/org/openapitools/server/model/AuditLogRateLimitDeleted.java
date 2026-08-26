package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogRateLimitDeleted   {

    private String id;

    /**
     * Default constructor.
     */
    public AuditLogRateLimitDeleted() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogRateLimitDeleted.
     *
     * @param id The rate limit ID
     */
    public AuditLogRateLimitDeleted(
        String id
    ) {
        this.id = id;
    }



    /**
     * The rate limit ID
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
        sb.append("class AuditLogRateLimitDeleted {\n");
        
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

