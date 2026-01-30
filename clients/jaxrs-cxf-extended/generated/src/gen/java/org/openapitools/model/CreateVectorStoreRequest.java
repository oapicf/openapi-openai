package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.model.VectorStoreExpirationAfter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateVectorStoreRequest  {
  
 /**
  * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  */
  @ApiModelProperty(value = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")
  private List<String> fileIds = new ArrayList<>();

 /**
  * The name of the vector store.
  */
  @ApiModelProperty(value = "The name of the vector store.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private VectorStoreExpirationAfter expiresAfter;

  @ApiModelProperty(value = "")
  @Valid
  private CreateVectorStoreRequestChunkingStrategy chunkingStrategy;

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  private Object metadata;
 /**
  * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
  * @return fileIds
  */
  @JsonProperty("file_ids")
 @Size(max=500)  public List<String> getFileIds() {
    return fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
 public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   * Sets the <code>fileIds</code> property.
   */
  public CreateVectorStoreRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  /**
   * Adds a new item to the <code>fileIds</code> list.
   */
  public CreateVectorStoreRequest addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

 /**
  * The name of the vector store.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public CreateVectorStoreRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get expiresAfter
  * @return expiresAfter
  */
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  /**
   * Sets the <code>expiresAfter</code> property.
   */
 public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  /**
   * Sets the <code>expiresAfter</code> property.
   */
  public CreateVectorStoreRequest expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

 /**
  * Get chunkingStrategy
  * @return chunkingStrategy
  */
  @JsonProperty("chunking_strategy")
  public CreateVectorStoreRequestChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  /**
   * Sets the <code>chunkingStrategy</code> property.
   */
 public void setChunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  /**
   * Sets the <code>chunkingStrategy</code> property.
   */
  public CreateVectorStoreRequest chunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

 /**
  * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  * @return metadata
  */
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public CreateVectorStoreRequest metadata(Object metadata) {
    this.metadata = metadata;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

