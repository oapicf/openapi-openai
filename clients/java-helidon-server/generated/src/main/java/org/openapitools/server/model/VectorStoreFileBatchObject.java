package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.VectorStoreFileBatchObjectFileCounts;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A batch of files attached to a vector store.
 */
public class VectorStoreFileBatchObject   {

    private String id;

    /**
    * The object type, which is always `vector_store.file_batch`.
    */
    public enum ObjectEnum {
        VECTOR_STORE_FILES_BATCH("vector_store.files_batch");

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
    private String vectorStoreId;

    /**
    * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
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
    private VectorStoreFileBatchObjectFileCounts fileCounts;

    /**
     * Default constructor.
     */
    public VectorStoreFileBatchObject() {
    // JSON-B / Jackson
    }

    /**
     * Create VectorStoreFileBatchObject.
     *
     * @param id The identifier, which can be referenced in API endpoints.
     * @param _object The object type, which is always &#x60;vector_store.file_batch&#x60;.
     * @param createdAt The Unix timestamp (in seconds) for when the vector store files batch was created.
     * @param vectorStoreId The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
     * @param status The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;.
     * @param fileCounts fileCounts
     */
    public VectorStoreFileBatchObject(
        String id, 
        ObjectEnum _object, 
        Integer createdAt, 
        String vectorStoreId, 
        StatusEnum status, 
        VectorStoreFileBatchObjectFileCounts fileCounts
    ) {
        this.id = id;
        this._object = _object;
        this.createdAt = createdAt;
        this.vectorStoreId = vectorStoreId;
        this.status = status;
        this.fileCounts = fileCounts;
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
     * The object type, which is always `vector_store.file_batch`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The Unix timestamp (in seconds) for when the vector store files batch was created.
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
     * The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Get fileCounts
     * @return fileCounts
     */
    public VectorStoreFileBatchObjectFileCounts getFileCounts() {
        return fileCounts;
    }

    public void setFileCounts(VectorStoreFileBatchObjectFileCounts fileCounts) {
        this.fileCounts = fileCounts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VectorStoreFileBatchObject {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    vectorStoreId: ").append(toIndentedString(vectorStoreId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    fileCounts: ").append(toIndentedString(fileCounts)).append("\n");
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

