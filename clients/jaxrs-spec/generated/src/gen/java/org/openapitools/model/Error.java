package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("Error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-29T14:09:36.506419692Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class Error   {
  private String code;
  private String message;
  private String param;
  private String type;

  public Error() {
  }

  @JsonCreator
  public Error(
    @JsonProperty(required = true, value = "code") String code,
    @JsonProperty(required = true, value = "message") String message,
    @JsonProperty(required = true, value = "param") String param,
    @JsonProperty(required = true, value = "type") String type
  ) {
    this.code = code;
    this.message = message;
    this.param = param;
    this.type = type;
  }

  /**
   **/
  public Error code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "code")
  @NotNull public String getCode() {
    return code;
  }

  @JsonProperty(required = true, value = "code")
  public void setCode(String code) {
    this.code = code;
  }

  /**
   **/
  public Error message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "message")
  @NotNull public String getMessage() {
    return message;
  }

  @JsonProperty(required = true, value = "message")
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  public Error param(String param) {
    this.param = param;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "param")
  @NotNull public String getParam() {
    return param;
  }

  @JsonProperty(required = true, value = "param")
  public void setParam(String param) {
    this.param = param;
  }

  /**
   **/
  public Error type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "type")
  @NotNull public String getType() {
    return type;
  }

  @JsonProperty(required = true, value = "type")
  public void setType(String type) {
    this.type = type;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

