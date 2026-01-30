package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AssistantObjectToolResourcesCodeInterpreter;
import org.openapitools.model.AssistantObjectToolResourcesFileSearch;
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

public class AssistantObjectToolResources  {
  
  @ApiModelProperty(value = "")

  @Valid

  private AssistantObjectToolResourcesCodeInterpreter codeInterpreter;

  @ApiModelProperty(value = "")

  @Valid

  private AssistantObjectToolResourcesFileSearch fileSearch;
 /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  @JsonProperty("code_interpreter")
  public AssistantObjectToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(AssistantObjectToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public AssistantObjectToolResources codeInterpreter(AssistantObjectToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

 /**
   * Get fileSearch
   * @return fileSearch
  **/
  @JsonProperty("file_search")
  public AssistantObjectToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
  }

  public AssistantObjectToolResources fileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
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
    AssistantObjectToolResources assistantObjectToolResources = (AssistantObjectToolResources) o;
    return Objects.equals(this.codeInterpreter, assistantObjectToolResources.codeInterpreter) &&
        Objects.equals(this.fileSearch, assistantObjectToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolResources {\n");
    
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

