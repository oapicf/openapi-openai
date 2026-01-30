package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * A result instance of the file search.
 */
@ApiModel(description = "A result instance of the file search.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchResultObject   {
  @JsonProperty("file_id")
  private String fileId;

  @JsonProperty("file_name")
  private String fileName;

  @JsonProperty("score")
  private BigDecimal score;

  @JsonProperty("content")
  
  private List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = null;

  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the file that result was found in.
   * @return fileId
   */
  @ApiModelProperty(required = true, value = "The ID of the file that result was found in.")
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of the file that result was found in.
   * @return fileName
   */
  @ApiModelProperty(required = true, value = "The name of the file that result was found in.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public RunStepDetailsToolCallsFileSearchResultObject score(BigDecimal score) {
    this.score = score;
    return this;
  }

  /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   * minimum: 0
   * maximum: 1
   * @return score
   */
  @ApiModelProperty(required = true, value = "The score of the result. All values must be a floating point number between 0 and 1.")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public RunStepDetailsToolCallsFileSearchResultObject content(List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
    return this;
  }

  public RunStepDetailsToolCallsFileSearchResultObject addContentItem(RunStepDetailsToolCallsFileSearchResultObjectContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   * @return content
   */
  @ApiModelProperty(value = "The content of the result that was found. The content is only included if requested via the include query parameter.")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

