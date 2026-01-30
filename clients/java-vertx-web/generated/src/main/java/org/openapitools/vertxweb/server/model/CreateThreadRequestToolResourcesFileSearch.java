package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CreateThreadRequestToolResourcesFileSearchVectorStoresInner;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateThreadRequestToolResourcesFileSearch   {
  
  private List<String> vectorStoreIds = new ArrayList<>();
  private List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores = new ArrayList<>();

  public CreateThreadRequestToolResourcesFileSearch () {

  }

  public CreateThreadRequestToolResourcesFileSearch (List<String> vectorStoreIds, List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStoreIds = vectorStoreIds;
    this.vectorStores = vectorStores;
  }

    
  @JsonProperty("vector_store_ids")
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }
  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }

    
  @JsonProperty("vector_stores")
  public List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> getVectorStores() {
    return vectorStores;
  }
  public void setVectorStores(List<CreateThreadRequestToolResourcesFileSearchVectorStoresInner> vectorStores) {
    this.vectorStores = vectorStores;
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
    return Objects.equals(vectorStoreIds, createThreadRequestToolResourcesFileSearch.vectorStoreIds) &&
        Objects.equals(vectorStores, createThreadRequestToolResourcesFileSearch.vectorStores);
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
