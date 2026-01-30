package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;

/**
 * The ranking options for the file search.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDetailsToolCallsFileSearchRankingOptionsObject   {
  


  public enum RankerEnum {
    DEFAULT_2024_08_21("default_2024_08_21");

    private String value;

    RankerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RankerEnum ranker;
  private BigDecimal scoreThreshold;

  public RunStepDetailsToolCallsFileSearchRankingOptionsObject () {

  }

  public RunStepDetailsToolCallsFileSearchRankingOptionsObject (RankerEnum ranker, BigDecimal scoreThreshold) {
    this.ranker = ranker;
    this.scoreThreshold = scoreThreshold;
  }

    
  @JsonProperty("ranker")
  public RankerEnum getRanker() {
    return ranker;
  }
  public void setRanker(RankerEnum ranker) {
    this.ranker = ranker;
  }

    
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
    return Objects.equals(ranker, runStepDetailsToolCallsFileSearchRankingOptionsObject.ranker) &&
        Objects.equals(scoreThreshold, runStepDetailsToolCallsFileSearchRankingOptionsObject.scoreThreshold);
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
