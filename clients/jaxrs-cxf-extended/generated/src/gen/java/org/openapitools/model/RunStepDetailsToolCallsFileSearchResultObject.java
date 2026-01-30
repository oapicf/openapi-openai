package org.openapitools.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
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
  @Valid
  private BigDecimal score;

 /**
  * The content of the result that was found. The content is only included if requested via the include query parameter.
  */
  @ApiModelProperty(value = "The content of the result that was found. The content is only included if requested via the include query parameter.")
  @Valid
  private List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();
 /**
  * The ID of the file that result was found in.
  * @return fileId
  */
  @JsonProperty("file_id")
  @NotNull
  public String getFileId() {
    return fileId;
  }

  /**
   * Sets the <code>fileId</code> property.
   */
 public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * Sets the <code>fileId</code> property.
   */
  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

 /**
  * The name of the file that result was found in.
  * @return fileName
  */
  @JsonProperty("file_name")
  @NotNull
  public String getFileName() {
    return fileName;
  }

  /**
   * Sets the <code>fileName</code> property.
   */
 public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * Sets the <code>fileName</code> property.
   */
  public RunStepDetailsToolCallsFileSearchResultObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

 /**
  * The score of the result. All values must be a floating point number between 0 and 1.
  * minimum: 0
  * maximum: 1
  * @return score
  */
  @JsonProperty("score")
  @NotNull
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getScore() {
    return score;
  }

  /**
   * Sets the <code>score</code> property.
   */
 public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * Sets the <code>score</code> property.
   */
  public RunStepDetailsToolCallsFileSearchResultObject score(BigDecimal score) {
    this.score = score;
    return this;
  }

 /**
  * The content of the result that was found. The content is only included if requested via the include query parameter.
  * @return content
  */
  @JsonProperty("content")
  public List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
    return content;
  }

  /**
   * Sets the <code>content</code> property.
   */
 public void setContent(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
  }

  /**
   * Sets the <code>content</code> property.
   */
  public RunStepDetailsToolCallsFileSearchResultObject content(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
    return this;
  }

  /**
   * Adds a new item to the <code>content</code> list.
   */
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

