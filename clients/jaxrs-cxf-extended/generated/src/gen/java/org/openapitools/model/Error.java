package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Error  {
  
  @ApiModelProperty(required = true, value = "")
  private String code;

  @ApiModelProperty(required = true, value = "")
  private String message;

  @ApiModelProperty(required = true, value = "")
  private String param;

  @ApiModelProperty(required = true, value = "")
  private String type;
 /**
  * Get code
  * @return code
  */
  @JsonProperty("code")
  @NotNull
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
  public Error code(String code) {
    this.code = code;
    return this;
  }

 /**
  * Get message
  * @return message
  */
  @JsonProperty("message")
  @NotNull
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
  public Error message(String message) {
    this.message = message;
    return this;
  }

 /**
  * Get param
  * @return param
  */
  @JsonProperty("param")
  @NotNull
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
  public Error param(String param) {
    this.param = param;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public Error type(String type) {
    this.type = type;
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
    Error error = (Error) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.param, error.param) &&
        Objects.equals(this.type, error.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, param, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

