package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MessageDeltaContentTextAnnotationsFileCitationObject;
import org.openapitools.server.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import org.openapitools.server.model.MessageDeltaContentTextAnnotationsFilePathObject;
import org.openapitools.server.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageDeltaContentTextObjectTextAnnotationsInner   {

    private Integer index;

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
    private MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation;
    private Integer startIndex;
    private Integer endIndex;
    private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

    /**
     * Default constructor.
     */
    public MessageDeltaContentTextObjectTextAnnotationsInner() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentTextObjectTextAnnotationsInner.
     *
     * @param index The index of the annotation in the text content part.
     * @param type Always &#x60;file_citation&#x60;.
     * @param text The text in the message content that needs to be replaced.
     * @param fileCitation fileCitation
     * @param startIndex startIndex
     * @param endIndex endIndex
     * @param filePath filePath
     */
    public MessageDeltaContentTextObjectTextAnnotationsInner(
        Integer index, 
        TypeEnum type, 
        String text, 
        MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation, 
        Integer startIndex, 
        Integer endIndex, 
        MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath
    ) {
        this.index = index;
        this.type = type;
        this.text = text;
        this.fileCitation = fileCitation;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.filePath = filePath;
    }



    /**
     * The index of the annotation in the text content part.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
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
    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation getFileCitation() {
        return fileCitation;
    }

    public void setFileCitation(MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation fileCitation) {
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
    public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
        return filePath;
    }

    public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
        this.filePath = filePath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextObjectTextAnnotationsInner {\n");
        
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
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

