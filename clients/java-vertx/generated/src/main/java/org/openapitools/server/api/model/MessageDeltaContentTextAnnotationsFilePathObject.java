package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageDeltaContentTextAnnotationsFilePathObject   {
  
  private Integer index;


  public enum TypeEnum {
    FILE_PATH("file_path");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private String text;
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;
  private Integer startIndex;
  private Integer endIndex;

  public MessageDeltaContentTextAnnotationsFilePathObject () {

  }

  public MessageDeltaContentTextAnnotationsFilePathObject (Integer index, TypeEnum type, String text, MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath, Integer startIndex, Integer endIndex) {
    this.index = index;
    this.type = type;
    this.text = text;
    this.filePath = filePath;
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

    
  @JsonProperty("file_path")
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }
  public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

    
  @JsonProperty("start_index")
  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

    
  @JsonProperty("end_index")
  public Integer getEndIndex() {
    return endIndex;
  }
  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDeltaContentTextAnnotationsFilePathObject messageDeltaContentTextAnnotationsFilePathObject = (MessageDeltaContentTextAnnotationsFilePathObject) o;
    return Objects.equals(index, messageDeltaContentTextAnnotationsFilePathObject.index) &&
        Objects.equals(type, messageDeltaContentTextAnnotationsFilePathObject.type) &&
        Objects.equals(text, messageDeltaContentTextAnnotationsFilePathObject.text) &&
        Objects.equals(filePath, messageDeltaContentTextAnnotationsFilePathObject.filePath) &&
        Objects.equals(startIndex, messageDeltaContentTextAnnotationsFilePathObject.startIndex) &&
        Objects.equals(endIndex, messageDeltaContentTextAnnotationsFilePathObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, type, text, filePath, startIndex, endIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFilePathObject {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
