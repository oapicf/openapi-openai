package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The ranking options for the file search.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RunStepDetailsToolCallsFileSearchRankingOptionsObject   {
  /**
   * The ranker used for the file search.
   */
  public enum RankerEnum {
    DEFAULT_2024_08_21("default_2024_08_21");

    private final String value;

    RankerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("ranker")
  @NotNull

  private RankerEnum ranker;

  @JsonProperty("score_threshold")
  @NotNull
@DecimalMin("0")
@DecimalMax("1")
@Valid

  private BigDecimal scoreThreshold;

  public RunStepDetailsToolCallsFileSearchRankingOptionsObject ranker(RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

   /**
   * The ranker used for the file search.
   * @return ranker
  **/
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
  **/
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
    return Objects.equals(ranker, runStepDetailsToolCallsFileSearchRankingOptionsObject.ranker) &&
        Objects.equals(scoreThreshold, runStepDetailsToolCallsFileSearchRankingOptionsObject.scoreThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranker, scoreThreshold);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

