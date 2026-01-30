package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ModifyAssistantRequestToolResourcesCodeInterpreter  {
  
 /**
  * Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
  */
  @ApiModelProperty(value = "Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. ")

  private List<String> fileIds = new ArrayList<>();
 /**
   * Overrides the list of [file](/docs/api-reference/files) IDs made available to the &#x60;code_interpreter&#x60; tool. There can be a maximum of 20 files associated with the tool. 
   * @return fileIds
  **/
  @JsonProperty("file_ids")
 @Size(max=20)  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public ModifyAssistantRequestToolResourcesCodeInterpreter fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public ModifyAssistantRequestToolResourcesCodeInterpreter addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
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
    ModifyAssistantRequestToolResourcesCodeInterpreter modifyAssistantRequestToolResourcesCodeInterpreter = (ModifyAssistantRequestToolResourcesCodeInterpreter) o;
    return Objects.equals(this.fileIds, modifyAssistantRequestToolResourcesCodeInterpreter.fileIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

