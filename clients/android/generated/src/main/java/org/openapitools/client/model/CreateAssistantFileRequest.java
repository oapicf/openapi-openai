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
public class CreateAssistantFileRequest {
  
  @SerializedName("file_id")
  private String fileId = null;

  /**
   * A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
   **/
  @ApiModelProperty(required = true, value = "A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.")
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
    CreateAssistantFileRequest createAssistantFileRequest = (CreateAssistantFileRequest) o;
    return (this.fileId == null ? createAssistantFileRequest.fileId == null : this.fileId.equals(createAssistantFileRequest.fileId));
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
    sb.append("class CreateAssistantFileRequest {\n");
    
    sb.append("  fileId: ").append(fileId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
