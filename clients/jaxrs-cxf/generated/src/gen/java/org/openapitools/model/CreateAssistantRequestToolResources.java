package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearch;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. 
 */
@ApiModel(description="A set of resources that are used by the assistant's tools. The resources are specific to the type of tool. For example, the `code_interpreter` tool requires a list of file IDs, while the `file_search` tool requires a list of vector store IDs. ")

public class CreateAssistantRequestToolResources  {
  
  @ApiModelProperty(value = "")

  @Valid

  private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  @ApiModelProperty(value = "")

  @Valid

  private CreateAssistantRequestToolResourcesFileSearch fileSearch;
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

  public CreateAssistantRequestToolResources codeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

 /**
   * Get fileSearch
   * @return fileSearch
  **/
  @JsonProperty("file_search")
  public CreateAssistantRequestToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(CreateAssistantRequestToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public CreateAssistantRequestToolResources fileSearch(CreateAssistantRequestToolResourcesFileSearch fileSearch) {
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
    CreateAssistantRequestToolResources createAssistantRequestToolResources = (CreateAssistantRequestToolResources) o;
    return Objects.equals(this.codeInterpreter, createAssistantRequestToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, createAssistantRequestToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResources {\n");
    
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

