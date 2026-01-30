package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AssistantObjectToolResourcesCodeInterpreter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantObjectToolResourcesCodeInterpreter   {
  @JsonProperty("file_ids")
  
  private List<String> fileIds = null;

  public AssistantObjectToolResourcesCodeInterpreter fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public AssistantObjectToolResourcesCodeInterpreter addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
   * @return fileIds
   */
  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. ")
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
    AssistantObjectToolResourcesCodeInterpreter assistantObjectToolResourcesCodeInterpreter = (AssistantObjectToolResourcesCodeInterpreter) o;
    return Objects.equals(this.fileIds, assistantObjectToolResourcesCodeInterpreter.fileIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolResourcesCodeInterpreter {\n");
    
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

