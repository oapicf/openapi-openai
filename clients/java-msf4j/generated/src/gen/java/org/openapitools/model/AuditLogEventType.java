package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

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

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuditLogEventType fromValue(String text) {
    for (AuditLogEventType b : AuditLogEventType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

