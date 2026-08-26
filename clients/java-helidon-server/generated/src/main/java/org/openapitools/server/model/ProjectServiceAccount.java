package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an individual service account in a project.
 */
public class ProjectServiceAccount   {


    /**
    * The object type, which is always `organization.project.service_account`
    */
    public enum ObjectEnum {
        ORGANIZATION_PROJECT_SERVICE_ACCOUNT("organization.project.service_account");

        private String value;

        ObjectEnum(String value) {
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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private String id;
    private String name;

    /**
    * `owner` or `member`
    */
    public enum RoleEnum {
        OWNER("owner"),
        MEMBER("member");

        private String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String text) {
            for (RoleEnum b : RoleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private RoleEnum role;
    private Integer createdAt;

    /**
     * Default constructor.
     */
    public ProjectServiceAccount() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectServiceAccount.
     *
     * @param _object The object type, which is always &#x60;organization.project.service_account&#x60;
     * @param id The identifier, which can be referenced in API endpoints
     * @param name The name of the service account
     * @param role &#x60;owner&#x60; or &#x60;member&#x60;
     * @param createdAt The Unix timestamp (in seconds) of when the service account was created
     */
    public ProjectServiceAccount(
        ObjectEnum _object, 
        String id, 
        String name, 
        RoleEnum role, 
        Integer createdAt
    ) {
        this._object = _object;
        this.id = id;
        this.name = name;
        this.role = role;
        this.createdAt = createdAt;
    }



    /**
     * The object type, which is always `organization.project.service_account`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The identifier, which can be referenced in API endpoints
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The name of the service account
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * `owner` or `member`
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * The Unix timestamp (in seconds) of when the service account was created
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectServiceAccount {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

