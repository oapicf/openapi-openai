package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A description of the error that caused the response to fail,  populated when the `status` is `failed`. 
 */
@ApiModel(description="A description of the error that caused the response to fail,  populated when the `status` is `failed`. ")

public class RealtimeResponseStatusDetailsError  {
  
 /**
  * The type of error.
  */
  @ApiModelProperty(value = "The type of error.")

  private String type;

 /**
  * Error code, if any.
  */
  @ApiModelProperty(value = "Error code, if any.")

  private String code;
 /**
   * The type of error.
   * @return type
  **/
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RealtimeResponseStatusDetailsError type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Error code, if any.
   * @return code
  **/
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public RealtimeResponseStatusDetailsError code(String code) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

