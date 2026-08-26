package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The upload Part represents a chunk of bytes we can add to an Upload object. 
 */
public class UploadPart   {

    private String id;
    private Integer createdAt;
    private String uploadId;

    /**
    * The object type, which is always `upload.part`.
    */
    public enum ObjectEnum {
        UPLOAD_PART("upload.part");

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

    /**
     * Default constructor.
     */
    public UploadPart() {
    // JSON-B / Jackson
    }

    /**
     * Create UploadPart.
     *
     * @param id The upload Part unique identifier, which can be referenced in API endpoints.
     * @param createdAt The Unix timestamp (in seconds) for when the Part was created.
     * @param uploadId The ID of the Upload object that this Part was added to.
     * @param _object The object type, which is always &#x60;upload.part&#x60;.
     */
    public UploadPart(
        String id, 
        Integer createdAt, 
        String uploadId, 
        ObjectEnum _object
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.uploadId = uploadId;
        this._object = _object;
    }



    /**
     * The upload Part unique identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Unix timestamp (in seconds) for when the Part was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The ID of the Upload object that this Part was added to.
     * @return uploadId
     */
    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * The object type, which is always `upload.part`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadPart {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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

