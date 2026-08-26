package org.openapitools.model;

import org.openapitools.model.AuditLogActorApiKey;
import org.openapitools.model.AuditLogActorSession;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The actor who performed the audit logged action.
 */
public class AuditLogActor implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("session")
  private AuditLogActorSession session;

  @JsonProperty("api_key")
  private AuditLogActorApiKey apiKey;

  /**
   * The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return session
   */
  public AuditLogActorSession getSession() {
    return session;
  }

  public void setSession(AuditLogActorSession session) {
    this.session = session;
  }

  /**
   * 
   * @return apiKey
   */
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
