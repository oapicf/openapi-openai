package org.openapitools.model;

import org.openapitools.model.Error;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ErrorResponse  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private Error error;
 /**
  * Get error
  * @return error
  */
  @JsonProperty("error")
  @NotNull
  public Error getError() {
    return error;
  }

  /**
   * Sets the <code>error</code> property.
   */
 public void setError(Error error) {
    this.error = error;
  }

  /**
   * Sets the <code>error</code> property.
   */
  public ErrorResponse error(Error error) {
    this.error = error;
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
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.error, errorResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

