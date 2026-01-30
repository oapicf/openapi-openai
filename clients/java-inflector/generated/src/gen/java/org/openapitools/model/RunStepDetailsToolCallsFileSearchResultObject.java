package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;



/**
 * A result instance of the file search.
 **/

@ApiModel(description = "A result instance of the file search.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchResultObject   {
  @JsonProperty("file_id")
  private String fileId;

  @JsonProperty("file_name")
  private String fileName;

  @JsonProperty("score")
  private BigDecimal score;

  @JsonProperty("content")
  private List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = null;

  /**
   * The ID of the file that result was found in.
   **/
  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the file that result was found in.")
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * The name of the file that result was found in.
   **/
  public RunStepDetailsToolCallsFileSearchResultObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The name of the file that result was found in.")
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   **/
  public RunStepDetailsToolCallsFileSearchResultObject score(BigDecimal score) {
    this.score = score;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The score of the result. All values must be a floating point number between 0 and 1.")
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   **/
  public RunStepDetailsToolCallsFileSearchResultObject content(List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "The content of the result that was found. The content is only included if requested via the include query parameter.")
  @JsonProperty("content")
  public List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
    return content;
  }
  public void setContent(List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepDetailsToolCallsFileSearchResultObject runStepDetailsToolCallsFileSearchResultObject = (RunStepDetailsToolCallsFileSearchResultObject) o;
    return Objects.equals(fileId, runStepDetailsToolCallsFileSearchResultObject.fileId) &&
        Objects.equals(fileName, runStepDetailsToolCallsFileSearchResultObject.fileName) &&
        Objects.equals(score, runStepDetailsToolCallsFileSearchResultObject.score) &&
        Objects.equals(content, runStepDetailsToolCallsFileSearchResultObject.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, fileName, score, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepDetailsToolCallsFileSearchResultObject {\n");
    
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

