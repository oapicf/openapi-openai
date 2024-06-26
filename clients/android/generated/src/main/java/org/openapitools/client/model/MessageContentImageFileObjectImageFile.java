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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MessageContentImageFileObjectImageFile {
  
  @SerializedName("file_id")
  private String fileId = null;

  /**
   * The [File](/docs/api-reference/files) ID of the image in the message content.
   **/
  @ApiModelProperty(required = true, value = "The [File](/docs/api-reference/files) ID of the image in the message content.")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentImageFileObjectImageFile messageContentImageFileObjectImageFile = (MessageContentImageFileObjectImageFile) o;
    return (this.fileId == null ? messageContentImageFileObjectImageFile.fileId == null : this.fileId.equals(messageContentImageFileObjectImageFile.fileId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.fileId == null ? 0: this.fileId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentImageFileObjectImageFile {\n");
    
    sb.append("  fileId: ").append(fileId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
