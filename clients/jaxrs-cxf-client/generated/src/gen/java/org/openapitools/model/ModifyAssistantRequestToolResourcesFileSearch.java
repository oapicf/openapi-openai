package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ModifyAssistantRequestToolResourcesFileSearch  {
  
 /**
  * Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  */
  @ApiModelProperty(value = "Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")

  private List<String> vectorStoreIds = new ArrayList<>();
 /**
   * Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   * @return vectorStoreIds
  **/
  @JsonProperty("vector_store_ids")
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }

  public ModifyAssistantRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  public ModifyAssistantRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    this.vectorStoreIds.add(vectorStoreIdsItem);
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
    ModifyAssistantRequestToolResourcesFileSearch modifyAssistantRequestToolResourcesFileSearch = (ModifyAssistantRequestToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, modifyAssistantRequestToolResourcesFileSearch.vectorStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyAssistantRequestToolResourcesFileSearch {\n");
    
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
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

