package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AssistantObjectToolResourcesCodeInterpreter
 */

@JsonTypeName("AssistantObject_tool_resources_code_interpreter")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AssistantObjectToolResourcesCodeInterpreter {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> fileIds = new ArrayList<>();

  public AssistantObjectToolResourcesCodeInterpreter fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AssistantObjectToolResourcesCodeInterpreter addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
   * @return fileIds
   */
  @Size(max = 20) 
  @Schema(name = "file_ids", description = "A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  @JsonProperty("file_ids")
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantObjectToolResourcesCodeInterpreter assistantObjectToolResourcesCodeInterpreter = (AssistantObjectToolResourcesCodeInterpreter) o;
    return Objects.equals(this.fileIds, assistantObjectToolResourcesCodeInterpreter.fileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolResourcesCodeInterpreter {\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

