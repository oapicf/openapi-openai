package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DefaultProjectErrorResponse  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer code;

  @ApiModelProperty(required = true, value = "")
  private String message;
 /**
  * Get code
  * @return code
  */
  @JsonProperty("code")
  @NotNull
  public Integer getCode() {
    return code;
  }

  /**
   * Sets the <code>code</code> property.
   */
 public void setCode(Integer code) {
    this.code = code;
  }

  /**
   * Sets the <code>code</code> property.
   */
  public DefaultProjectErrorResponse code(Integer code) {
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
  public DefaultProjectErrorResponse message(String message) {
    this.message = message;
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
    DefaultProjectErrorResponse defaultProjectErrorResponse = (DefaultProjectErrorResponse) o;
    return Objects.equals(this.code, defaultProjectErrorResponse.code) &&
        Objects.equals(this.message, defaultProjectErrorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultProjectErrorResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

