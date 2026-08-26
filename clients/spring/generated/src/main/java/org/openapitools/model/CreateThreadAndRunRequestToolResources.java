package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AssistantObjectToolResourcesFileSearch;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

@Schema(name = "CreateThreadAndRunRequest_tool_resources", description = "A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. ")
@JsonTypeName("CreateThreadAndRunRequest_tool_resources")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateThreadAndRunRequestToolResources {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AssistantObjectToolResourcesFileSearch fileSearch;

  public CreateThreadAndRunRequestToolResources codeInterpreter(@Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

  /**
   * Get codeInterpreter
   * @return codeInterpreter
   */
  @Valid 
  @Schema(name = "code_interpreter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code_interpreter")
  public @Nullable CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  @JsonProperty("code_interpreter")
  public void setCodeInterpreter(@Nullable CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public CreateThreadAndRunRequestToolResources fileSearch(@Nullable AssistantObjectToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

  /**
   * Get fileSearch
   * @return fileSearch
   */
  @Valid 
  @Schema(name = "file_search", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_search")
  public @Nullable AssistantObjectToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  @JsonProperty("file_search")
  public void setFileSearch(@Nullable AssistantObjectToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadAndRunRequestToolResources createThreadAndRunRequestToolResources = (CreateThreadAndRunRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, createThreadAndRunRequestToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, createThreadAndRunRequestToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadAndRunRequestToolResources {\n");
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

