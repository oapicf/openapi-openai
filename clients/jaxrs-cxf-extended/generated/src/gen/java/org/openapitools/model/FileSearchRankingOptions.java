package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 */
@ApiModel(description="The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")

public class FileSearchRankingOptions  {
  
public enum RankerEnum {

    @JsonProperty("auto") AUTO(String.valueOf("auto")),
    @JsonProperty("default_2024_08_21") DEFAULT_2024_08_21(String.valueOf("default_2024_08_21"));

    private String value;

    RankerEnum (String v) {
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

 /**
  * The ranker to use for the file search. If not specified will use the `auto` ranker.
  */
  @ApiModelProperty(value = "The ranker to use for the file search. If not specified will use the `auto` ranker.")
  private RankerEnum ranker;

 /**
  * The score threshold for the file search. All values must be a floating point number between 0 and 1.
  */
  @ApiModelProperty(required = true, value = "The score threshold for the file search. All values must be a floating point number between 0 and 1.")
  @Valid
  private BigDecimal scoreThreshold;
 /**
  * The ranker to use for the file search. If not specified will use the &#x60;auto&#x60; ranker.
  * @return ranker
  */
  @JsonProperty("ranker")
  public String getRanker() {
    return ranker == null ? null : ranker.value();
  }

  /**
   * Sets the <code>ranker</code> property.
   */
 public void setRanker(RankerEnum ranker) {
    this.ranker = ranker;
  }

  /**
   * Sets the <code>ranker</code> property.
   */
  public FileSearchRankingOptions ranker(RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

 /**
  * The score threshold for the file search. All values must be a floating point number between 0 and 1.
  * minimum: 0
  * maximum: 1
  * @return scoreThreshold
  */
  @JsonProperty("score_threshold")
  @NotNull
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getScoreThreshold() {
    return scoreThreshold;
  }

  /**
   * Sets the <code>scoreThreshold</code> property.
   */
 public void setScoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }

  /**
   * Sets the <code>scoreThreshold</code> property.
   */
  public FileSearchRankingOptions scoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

