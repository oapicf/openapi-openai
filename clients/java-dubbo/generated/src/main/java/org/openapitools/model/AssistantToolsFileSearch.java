package org.openapitools.model;

import org.openapitools.model.AssistantToolsFileSearchFileSearch;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AssistantToolsFileSearch implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of tool being defined: &#x60;file_search&#x60;
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("file_search")
  private AssistantToolsFileSearchFileSearch fileSearch;

  /**
   * The type of tool being defined: &#x60;file_search&#x60;
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return fileSearch
   */
  public AssistantToolsFileSearchFileSearch getFileSearch() {
    return fileSearch;
  }

  public void setFileSearch(AssistantToolsFileSearchFileSearch fileSearch) {
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
    AssistantToolsFileSearch assistantToolsFileSearch = (AssistantToolsFileSearch) o;
    return Objects.equals(this.type, assistantToolsFileSearch.type) &&
        Objects.equals(this.fileSearch, assistantToolsFileSearch.fileSearch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fileSearch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantToolsFileSearch {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
