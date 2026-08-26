package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ProjectApiKeyOwner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an individual API key in a project.
 */
public class ProjectApiKey   {


    /**
    * The object type, which is always `organization.project.api_key`
    */
    public enum ObjectEnum {
        ORGANIZATION_PROJECT_API_KEY("organization.project.api_key");

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
    private String redactedValue;
    private String name;
    private Integer createdAt;
    private String id;
    private ProjectApiKeyOwner owner;

    /**
     * Default constructor.
     */
    public ProjectApiKey() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectApiKey.
     *
     * @param _object The object type, which is always &#x60;organization.project.api_key&#x60;
     * @param redactedValue The redacted value of the API key
     * @param name The name of the API key
     * @param createdAt The Unix timestamp (in seconds) of when the API key was created
     * @param id The identifier, which can be referenced in API endpoints
     * @param owner owner
     */
    public ProjectApiKey(
        ObjectEnum _object, 
        String redactedValue, 
        String name, 
        Integer createdAt, 
        String id, 
        ProjectApiKeyOwner owner
    ) {
        this._object = _object;
        this.redactedValue = redactedValue;
        this.name = name;
        this.createdAt = createdAt;
        this.id = id;
        this.owner = owner;
    }



    /**
     * The object type, which is always `organization.project.api_key`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The redacted value of the API key
     * @return redactedValue
     */
    public String getRedactedValue() {
        return redactedValue;
    }

    public void setRedactedValue(String redactedValue) {
        this.redactedValue = redactedValue;
    }

    /**
     * The name of the API key
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The Unix timestamp (in seconds) of when the API key was created
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
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
     * Get owner
     * @return owner
     */
    public ProjectApiKeyOwner getOwner() {
        return owner;
    }

    public void setOwner(ProjectApiKeyOwner owner) {
        this.owner = owner;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectApiKey {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    redactedValue: ").append(toIndentedString(redactedValue)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

