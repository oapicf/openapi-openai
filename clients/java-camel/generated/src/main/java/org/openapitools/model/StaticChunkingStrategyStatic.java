package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StaticChunkingStrategyStatic
 */

@JsonTypeName("Static_Chunking_Strategy_static")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class StaticChunkingStrategyStatic {

  private Integer maxChunkSizeTokens;

  private Integer chunkOverlapTokens;

  public StaticChunkingStrategyStatic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StaticChunkingStrategyStatic(Integer maxChunkSizeTokens, Integer chunkOverlapTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    this.chunkOverlapTokens = chunkOverlapTokens;
  }

  public StaticChunkingStrategyStatic maxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    return this;
  }

  /**
   * The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
   * minimum: 100
   * maximum: 4096
   * @return maxChunkSizeTokens
   */
  @NotNull @Min(value = 100) @Max(value = 4096) 
  @Schema(name = "max_chunk_size_tokens", description = "The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_chunk_size_tokens")
  public Integer getMaxChunkSizeTokens() {
    return maxChunkSizeTokens;
  }

  public void setMaxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
  }

  public StaticChunkingStrategyStatic chunkOverlapTokens(Integer chunkOverlapTokens) {
    this.chunkOverlapTokens = chunkOverlapTokens;
    return this;
  }

  /**
   * The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
   * @return chunkOverlapTokens
   */
  @NotNull 
  @Schema(name = "chunk_overlap_tokens", description = "The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. ", requiredMode = Schema.RequiredMode.REQUIRED)
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

