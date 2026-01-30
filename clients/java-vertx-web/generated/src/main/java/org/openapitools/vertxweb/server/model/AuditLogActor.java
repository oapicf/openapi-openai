package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AuditLogActorApiKey;
import org.openapitools.vertxweb.server.model.AuditLogActorSession;

/**
 * The actor who performed the audit logged action.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuditLogActor   {
  


  public enum TypeEnum {
    SESSION("session"),
    API_KEY("api_key");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private TypeEnum type;
  private AuditLogActorSession session;
  private AuditLogActorApiKey apiKey;

  public AuditLogActor () {

  }

  public AuditLogActor (TypeEnum type, AuditLogActorSession session, AuditLogActorApiKey apiKey) {
    this.type = type;
    this.session = session;
    this.apiKey = apiKey;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("session")
  public AuditLogActorSession getSession() {
    return session;
  }
  public void setSession(AuditLogActorSession session) {
    this.session = session;
  }

    
  @JsonProperty("api_key")
  public AuditLogActorApiKey getApiKey() {
    return apiKey;
  }
  public void setApiKey(AuditLogActorApiKey apiKey) {
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
    return Objects.equals(type, auditLogActor.type) &&
        Objects.equals(session, auditLogActor.session) &&
        Objects.equals(apiKey, auditLogActor.apiKey);
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
