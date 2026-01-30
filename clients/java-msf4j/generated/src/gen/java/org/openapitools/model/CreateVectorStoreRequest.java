package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.model.VectorStoreExpirationAfter;

/**
 * CreateVectorStoreRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateVectorStoreRequest   {
  @JsonProperty("file_ids")
  private List<String> fileIds = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("expires_after")
  private VectorStoreExpirationAfter expiresAfter;

  @JsonProperty("chunking_strategy")
  private CreateVectorStoreRequestChunkingStrategy chunkingStrategy;

  @JsonProperty("metadata")
  private Object metadata;

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
  **/
  @ApiModelProperty(value = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateVectorStoreRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the vector store.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the vector store.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateVectorStoreRequest expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

   /**
   * Get expiresAfter
   * @return expiresAfter
  **/
  @ApiModelProperty(value = "")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  public CreateVectorStoreRequest chunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

   /**
   * Get chunkingStrategy
   * @return chunkingStrategy
  **/
  @ApiModelProperty(value = "")
  public CreateVectorStoreRequestChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateVectorStoreRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
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
    CreateVectorStoreRequest createVectorStoreRequest = (CreateVectorStoreRequest) o;
    return Objects.equals(this.fileIds, createVectorStoreRequest.fileIds) &&
        Objects.equals(this.name, createVectorStoreRequest.name) &&
        Objects.equals(this.expiresAfter, createVectorStoreRequest.expiresAfter) &&
        Objects.equals(this.chunkingStrategy, createVectorStoreRequest.chunkingStrategy) &&
        Objects.equals(this.metadata, createVectorStoreRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, name, expiresAfter, chunkingStrategy, metadata);
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

