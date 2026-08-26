package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageContentTextAnnotationsFileCitationObject;
import org.openapitools.server.model.MessageContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.server.model.MessageContentTextAnnotationsFilePathObject;
import org.openapitools.server.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageContentTextObjectTextAnnotationsInner   {


    /**
    * Always `file_citation`.
    */
    public enum TypeEnum {
        FILE_CITATION("file_citation"),
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
    private MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation;
    private Integer startIndex;
    private Integer endIndex;
    private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

    /**
     * Default constructor.
     */
    public MessageContentTextObjectTextAnnotationsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageContentTextObjectTextAnnotationsInner.
     *
     * @param type Always &#x60;file_citation&#x60;.
     * @param text The text in the message content that needs to be replaced.
     * @param fileCitation fileCitation
     * @param startIndex startIndex
     * @param endIndex endIndex
     * @param filePath filePath
     */
    public MessageContentTextObjectTextAnnotationsInner(
        TypeEnum type, 
        String text, 
        MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation, 
        Integer startIndex, 
        Integer endIndex, 
        MessageContentTextAnnotationsFilePathObjectFilePath filePath
    ) {
        this.type = type;
        this.text = text;
        this.fileCitation = fileCitation;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.filePath = filePath;
    }



    /**
     * Always `file_citation`.
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
     * Get fileCitation
     * @return fileCitation
     */
    public MessageContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
        return fileCitation;
    }

    public void setFileCitation(MessageContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
        this.fileCitation = fileCitation;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageContentTextObjectTextAnnotationsInner {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    fileCitation: ").append(toIndentedString(fileCitation)).append("\n");
        sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
        sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
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

