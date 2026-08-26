package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to add the user to the project.
 */
public class AuditLogUserAddedData   {

    private String role;

    /**
     * Default constructor.
     */
    public AuditLogUserAddedData() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogUserAddedData.
     *
     * @param role The role of the user. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
     */
    public AuditLogUserAddedData(
        String role
    ) {
        this.role = role;
    }



    /**
     * The role of the user. Is either `owner` or `member`.
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
        sb.append("class AuditLogUserAddedData {\n");
        
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

