/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.0.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-04-14T13:39:44.119769156Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageDeltaContentTextAnnotationsFilePathObjectFilePath   {
  
  private String fileId;

  /**
   * The ID of the file that was generated.
   */
  public MessageDeltaContentTextAnnotationsFilePathObjectFilePath fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(value = "The ID of the file that was generated.")
  @JsonProperty("file_id")
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
    MessageDeltaContentTextAnnotationsFilePathObjectFilePath messageDeltaContentTextAnnotationsFilePathObjectFilePath = (MessageDeltaContentTextAnnotationsFilePathObjectFilePath) o;
    return Objects.equals(fileId, messageDeltaContentTextAnnotationsFilePathObjectFilePath.fileId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

