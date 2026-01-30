package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("MessageContentTextAnnotationsFilePathObject_file_path")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class MessageContentTextAnnotationsFilePathObjectFilePath   {
  private String fileId;

  public MessageContentTextAnnotationsFilePathObjectFilePath() {
  }

  @JsonCreator
  public MessageContentTextAnnotationsFilePathObjectFilePath(
    @JsonProperty(required = true, value = "file_id") String fileId
  ) {
    this.fileId = fileId;
  }

  /**
   * The ID of the file that was generated.
   **/
  public MessageContentTextAnnotationsFilePathObjectFilePath fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the file that was generated.")
  @JsonProperty(required = true, value = "file_id")
  @NotNull public String getFileId() {
    return fileId;
  }

  @JsonProperty(required = true, value = "file_id")
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
    MessageContentTextAnnotationsFilePathObjectFilePath messageContentTextAnnotationsFilePathObjectFilePath = (MessageContentTextAnnotationsFilePathObjectFilePath) o;
    return Objects.equals(this.fileId, messageContentTextAnnotationsFilePathObjectFilePath.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextAnnotationsFilePathObjectFilePath {\n");
    
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

