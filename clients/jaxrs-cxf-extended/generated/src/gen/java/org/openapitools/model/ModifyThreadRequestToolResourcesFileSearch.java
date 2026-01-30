package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ModifyThreadRequestToolResourcesFileSearch  {
  
 /**
  * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  */
  @ApiModelProperty(value = "The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. ")
  private List<String> vectorStoreIds = new ArrayList<>();
 /**
  * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  * @return vectorStoreIds
  */
  @JsonProperty("vector_store_ids")
 @Size(max=1)  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  /**
   * Sets the <code>vectorStoreIds</code> property.
   */
 public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }

  /**
   * Sets the <code>vectorStoreIds</code> property.
   */
  public ModifyThreadRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  /**
   * Adds a new item to the <code>vectorStoreIds</code> list.
   */
  public ModifyThreadRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
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
    ModifyThreadRequestToolResourcesFileSearch modifyThreadRequestToolResourcesFileSearch = (ModifyThreadRequestToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, modifyThreadRequestToolResourcesFileSearch.vectorStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModifyThreadRequestToolResourcesFileSearch {\n");
    
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

