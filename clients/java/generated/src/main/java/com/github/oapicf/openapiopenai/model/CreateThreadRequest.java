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
import com.github.oapicf.openapiopenai.model.CreateMessageRequest;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.openapiopenai.JSON;

/**
 * CreateThreadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T13:36:26.918687560Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateThreadRequest {
  public static final String SERIALIZED_NAME_MESSAGES = "messages";
  @SerializedName(SERIALIZED_NAME_MESSAGES)
  private List<CreateMessageRequest> messages;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public CreateThreadRequest() {
  }

  public CreateThreadRequest messages(List<CreateMessageRequest> messages) {
    this.messages = messages;
    return this;
  }

  public CreateThreadRequest addMessagesItem(CreateMessageRequest messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * A list of [messages](/docs/api-reference/messages) to start the thread with.
   * @return messages
  **/
  @javax.annotation.Nullable
  public List<CreateMessageRequest> getMessages() {
    return messages;
  }

  public void setMessages(List<CreateMessageRequest> messages) {
    this.messages = messages;
  }


  public CreateThreadRequest metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateThreadRequest createThreadRequest = (CreateThreadRequest) o;
    return Objects.equals(this.messages, createThreadRequest.messages) &&
        Objects.equals(this.metadata, createThreadRequest.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, metadata);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateThreadRequest {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    openapiFields.add("messages");
    openapiFields.add("metadata");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateThreadRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateThreadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateThreadRequest is not found in the empty JSON string", CreateThreadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateThreadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateThreadRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("messages") != null && !jsonObj.get("messages").isJsonNull()) {
        JsonArray jsonArraymessages = jsonObj.getAsJsonArray("messages");
        if (jsonArraymessages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("messages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `messages` to be an array in the JSON string but got `%s`", jsonObj.get("messages").toString()));
          }

          // validate the optional field `messages` (array)
          for (int i = 0; i < jsonArraymessages.size(); i++) {
            CreateMessageRequest.validateJsonElement(jsonArraymessages.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateThreadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateThreadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateThreadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateThreadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateThreadRequest>() {
           @Override
           public void write(JsonWriter out, CreateThreadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateThreadRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateThreadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateThreadRequest
  * @throws IOException if the JSON string is invalid with respect to CreateThreadRequest
  */
  public static CreateThreadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateThreadRequest.class);
  }

 /**
  * Convert an instance of CreateThreadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
