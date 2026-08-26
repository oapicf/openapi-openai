package org.openapitools.server.model;

import org.openapitools.server.model.AuditLogActorUser;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The session in which the audit logged action was performed.
 */
public class AuditLogActorSession   {

    private AuditLogActorUser user;
    private String ipAddress;

    /**
     * Default constructor.
     */
    public AuditLogActorSession() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogActorSession.
     *
     * @param user user
     * @param ipAddress The IP address from which the action was performed.
     */
    public AuditLogActorSession(
        AuditLogActorUser user, 
        String ipAddress
    ) {
        this.user = user;
        this.ipAddress = ipAddress;
    }



    /**
     * Get user
     * @return user
     */
    public AuditLogActorUser getUser() {
        return user;
    }

    public void setUser(AuditLogActorUser user) {
        this.user = user;
    }

    /**
     * The IP address from which the action was performed.
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogActorSession {\n");
        
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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

