package org.openapitools.model;

import org.openapitools.model.ChunkingStrategyRequestParam;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CreateVectorStoreFileBatchRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   */
  @JsonProperty("file_ids")
  private List<String> fileIds = new ArrayList<>();

  @JsonProperty("chunking_strategy")
  private ChunkingStrategyRequestParam chunkingStrategy;

  /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   * @return fileIds
   */
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * 
   * @return chunkingStrategy
   */
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
    return Objects.equals(this.fileIds, createVectorStoreFileBatchRequest.fileIds) &&
        Objects.equals(this.chunkingStrategy, createVectorStoreFileBatchRequest.chunkingStrategy);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
