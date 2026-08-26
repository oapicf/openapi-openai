package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageDeltaContentImageFileObjectImageFile   {

    private String fileId;

    /**
    * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
    */
    public enum DetailEnum {
        AUTO("auto"),
        LOW("low"),
        HIGH("high");

        private String value;

        DetailEnum(String value) {
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
        public static DetailEnum fromValue(String text) {
            for (DetailEnum b : DetailEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private DetailEnum detail = DetailEnum.AUTO;

    /**
     * Default constructor.
     */
    public MessageDeltaContentImageFileObjectImageFile() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentImageFileObjectImageFile.
     *
     * @param fileId The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content.
     * @param detail Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
     */
    public MessageDeltaContentImageFileObjectImageFile(
        String fileId, 
        DetailEnum detail
    ) {
        this.fileId = fileId;
        this.detail = detail;
    }



    /**
     * The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    /**
     * Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
     * @return detail
     */
    public DetailEnum getDetail() {
        return detail;
    }

    public void setDetail(DetailEnum detail) {
        this.detail = detail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentImageFileObjectImageFile {\n");
        
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

