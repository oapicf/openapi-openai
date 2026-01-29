package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageContentTextAnnotationsFilePathObjectFilePath;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")
public class MessageContentTextAnnotationsFilePathObject   {
  

public enum TypeEnum {

    @JsonProperty("file_path") FILE_PATH(String.valueOf("file_path"));


    private String value;

    TypeEnum(String v) {
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

  private TypeEnum type;

  private String text;

  private MessageContentTextAnnotationsFilePathObjectFilePath filePath;

  private Integer startIndex;

  private Integer endIndex;

  /**
   * Always &#x60;file_path&#x60;.
   **/
  public MessageContentTextAnnotationsFilePathObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Always `file_path`.")
  @JsonProperty("type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The text in the message content that needs to be replaced.
   **/
  public MessageContentTextAnnotationsFilePathObject text(String text) {
    this.text = text;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The text in the message content that needs to be replaced.")
  @JsonProperty("text")
  @NotNull
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public MessageContentTextAnnotationsFilePathObject filePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("file_path")
  @NotNull
  public MessageContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }
  public void setFilePath(MessageContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }


  /**
   * minimum: 0
   **/
  public MessageContentTextAnnotationsFilePathObject startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("start_index")
  @NotNull
 @Min(0)  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  /**
   * minimum: 0
   **/
  public MessageContentTextAnnotationsFilePathObject endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("end_index")
  @NotNull
 @Min(0)  public Integer getEndIndex() {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

