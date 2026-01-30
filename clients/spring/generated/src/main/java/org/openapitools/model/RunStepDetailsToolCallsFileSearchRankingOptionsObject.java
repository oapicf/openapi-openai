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
 * The ranking options for the file search.
 */

@Schema(name = "RunStepDetailsToolCallsFileSearchRankingOptionsObject", description = "The ranking options for the file search.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchRankingOptionsObject {

  /**
   * The ranker used for the file search.
   */
  public enum RankerEnum {
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

  private RankerEnum ranker;

  private BigDecimal scoreThreshold;

  public RunStepDetailsToolCallsFileSearchRankingOptionsObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDetailsToolCallsFileSearchRankingOptionsObject(RankerEnum ranker, BigDecimal scoreThreshold) {
    this.ranker = ranker;
    this.scoreThreshold = scoreThreshold;
  }

  public RunStepDetailsToolCallsFileSearchRankingOptionsObject ranker(RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

  /**
   * The ranker used for the file search.
   * @return ranker
   */
  @NotNull 
  @Schema(name = "ranker", description = "The ranker used for the file search.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ranker")
  public RankerEnum getRanker() {
    return ranker;
  }

  public void setRanker(RankerEnum ranker) {
    this.ranker = ranker;
  }

  public RunStepDetailsToolCallsFileSearchRankingOptionsObject scoreThreshold(BigDecimal scoreThreshold) {
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
    RunStepDetailsToolCallsFileSearchRankingOptionsObject runStepDetailsToolCallsFileSearchRankingOptionsObject = (RunStepDetailsToolCallsFileSearchRankingOptionsObject) o;
    return Objects.equals(this.ranker, runStepDetailsToolCallsFileSearchRankingOptionsObject.ranker) &&
        Objects.equals(this.scoreThreshold, runStepDetailsToolCallsFileSearchRankingOptionsObject.scoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranker, scoreThreshold);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchRankingOptionsObject {\n");
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

