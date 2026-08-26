package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ProjectServiceAccountApiKey   {


    /**
    * The object type, which is always `organization.project.service_account.api_key`
    */
    public enum ObjectEnum {
        ORGANIZATION_PROJECT_SERVICE_ACCOUNT_API_KEY("organization.project.service_account.api_key");

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
    private String value;
    private String name;
    private Integer createdAt;
    private String id;

    /**
     * Default constructor.
     */
    public ProjectServiceAccountApiKey() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectServiceAccountApiKey.
     *
     * @param _object The object type, which is always &#x60;organization.project.service_account.api_key&#x60;
     * @param value value
     * @param name name
     * @param createdAt createdAt
     * @param id id
     */
    public ProjectServiceAccountApiKey(
        ObjectEnum _object, 
        String value, 
        String name, 
        Integer createdAt, 
        String id
    ) {
        this._object = _object;
        this.value = value;
        this.name = name;
        this.createdAt = createdAt;
        this.id = id;
    }



    /**
     * The object type, which is always `organization.project.service_account.api_key`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectServiceAccountApiKey {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

