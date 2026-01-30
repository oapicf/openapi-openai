package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.RunStepDetailsToolCallsFileSearchResultObjectContentInner;

/**
 * A result instance of the file search.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunStepDetailsToolCallsFileSearchResultObject   {
  
  private String fileId;
  private String fileName;
  private BigDecimal score;
  private List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content = new ArrayList<>();

  public RunStepDetailsToolCallsFileSearchResultObject () {

  }

  public RunStepDetailsToolCallsFileSearchResultObject (String fileId, String fileName, BigDecimal score, List<RunStepDetailsToolCallsFileSearchResultObjectContentInner> content) {
    this.fileId = fileId;
    this.fileName = fileName;
    this.score = score;
    this.content = content;
  }

    
  @JsonProperty("file_id")
  public String getFileId() {
    return fileId;
  }
  public void setFileId(String fileId) {
    this.fileId = fileId;
  }

    
  @JsonProperty("file_name")
  public String getFileName() {
    return fileName;
  }
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

    
  @JsonProperty("score")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }

    
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
