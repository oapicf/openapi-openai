package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogApiKeyUpdatedChangesRequested;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogApiKeyUpdated   {

    private String id;
    private AuditLogApiKeyUpdatedChangesRequested changesRequested;

    /**
     * Default constructor.
     */
    public AuditLogApiKeyUpdated() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogApiKeyUpdated.
     *
     * @param id The tracking ID of the API key.
     * @param changesRequested changesRequested
     */
    public AuditLogApiKeyUpdated(
        String id, 
        AuditLogApiKeyUpdatedChangesRequested changesRequested
    ) {
        this.id = id;
        this.changesRequested = changesRequested;
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
     * Get changesRequested
     * @return changesRequested
     */
    public AuditLogApiKeyUpdatedChangesRequested getChangesRequested() {
        return changesRequested;
    }

    public void setChangesRequested(AuditLogApiKeyUpdatedChangesRequested changesRequested) {
        this.changesRequested = changesRequested;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogApiKeyUpdated {\n");
        
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

