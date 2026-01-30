package org.openapitools.model;

import org.openapitools.model.ChunkingStrategyRequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateVectorStoreFileRequest  {
  
 /**
  * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
  */
  @ApiModelProperty(required = true, value = "A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.")

  private String fileId;

  @ApiModelProperty(value = "")

  @Valid

  private ChunkingStrategyRequestParam chunkingStrategy;
 /**
   * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   * @return fileId
  **/
  @JsonProperty("file_id")
  @NotNull
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public CreateVectorStoreFileRequest fileId(String fileId) {
    this.fileId = fileId;
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

  public CreateVectorStoreFileRequest chunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
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
    CreateVectorStoreFileRequest createVectorStoreFileRequest = (CreateVectorStoreFileRequest) o;
    return Objects.equals(this.fileId, createVectorStoreFileRequest.fileId) &&
        Objects.equals(this.chunkingStrategy, createVectorStoreFileRequest.chunkingStrategy);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

