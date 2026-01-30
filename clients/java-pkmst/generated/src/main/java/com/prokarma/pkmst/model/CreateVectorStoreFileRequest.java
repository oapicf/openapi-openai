package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ChunkingStrategyRequestParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CreateVectorStoreFileRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateVectorStoreFileRequest   {
  @JsonProperty("file_id")
  private String fileId;

  @JsonProperty("chunking_strategy")
  private ChunkingStrategyRequestParam chunkingStrategy;

  public CreateVectorStoreFileRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
   * @return fileId
   */
  @ApiModelProperty(required = true, value = "A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public CreateVectorStoreFileRequest chunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  /**
   * Get chunkingStrategy
   * @return chunkingStrategy
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

