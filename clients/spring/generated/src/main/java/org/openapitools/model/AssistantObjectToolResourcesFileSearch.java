package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AssistantObjectToolResourcesFileSearch
 */

@JsonTypeName("AssistantObject_tool_resources_file_search")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AssistantObjectToolResourcesFileSearch {

  @Valid
  private List<String> vectorStoreIds = new ArrayList<>();

  public AssistantObjectToolResourcesFileSearch vectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
    return this;
  }

  public AssistantObjectToolResourcesFileSearch addVectorStoreIdsItem(String vectorStoreIdsItem) {
    if (this.vectorStoreIds == null) {
      this.vectorStoreIds = new ArrayList<>();
    }
    this.vectorStoreIds.add(vectorStoreIdsItem);
    return this;
  }

  /**
   * The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
   * @return vectorStoreIds
   */
  @Size(max = 1) 
  @Schema(name = "vector_store_ids", description = "The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vector_store_ids")
  public List<String> getVectorStoreIds() {
    return vectorStoreIds;
  }

  public void setVectorStoreIds(List<String> vectorStoreIds) {
    this.vectorStoreIds = vectorStoreIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantObjectToolResourcesFileSearch assistantObjectToolResourcesFileSearch = (AssistantObjectToolResourcesFileSearch) o;
    return Objects.equals(this.vectorStoreIds, assistantObjectToolResourcesFileSearch.vectorStoreIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vectorStoreIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantObjectToolResourcesFileSearch {\n");
    sb.append("    vectorStoreIds: ").append(toIndentedString(vectorStoreIds)).append("\n");
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

