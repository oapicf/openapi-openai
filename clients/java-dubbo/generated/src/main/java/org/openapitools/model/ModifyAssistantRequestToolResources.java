package org.openapitools.model;

import org.openapitools.model.ModifyAssistantRequestToolResourcesCodeInterpreter;
import org.openapitools.model.ModifyAssistantRequestToolResourcesFileSearch;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */
public class ModifyAssistantRequestToolResources implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code_interpreter")
  private ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter;

  @JsonProperty("file_search")
  private ModifyAssistantRequestToolResourcesFileSearch fileSearch;

  /**
   * 
   * @return codeInterpreter
   */
  public ModifyAssistantRequestToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(ModifyAssistantRequestToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  /**
   * 
   * @return fileSearch
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
