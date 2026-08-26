package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OpenAIFile;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The Upload object can accept byte chunks in the form of Parts. 
 */
public class Upload   {

    private String id;
    private Integer createdAt;
    private String filename;
    private Integer bytes;
    private String purpose;

    /**
    * The status of the Upload.
    */
    public enum StatusEnum {
        PENDING("pending"),
        COMPLETED("completed"),
        CANCELLED("cancelled"),
        EXPIRED("expired");

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
    private Integer expiresAt;

    /**
    * The object type, which is always \"upload\".
    */
    public enum ObjectEnum {
        UPLOAD("upload");

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
    private OpenAIFile _file;

    /**
     * Default constructor.
     */
    public Upload() {
    // JSON-B / Jackson
    }

    /**
     * Create Upload.
     *
     * @param id The Upload unique identifier, which can be referenced in API endpoints.
     * @param createdAt The Unix timestamp (in seconds) for when the Upload was created.
     * @param filename The name of the file to be uploaded.
     * @param bytes The intended number of bytes to be uploaded.
     * @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
     * @param status The status of the Upload.
     * @param expiresAt The Unix timestamp (in seconds) for when the Upload was created.
     * @param _object The object type, which is always \&quot;upload\&quot;.
     * @param _file _file
     */
    public Upload(
        String id, 
        Integer createdAt, 
        String filename, 
        Integer bytes, 
        String purpose, 
        StatusEnum status, 
        Integer expiresAt, 
        ObjectEnum _object, 
        OpenAIFile _file
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.filename = filename;
        this.bytes = bytes;
        this.purpose = purpose;
        this.status = status;
        this.expiresAt = expiresAt;
        this._object = _object;
        this._file = _file;
    }



    /**
     * The Upload unique identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The Unix timestamp (in seconds) for when the Upload was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The name of the file to be uploaded.
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * The intended number of bytes to be uploaded.
     * @return bytes
     */
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    /**
     * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
     * @return purpose
     */
    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    /**
     * The status of the Upload.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * The Unix timestamp (in seconds) for when the Upload was created.
     * @return expiresAt
     */
    public Integer getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
    }

    /**
     * The object type, which is always \"upload\".
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get _file
     * @return _file
     */
    public OpenAIFile getFile() {
        return _file;
    }

    public void setFile(OpenAIFile _file) {
        this._file = _file;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Upload {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    _file: ").append(toIndentedString(_file)).append("\n");
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

