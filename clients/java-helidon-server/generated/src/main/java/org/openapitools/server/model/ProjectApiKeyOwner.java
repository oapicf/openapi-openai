package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ProjectServiceAccount;
import org.openapitools.server.model.ProjectUser;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProjectApiKeyOwner   {


    /**
    * `user` or `service_account`
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
    private ProjectUser user;
    private ProjectServiceAccount serviceAccount;

    /**
     * Default constructor.
     */
    public ProjectApiKeyOwner() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectApiKeyOwner.
     *
     * @param type &#x60;user&#x60; or &#x60;service_account&#x60;
     * @param user user
     * @param serviceAccount serviceAccount
     */
    public ProjectApiKeyOwner(
        TypeEnum type, 
        ProjectUser user, 
        ProjectServiceAccount serviceAccount
    ) {
        this.type = type;
        this.user = user;
        this.serviceAccount = serviceAccount;
    }



    /**
     * `user` or `service_account`
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
    public ProjectUser getUser() {
        return user;
    }

    public void setUser(ProjectUser user) {
        this.user = user;
    }

    /**
     * Get serviceAccount
     * @return serviceAccount
     */
    public ProjectServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(ProjectServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectApiKeyOwner {\n");
        
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

