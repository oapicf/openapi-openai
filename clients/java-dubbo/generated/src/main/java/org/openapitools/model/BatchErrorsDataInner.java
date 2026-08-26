package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BatchErrorsDataInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * An error code identifying the error type.
   */
  @JsonProperty("code")
  private String code;

  /**
   * A human-readable message providing more details about the error.
   */
  @JsonProperty("message")
  private String message;

  /**
   * The name of the parameter that caused the error, if applicable.
   */
  @JsonProperty("param")
  private String param;

  /**
   * The line number of the input file where the error occurred, if applicable.
   */
  @JsonProperty("line")
  private Integer line;

  /**
   * An error code identifying the error type.
   * @return code
   */
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable message providing more details about the error.
   * @return message
   */
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The name of the parameter that caused the error, if applicable.
   * @return param
   */
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  /**
   * The line number of the input file where the error occurred, if applicable.
   * @return line
   */
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
    return Objects.equals(this.code, batchErrorsDataInner.code) &&
        Objects.equals(this.message, batchErrorsDataInner.message) &&
        Objects.equals(this.param, batchErrorsDataInner.param) &&
        Objects.equals(this.line, batchErrorsDataInner.line);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
