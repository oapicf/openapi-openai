package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyAssistantRequestToolResourcesCodeInterpreter   {
  
  private List<String> fileIds = new ArrayList<>();

  public ModifyAssistantRequestToolResourcesCodeInterpreter () {

  }

  public ModifyAssistantRequestToolResourcesCodeInterpreter (List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("file_ids")
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
    ModifyAssistantRequestToolResourcesCodeInterpreter modifyAssistantRequestToolResourcesCodeInterpreter = (ModifyAssistantRequestToolResourcesCodeInterpreter) o;
    return Objects.equals(fileIds, modifyAssistantRequestToolResourcesCodeInterpreter.fileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAssistantRequestToolResourcesCodeInterpreter {\n");
    
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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
