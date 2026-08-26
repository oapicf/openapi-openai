package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.VectorStoreFileObjectChunkingStrategy;
import org.openapitools.server.model.VectorStoreFileObjectLastError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A list of files attached to a vector store.
 */
public class VectorStoreFileObject   {

    private String id;

    /**
    * The object type, which is always `vector_store.file`.
    */
    public enum ObjectEnum {
        VECTOR_STORE_FILE("vector_store.file");

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
    private Integer createdAt;
    private String vectorStoreId;

    /**
    * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
    */
    public enum StatusEnum {
        IN_PROGRESS("in_progress"),
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        FAILED("failed");

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
    private VectorStoreFileObjectLastError lastError;
    private VectorStoreFileObjectChunkingStrategy chunkingStrategy;

    /**
     * Default constructor.
     */
    public VectorStoreFileObject() {
    // JSON-B / Jackson
    }

    /**
     * Create VectorStoreFileObject.
     *
     * @param id The identifier, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;vector_store.file&#x60;.
     * @param usageBytes The total vector store usage in bytes. Note that this may be different from the original file size.
     * @param createdAt The Unix timestamp (in seconds) for when the vector store file was created.
     * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
     * @param status The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use.
     * @param lastError lastError
     * @param chunkingStrategy chunkingStrategy
     */
    public VectorStoreFileObject(
        String id, 
        ObjectEnum _object, 
        Integer usageBytes, 
        Integer createdAt, 
        String vectorStoreId, 
        StatusEnum status, 
        VectorStoreFileObjectLastError lastError, 
        VectorStoreFileObjectChunkingStrategy chunkingStrategy
    ) {
        this.id = id;
        this._object = _object;
        this.usageBytes = usageBytes;
        this.createdAt = createdAt;
        this.vectorStoreId = vectorStoreId;
        this.status = status;
        this.lastError = lastError;
        this.chunkingStrategy = chunkingStrategy;
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
     * The object type, which is always `vector_store.file`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The total vector store usage in bytes. Note that this may be different from the original file size.
     * @return usageBytes
     */
    public Integer getUsageBytes() {
        return usageBytes;
    }

    public void setUsageBytes(Integer usageBytes) {
        this.usageBytes = usageBytes;
    }

    /**
     * The Unix timestamp (in seconds) for when the vector store file was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
     * @return vectorStoreId
     */
    public String getVectorStoreId() {
        return vectorStoreId;
    }

    public void setVectorStoreId(String vectorStoreId) {
        this.vectorStoreId = vectorStoreId;
    }

    /**
     * The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get lastError
     * @return lastError
     */
    public VectorStoreFileObjectLastError getLastError() {
        return lastError;
    }

    public void setLastError(VectorStoreFileObjectLastError lastError) {
        this.lastError = lastError;
    }

    /**
     * Get chunkingStrategy
     * @return chunkingStrategy
     */
    public VectorStoreFileObjectChunkingStrategy getChunkingStrategy() {
        return chunkingStrategy;
    }

    public void setChunkingStrategy(VectorStoreFileObjectChunkingStrategy chunkingStrategy) {
        this.chunkingStrategy = chunkingStrategy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VectorStoreFileObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    vectorStoreId: ").append(toIndentedString(vectorStoreId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
        sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
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

