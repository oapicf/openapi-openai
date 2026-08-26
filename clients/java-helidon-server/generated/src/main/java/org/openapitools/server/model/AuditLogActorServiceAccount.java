package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The service account that performed the audit logged action.
 */
public class AuditLogActorServiceAccount   {

    private String id;

    /**
     * Default constructor.
     */
    public AuditLogActorServiceAccount() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogActorServiceAccount.
     *
     * @param id The service account id.
     */
    public AuditLogActorServiceAccount(
        String id
    ) {
        this.id = id;
    }



    /**
     * The service account id.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogActorServiceAccount {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

