package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * StaticChunkingStrategyStatic
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class StaticChunkingStrategyStatic   {
  @JsonProperty("max_chunk_size_tokens")
  @NotNull
@Min(100)
@Max(4096)

  private Integer maxChunkSizeTokens;

  @JsonProperty("chunk_overlap_tokens")
  @NotNull

  private Integer chunkOverlapTokens;

  public StaticChunkingStrategyStatic maxChunkSizeTokens(Integer maxChunkSizeTokens) {
    this.maxChunkSizeTokens = maxChunkSizeTokens;
    return this;
  }

   /**
   * The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
   * minimum: 100
   * maximum: 4096
   * @return maxChunkSizeTokens
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

