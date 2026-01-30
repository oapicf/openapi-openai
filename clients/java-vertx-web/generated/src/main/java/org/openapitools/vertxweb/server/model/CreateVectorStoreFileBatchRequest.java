package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ChunkingStrategyRequestParam;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVectorStoreFileBatchRequest   {
  
  private List<String> fileIds = new ArrayList<>();
  private ChunkingStrategyRequestParam chunkingStrategy;

  public CreateVectorStoreFileBatchRequest () {

  }

  public CreateVectorStoreFileBatchRequest (List<String> fileIds, ChunkingStrategyRequestParam chunkingStrategy) {
    this.fileIds = fileIds;
    this.chunkingStrategy = chunkingStrategy;
  }

    
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("chunking_strategy")
  public ChunkingStrategyRequestParam getChunkingStrategy() {
    return chunkingStrategy;
  }
  public void setChunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVectorStoreFileBatchRequest createVectorStoreFileBatchRequest = (CreateVectorStoreFileBatchRequest) o;
    return Objects.equals(fileIds, createVectorStoreFileBatchRequest.fileIds) &&
        Objects.equals(chunkingStrategy, createVectorStoreFileBatchRequest.chunkingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, chunkingStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVectorStoreFileBatchRequest {\n");
    
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    chunkingStrategy: ").append(toIndentedString(chunkingStrategy)).append("\n");
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
