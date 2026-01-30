package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "A description of the error that caused the response to fail,  populated when the `status` is `failed`. ")
public class RealtimeResponseStatusDetailsError   {
  
  private String type;

  private String code;

  /**
   * The type of error.
   **/
  public RealtimeResponseStatusDetailsError type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of error.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Error code, if any.
   **/
  public RealtimeResponseStatusDetailsError code(String code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "Error code, if any.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeResponseStatusDetailsError realtimeResponseStatusDetailsError = (RealtimeResponseStatusDetailsError) o;
    return Objects.equals(this.type, realtimeResponseStatusDetailsError.type) &&
        Objects.equals(this.code, realtimeResponseStatusDetailsError.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeResponseStatusDetailsError {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

