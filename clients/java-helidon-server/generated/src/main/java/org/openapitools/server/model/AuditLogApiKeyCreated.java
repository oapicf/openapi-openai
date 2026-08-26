package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogApiKeyCreatedData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogApiKeyCreated   {

    private String id;
    private AuditLogApiKeyCreatedData data;

    /**
     * Default constructor.
     */
    public AuditLogApiKeyCreated() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogApiKeyCreated.
     *
     * @param id The tracking ID of the API key.
     * @param data data
     */
    public AuditLogApiKeyCreated(
        String id, 
        AuditLogApiKeyCreatedData data
    ) {
        this.id = id;
        this.data = data;
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
     * Get data
     * @return data
     */
    public AuditLogApiKeyCreatedData getData() {
        return data;
    }

    public void setData(AuditLogApiKeyCreatedData data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogApiKeyCreated {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

