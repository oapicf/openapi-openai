package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.AuditLogActorServiceAccount;
import org.openapitools.server.model.AuditLogActorUser;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The API Key used to perform the audit logged action.
 */
public class AuditLogActorApiKey   {

    private String id;

    /**
    * The type of API key. Can be either `user` or `service_account`.
    */
    public enum TypeEnum {
        USER("user"),
        SERVICE_ACCOUNT("service_account");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private AuditLogActorUser user;
    private AuditLogActorServiceAccount serviceAccount;

    /**
     * Default constructor.
     */
    public AuditLogActorApiKey() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogActorApiKey.
     *
     * @param id The tracking id of the API key.
     * @param type The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;.
     * @param user user
     * @param serviceAccount serviceAccount
     */
    public AuditLogActorApiKey(
        String id, 
        TypeEnum type, 
        AuditLogActorUser user, 
        AuditLogActorServiceAccount serviceAccount
    ) {
        this.id = id;
        this.type = type;
        this.user = user;
        this.serviceAccount = serviceAccount;
    }



    /**
     * The tracking id of the API key.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The type of API key. Can be either `user` or `service_account`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
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
     * Get serviceAccount
     * @return serviceAccount
     */
    public AuditLogActorServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(AuditLogActorServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogActorApiKey {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    serviceAccount: ").append(toIndentedString(serviceAccount)).append("\n");
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

