package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActorApiKey;
import org.openapitools.model.AuditLogActorSession;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The actor who performed the audit logged action.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The actor who performed the audit logged action.")
public class AuditLogActor   {
  

public enum TypeEnum {

    @JsonProperty("session") SESSION(String.valueOf("session")), @JsonProperty("api_key") API_KEY(String.valueOf("api_key"));


    private String value;

    TypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
        for (TypeEnum b : TypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private TypeEnum type;

  private AuditLogActorSession session;

  private AuditLogActorApiKey apiKey;

  /**
   * The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
   **/
  public AuditLogActor type(TypeEnum type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "The type of actor. Is either `session` or `api_key`.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   **/
  public AuditLogActor session(AuditLogActorSession session) {
    this.session = session;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("session")
  public AuditLogActorSession getSession() {
    return session;
  }
  public void setSession(AuditLogActorSession session) {
    this.session = session;
  }


  /**
   **/
  public AuditLogActor apiKey(AuditLogActorApiKey apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

