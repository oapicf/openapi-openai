package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateThreadRequest_tool_resources_file_search")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateThreadRequestToolResourcesFileSearch   {
  private @Valid List<String> vectorStoreIds = new ArrayList<>();
  private @Valid List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();

  public CreateThreadRequestToolResourcesFileSearch() {
  }

  /**
   * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
   **/
  public CreateThreadRequestToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  
  @ApiModelProperty(value = "The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. ")
  @JsonProperty("vector_store_ids")
   @Size(max=1)public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  @JsonProperty("vector_store_ids")
  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }

  public CreateThreadRequestToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }

    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

  public CreateThreadRequestToolResourcesFileSearch removeVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (vectorStoreIdsItem != null && this.vectorStoreIds != null) {
      this.vectorStoreIds.remove(vectorStoreIdsItem);
    }

    return this;
  }
  /**
   * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
   **/
  public CreateThreadRequestToolResourcesFileSearch vectorStores(List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
    return this;
  }

  
  @ApiModelProperty(value = "A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. ")
  @JsonProperty("vector_stores")
  @Valid  @Size(max=1)public List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
    return vectorStores;
  }

  @JsonProperty("vector_stores")
  public void setVectorStores(List<@Valid CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
  }

  public CreateThreadRequestToolResourcesFileSearch addVectorStoresItem(CreateThreadRequestToolResourcesFileSearchVectorStoresInner vectorStoresItem) {
    if (this.vectorStores == null) {
      this.vectorStores = new ArrayList<>();
    }

    this.vectorStores.add(vectorStoresItem);
    return this;
  }

  public CreateThreadRequestToolResourcesFileSearch removeVectorStoresItem(CreateThreadRequestToolResourcesFileSearchVectorStoresInner vectorStoresItem) {
    if (vectorStoresItem != null && this.vectorStores != null) {
      this.vectorStores.remove(vectorStoresItem);
    }

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
    CreateThreadRequestToolResourcesFileSearch createThreadRequestToolResourcesFileSearch = (CreateThreadRequestToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, createThreadRequestToolResourcesFileSearch.vectorStoreIds) &&
        Objects.equals(this.vectorStores, createThreadRequestToolResourcesFileSearch.vectorStores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds, vectorStores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequestToolResourcesFileSearch {\n");
    
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

