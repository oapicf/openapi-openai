package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogUserAddedData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogUserAdded   {

    private String id;
    private AuditLogUserAddedData data;

    /**
     * Default constructor.
     */
    public AuditLogUserAdded() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogUserAdded.
     *
     * @param id The user ID.
     * @param data data
     */
    public AuditLogUserAdded(
        String id, 
        AuditLogUserAddedData data
    ) {
        this.id = id;
        this.data = data;
    }



    /**
     * The user ID.
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
    public AuditLogUserAddedData getData() {
        return data;
    }

    public void setData(AuditLogUserAddedData data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogUserAdded {\n");
        
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

