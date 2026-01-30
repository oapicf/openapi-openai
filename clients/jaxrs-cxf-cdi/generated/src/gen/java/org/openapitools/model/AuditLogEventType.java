package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The event type.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AuditLogEventType {

    @JsonProperty("api_key.created") API_KEY_CREATED(String.valueOf("api_key.created")), @JsonProperty("api_key.updated") API_KEY_UPDATED(String.valueOf("api_key.updated")), @JsonProperty("api_key.deleted") API_KEY_DELETED(String.valueOf("api_key.deleted")), @JsonProperty("invite.sent") INVITE_SENT(String.valueOf("invite.sent")), @JsonProperty("invite.accepted") INVITE_ACCEPTED(String.valueOf("invite.accepted")), @JsonProperty("invite.deleted") INVITE_DELETED(String.valueOf("invite.deleted")), @JsonProperty("login.succeeded") LOGIN_SUCCEEDED(String.valueOf("login.succeeded")), @JsonProperty("login.failed") LOGIN_FAILED(String.valueOf("login.failed")), @JsonProperty("logout.succeeded") LOGOUT_SUCCEEDED(String.valueOf("logout.succeeded")), @JsonProperty("logout.failed") LOGOUT_FAILED(String.valueOf("logout.failed")), @JsonProperty("organization.updated") ORGANIZATION_UPDATED(String.valueOf("organization.updated")), @JsonProperty("project.created") PROJECT_CREATED(String.valueOf("project.created")), @JsonProperty("project.updated") PROJECT_UPDATED(String.valueOf("project.updated")), @JsonProperty("project.archived") PROJECT_ARCHIVED(String.valueOf("project.archived")), @JsonProperty("service_account.created") SERVICE_ACCOUNT_CREATED(String.valueOf("service_account.created")), @JsonProperty("service_account.updated") SERVICE_ACCOUNT_UPDATED(String.valueOf("service_account.updated")), @JsonProperty("service_account.deleted") SERVICE_ACCOUNT_DELETED(String.valueOf("service_account.deleted")), @JsonProperty("rate_limit.updated") RATE_LIMIT_UPDATED(String.valueOf("rate_limit.updated")), @JsonProperty("rate_limit.deleted") RATE_LIMIT_DELETED(String.valueOf("rate_limit.deleted")), @JsonProperty("user.added") USER_ADDED(String.valueOf("user.added")), @JsonProperty("user.updated") USER_UPDATED(String.valueOf("user.updated")), @JsonProperty("user.deleted") USER_DELETED(String.valueOf("user.deleted"));


    private String value;

    AuditLogEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AuditLogEventType fromValue(String value) {
        for (AuditLogEventType b : AuditLogEventType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



