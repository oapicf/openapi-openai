package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The details for events with this &#x60;type&#x60;.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The details for events with this `type`.")
public class AuditLogLoginFailed   {
  
  private String errorCode;

  private String errorMessage;

  /**
   * The error code of the failure.
   **/
  public AuditLogLoginFailed errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @ApiModelProperty(value = "The error code of the failure.")
  @JsonProperty("error_code")
  public String getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }


  /**
   * The error message of the failure.
   **/
  public AuditLogLoginFailed errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
  @ApiModelProperty(value = "The error message of the failure.")
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogLoginFailed auditLogLoginFailed = (AuditLogLoginFailed) o;
    return Objects.equals(this.errorCode, auditLogLoginFailed.errorCode) &&
        Objects.equals(this.errorMessage, auditLogLoginFailed.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogLoginFailed {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

