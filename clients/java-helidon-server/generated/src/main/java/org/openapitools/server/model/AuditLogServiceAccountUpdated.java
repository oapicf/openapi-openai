package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogServiceAccountUpdatedChangesRequested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogServiceAccountUpdated   {

    private String id;
    private AuditLogServiceAccountUpdatedChangesRequested changesRequested;

    /**
     * Default constructor.
     */
    public AuditLogServiceAccountUpdated() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogServiceAccountUpdated.
     *
     * @param id The service account ID.
     * @param changesRequested changesRequested
     */
    public AuditLogServiceAccountUpdated(
        String id, 
        AuditLogServiceAccountUpdatedChangesRequested changesRequested
    ) {
        this.id = id;
        this.changesRequested = changesRequested;
    }



    /**
     * The service account ID.
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
    public AuditLogServiceAccountUpdatedChangesRequested getChangesRequested() {
        return changesRequested;
    }

    public void setChangesRequested(AuditLogServiceAccountUpdatedChangesRequested changesRequested) {
        this.changesRequested = changesRequested;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogServiceAccountUpdated {\n");
        
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

