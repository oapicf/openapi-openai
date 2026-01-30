package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The event type.
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-29T14:08:43.241169944Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  private final String value;

  AuditLogEventType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
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

