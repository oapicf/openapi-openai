package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an individual `user` within an organization.
 */
public class User   {


    /**
    * The object type, which is always `organization.user`
    */
    public enum ObjectEnum {
        ORGANIZATION_USER("organization.user");

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
    private String email;

    /**
    * `owner` or `reader`
    */
    public enum RoleEnum {
        OWNER("owner"),
        READER("reader");

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
    private Integer addedAt;

    /**
     * Default constructor.
     */
    public User() {
    // JSON-B / Jackson
    }

    /**
     * Create User.
     *
     * @param _object The object type, which is always &#x60;organization.user&#x60;
     * @param id The identifier, which can be referenced in API endpoints
     * @param name The name of the user
     * @param email The email address of the user
     * @param role &#x60;owner&#x60; or &#x60;reader&#x60;
     * @param addedAt The Unix timestamp (in seconds) of when the user was added.
     */
    public User(
        ObjectEnum _object, 
        String id, 
        String name, 
        String email, 
        RoleEnum role, 
        Integer addedAt
    ) {
        this._object = _object;
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
        this.addedAt = addedAt;
    }



    /**
     * The object type, which is always `organization.user`
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
     * The name of the user
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The email address of the user
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * `owner` or `reader`
     * @return role
     */
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    /**
     * The Unix timestamp (in seconds) of when the user was added.
     * @return addedAt
     */
    public Integer getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Integer addedAt) {
        this.addedAt = addedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
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

