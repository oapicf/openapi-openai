package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The event type.
 */
public enum AuditLogEventType {
  
  API_KEY_CREATED("api_key.created"),
  
  API_KEY_UPDATED("api_key.updated"),
  
  API_KEY_DELETED("api_key.deleted"),
  
  INVITE_SENT("invite.sent"),
  
  INVITE_ACCEPTED("invite.accepted"),
  
  INVITE_DELETED("invite.deleted"),
  
  LOGIN_SUCCEEDED("login.succeeded"),
  
  LOGIN_FAILED("login.failed"),
  
  LOGOUT_SUCCEEDED("logout.succeeded"),
  
  LOGOUT_FAILED("logout.failed"),
  
  ORGANIZATION_UPDATED("organization.updated"),
  
  PROJECT_CREATED("project.created"),
  
  PROJECT_UPDATED("project.updated"),
  
  PROJECT_ARCHIVED("project.archived"),
  
  SERVICE_ACCOUNT_CREATED("service_account.created"),
  
  SERVICE_ACCOUNT_UPDATED("service_account.updated"),
  
  SERVICE_ACCOUNT_DELETED("service_account.deleted"),
  
  RATE_LIMIT_UPDATED("rate_limit.updated"),
  
  RATE_LIMIT_DELETED("rate_limit.deleted"),
  
  USER_ADDED("user.added"),
  
  USER_UPDATED("user.updated"),
  
  USER_DELETED("user.deleted");

  private String value;

  AuditLogEventType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AuditLogEventType fromString(String s) {
      for (AuditLogEventType b : AuditLogEventType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuditLogEventType fromValue(String value) {
    for (AuditLogEventType b : AuditLogEventType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


