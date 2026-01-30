package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;



/**
 * The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 **/

@ApiModel(description = "The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class FileSearchRankingOptions   {
  /**
   * The ranker to use for the file search. If not specified will use the `auto` ranker.
   */
  public enum RankerEnum {
    AUTO("auto"),
    
    DEFAULT_2024_08_21("default_2024_08_21");

    private String value;

    RankerEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RankerEnum fromValue(String text) {
      for (RankerEnum b : RankerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("ranker")
  private RankerEnum ranker;

  @JsonProperty("score_threshold")
  private BigDecimal scoreThreshold;

  /**
   * The ranker to use for the file search. If not specified will use the `auto` ranker.
   **/
  public FileSearchRankingOptions ranker(RankerEnum ranker) {
    this.ranker = ranker;
    return this;
  }

  
  @ApiModelProperty(value = "The ranker to use for the file search. If not specified will use the `auto` ranker.")
  @JsonProperty("ranker")
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
  public FileSearchRankingOptions scoreThreshold(BigDecimal scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score threshold for the file search. All values must be a floating point number between 0 and 1.")
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
    return Objects.equals(ranker, fileSearchRankingOptions.ranker) &&
        Objects.equals(scoreThreshold, fileSearchRankingOptions.scoreThreshold);
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

