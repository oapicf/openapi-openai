package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.vertxweb.server.model.CreateAssistantRequestToolResourcesFileSearch;

/**
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssistantRequestToolResources   {
  
  private CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter;
  private CreateAssistantRequestToolResourcesFileSearch fileSearch;

  public CreateAssistantRequestToolResources () {

  }

  public CreateAssistantRequestToolResources (CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter, CreateAssistantRequestToolResourcesFileSearch fileSearch) {
    this.codeInterpreter = codeInterpreter;
    this.fileSearch = fileSearch;
  }

    
  @JsonProperty("code_interpreter")
  public CreateAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }
  public void setCodeInterpreter(CreateAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

    
  @JsonProperty("file_search")
  public CreateAssistantRequestToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }
  public void setFileSearch(CreateAssistantRequestToolResourcesFileSearch fileSearch) {
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
    CreateAssistantRequestToolResources createAssistantRequestToolResources = (CreateAssistantRequestToolResources) o;
    return Objects.equals(codeInterpreter, createAssistantRequestToolResources.codeInterpreter) &&
        Objects.equals(fileSearch, createAssistantRequestToolResources.fileSearch);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
