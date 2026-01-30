package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.RealtimeConversationItemContentInner;

/**
 * The item to add to the conversation.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RealtimeConversationItem   {
  
  private String id;


  public enum TypeEnum {
    MESSAGE("message"),
    FUNCTION_CALL("function_call"),
    FUNCTION_CALL_OUTPUT("function_call_output");

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


  public enum ObjectEnum {
    REALTIME_ITEM("realtime.item");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;


  public enum StatusEnum {
    COMPLETED("completed"),
    INCOMPLETE("incomplete");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StatusEnum status;


  public enum RoleEnum {
    USER("user"),
    ASSISTANT("assistant"),
    SYSTEM("system");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleEnum role;
  private List<RealtimeConversationItemContentInner> content = new ArrayList<>();
  private String callId;
  private String name;
  private String arguments;
  private String output;

  public RealtimeConversationItem () {

  }

  public RealtimeConversationItem (String id, TypeEnum type, ObjectEnum _object, StatusEnum status, RoleEnum role, List<RealtimeConversationItemContentInner> content, String callId, String name, String arguments, String output) {
    this.id = id;
    this.type = type;
    this._object = _object;
    this.status = status;
    this.role = role;
    this.content = content;
    this.callId = callId;
    this.name = name;
    this.arguments = arguments;
    this.output = output;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

    
  @JsonProperty("role")
  public RoleEnum getRole() {
    return role;
  }
  public void setRole(RoleEnum role) {
    this.role = role;
  }

    
  @JsonProperty("content")
  public List<RealtimeConversationItemContentInner> getContent() {
    return content;
  }
  public void setContent(List<RealtimeConversationItemContentInner> content) {
    this.content = content;
  }

    
  @JsonProperty("call_id")
  public String getCallId() {
    return callId;
  }
  public void setCallId(String callId) {
    this.callId = callId;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("arguments")
  public String getArguments() {
    return arguments;
  }
  public void setArguments(String arguments) {
    this.arguments = arguments;
  }

    
  @JsonProperty("output")
  public String getOutput() {
    return output;
  }
  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealtimeConversationItem realtimeConversationItem = (RealtimeConversationItem) o;
    return Objects.equals(id, realtimeConversationItem.id) &&
        Objects.equals(type, realtimeConversationItem.type) &&
        Objects.equals(_object, realtimeConversationItem._object) &&
        Objects.equals(status, realtimeConversationItem.status) &&
        Objects.equals(role, realtimeConversationItem.role) &&
        Objects.equals(content, realtimeConversationItem.content) &&
        Objects.equals(callId, realtimeConversationItem.callId) &&
        Objects.equals(name, realtimeConversationItem.name) &&
        Objects.equals(arguments, realtimeConversationItem.arguments) &&
        Objects.equals(output, realtimeConversationItem.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, _object, status, role, content, callId, name, arguments, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealtimeConversationItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    callId: ").append(toIndentedString(callId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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
