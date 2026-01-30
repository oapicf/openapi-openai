package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The ranking options for the file search.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The ranking options for the file search.")
public class RunStepDetailsToolCallsFileSearchRankingOptionsObject   {
  

public enum RankerEnum {

    @JsonProperty("default_2024_08_21") DEFAULT_2024_08_21(String.valueOf("default_2024_08_21"));


    private String value;

    RankerEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

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

  /**
   * The ranker used for the file search.
   **/
  public RunStepDetailsToolCallsFileSearchRankingOptionsObject ranker(RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ranker used for the file search.")
  @JsonProperty("ranker")
  @NotNull
  public RankerEnum getRanker() {
    return ranker;
  }
  public void setRanker(RankerEnum ranker) {
    this.ranker = ranker;
  }


  /**
   * The score threshold for the file search. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   **/
  public RunStepDetailsToolCallsFileSearchRankingOptionsObject scoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score threshold for the file search. All values must be a floating point number between 0 and 1.")
  @JsonProperty("score_threshold")
  @NotNull
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getScoreThreshold() {
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

