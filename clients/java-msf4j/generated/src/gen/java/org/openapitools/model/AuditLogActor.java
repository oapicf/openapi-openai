package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorApiKey;
import org.openapitools.model.AuditLogActorSession;

/**
 * The actor who performed the audit logged action.
 */
@ApiModel(description = "The actor who performed the audit logged action.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-29T14:08:14.730511815Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AuditLogActor   {
  /**
   * The type of actor. Is either `session` or `api_key`.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("session")
  private AuditLogActorSession session;

  @JsonProperty("api_key")
  private AuditLogActorApiKey apiKey;

  public AuditLogActor type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of actor. Is either `session` or `api_key`.
   * @return type
  **/
  @ApiModelProperty(value = "The type of actor. Is either `session` or `api_key`.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public AuditLogActor session(AuditLogActorSession session) {
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @ApiModelProperty(value = "")
  public AuditLogActorSession getSession() {
    return session;
  }

  public void setSession(AuditLogActorSession session) {
    this.session = session;
  }

  public AuditLogActor apiKey(AuditLogActorApiKey apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @ApiModelProperty(value = "")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

