package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchErrorsDataInner   {
  
  private String code;
  private String message;
  private String param;
  private Integer line;

  public BatchErrorsDataInner () {

  }

  public BatchErrorsDataInner (String code, String message, String param, Integer line) {
    this.code = code;
    this.message = message;
    this.param = param;
    this.line = line;
  }

    
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

    
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

    
  @JsonProperty("param")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }

    
  @JsonProperty("line")
  public Integer getLine() {
    return line;
  }
  public void setLine(Integer line) {
    this.line = line;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchErrorsDataInner batchErrorsDataInner = (BatchErrorsDataInner) o;
    return Objects.equals(code, batchErrorsDataInner.code) &&
        Objects.equals(message, batchErrorsDataInner.message) &&
        Objects.equals(param, batchErrorsDataInner.param) &&
        Objects.equals(line, batchErrorsDataInner.line);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, param, line);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchErrorsDataInner {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
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
