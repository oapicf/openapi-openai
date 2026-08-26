package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RealtimeConversationItemContentInner;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The item to add to the conversation.
 */

@Schema(name = "RealtimeConversationItem", description = "The item to add to the conversation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-26T05:22:24.124939009Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RealtimeConversationItem {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String id;

  /**
   * The type of the item (`message`, `function_call`, `function_call_output`). 
   */
  public enum TypeEnum {
    MESSAGE("message"),
    
    FUNCTION_CALL("function_call"),
    
    FUNCTION_CALL_OUTPUT("function_call_output");

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

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable TypeEnum type;

  /**
   * Identifier for the API object being returned - always `realtime.item`. 
   */
  public enum ObjectEnum {
    REALTIME_ITEM("realtime.item");

    private final String value;

    ObjectEnum(String value) {
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
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ObjectEnum _object;

  /**
   * The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. 
   */
  public enum StatusEnum {
    COMPLETED("completed"),
    
    INCOMPLETE("incomplete");

    private final String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable StatusEnum status;

  /**
   * The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. 
   */
  public enum RoleEnum {
    USER("user"),
    
    ASSISTANT("assistant"),
    
    SYSTEM("system");

    private final String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable RoleEnum role;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid RealtimeConversationItemContentInner> content = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String callId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String arguments;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String output;

  public RealtimeConversationItem id(@Nullable String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique ID of the item, this can be generated by the client to help  manage server-side context, but is not required because the server will  generate one if not provided. 
   * @return id
   */
  
  @Schema(name = "id", description = "The unique ID of the item, this can be generated by the client to help  manage server-side context, but is not required because the server will  generate one if not provided. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public @Nullable String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(@Nullable String id) {
    this.id = id;
  }

  public RealtimeConversationItem type(@Nullable TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the item (`message`, `function_call`, `function_call_output`). 
   * @return type
   */
  
  @Schema(name = "type", description = "The type of the item (`message`, `function_call`, `function_call_output`). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public @Nullable TypeEnum getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable TypeEnum type) {
    this.type = type;
  }

  public RealtimeConversationItem _object(@Nullable ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * Identifier for the API object being returned - always `realtime.item`. 
   * @return _object
   */
  
  @Schema(name = "object", description = "Identifier for the API object being returned - always `realtime.item`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public @Nullable ObjectEnum getObject() {
    return _object;
  }

  @JsonProperty("object")
  public void setObject(@Nullable ObjectEnum _object) {
    this._object = _object;
  }

  public RealtimeConversationItem status(@Nullable StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. 
   * @return status
   */
  
  @Schema(name = "status", description = "The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public @Nullable StatusEnum getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable StatusEnum status) {
    this.status = status;
  }

  public RealtimeConversationItem role(@Nullable RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. 
   * @return role
   */
  
  @Schema(name = "role", description = "The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public @Nullable RoleEnum getRole() {
    return role;
  }

  @JsonProperty("role")
  public void setRole(@Nullable RoleEnum role) {
    this.role = role;
  }

  public RealtimeConversationItem content(List<@Valid RealtimeConversationItemContentInner> content) {
    this.content = content;
    return this;
  }

  public RealtimeConversationItem addContentItem(RealtimeConversationItemContentInner contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * The content of the message, applicable for `message` items.  - Message items of role `system` support only `input_text` content - Message items of role `user` support `input_text` and `input_audio`    content - Message items of role `assistant` support `text` content. 
   * @return content
   */
  @Valid 
  @Schema(name = "content", description = "The content of the message, applicable for `message` items.  - Message items of role `system` support only `input_text` content - Message items of role `user` support `input_text` and `input_audio`    content - Message items of role `assistant` support `text` content. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public List<@Valid RealtimeConversationItemContentInner> getContent() {
    return content;
  }

  @JsonProperty("content")
  public void setContent(List<@Valid RealtimeConversationItemContentInner> content) {
    this.content = content;
  }

  public RealtimeConversationItem callId(@Nullable String callId) {
    this.callId = callId;
    return this;
  }

  /**
   * The ID of the function call (for `function_call` and  `function_call_output` items). If passed on a `function_call_output`  item, the server will check that a `function_call` item with the same  ID exists in the conversation history. 
   * @return callId
   */
  
  @Schema(name = "call_id", description = "The ID of the function call (for `function_call` and  `function_call_output` items). If passed on a `function_call_output`  item, the server will check that a `function_call` item with the same  ID exists in the conversation history. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("call_id")
  public @Nullable String getCallId() {
    return callId;
  }

  @JsonProperty("call_id")
  public void setCallId(@Nullable String callId) {
    this.callId = callId;
  }

  public RealtimeConversationItem name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the function being called (for `function_call` items). 
   * @return name
   */
  
  @Schema(name = "name", description = "The name of the function being called (for `function_call` items). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public RealtimeConversationItem arguments(@Nullable String arguments) {
    this.arguments = arguments;
    return this;
  }

  /**
   * The arguments of the function call (for `function_call` items). 
   * @return arguments
   */
  
  @Schema(name = "arguments", description = "The arguments of the function call (for `function_call` items). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arguments")
  public @Nullable String getArguments() {
    return arguments;
  }

  @JsonProperty("arguments")
  public void setArguments(@Nullable String arguments) {
    this.arguments = arguments;
  }

  public RealtimeConversationItem output(@Nullable String output) {
    this.output = output;
    return this;
  }

  /**
   * The output of the function call (for `function_call_output` items). 
   * @return output
   */
  
  @Schema(name = "output", description = "The output of the function call (for `function_call_output` items). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output")
  public @Nullable String getOutput() {
    return output;
  }

  @JsonProperty("output")
  public void setOutput(@Nullable String output) {
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
    return Objects.equals(this.id, realtimeConversationItem.id) &&
        Objects.equals(this.type, realtimeConversationItem.type) &&
        Objects.equals(this._object, realtimeConversationItem._object) &&
        Objects.equals(this.status, realtimeConversationItem.status) &&
        Objects.equals(this.role, realtimeConversationItem.role) &&
        Objects.equals(this.content, realtimeConversationItem.content) &&
        Objects.equals(this.callId, realtimeConversationItem.callId) &&
        Objects.equals(this.name, realtimeConversationItem.name) &&
        Objects.equals(this.arguments, realtimeConversationItem.arguments) &&
        Objects.equals(this.output, realtimeConversationItem.output);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

