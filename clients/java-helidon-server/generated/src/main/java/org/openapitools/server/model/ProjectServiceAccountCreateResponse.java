package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ProjectServiceAccountApiKey;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProjectServiceAccountCreateResponse   {


    /**
    * Gets or Sets _object
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
    * Service accounts can only have one role of type `member`
    */
    public enum RoleEnum {
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
    private ProjectServiceAccountApiKey apiKey;

    /**
     * Default constructor.
     */
    public ProjectServiceAccountCreateResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectServiceAccountCreateResponse.
     *
     * @param _object _object
     * @param id id
     * @param name name
     * @param role Service accounts can only have one role of type &#x60;member&#x60;
     * @param createdAt createdAt
     * @param apiKey apiKey
     */
    public ProjectServiceAccountCreateResponse(
        ObjectEnum _object, 
        String id, 
        String name, 
        RoleEnum role, 
        Integer createdAt, 
        ProjectServiceAccountApiKey apiKey
    ) {
        this._object = _object;
        this.id = id;
        this.name = name;
        this.role = role;
        this.createdAt = createdAt;
        this.apiKey = apiKey;
    }



    /**
     * Get _object
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Service accounts can only have one role of type `member`
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Get apiKey
     * @return apiKey
     */
    public ProjectServiceAccountApiKey getApiKey() {
        return apiKey;
    }

    public void setApiKey(ProjectServiceAccountApiKey apiKey) {
        this.apiKey = apiKey;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectServiceAccountCreateResponse {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

