package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A result instance of the file search.
 */
@ApiModel(description="A result instance of the file search.")

public class RunStepDetailsToolCallsFileSearchResultObject  {
  
 /**
  * The ID of the file that result was found in.
  */
  @ApiModelProperty(required = true, value = "The ID of the file that result was found in.")

  private String fileId;

 /**
  * The name of the file that result was found in.
  */
  @ApiModelProperty(required = true, value = "The name of the file that result was found in.")

  private String fileName;

 /**
  * The score of the result. All values must be a floating point number between 0 and 1.
  */
  @ApiModelProperty(required = true, value = "The score of the result. All values must be a floating point number between 0 and 1.")

  private BigDecimal score;

 /**
  * The content of the result that was found. The content is only included if requested via the include query parameter.
  */
  @ApiModelProperty(value = "The content of the result that was found. The content is only included if requested via the include query parameter.")

  private List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();
 /**
   * The ID of the file that result was found in.
   * @return fileId
  **/
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

 /**
   * The name of the file that result was found in.
   * @return fileName
  **/
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return score
  **/
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public RunStepDetailsToolCallsFileSearchResultObject score(BigDecimal score) {
    this.score = score;
    return this;
  }

 /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   * @return content
  **/
  @JsonProperty("content")
  public List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
    return content;
  }

  public void setContent(List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
  }

  public RunStepDetailsToolCallsFileSearchResultObject content(List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
    return this;
  }

  public RunStepDetailsToolCallsFileSearchResultObject addContentItem(RunStepDetailsToolCallsFileSearchResultObjectContentInner contentItem) {
    this.content.add(contentItem);
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
    RunStepDetailsToolCallsFileSearchResultObject runStepDetailsToolCallsFileSearchResultObject = (RunStepDetailsToolCallsFileSearchResultObject) o;
    return Objects.equals(this.fileId, runStepDetailsToolCallsFileSearchResultObject.fileId) &&
        Objects.equals(this.fileName, runStepDetailsToolCallsFileSearchResultObject.fileName) &&
        Objects.equals(this.score, runStepDetailsToolCallsFileSearchResultObject.score) &&
        Objects.equals(this.content, runStepDetailsToolCallsFileSearchResultObject.content);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

