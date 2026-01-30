package apimodels;

import apimodels.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner   {
  @JsonProperty("file_ids")
  @Size(max=10000)

  private List<String> fileIds = null;

  @JsonProperty("chunking_strategy")
  @Valid

  private CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy;

  @JsonProperty("metadata")
  
  private Object metadata;

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner addFileIdsItem(String fileIdsItem) {
    if (this.fileIds == null) {
      this.fileIds = new ArrayList<>();
    }
    this.fileIds.add(fileIdsItem);
    return this;
  }

   /**
   * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
   * @return fileIds
  **/
  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner chunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

   /**
   * Get chunkingStrategy
   * @return chunkingStrategy
  **/
  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
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
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInner createAssistantRequestToolResourcesFileSearchVectorStoresInner = (CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) o;
    return Objects.equals(fileIds, createAssistantRequestToolResourcesFileSearchVectorStoresInner.fileIds) &&
        Objects.equals(chunkingStrategy, createAssistantRequestToolResourcesFileSearchVectorStoresInner.chunkingStrategy) &&
        Objects.equals(metadata, createAssistantRequestToolResourcesFileSearchVectorStoresInner.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, chunkingStrategy, metadata);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner {\n");
    
    sb.append("    fileIds: ").append(toIndentedString(fileIds)).append("\n");
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

