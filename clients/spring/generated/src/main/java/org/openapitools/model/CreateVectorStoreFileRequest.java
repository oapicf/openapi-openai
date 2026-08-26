package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ChunkingStrategyRequestParam;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateVectorStoreFileRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateVectorStoreFileRequest {

  private String fileId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ChunkingStrategyRequestParam chunkingStrategy;

  public CreateVectorStoreFileRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateVectorStoreFileRequest(String fileId) {
    this.fileId = fileId;
  }

  public CreateVectorStoreFileRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
   * @return fileId
   */
  @NotNull 
  @Schema(name = "file_id", description = "A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }

  @JsonProperty("file_id")
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public CreateVectorStoreFileRequest chunkingStrategy(@Nullable ChunkingStrategyRequestParam chunkingStrategy) {
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
  public @Nullable ChunkingStrategyRequestParam getChunkingStrategy() {
    return chunkingStrategy;
  }

  @JsonProperty("chunking_strategy")
  public void setChunkingStrategy(@Nullable ChunkingStrategyRequestParam chunkingStrategy) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

