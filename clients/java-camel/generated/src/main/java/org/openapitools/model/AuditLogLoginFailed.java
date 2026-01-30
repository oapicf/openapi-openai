package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The details for events with this &#x60;type&#x60;.
 */

@Schema(name = "AuditLog_login_failed", description = "The details for events with this `type`.")
@JsonTypeName("AuditLog_login_failed")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogLoginFailed {

  private String errorCode;

  private String errorMessage;

  public AuditLogLoginFailed errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * The error code of the failure.
   * @return errorCode
   */
  
  @Schema(name = "error_code", description = "The error code of the failure.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_code")
  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public AuditLogLoginFailed errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The error message of the failure.
   * @return errorMessage
   */
  
  @Schema(name = "error_message", description = "The error message of the failure.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

