package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.
 */
@ApiModel(description="A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")

public class MessageContentTextAnnotationsFilePathObject  {
  
public enum TypeEnum {

    @JsonProperty("file_path") FILE_PATH(String.valueOf("file_path"));

    private String value;

    TypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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
  @ApiModelProperty(required = true, value = "The text in the message content that needs to be replaced.")
  private String text;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  @ApiModelProperty(required = true, value = "")
  private Integer startIndex;

  @ApiModelProperty(required = true, value = "")
  private Integer endIndex;
 /**
  * Always &#x60;file_path&#x60;.
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type == null ? null : type.value();
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public MessageContentTextAnnotationsFilePathObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

 /**
  * The text in the message content that needs to be replaced.
  * @return text
  */
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }

  /**
   * Sets the <code>text</code> property.
   */
 public void setText(String text) {
    this.text = text;
  }

  /**
   * Sets the <code>text</code> property.
   */
  public MessageContentTextAnnotationsFilePathObject text(String text) {
    this.text = text;
    return this;
  }

 /**
  * Get filePath
  * @return filePath
  */
  @JsonProperty("file_path")
  @NotNull
  public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }

  /**
   * Sets the <code>filePath</code> property.
   */
 public void setFilePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  /**
   * Sets the <code>filePath</code> property.
   */
  public MessageContentTextAnnotationsFilePathObject filePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

 /**
  * Get startIndex
  * minimum: 0
  * @return startIndex
  */
  @JsonProperty("start_index")
  @NotNull
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }

  /**
   * Sets the <code>startIndex</code> property.
   */
 public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * Sets the <code>startIndex</code> property.
   */
  public MessageContentTextAnnotationsFilePathObject startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

 /**
  * Get endIndex
  * minimum: 0
  * @return endIndex
  */
  @JsonProperty("end_index")
  @NotNull
 @Min(0)  public Integer getEndIndex() {
    return endIndex;
  }

  /**
   * Sets the <code>endIndex</code> property.
   */
 public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  /**
   * Sets the <code>endIndex</code> property.
   */
  public MessageContentTextAnnotationsFilePathObject endIndex(Integer endIndex) {
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
    MessageContentTextAnnotationsFilePathObject messageContentTextAnnotationsFilePathObject = (MessageContentTextAnnotationsFilePathObject) o;
    return Objects.equals(this.type, messageContentTextAnnotationsFilePathObject.type) &&
        Objects.equals(this.text, messageContentTextAnnotationsFilePathObject.text) &&
        Objects.equals(this.filePath, messageContentTextAnnotationsFilePathObject.filePath) &&
        Objects.equals(this.startIndex, messageContentTextAnnotationsFilePathObject.startIndex) &&
        Objects.equals(this.endIndex, messageContentTextAnnotationsFilePathObject.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, filePath, startIndex, endIndex);
  }

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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

