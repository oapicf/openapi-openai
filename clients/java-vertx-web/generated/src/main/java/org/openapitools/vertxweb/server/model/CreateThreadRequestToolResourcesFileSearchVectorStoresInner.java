package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateThreadRequestToolResourcesFileSearchVectorStoresInner   {
  
  private List<String> fileIds = new ArrayList<>();
  private CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy;
  private Object metadata;

  public CreateThreadRequestToolResourcesFileSearchVectorStoresInner () {

  }

  public CreateThreadRequestToolResourcesFileSearchVectorStoresInner (List<String> fileIds, CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy, Object metadata) {
    this.fileIds = fileIds;
    this.chunkingStrategy = chunkingStrategy;
    this.metadata = metadata;
  }

    
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("chunking_strategy")
  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }
  public void setChunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

    
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
    CreateThreadRequestToolResourcesFileSearchVectorStoresInner createThreadRequestToolResourcesFileSearchVectorStoresInner = (CreateThreadRequestToolResourcesFileSearchVectorStoresInner) o;
    return Objects.equals(fileIds, createThreadRequestToolResourcesFileSearchVectorStoresInner.fileIds) &&
        Objects.equals(chunkingStrategy, createThreadRequestToolResourcesFileSearchVectorStoresInner.chunkingStrategy) &&
        Objects.equals(metadata, createThreadRequestToolResourcesFileSearchVectorStoresInner.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, chunkingStrategy, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequestToolResourcesFileSearchVectorStoresInner {\n");
    
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
