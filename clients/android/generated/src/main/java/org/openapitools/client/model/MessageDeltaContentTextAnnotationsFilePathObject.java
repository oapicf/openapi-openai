/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
 **/
@ApiModel(description = "A URL for the file that's generated when the assistant used the `code_interpreter` tool to generate a file.")
public class MessageDeltaContentTextAnnotationsFilePathObject {
  
  @SerializedName("index")
  private Integer index = null;
  public enum TypeEnum {
     file_path, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("text")
  private String text = null;
  @SerializedName("file_path")
  private MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath = null;
  @SerializedName("start_index")
  private Integer startIndex = null;
  @SerializedName("end_index")
  private Integer endIndex = null;

  /**
   * The index of the annotation in the text content part.
   **/
  @ApiModelProperty(required = true, value = "The index of the annotation in the text content part.")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Always `file_path`.
   **/
  @ApiModelProperty(required = true, value = "Always `file_path`.")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * The text in the message content that needs to be replaced.
   **/
  @ApiModelProperty(value = "The text in the message content that needs to be replaced.")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath getFilePath() {
    return filePath;
  }
  public void setFilePath(MessageDeltaContentTextAnnotationsFilePathObjectFilePath filePath) {
    this.filePath = filePath;
  }

  /**
   * minimum: 0
   **/
  @ApiModelProperty(value = "")
  public Integer getStartIndex() {
    return startIndex;
  }
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  /**
   * minimum: 0
   **/
  @ApiModelProperty(value = "")
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
    return (this.index == null ? messageDeltaContentTextAnnotationsFilePathObject.index == null : this.index.equals(messageDeltaContentTextAnnotationsFilePathObject.index)) &&
        (this.type == null ? messageDeltaContentTextAnnotationsFilePathObject.type == null : this.type.equals(messageDeltaContentTextAnnotationsFilePathObject.type)) &&
        (this.text == null ? messageDeltaContentTextAnnotationsFilePathObject.text == null : this.text.equals(messageDeltaContentTextAnnotationsFilePathObject.text)) &&
        (this.filePath == null ? messageDeltaContentTextAnnotationsFilePathObject.filePath == null : this.filePath.equals(messageDeltaContentTextAnnotationsFilePathObject.filePath)) &&
        (this.startIndex == null ? messageDeltaContentTextAnnotationsFilePathObject.startIndex == null : this.startIndex.equals(messageDeltaContentTextAnnotationsFilePathObject.startIndex)) &&
        (this.endIndex == null ? messageDeltaContentTextAnnotationsFilePathObject.endIndex == null : this.endIndex.equals(messageDeltaContentTextAnnotationsFilePathObject.endIndex));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.index == null ? 0: this.index.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.text == null ? 0: this.text.hashCode());
    result = 31 * result + (this.filePath == null ? 0: this.filePath.hashCode());
    result = 31 * result + (this.startIndex == null ? 0: this.startIndex.hashCode());
    result = 31 * result + (this.endIndex == null ? 0: this.endIndex.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFilePathObject {\n");
    
    sb.append("  index: ").append(index).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  text: ").append(text).append("\n");
    sb.append("  filePath: ").append(filePath).append("\n");
    sb.append("  startIndex: ").append(startIndex).append("\n");
    sb.append("  endIndex: ").append(endIndex).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
