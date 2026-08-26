package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents an individual project.
 */
public class Project   {

    private String id;

    /**
    * The object type, which is always `organization.project`
    */
    public enum ObjectEnum {
        ORGANIZATION_PROJECT("organization.project");

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
    private String name;
    private Integer createdAt;
    private Integer archivedAt;

    /**
    * `active` or `archived`
    */
    public enum StatusEnum {
        ACTIVE("active"),
        ARCHIVED("archived");

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String text) {
            for (StatusEnum b : StatusEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StatusEnum status;

    /**
     * Default constructor.
     */
    public Project() {
    // JSON-B / Jackson
    }

    /**
     * Create Project.
     *
     * @param id The identifier, which can be referenced in API endpoints
     * @param _object The object type, which is always &#x60;organization.project&#x60;
     * @param name The name of the project. This appears in reporting.
     * @param createdAt The Unix timestamp (in seconds) of when the project was created.
     * @param archivedAt The Unix timestamp (in seconds) of when the project was archived or &#x60;null&#x60;.
     * @param status &#x60;active&#x60; or &#x60;archived&#x60;
     */
    public Project(
        String id, 
        ObjectEnum _object, 
        String name, 
        Integer createdAt, 
        Integer archivedAt, 
        StatusEnum status
    ) {
        this.id = id;
        this._object = _object;
        this.name = name;
        this.createdAt = createdAt;
        this.archivedAt = archivedAt;
        this.status = status;
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
     * The object type, which is always `organization.project`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The name of the project. This appears in reporting.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The Unix timestamp (in seconds) of when the project was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The Unix timestamp (in seconds) of when the project was archived or `null`.
     * @return archivedAt
     */
    public Integer getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(Integer archivedAt) {
        this.archivedAt = archivedAt;
    }

    /**
     * `active` or `archived`
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Project {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

