package org.openapitools.model;

import java.math.BigDecimal;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The ranking options for the file search.
 */
public class RunStepDetailsToolCallsFileSearchRankingOptionsObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ranker used for the file search.
   */
  @JsonProperty("ranker")
  private String ranker;

  /**
   * The score threshold for the file search. All values must be a floating point number between 0 and 1.
   */
  @JsonProperty("score_threshold")
  private BigDecimal scoreThreshold;

  /**
   * The ranker used for the file search.
   * @return ranker
   */
  public String getRanker() {
    return ranker;
  }

  public void setRanker(String ranker) {
    this.ranker = ranker;
  }

  /**
   * The score threshold for the file search. All values must be a floating point number between 0 and 1.
   * @return scoreThreshold
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
