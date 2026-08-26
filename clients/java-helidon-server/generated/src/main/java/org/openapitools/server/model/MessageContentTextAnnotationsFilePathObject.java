package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 */
public class MessageContentTextAnnotationsFilePathObject   {


    /**
    * Always `file_path`.
    */
    public enum TypeEnum {
        FILE_PATH("file_path");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private String text;
    private MessageContentTextAnnotationsFilePathObjectFilePath filePath;
    private Integer startIndex;
    private Integer endIndex;

    /**
     * Default constructor.
     */
    public MessageContentTextAnnotationsFilePathObject() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageContentTextAnnotationsFilePathObject.
     *
     * @param type Always &#x60;file_path&#x60;.
     * @param text The text in the message content that needs to be replaced.
     * @param filePath filePath
     * @param startIndex startIndex
     * @param endIndex endIndex
     */
    public MessageContentTextAnnotationsFilePathObject(
        TypeEnum type, 
        String text, 
        MessageContentTextAnnotationsFilePathObjectFilePath filePath, 
        Integer startIndex, 
        Integer endIndex
    ) {
        this.type = type;
        this.text = text;
        this.filePath = filePath;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }



    /**
     * Always `file_path`.
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * The text in the message content that needs to be replaced.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get filePath
     * @return filePath
     */
    public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
        return filePath;
    }

    public void setFilePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
        this.filePath = filePath;
    }

    /**
     * Get startIndex
     * minimum: 0
     * @return startIndex
     */
    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * Get endIndex
     * minimum: 0
     * @return endIndex
     */
    public Integer getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(Integer endIndex) {
        this.endIndex = endIndex;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageContentTextAnnotationsFilePathObject {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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

