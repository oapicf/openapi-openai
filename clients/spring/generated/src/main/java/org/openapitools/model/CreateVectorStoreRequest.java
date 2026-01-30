package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.model.VectorStoreExpirationAfter;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateVectorStoreRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateVectorStoreRequest {

  @Valid
  private List<String> fileIds = new ArrayList<>();

  private @Nullable String name;

  private @Nullable VectorStoreExpirationAfter expiresAfter;

  private @Nullable CreateVectorStoreRequestChunkingStrategy chunkingStrategy;

  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public CreateVectorStoreRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateVectorStoreRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

  /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
   * @return fileIds
   */
  @Size(max = 500) 
  @Schema(name = "file_ids", description = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateVectorStoreRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the vector store.
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the vector store.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CreateVectorStoreRequest expiresAfter(@Nullable VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

  /**
   * Get expiresAfter
   * @return expiresAfter
   */
  @Valid 
  @Schema(name = "expires_after", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expires_after")
  public @Nullable VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(@Nullable VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public CreateVectorStoreRequest chunkingStrategy(@Nullable CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
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
  public @Nullable CreateVectorStoreRequestChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(@Nullable CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateVectorStoreRequest metadata(Object metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
   */
  
  @Schema(name = "metadata", description = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Object> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Object> metadata) {
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
    CreateVectorStoreRequest createVectorStoreRequest = (CreateVectorStoreRequest) o;
    return Objects.equals(this.fileIds, createVectorStoreRequest.fileIds) &&
        Objects.equals(this.name, createVectorStoreRequest.name) &&
        Objects.equals(this.expiresAfter, createVectorStoreRequest.expiresAfter) &&
        Objects.equals(this.chunkingStrategy, createVectorStoreRequest.chunkingStrategy) &&
        equalsNullable(this.metadata, createVectorStoreRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, name, expiresAfter, chunkingStrategy, hashCodeNullable(metadata));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVectorStoreRequest {\n");
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expiresAfter: ").append(toIndentedString(expiresAfter)).append("\n");
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

