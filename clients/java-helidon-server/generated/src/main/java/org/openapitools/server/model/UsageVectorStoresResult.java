package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The aggregated vector stores usage details of the specific time bucket.
 */
public class UsageVectorStoresResult   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        ORGANIZATION_USAGE_VECTOR_STORES_RESULT("organization.usage.vector_stores.result");

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
    private Integer usageBytes;
    private String projectId;

    /**
     * Default constructor.
     */
    public UsageVectorStoresResult() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageVectorStoresResult.
     *
     * @param _object _object
     * @param usageBytes The vector stores usage in bytes.
     * @param projectId When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     */
    public UsageVectorStoresResult(
        ObjectEnum _object, 
        Integer usageBytes, 
        String projectId
    ) {
        this._object = _object;
        this.usageBytes = usageBytes;
        this.projectId = projectId;
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
     * The vector stores usage in bytes.
     * @return usageBytes
     */
    public Integer getUsageBytes() {
        return usageBytes;
    }

    public void setUsageBytes(Integer usageBytes) {
        this.usageBytes = usageBytes;
    }

    /**
     * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageVectorStoresResult {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

