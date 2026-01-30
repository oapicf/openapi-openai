package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BatchErrorsDataInner  {
  
 /**
  * An error code identifying the error type.
  */
  @ApiModelProperty(value = "An error code identifying the error type.")
  private String code;

 /**
  * A human-readable message providing more details about the error.
  */
  @ApiModelProperty(value = "A human-readable message providing more details about the error.")
  private String message;

 /**
  * The name of the parameter that caused the error, if applicable.
  */
  @ApiModelProperty(value = "The name of the parameter that caused the error, if applicable.")
  private String param;

 /**
  * The line number of the input file where the error occurred, if applicable.
  */
  @ApiModelProperty(value = "The line number of the input file where the error occurred, if applicable.")
  private Integer line;
 /**
  * An error code identifying the error type.
  * @return code
  */
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(String code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public BatchErrorsDataInner code(String code) {
    this.code = code;
    return this;
  }

 /**
  * A human-readable message providing more details about the error.
  * @return message
  */
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  /**
   * Sets the <code>message</code> property.
   */
 public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Sets the <code>message</code> property.
   */
  public BatchErrorsDataInner message(String message) {
    this.message = message;
    return this;
  }

 /**
  * The name of the parameter that caused the error, if applicable.
  * @return param
  */
  @JsonProperty("param")
  public String getParam() {
    return param;
  }

  /**
   * Sets the <code>param</code> property.
   */
 public void setParam(String param) {
    this.param = param;
  }

  /**
   * Sets the <code>param</code> property.
   */
  public BatchErrorsDataInner param(String param) {
    this.param = param;
    return this;
  }

 /**
  * The line number of the input file where the error occurred, if applicable.
  * @return line
  */
  @JsonProperty("line")
  public Integer getLine() {
    return line;
  }

  /**
   * Sets the <code>line</code> property.
   */
 public void setLine(Integer line) {
    this.line = line;
  }

  /**
   * Sets the <code>line</code> property.
   */
  public BatchErrorsDataInner line(Integer line) {
    this.line = line;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

