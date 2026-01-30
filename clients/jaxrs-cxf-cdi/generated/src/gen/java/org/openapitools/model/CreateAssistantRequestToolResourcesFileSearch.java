package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateAssistantRequestToolResourcesFileSearch   {
  
  private List<String> vectorStoreIds = new ArrayList<>();

  private List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();

  /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   **/
  public CreateAssistantRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  
  @ApiModelProperty(value = "The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")
  @JsonProperty("vector_store_ids")
 @Size(max=1)  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }
  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }

  public CreateAssistantRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }


  /**
   * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   **/
  public CreateAssistantRequestToolResourcesFileSearch vectorStores(List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
    return this;
  }

  
  @ApiModelProperty(value = "A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")
  @JsonProperty("vector_stores")
 @Size(max=1)  public List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
    return vectorStores;
  }
  public void setVectorStores(List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
  }

  public CreateAssistantRequestToolResourcesFileSearch addVectorStoresItem(CreateAssistantRequestToolResourcesFileSearchVectorStoresInner vectorStoresItem) {
    if (this.vectorStores == null) {
      this.vectorStores = new ArrayList<>();
    }
    this.vectorStores.add(vectorStoresItem);
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
    CreateAssistantRequestToolResourcesFileSearch createAssistantRequestToolResourcesFileSearch = (CreateAssistantRequestToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, createAssistantRequestToolResourcesFileSearch.vectorStoreIds) &&
        Objects.equals(this.vectorStores, createAssistantRequestToolResourcesFileSearch.vectorStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds, vectorStores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResourcesFileSearch {\n");
    
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
    sb.append("    vectorStores: ").append(toIndentedString(vectorStores)).append("\n");
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

