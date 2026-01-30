package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */

@Schema(name = "FileSearchRankingOptions", description = "The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FileSearchRankingOptions {

  /**
   * The ranker to use for the file search. If not specified will use the `auto` ranker.
   */
  public enum RankerEnum {
    AUTO("auto"),
    
    DEFAULT_2024_08_21("default_2024_08_21");

    private final String value;

    RankerEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RankerEnum fromValue(String value) {
      for (RankerEnum b : RankerEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable RankerEnum ranker;

  private BigDecimal scoreThreshold;

  public FileSearchRankingOptions() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FileSearchRankingOptions(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }

  public FileSearchRankingOptions ranker(@Nullable RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

  /**
   * The ranker to use for the file search. If not specified will use the `auto` ranker.
   * @return ranker
   */
  
  @Schema(name = "ranker", description = "The ranker to use for the file search. If not specified will use the `auto` ranker.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranker")
  public @Nullable RankerEnum getRanker() {
    return ranker;
  }

  public void setRanker(@Nullable RankerEnum ranker) {
    this.ranker = ranker;
  }

  public FileSearchRankingOptions scoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  /**
   * The score threshold for the file search. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return scoreThreshold
   */
  @NotNull @Valid @DecimalMin(value = "0") @DecimalMax(value = "1") 
  @Schema(name = "score_threshold", description = "The score threshold for the file search. All values must be a floating point number between 0 and 1.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score_threshold")
  public BigDecimal getScoreThreshold() {
    return scoreThreshold;
  }

  public void setScoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSearchRankingOptions fileSearchRankingOptions = (FileSearchRankingOptions) o;
    return Objects.equals(this.ranker, fileSearchRankingOptions.ranker) &&
        Objects.equals(this.scoreThreshold, fileSearchRankingOptions.scoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranker, scoreThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSearchRankingOptions {\n");
    sb.append("    ranker: ").append(toIndentedString(ranker)).append("\n");
    sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
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

