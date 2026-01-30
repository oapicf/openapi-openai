package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChunkingStrategyRequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateVectorStoreFileBatchRequest  {
  
 /**
  * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  */
  @ApiModelProperty(required = true, value = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")

  private List<String> fileIds = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private ChunkingStrategyRequestParam chunkingStrategy;
 /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   * @return fileIds
  **/
  @JsonProperty("file_ids")
  @NotNull
 @Size(min=1,max=500)  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateVectorStoreFileBatchRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateVectorStoreFileBatchRequest addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

 /**
   * Get chunkingStrategy
   * @return chunkingStrategy
  **/
  @JsonProperty("chunking_strategy")
  public ChunkingStrategyRequestParam getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateVectorStoreFileBatchRequest chunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

