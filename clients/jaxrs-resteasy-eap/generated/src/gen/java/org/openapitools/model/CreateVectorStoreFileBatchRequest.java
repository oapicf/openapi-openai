package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ChunkingStrategyRequestParam;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-29T14:09:29.020322047Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateVectorStoreFileBatchRequest   {
  
  private List<String> fileIds = new ArrayList<>();
  private ChunkingStrategyRequestParam chunkingStrategy;

  /**
   * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
   **/
  
  @ApiModelProperty(required = true, value = "A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.")
  @JsonProperty("file_ids")
  @NotNull
 @Size(min=1,max=500)  public List<String> getFileIds() {
    return fileIds;
  }
  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("chunking_strategy")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

