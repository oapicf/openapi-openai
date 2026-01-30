package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StaticChunkingStrategyStatic   {
  
  private Integer maxChunkSizeTokens;
  private Integer chunkOverlapTokens;

  public StaticChunkingStrategyStatic () {

  }

  public StaticChunkingStrategyStatic (Integer maxChunkSizeTokens, Integer chunkOverlapTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    this.chunkOverlapTokens = chunkOverlapTokens;
  }

    
  @JsonProperty("max_chunk_size_tokens")
  public Integer getMaxChunkSizeTokens() {
    return maxChunkSizeTokens;
  }
  public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
  }

    
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
