package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
 */

@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeOutputImageObject_image")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-04-14T13:40:33.442815767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {

  private String fileId;

  public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The [file](/docs/api-reference/files) ID of the image.
   * @return fileId
  */
  
  @Schema(name = "file_id", description = "The [file](/docs/api-reference/files) ID of the image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage = (RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage) o;
    return Objects.equals(this.fileId, runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage.fileId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage {\n");
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

