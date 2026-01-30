package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssistantRequestToolResourcesFileSearch  {
  
 /**
  * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  */
  @ApiModelProperty(value = "The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")
  private List<String> vectorStoreIds = new ArrayList<>();

 /**
  * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  */
  @ApiModelProperty(value = "A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. ")
  @Valid
  private List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();
 /**
  * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
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
  public CreateAssistantRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  /**
   * Adds a new item to the <code>vectorStoreIds</code> list.
   */
  public CreateAssistantRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

 /**
  * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  * @return vectorStores
  */
  @JsonProperty("vector_stores")
 @Size(max=1)  public List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
    return vectorStores;
  }

  /**
   * Sets the <code>vectorStores</code> property.
   */
 public void setVectorStores(List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
  }

  /**
   * Sets the <code>vectorStores</code> property.
   */
  public CreateAssistantRequestToolResourcesFileSearch vectorStores(List<@Valid CreateAssistantRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
    return this;
  }

  /**
   * Adds a new item to the <code>vectorStores</code> list.
   */
  public CreateAssistantRequestToolResourcesFileSearch addVectorStoresItem(CreateAssistantRequestToolResourcesFileSearchVectorStoresInner vectorStoresItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

