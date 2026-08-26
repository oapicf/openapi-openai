package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.AuditLogInviteSentData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The details for events with this `type`.
 */
public class AuditLogInviteSent   {

    private String id;
    private AuditLogInviteSentData data;

    /**
     * Default constructor.
     */
    public AuditLogInviteSent() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogInviteSent.
     *
     * @param id The ID of the invite.
     * @param data data
     */
    public AuditLogInviteSent(
        String id, 
        AuditLogInviteSentData data
    ) {
        this.id = id;
        this.data = data;
    }



    /**
     * The ID of the invite.
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
    public AuditLogInviteSentData getData() {
        return data;
    }

    public void setData(AuditLogInviteSentData data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogInviteSent {\n");
        
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

