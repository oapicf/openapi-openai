/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.github.oapicf.openapiopenai.model;

import java.util.Objects;
import com.github.oapicf.openapiopenai.model.ChatCompletionMessageToolCall;
import com.github.oapicf.openapiopenai.model.ChatCompletionRequestAssistantMessageFunctionCall;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.openapiopenai.JSON;

/**
 * A chat completion message generated by the model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T11:06:04.801466369Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ChatCompletionResponseMessage {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_TOOL_CALLS = "tool_calls";
  @SerializedName(SERIALIZED_NAME_TOOL_CALLS)
  private List<ChatCompletionMessageToolCall> toolCalls = new ArrayList<>();

  /**
   * The role of the author of this message.
   */
  @JsonAdapter(RoleEnum.Adapter.class)
  public enum RoleEnum {
    ASSISTANT("assistant");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RoleEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      RoleEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleEnum role;

  public static final String SERIALIZED_NAME_FUNCTION_CALL = "function_call";
  @Deprecated
  @SerializedName(SERIALIZED_NAME_FUNCTION_CALL)
  private ChatCompletionRequestAssistantMessageFunctionCall functionCall;

  public ChatCompletionResponseMessage() {
  }

  public ChatCompletionResponseMessage content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The contents of the message.
   * @return content
   */
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public ChatCompletionResponseMessage toolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
    return this;
  }

  public ChatCompletionResponseMessage addToolCallsItem(ChatCompletionMessageToolCall toolCallsItem) {
    if (this.toolCalls == null) {
      this.toolCalls = new ArrayList<>();
    }
    this.toolCalls.add(toolCallsItem);
    return this;
  }

  /**
   * The tool calls generated by the model, such as function calls.
   * @return toolCalls
   */
  @javax.annotation.Nullable
  public List<ChatCompletionMessageToolCall> getToolCalls() {
    return toolCalls;
  }

  public void setToolCalls(List<ChatCompletionMessageToolCall> toolCalls) {
    this.toolCalls = toolCalls;
  }


  public ChatCompletionResponseMessage role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * The role of the author of this message.
   * @return role
   */
  @javax.annotation.Nonnull
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }


  @Deprecated
  public ChatCompletionResponseMessage functionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   * @deprecated
   */
  @Deprecated
  @javax.annotation.Nullable
  public ChatCompletionRequestAssistantMessageFunctionCall getFunctionCall() {
    return functionCall;
  }

  @Deprecated
  public void setFunctionCall(ChatCompletionRequestAssistantMessageFunctionCall functionCall) {
    this.functionCall = functionCall;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionResponseMessage chatCompletionResponseMessage = (ChatCompletionResponseMessage) o;
    return Objects.equals(this.content, chatCompletionResponseMessage.content) &&
        Objects.equals(this.toolCalls, chatCompletionResponseMessage.toolCalls) &&
        Objects.equals(this.role, chatCompletionResponseMessage.role) &&
        Objects.equals(this.functionCall, chatCompletionResponseMessage.functionCall);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, toolCalls, role, functionCall);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionResponseMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    toolCalls: ").append(toIndentedString(toolCalls)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("content");
    openapiFields.add("tool_calls");
    openapiFields.add("role");
    openapiFields.add("function_call");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("role");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ChatCompletionResponseMessage
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionResponseMessage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionResponseMessage is not found in the empty JSON string", ChatCompletionResponseMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChatCompletionResponseMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatCompletionResponseMessage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChatCompletionResponseMessage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("tool_calls") != null && !jsonObj.get("tool_calls").isJsonNull()) {
        JsonArray jsonArraytoolCalls = jsonObj.getAsJsonArray("tool_calls");
        if (jsonArraytoolCalls != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tool_calls").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tool_calls` to be an array in the JSON string but got `%s`", jsonObj.get("tool_calls").toString()));
          }

          // validate the optional field `tool_calls` (array)
          for (int i = 0; i < jsonArraytoolCalls.size(); i++) {
            ChatCompletionMessageToolCall.validateJsonElement(jsonArraytoolCalls.get(i));
          };
        }
      }
      if (!jsonObj.get("role").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `role` to be a primitive type in the JSON string but got `%s`", jsonObj.get("role").toString()));
      }
      // validate the required field `role`
      RoleEnum.validateJsonElement(jsonObj.get("role"));
      // validate the optional field `function_call`
      if (jsonObj.get("function_call") != null && !jsonObj.get("function_call").isJsonNull()) {
        ChatCompletionRequestAssistantMessageFunctionCall.validateJsonElement(jsonObj.get("function_call"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionResponseMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionResponseMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionResponseMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionResponseMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionResponseMessage>() {
           @Override
           public void write(JsonWriter out, ChatCompletionResponseMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatCompletionResponseMessage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ChatCompletionResponseMessage given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ChatCompletionResponseMessage
   * @throws IOException if the JSON string is invalid with respect to ChatCompletionResponseMessage
   */
  public static ChatCompletionResponseMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionResponseMessage.class);
  }

  /**
   * Convert an instance of ChatCompletionResponseMessage to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

