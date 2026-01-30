package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AuditLogActorApiKey;
import org.openapitools.model.AuditLogActorSession;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The actor who performed the audit logged action.
 */

@Schema(name = "AuditLogActor", description = "The actor who performed the audit logged action.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActor {

  /**
   * The type of actor. Is either `session` or `api_key`.
   */
  public enum TypeEnum {
    SESSION("session"),
    
    API_KEY("api_key");

    private final String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable TypeEnum type;

  private @Nullable AuditLogActorSession session;

  private @Nullable AuditLogActorApiKey apiKey;

  public AuditLogActor type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of actor. Is either `session` or `api_key`.
   * @return type
   */
  
  @Schema(name = "type", description = "The type of actor. Is either `session` or `api_key`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public AuditLogActor session(@Nullable AuditLogActorSession session) {
    this.session = session;
    return this;
  }

  /**
   * Get session
   * @return session
   */
  @Valid 
  @Schema(name = "session", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("session")
  public @Nullable AuditLogActorSession getSession() {
    return session;
  }

  public void setSession(@Nullable AuditLogActorSession session) {
    this.session = session;
  }

  public AuditLogActor apiKey(@Nullable AuditLogActorApiKey apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * Get apiKey
   * @return apiKey
   */
  @Valid 
  @Schema(name = "api_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("api_key")
  public @Nullable AuditLogActorApiKey getApiKey() {
    return apiKey;
  }

  public void setApiKey(@Nullable AuditLogActorApiKey apiKey) {
    this.apiKey = apiKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogActor auditLogActor = (AuditLogActor) o;
    return Objects.equals(this.type, auditLogActor.type) &&
        Objects.equals(this.session, auditLogActor.session) &&
        Objects.equals(this.apiKey, auditLogActor.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, session, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogActor {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

