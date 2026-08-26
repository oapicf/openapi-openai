package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogProjectCreatedData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogProjectCreated   {

    private String id;
    private AuditLogProjectCreatedData data;

    /**
     * Default constructor.
     */
    public AuditLogProjectCreated() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogProjectCreated.
     *
     * @param id The project ID.
     * @param data data
     */
    public AuditLogProjectCreated(
        String id, 
        AuditLogProjectCreatedData data
    ) {
        this.id = id;
        this.data = data;
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
     * Get data
     * @return data
     */
    public AuditLogProjectCreatedData getData() {
        return data;
    }

    public void setData(AuditLogProjectCreatedData data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogProjectCreated {\n");
        
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

