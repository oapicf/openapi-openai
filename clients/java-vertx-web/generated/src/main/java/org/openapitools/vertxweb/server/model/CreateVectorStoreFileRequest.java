package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.ChunkingStrategyRequestParam;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVectorStoreFileRequest   {
  
  private String fileId;
  private ChunkingStrategyRequestParam chunkingStrategy;

  public CreateVectorStoreFileRequest () {

  }

  public CreateVectorStoreFileRequest (String fileId, ChunkingStrategyRequestParam chunkingStrategy) {
    this.fileId = fileId;
    this.chunkingStrategy = chunkingStrategy;
  }

    
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
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
    CreateVectorStoreFileRequest createVectorStoreFileRequest = (CreateVectorStoreFileRequest) o;
    return Objects.equals(fileId, createVectorStoreFileRequest.fileId) &&
        Objects.equals(chunkingStrategy, createVectorStoreFileRequest.chunkingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, chunkingStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVectorStoreFileRequest {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
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
