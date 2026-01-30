/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI document version: 2.3.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-29T14:08:32.184840743Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchErrorsDataInner   {
  
  private String code;
  private String message;
  private String param;
  private Integer line;

  /**
   * An error code identifying the error type.
   */
  public BatchErrorsDataInner code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "An error code identifying the error type.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable message providing more details about the error.
   */
  public BatchErrorsDataInner message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "A human-readable message providing more details about the error.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The name of the parameter that caused the error, if applicable.
   */
  public BatchErrorsDataInner param(String param) {
    this.param = param;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the parameter that caused the error, if applicable.")
  @JsonProperty("param")
  public String getParam() {
    return param;
  }
  public void setParam(String param) {
    this.param = param;
  }

  /**
   * The line number of the input file where the error occurred, if applicable.
   */
  public BatchErrorsDataInner line(Integer line) {
    this.line = line;
    return this;
  }

  
  @ApiModelProperty(value = "The line number of the input file where the error occurred, if applicable.")
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

