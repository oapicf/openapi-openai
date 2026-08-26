package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateAssistantRequestToolResourcesCodeInterpreter implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool. 
   */
  @JsonProperty("file_ids")
  private List<String> fileIds = new ArrayList<>();

  /**
   * A list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool. 
   * @return fileIds
   */
  public List<String> getFileIds() {
    return fileIds;
  }

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
    CreateAssistantRequestToolResourcesCodeInterpreter createAssistantRequestToolResourcesCodeInterpreter = (CreateAssistantRequestToolResourcesCodeInterpreter) o;
    return Objects.equals(this.fileIds, createAssistantRequestToolResourcesCodeInterpreter.fileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResourcesCodeInterpreter {\n");
    
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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
