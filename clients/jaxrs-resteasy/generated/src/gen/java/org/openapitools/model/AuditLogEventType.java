package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;
public enum AuditLogEventType {
    API_KEY_CREATED, API_KEY_UPDATED, API_KEY_DELETED, INVITE_SENT, INVITE_ACCEPTED, INVITE_DELETED, LOGIN_SUCCEEDED, LOGIN_FAILED, LOGOUT_SUCCEEDED, LOGOUT_FAILED, ORGANIZATION_UPDATED, PROJECT_CREATED, PROJECT_UPDATED, PROJECT_ARCHIVED, SERVICE_ACCOUNT_CREATED, SERVICE_ACCOUNT_UPDATED, SERVICE_ACCOUNT_DELETED, RATE_LIMIT_UPDATED, RATE_LIMIT_DELETED, USER_ADDED, USER_UPDATED, USER_DELETED
}
