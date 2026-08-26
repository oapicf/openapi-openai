package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogProjectUpdatedChangesRequested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogProjectUpdated   {

    private String id;
    private AuditLogProjectUpdatedChangesRequested changesRequested;

    /**
     * Default constructor.
     */
    public AuditLogProjectUpdated() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogProjectUpdated.
     *
     * @param id The project ID.
     * @param changesRequested changesRequested
     */
    public AuditLogProjectUpdated(
        String id, 
        AuditLogProjectUpdatedChangesRequested changesRequested
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
    public AuditLogProjectUpdatedChangesRequested getChangesRequested() {
        return changesRequested;
    }

    public void setChangesRequested(AuditLogProjectUpdatedChangesRequested changesRequested) {
        this.changesRequested = changesRequested;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogProjectUpdated {\n");
        
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

