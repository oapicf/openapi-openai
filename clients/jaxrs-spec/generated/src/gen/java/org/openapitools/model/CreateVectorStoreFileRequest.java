package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ChunkingStrategyRequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CreateVectorStoreFileRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateVectorStoreFileRequest   {
  private String fileId;
  private ChunkingStrategyRequestParam chunkingStrategy;

  public CreateVectorStoreFileRequest() {
  }

  @JsonCreator
  public CreateVectorStoreFileRequest(
    @JsonProperty(required = true, value = "file_id") String fileId
  ) {
    this.fileId = fileId;
  }

  /**
   * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   **/
  public CreateVectorStoreFileRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.")
  @JsonProperty(required = true, value = "file_id")
  @NotNull public String getFileId() {
    return fileId;
  }

  @JsonProperty(required = true, value = "file_id")
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   **/
  public CreateVectorStoreFileRequest chunkingStrategy(ChunkingStrategyRequestParam chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("chunking_strategy")
  @Valid public ChunkingStrategyRequestParam getChunkingStrategy() {
    return chunkingStrategy;
  }

  @JsonProperty("chunking_strategy")
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

