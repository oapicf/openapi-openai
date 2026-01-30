package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateVectorStoreRequestChunkingStrategy;
import org.openapitools.vertxweb.server.model.VectorStoreExpirationAfter;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateVectorStoreRequest   {
  
  private List<String> fileIds = new ArrayList<>();
  private String name;
  private VectorStoreExpirationAfter expiresAfter;
  private CreateVectorStoreRequestChunkingStrategy chunkingStrategy;
  private Object metadata;

  public CreateVectorStoreRequest () {

  }

  public CreateVectorStoreRequest (List<String> fileIds, String name, VectorStoreExpirationAfter expiresAfter, CreateVectorStoreRequestChunkingStrategy chunkingStrategy, Object metadata) {
    this.fileIds = fileIds;
    this.name = name;
    this.expiresAfter = expiresAfter;
    this.chunkingStrategy = chunkingStrategy;
    this.metadata = metadata;
  }

    
  @JsonProperty("file_ids")
  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("expires_after")
  public VectorStoreExpirationAfter getExpiresAfter() {
    return expiresAfter;
  }
  public void setExpiresAfter(VectorStoreExpirationAfter expiresAfter) {
    this.expiresAfter = expiresAfter;
  }

    
  @JsonProperty("chunking_strategy")
  public CreateVectorStoreRequestChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }
  public void setChunkingStrategy(CreateVectorStoreRequestChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

    
  @JsonProperty("metadata")
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
    return Objects.equals(fileIds, createVectorStoreRequest.fileIds) &&
        Objects.equals(name, createVectorStoreRequest.name) &&
        Objects.equals(expiresAfter, createVectorStoreRequest.expiresAfter) &&
        Objects.equals(chunkingStrategy, createVectorStoreRequest.chunkingStrategy) &&
        Objects.equals(metadata, createVectorStoreRequest.metadata);
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
