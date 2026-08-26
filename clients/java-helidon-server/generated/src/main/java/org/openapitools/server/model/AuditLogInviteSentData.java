package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to create the invite.
 */
public class AuditLogInviteSentData   {

    private String email;
    private String role;

    /**
     * Default constructor.
     */
    public AuditLogInviteSentData() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogInviteSentData.
     *
     * @param email The email invited to the organization.
     * @param role The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
     */
    public AuditLogInviteSentData(
        String email, 
        String role
    ) {
        this.email = email;
        this.role = role;
    }



    /**
     * The email invited to the organization.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * The role the email was invited to be. Is either `owner` or `member`.
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogInviteSentData {\n");
        
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

