package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The `File` object represents a document that has been uploaded to OpenAI.
 */
public class OpenAIFile   {

    private String id;
    private Integer bytes;
    private Integer createdAt;
    private String filename;

    /**
    * The object type, which is always `file`.
    */
    public enum ObjectEnum {
        FILE("file");

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
    * The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
    */
    public enum PurposeEnum {
        ASSISTANTS("assistants"),
        ASSISTANTS_OUTPUT("assistants_output"),
        BATCH("batch"),
        BATCH_OUTPUT("batch_output"),
        FINE_TUNE("fine-tune"),
        FINE_TUNE_RESULTS("fine-tune-results"),
        VISION("vision");

        private String value;

        PurposeEnum(String value) {
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
        public static PurposeEnum fromValue(String text) {
            for (PurposeEnum b : PurposeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private PurposeEnum purpose;

    /**
    * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
    */
    public enum StatusEnum {
        UPLOADED("uploaded"),
        PROCESSED("processed"),
        ERROR("error");

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
    private String statusDetails;

    /**
     * Default constructor.
     */
    public OpenAIFile() {
    // JSON-B / Jackson
    }

    /**
     * Create OpenAIFile.
     *
     * @param id The file identifier, which can be referenced in the API endpoints.
     * @param bytes The size of the file, in bytes.
     * @param createdAt The Unix timestamp (in seconds) for when the file was created.
     * @param filename The name of the file.
     * @param _object The object type, which is always &#x60;file&#x60;.
     * @param purpose The intended purpose of the file. Supported values are &#x60;assistants&#x60;, &#x60;assistants_output&#x60;, &#x60;batch&#x60;, &#x60;batch_output&#x60;, &#x60;fine-tune&#x60;, &#x60;fine-tune-results&#x60; and &#x60;vision&#x60;.
     * @param status Deprecated. The current status of the file, which can be either &#x60;uploaded&#x60;, &#x60;processed&#x60;, or &#x60;error&#x60;.
     * @param statusDetails Deprecated. For details on why a fine-tuning training file failed validation, see the &#x60;error&#x60; field on &#x60;fine_tuning.job&#x60;.
     */
    public OpenAIFile(
        String id, 
        Integer bytes, 
        Integer createdAt, 
        String filename, 
        ObjectEnum _object, 
        PurposeEnum purpose, 
        StatusEnum status, 
        String statusDetails
    ) {
        this.id = id;
        this.bytes = bytes;
        this.createdAt = createdAt;
        this.filename = filename;
        this._object = _object;
        this.purpose = purpose;
        this.status = status;
        this.statusDetails = statusDetails;
    }



    /**
     * The file identifier, which can be referenced in the API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The size of the file, in bytes.
     * @return bytes
     */
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    /**
     * The Unix timestamp (in seconds) for when the file was created.
     * @return createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The name of the file.
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * The object type, which is always `file`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
     * @return purpose
     */
    public PurposeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    /**
     * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    /**
     * Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
     * @return statusDetails
     */
    public String getStatusDetails() {
        return statusDetails;
    }

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenAIFile {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
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

