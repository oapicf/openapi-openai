package apimodels;

import apimodels.ChunkingStrategyRequestParam;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateVectorStoreFileRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateVectorStoreFileRequest   {
  @JsonProperty("file_id")
  @NotNull

  private String fileId;

  @JsonProperty("chunking_strategy")
  @Valid

  private ChunkingStrategyRequestParam chunkingStrategy;

  public CreateVectorStoreFileRequest fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
   * @return fileId
  **/
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
  **/
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
    return Objects.equals(fileId, createVectorStoreFileRequest.fileId) &&
        Objects.equals(chunkingStrategy, createVectorStoreFileRequest.chunkingStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, chunkingStrategy);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

