package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="A result instance of the file search.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-29T14:09:21.247747647Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchResultObject   {
  
  private String fileId;
  private String fileName;
  private BigDecimal score;
  private List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

  /**
   * The ID of the file that result was found in.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the file that result was found in.")
  @JsonProperty("file_id")
  @NotNull
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * The name of the file that result was found in.
   **/
  
  @ApiModelProperty(required = true, value = "The name of the file that result was found in.")
  @JsonProperty("file_name")
  @NotNull
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
  
  @ApiModelProperty(required = true, value = "The score of the result. All values must be a floating point number between 0 and 1.")
  @JsonProperty("score")
  @NotNull
 @DecimalMin("0") @DecimalMax("1")  @Valid
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   **/
  
  @ApiModelProperty(value = "The content of the result that was found. The content is only included if requested via the include query parameter.")
  @JsonProperty("content")
  @Valid
  public List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> getContent() {
    return content;
  }
  public void setContent(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
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

