package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Batch_errors_data_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BatchErrorsDataInner   {
  private String code;
  private String message;
  private String param;
  private Integer line;

  public BatchErrorsDataInner() {
  }

  /**
   * An error code identifying the error type.
   **/
  public BatchErrorsDataInner code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "An error code identifying the error type.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * A human-readable message providing more details about the error.
   **/
  public BatchErrorsDataInner message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "A human-readable message providing more details about the error.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * The name of the parameter that caused the error, if applicable.
   **/
  public BatchErrorsDataInner param(String param) {
    this.param = param;
    return this;
  }

  
  @ApiModelProperty(value = "The name of the parameter that caused the error, if applicable.")
  @JsonProperty("param")
  public String getParam() {
    return param;
  }

  @JsonProperty("param")
  public void setParam(String param) {
    this.param = param;
  }

  /**
   * The line number of the input file where the error occurred, if applicable.
   **/
  public BatchErrorsDataInner line(Integer line) {
    this.line = line;
    return this;
  }

  
  @ApiModelProperty(value = "The line number of the input file where the error occurred, if applicable.")
  @JsonProperty("line")
  public Integer getLine() {
    return line;
  }

  @JsonProperty("line")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

