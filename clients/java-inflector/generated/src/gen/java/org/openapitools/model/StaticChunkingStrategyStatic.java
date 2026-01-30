package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StaticChunkingStrategyStatic   {
  @JsonProperty("max_chunk_size_tokens")
  private Integer maxChunkSizeTokens;

  @JsonProperty("chunk_overlap_tokens")
  private Integer chunkOverlapTokens;

  /**
   * The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
   * minimum: 100
   * maximum: 4096
   **/
  public StaticChunkingStrategyStatic maxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.")
  @JsonProperty("max_chunk_size_tokens")
  public Integer getMaxChunkSizeTokens() {
    return maxChunkSizeTokens;
  }
  public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
  }

  /**
   * The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
   **/
  public StaticChunkingStrategyStatic chunkOverlapTokens(Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. ")
  @JsonProperty("chunk_overlap_tokens")
  public Integer getChunkOverlapTokens() {
    return chunkOverlapTokens;
  }
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
    return Objects.equals(maxChunkSizeTokens, staticChunkingStrategyStatic.maxChunkSizeTokens) &&
        Objects.equals(chunkOverlapTokens, staticChunkingStrategyStatic.chunkOverlapTokens);
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

