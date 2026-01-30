package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A result instance of the file search.
 */

@Schema(name = "RunStepDetailsToolCallsFileSearchResultObject", description = "A result instance of the file search.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class RunStepDetailsToolCallsFileSearchResultObject {

  private String fileId;

  private String fileName;

  private BigDecimal score;

  @Valid
  private List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchResultObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RunStepDetailsToolCallsFileSearchResultObject(String fileId, String fileName, BigDecimal score) {
    this.fileId = fileId;
    this.fileName = fileName;
    this.score = score;
  }

  public RunStepDetailsToolCallsFileSearchResultObject fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the file that result was found in.
   * @return fileId
   */
  @NotNull 
  @Schema(name = "file_id", description = "The ID of the file that result was found in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_id")
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
  @NotNull 
  @Schema(name = "file_name", description = "The name of the file that result was found in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("file_name")
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
  @NotNull @Valid @DecimalMin(value = "0") @DecimalMax(value = "1") 
  @Schema(name = "score", description = "The score of the result. All values must be a floating point number between 0 and 1.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  public RunStepDetailsToolCallsFileSearchResultObject content(List<@Valid RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
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
  @Valid 
  @Schema(name = "content", description = "The content of the result that was found. The content is only included if requested via the include query parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
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

