package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateEmbeddingResponseUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-16T01:12:54.315235707Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateEmbeddingResponseUsage   {
  @JsonProperty("prompt_tokens")
  @NotNull

  private Integer promptTokens;

  @JsonProperty("total_tokens")
  @NotNull

  private Integer totalTokens;

  public CreateEmbeddingResponseUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

   /**
   * Get promptTokens
   * @return promptTokens
  **/
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }

  public CreateEmbeddingResponseUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

   /**
   * Get totalTokens
   * @return totalTokens
  **/
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEmbeddingResponseUsage createEmbeddingResponseUsage = (CreateEmbeddingResponseUsage) o;
    return Objects.equals(promptTokens, createEmbeddingResponseUsage.promptTokens) &&
        Objects.equals(totalTokens, createEmbeddingResponseUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promptTokens, totalTokens);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEmbeddingResponseUsage {\n");
    
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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

