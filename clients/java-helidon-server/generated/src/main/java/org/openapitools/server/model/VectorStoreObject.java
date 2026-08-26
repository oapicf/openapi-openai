package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.VectorStoreExpirationAfter;
import org.openapitools.server.model.VectorStoreObjectFileCounts;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A vector store is a collection of processed files can be used by the `file_search` tool.
 */
public class VectorStoreObject   {

    private String id;

    /**
    * The object type, which is always `vector_store`.
    */
    public enum ObjectEnum {
        VECTOR_STORE("vector_store");

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
    private Integer createdAt;
    private String name;
    private Integer usageBytes;
    private VectorStoreObjectFileCounts fileCounts;

    /**
    * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
    */
    public enum StatusEnum {
        EXPIRED("expired"),
        IN_PROGRESS("in_progress"),
        COMPLETED("completed");

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
    private VectorStoreExpirationAfter expiresAfter;
    private Integer expiresAt;
    private Integer lastActiveAt;
    private Object metadata;

    /**
     * Default constructor.
     */
    public VectorStoreObject() {
    // JSON-B / Jackson
    }

    /**
     * Create VectorStoreObject.
     *
     * @param id The identifier, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;vector_store&#x60;.
     * @param createdAt The Unix timestamp (in seconds) for when the vector store was created.
     * @param name The name of the vector store.
     * @param usageBytes The total number of bytes used by the files in the vector store.
     * @param fileCounts fileCounts
     * @param status The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
     * @param expiresAfter expiresAfter
     * @param expiresAt The Unix timestamp (in seconds) for when the vector store will expire.
     * @param lastActiveAt The Unix timestamp (in seconds) for when the vector store was last active.
     * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     */
    public VectorStoreObject(
        String id, 
        ObjectEnum _object, 
        Integer createdAt, 
        String name, 
        Integer usageBytes, 
        VectorStoreObjectFileCounts fileCounts, 
        StatusEnum status, 
        VectorStoreExpirationAfter expiresAfter, 
        Integer expiresAt, 
        Integer lastActiveAt, 
        Object metadata
    ) {
        this.id = id;
        this._object = _object;
        this.createdAt = createdAt;
        this.name = name;
        this.usageBytes = usageBytes;
        this.fileCounts = fileCounts;
        this.status = status;
        this.expiresAfter = expiresAfter;
        this.expiresAt = expiresAt;
        this.lastActiveAt = lastActiveAt;
        this.metadata = metadata;
    }



    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The object type, which is always `vector_store`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The Unix timestamp (in seconds) for when the vector store was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The name of the vector store.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The total number of bytes used by the files in the vector store.
     * @return usageBytes
     */
    public Integer getUsageBytes() {
        return usageBytes;
    }

    public void setUsageBytes(Integer usageBytes) {
        this.usageBytes = usageBytes;
    }

    /**
     * Get fileCounts
     * @return fileCounts
     */
    public VectorStoreObjectFileCounts getFileCounts() {
        return fileCounts;
    }

    public void setFileCounts(VectorStoreObjectFileCounts fileCounts) {
        this.fileCounts = fileCounts;
    }

    /**
     * The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get expiresAfter
     * @return expiresAfter
     */
    public VectorStoreExpirationAfter getExpiresAfter() {
        return expiresAfter;
    }

    public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
        this.expiresAfter = expiresAfter;
    }

    /**
     * The Unix timestamp (in seconds) for when the vector store will expire.
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * The Unix timestamp (in seconds) for when the vector store was last active.
     * @return lastActiveAt
     */
    public Integer getLastActiveAt() {
        return lastActiveAt;
    }

    public void setLastActiveAt(Integer lastActiveAt) {
        this.lastActiveAt = lastActiveAt;
    }

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
     * @return metadata
     */
    public Object getMetadata() {
        return metadata;
    }

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VectorStoreObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
        sb.append("    fileCounts: ").append(toIndentedString(fileCounts)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    lastActiveAt: ").append(toIndentedString(lastActiveAt)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

