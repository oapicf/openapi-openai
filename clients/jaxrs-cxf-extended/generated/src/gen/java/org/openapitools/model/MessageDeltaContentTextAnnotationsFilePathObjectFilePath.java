package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MessageDeltaContentTextAnnotationsFilePathObjectFilePath  {
  
 /**
  * The ID of the file that was generated.
  */
  @ApiModelProperty(value = "The ID of the file that was generated.")
  private String fileId;
 /**
  * The ID of the file that was generated.
  * @return fileId
  */
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }

  /**
   * Sets the <code>fileId</code> property.
   */
 public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * Sets the <code>fileId</code> property.
   */
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath fileId(String fileId) {
    this.fileId = fileId;
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
    MessageDeltaContentTextAnnotationsFilePathObjectFilePath messageDeltaContentTextAnnotationsFilePathObjectFilePath = (MessageDeltaContentTextAnnotationsFilePathObjectFilePath) o;
    return Objects.equals(this.fileId, messageDeltaContentTextAnnotationsFilePathObjectFilePath.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageDeltaContentTextAnnotationsFilePathObjectFilePath {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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

