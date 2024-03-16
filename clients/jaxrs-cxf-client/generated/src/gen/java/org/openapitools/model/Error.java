package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Error  {
  
  @ApiModelProperty(required = true, value = "")
  private String type;

  @ApiModelProperty(required = true, value = "")
  private String message;

  @ApiModelProperty(required = true, value = "")
  private String param;

  @ApiModelProperty(required = true, value = "")
  private String code;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Error type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get message
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

 /**
   * Get param
   * @return param
  **/
  @JsonProperty("param")
  public String getParam() {
    return param;
  }

  public void setParam(String param) {
    this.param = param;
  }

  public Error param(String param) {
    this.param = param;
    return this;
  }

 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Error code(String code) {
    this.code = code;
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
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.param, error.param) &&
        Objects.equals(this.code, error.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message, param, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    param: ").append(toIndentedString(param)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

