package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
 */

@JsonTypeName("CreateAssistantRequest_tool_resources_file_search_vector_stores_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {

  @Valid
  private List<String> fileIds = new ArrayList<>();

  private CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy;

  private Object metadata;

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
   * @return fileIds
   */
  @Size(max = 10000) 
  @Schema(name = "file_ids", description = "A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner chunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  /**
   * Get chunkingStrategy
   * @return chunkingStrategy
   */
  @Valid 
  @Schema(name = "chunking_strategy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("chunking_strategy")
  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInner createAssistantRequestToolResourcesFileSearchVectorStoresInner = (CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) o;
    return Objects.equals(this.fileIds, createAssistantRequestToolResourcesFileSearchVectorStoresInner.fileIds) &&
        Objects.equals(this.chunkingStrategy, createAssistantRequestToolResourcesFileSearchVectorStoresInner.chunkingStrategy) &&
        Objects.equals(this.metadata, createAssistantRequestToolResourcesFileSearchVectorStoresInner.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, chunkingStrategy, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

