package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ModifyAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.ModifyAssistantRequestToolResourcesFileSearch;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */

@Schema(name = "ModifyAssistantRequest_tool_resources", description = "A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. ")
@JsonTypeName("ModifyAssistantRequest_tool_resources")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ModifyAssistantRequestToolResources {

  private ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  private ModifyAssistantRequestToolResourcesFileSearch fileSearch;

  public ModifyAssistantRequestToolResources codeInterpreter(ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
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
  public ModifyAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public ModifyAssistantRequestToolResources fileSearch(ModifyAssistantRequestToolResourcesFileSearch fileSearch) {
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
  public ModifyAssistantRequestToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(ModifyAssistantRequestToolResourcesFileSearch fileSearch) {
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
    ModifyAssistantRequestToolResources modifyAssistantRequestToolResources = (ModifyAssistantRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, modifyAssistantRequestToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, modifyAssistantRequestToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAssistantRequestToolResources {\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

