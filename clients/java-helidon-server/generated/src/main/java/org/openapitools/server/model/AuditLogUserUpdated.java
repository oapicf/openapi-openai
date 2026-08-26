package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogUserUpdatedChangesRequested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogUserUpdated   {

    private String id;
    private AuditLogUserUpdatedChangesRequested changesRequested;

    /**
     * Default constructor.
     */
    public AuditLogUserUpdated() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogUserUpdated.
     *
     * @param id The project ID.
     * @param changesRequested changesRequested
     */
    public AuditLogUserUpdated(
        String id, 
        AuditLogUserUpdatedChangesRequested changesRequested
    ) {
        this.id = id;
        this.changesRequested = changesRequested;
    }



    /**
     * The project ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get changesRequested
     * @return changesRequested
     */
    public AuditLogUserUpdatedChangesRequested getChangesRequested() {
        return changesRequested;
    }

    public void setChangesRequested(AuditLogUserUpdatedChangesRequested changesRequested) {
        this.changesRequested = changesRequested;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogUserUpdated {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    changesRequested: ").append(toIndentedString(changesRequested)).append("\n");
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

