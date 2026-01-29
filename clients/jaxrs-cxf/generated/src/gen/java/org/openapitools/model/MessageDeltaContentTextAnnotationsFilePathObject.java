package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 */
@ApiModel(description="A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")

public class MessageDeltaContentTextAnnotationsFilePathObject  {
  
 /**
  * The index of the annotation in the text content part.
  */
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")

  private Integer index;

public enum TypeEnum {

FILE_PATH(String.valueOf("file_path"));


    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Always `file_path`.
  */
  @ApiModelProperty(required = true, value = "Always `file_path`.")

  private TypeEnum type;

 /**
  * The text in the message content that needs to be replaced.
  */
  @ApiModelProperty(value = "The text in the message content that needs to be replaced.")

  private String text;

  @ApiModelProperty(value = "")

  @Valid

  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath;

  @ApiModelProperty(value = "")

  private Integer startIndex;

  @ApiModelProperty(value = "")

  private Integer endIndex;
 /**
   * The index of the annotation in the text content part.
   * @return index
  **/
  @JsonProperty("index")
  @NotNull
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Always &#x60;file_path&#x60;.
   * @return type
  **/
  @JsonProperty("type")
  @NotNull
  public String getType() {
    if (type == null) {
      return null;
    }
    return type.value();
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
   * The text in the message content that needs to be replaced.
   * @return text
  **/
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject text(String text) {
    this.text = text;
    return this;
  }

 /**
   * Get filePath
   * @return filePath
  **/
  @JsonProperty("file_path")
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject filePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

 /**
   * Get startIndex
   * minimum: 0
   * @return startIndex
  **/
  @JsonProperty("start_index")
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

 /**
   * Get endIndex
   * minimum: 0
   * @return endIndex
  **/
  @JsonProperty("end_index")
 @Min(0)  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public MessageDeltaContentTextAnnotationsFilePathObject endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
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
    return Objects.equals(this.index, messageDeltaContentTextAnnotationsFilePathObject.index) &&
        Objects.equals(this.type, messageDeltaContentTextAnnotationsFilePathObject.type) &&
        Objects.equals(this.text, messageDeltaContentTextAnnotationsFilePathObject.text) &&
        Objects.equals(this.filePath, messageDeltaContentTextAnnotationsFilePathObject.filePath) &&
        Objects.equals(this.startIndex, messageDeltaContentTextAnnotationsFilePathObject.startIndex) &&
        Objects.equals(this.endIndex, messageDeltaContentTextAnnotationsFilePathObject.endIndex);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

