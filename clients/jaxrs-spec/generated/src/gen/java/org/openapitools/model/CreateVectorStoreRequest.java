package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.model.VectorStoreExpirationAfter;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateVectorStoreRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateVectorStoreRequest   {
  private @Valid List<String> fileIds = new ArrayList<>();
  private String name;
  private VectorStoreExpirationAfter expiresAfter;
  private CreateVectorStoreRequestChunkingStrategy chunkingStrategy;
  private Object metadata;

  public CreateVectorStoreRequest() {
  }

  /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   **/
  public CreateVectorStoreRequest fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  
  @ApiModelProperty(value = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")
  @JsonProperty("file_ids")
   @Size(max=500)public List<String> getFileIds() {
    return fileIds;
  }

  @JsonProperty("file_ids")
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateVectorStoreRequest addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }

    this.fileIds.add(fileIdsItem);
    return this;
  }

  public CreateVectorStoreRequest removeFileIdsItem(String fileIdsItem) {
    if (fileIdsItem != null && this.fileIds != null) {
      this.fileIds.remove(fileIdsItem);
    }

    return this;
  }
  /**
   * The name of the vector store.
   **/
  public CreateVectorStoreRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the vector store.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public CreateVectorStoreRequest expiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("expires_after")
  @Valid public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }

  @JsonProperty("expires_after")
  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

  /**
   **/
  public CreateVectorStoreRequest chunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chunking_strategy")
  @Valid public CreateVectorStoreRequestChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  @JsonProperty("chunking_strategy")
  public void setChunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   **/
  public CreateVectorStoreRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
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

