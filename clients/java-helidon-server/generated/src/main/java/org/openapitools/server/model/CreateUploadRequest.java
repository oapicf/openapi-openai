package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateUploadRequest   {

    private String filename;

    /**
    * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
    */
    public enum PurposeEnum {
        ASSISTANTS("assistants"),
        BATCH("batch"),
        FINE_TUNE("fine-tune"),
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
    private Integer bytes;
    private String mimeType;

    /**
     * Default constructor.
     */
    public CreateUploadRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateUploadRequest.
     *
     * @param filename The name of the file to upload. 
     * @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
     * @param bytes The number of bytes in the file you are uploading. 
     * @param mimeType The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
     */
    public CreateUploadRequest(
        String filename, 
        PurposeEnum purpose, 
        Integer bytes, 
        String mimeType
    ) {
        this.filename = filename;
        this.purpose = purpose;
        this.bytes = bytes;
        this.mimeType = mimeType;
    }



    /**
     * The name of the file to upload. 
     * @return filename
     */
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
     * @return purpose
     */
    public PurposeEnum getPurpose() {
        return purpose;
    }

    public void setPurpose(PurposeEnum purpose) {
        this.purpose = purpose;
    }

    /**
     * The number of bytes in the file you are uploading. 
     * @return bytes
     */
    public Integer getBytes() {
        return bytes;
    }

    public void setBytes(Integer bytes) {
        this.bytes = bytes;
    }

    /**
     * The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
     * @return mimeType
     */
    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUploadRequest {\n");
        
        sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
        sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
        sb.append("    bytes: ").append(toIndentedString(bytes)).append("\n");
        sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

