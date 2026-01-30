package apimodels;

import apimodels.AssistantObjectToolResourcesCodeInterpreter;
import apimodels.AssistantObjectToolResourcesFileSearch;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AssistantObjectToolResources   {
  @JsonProperty("code_interpreter")
  @Valid

  private AssistantObjectToolResourcesCodeInterpreter codeInterpreter;

  @JsonProperty("file_search")
  @Valid

  private AssistantObjectToolResourcesFileSearch fileSearch;

  public AssistantObjectToolResources codeInterpreter(AssistantObjectToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
    return this;
  }

   /**
   * Get codeInterpreter
   * @return codeInterpreter
  **/
  public AssistantObjectToolResourcesCodeInterpreter getCodeInterpreter() {
    return codeInterpreter;
  }

  public void setCodeInterpreter(AssistantObjectToolResourcesCodeInterpreter codeInterpreter) {
    this.codeInterpreter = codeInterpreter;
  }

  public AssistantObjectToolResources fileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
    this.fileSearch = fileSearch;
    return this;
  }

   /**
   * Get fileSearch
   * @return fileSearch
  **/
  public AssistantObjectToolResourcesFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(AssistantObjectToolResourcesFileSearch fileSearch) {
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
    AssistantObjectToolResources assistantObjectToolResources = (AssistantObjectToolResources) o;
    return Objects.equals(codeInterpreter, assistantObjectToolResources.codeInterpreter) &&
        Objects.equals(fileSearch, assistantObjectToolResources.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeInterpreter, fileSearch);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

