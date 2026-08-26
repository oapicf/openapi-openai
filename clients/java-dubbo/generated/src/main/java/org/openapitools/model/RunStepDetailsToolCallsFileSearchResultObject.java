package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A result instance of the file search.
 */
public class RunStepDetailsToolCallsFileSearchResultObject implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the file that result was found in.
   */
  @JsonProperty("file_id")
  private String fileId;

  /**
   * The name of the file that result was found in.
   */
  @JsonProperty("file_name")
  private String fileName;

  /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   */
  @JsonProperty("score")
  private BigDecimal score;

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   */
  @JsonProperty("content")
  private List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

  /**
   * The ID of the file that result was found in.
   * @return fileId
   */
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

  /**
   * The name of the file that result was found in.
   * @return fileName
   */
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * The score of the result. All values must be a floating point number between 0 and 1.
   * @return score
   */
  public BigDecimal getScore() {
    return score;
  }

  public void setScore(BigDecimal score) {
    this.score = score;
  }

  /**
   * The content of the result that was found. The content is only included if requested via the include query parameter.
   * @return content
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
