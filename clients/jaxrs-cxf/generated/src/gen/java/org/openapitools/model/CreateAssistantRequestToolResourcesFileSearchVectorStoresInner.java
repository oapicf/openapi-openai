package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner  {
  
 /**
  * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  */
  @ApiModelProperty(value = "A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. ")

  private List<String> fileIds = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy;

 /**
  * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  */
  @ApiModelProperty(value = "Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. ")

  private Object metadata;
 /**
   * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
   * @return fileIds
  **/
  @JsonProperty("file_ids")
 @Size(max=10000)  public List<String> getFileIds() {
    return fileIds;
  }

  public void setFileIds(List<String> fileIds) {
    this.fileIds = fileIds;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner fileIds(List<String> fileIds) {
    this.fileIds = fileIds;
    return this;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner addFileIdsItem(String fileIdsItem) {
    this.fileIds.add(fileIdsItem);
    return this;
  }

 /**
   * Get chunkingStrategy
   * @return chunkingStrategy
  **/
  @JsonProperty("chunking_strategy")
  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy getChunkingStrategy() {
    return chunkingStrategy;
  }

  public void setChunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner chunkingStrategy(CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy chunkingStrategy) {
    this.chunkingStrategy = chunkingStrategy;
    return this;
  }

 /**
   * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
   * @return metadata
  **/
  @JsonProperty("metadata")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public CreateAssistantRequestToolResourcesFileSearchVectorStoresInner metadata(Object metadata) {
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
    CreateAssistantRequestToolResourcesFileSearchVectorStoresInner createAssistantRequestToolResourcesFileSearchVectorStoresInner = (CreateAssistantRequestToolResourcesFileSearchVectorStoresInner) o;
    return Objects.equals(this.fileIds, createAssistantRequestToolResourcesFileSearchVectorStoresInner.fileIds) &&
        Objects.equals(this.chunkingStrategy, createAssistantRequestToolResourcesFileSearchVectorStoresInner.chunkingStrategy) &&
        Objects.equals(this.metadata, createAssistantRequestToolResourcesFileSearchVectorStoresInner.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileIds, chunkingStrategy, metadata);
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

