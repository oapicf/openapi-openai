package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A result instance of the file search.
 **/
@ApiModel(description = "A result instance of the file search.")
@JsonTypeName("RunStepDetailsToolCallsFileSearchResultObject")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchResultObject   {
  private String fileId;
  private String fileName;
  private BigDecimal score;
  private @Valid List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchResultObject() {
  }

  @JsonCreator
  public RunStepDetailsToolCallsFileSearchResultObject(
    @JsonProperty(required = true, value = "file_id") String fileId,
    @JsonProperty(required = true, value = "file_name") String fileName,
    @JsonProperty(required = true, value = "score") BigDecimal score
  ) {
    this.fileId = fileId;
    this.fileName = fileName;
    this.score = score;
  }

  /**
   * The ID of the file that result was found in.
   **/
  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the file that result was found in.")
  @JsonProperty(required = true, value = "file_id")
  @NotNull public String getFileId() {
    return fileId;
  }

  @JsonProperty(required = true, value = "file_id")
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
  @JsonProperty(required = true, value = "file_name")
  @NotNull public String getFileName() {
    return fileName;
  }

  @JsonProperty(required = true, value = "file_name")
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
  @JsonProperty(required = true, value = "score")
  @NotNull @Valid  @DecimalMin("0") @DecimalMax("1")public BigDecimal getScore() {
    return score;
  }

  @JsonProperty(required = true, value = "score")
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   **/
  public RunStepDetailsToolCallsFileSearchResultObject content(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
    return this;
  }

  
  @ApiModelProperty(value = "The content of the result that was found. The content is only included if requested via the include query parameter.")
  @JsonProperty("content")
  @Valid public List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.content = content;
  }

  public RunStepDetailsToolCallsFileSearchResultObject addContentItem(RunStepDetailsToolCallsFileSearchResultObjectContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }

    this.content.add(contentItem);
    return this;
  }

  public RunStepDetailsToolCallsFileSearchResultObject removeContentItem(RunStepDetailsToolCallsFileSearchResultObjectContentInner contentItem) {
    if (contentItem != null && this.content != null) {
      this.content.remove(contentItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

