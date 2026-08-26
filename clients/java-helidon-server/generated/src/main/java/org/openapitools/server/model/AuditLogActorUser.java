package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The user who performed the audit logged action.
 */
public class AuditLogActorUser   {

    private String id;
    private String email;

    /**
     * Default constructor.
     */
    public AuditLogActorUser() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogActorUser.
     *
     * @param id The user id.
     * @param email The user email.
     */
    public AuditLogActorUser(
        String id, 
        String email
    ) {
        this.id = id;
        this.email = email;
    }



    /**
     * The user id.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The user email.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogActorUser {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

