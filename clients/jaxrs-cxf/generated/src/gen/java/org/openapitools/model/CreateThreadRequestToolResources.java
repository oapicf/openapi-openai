package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.CreateThreadRequestToolResourcesFileSearch;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 */
@ApiModel(description="A set of resources that are made available to the assistant's tools in this thread. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. ")

public class CreateThreadRequestToolResources  {
  
  @ApiModelProperty(value = "")

  @Valid

  private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  @ApiModelProperty(value = "")

  @Valid

  private CreateThreadRequestToolResourcesFileSearch fileSearch;
 /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  @JsonProperty("code_interpreter")
  public CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public CreateThreadRequestToolResources codeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

 /**
   * Get fileSearch
   * @return fileSearch
  **/
  @JsonProperty("file_search")
  public CreateThreadRequestToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(CreateThreadRequestToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public CreateThreadRequestToolResources fileSearch(CreateThreadRequestToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
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
    CreateThreadRequestToolResources createThreadRequestToolResources = (CreateThreadRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, createThreadRequestToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, createThreadRequestToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequestToolResources {\n");
    
    sb.append("    codeInterpreter: ").append(toIndentedString(codeInterpreter)).append("\n");
    sb.append("    fileSearch: ").append(toIndentedString(fileSearch)).append("\n");
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

