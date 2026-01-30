package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Static_Chunking_Strategy_static")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StaticChunkingStrategyStatic   {
  private Integer maxChunkSizeTokens;
  private Integer chunkOverlapTokens;

  public StaticChunkingStrategyStatic() {
  }

  @JsonCreator
  public StaticChunkingStrategyStatic(
    @JsonProperty(required = true, value = "max_chunk_size_tokens") Integer maxChunkSizeTokens,
    @JsonProperty(required = true, value = "chunk_overlap_tokens") Integer chunkOverlapTokens
  ) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    this.chunkOverlapTokens = chunkOverlapTokens;
  }

  /**
   * The maximum number of tokens in each chunk. The default value is &#x60;800&#x60;. The minimum value is &#x60;100&#x60; and the maximum value is &#x60;4096&#x60;.
   * minimum: 100
   * maximum: 4096
   **/
  public StaticChunkingStrategyStatic maxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.")
  @JsonProperty(required = true, value = "max_chunk_size_tokens")
  @NotNull  @Min(100) @Max(4096)public Integer getMaxChunkSizeTokens() {
    return maxChunkSizeTokens;
  }

  @JsonProperty(required = true, value = "max_chunk_size_tokens")
  public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
  }

  /**
   * The number of tokens that overlap between chunks. The default value is &#x60;400&#x60;.  Note that the overlap must not exceed half of &#x60;max_chunk_size_tokens&#x60;. 
   **/
  public StaticChunkingStrategyStatic chunkOverlapTokens(Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. ")
  @JsonProperty(required = true, value = "chunk_overlap_tokens")
  @NotNull public Integer getChunkOverlapTokens() {
    return chunkOverlapTokens;
  }

  @JsonProperty(required = true, value = "chunk_overlap_tokens")
  public void setChunkOverlapTokens(Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StaticChunkingStrategyStatic staticChunkingStrategyStatic = (StaticChunkingStrategyStatic) o;
    return Objects.equals(this.maxChunkSizeTokens, staticChunkingStrategyStatic.maxChunkSizeTokens) &&
        Objects.equals(this.chunkOverlapTokens, staticChunkingStrategyStatic.chunkOverlapTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxChunkSizeTokens, chunkOverlapTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StaticChunkingStrategyStatic {\n");
    
    sb.append("    maxChunkSizeTokens: ").append(toIndentedString(maxChunkSizeTokens)).append("\n");
    sb.append("    chunkOverlapTokens: ").append(toIndentedString(chunkOverlapTokens)).append("\n");
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

