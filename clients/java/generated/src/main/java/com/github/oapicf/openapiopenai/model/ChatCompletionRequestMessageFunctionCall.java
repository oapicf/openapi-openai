/*
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * The name and arguments of a function that should be called, as generated by the model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-16T01:12:13.030985790Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ChatCompletionRequestMessageFunctionCall {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private String arguments;

  public ChatCompletionRequestMessageFunctionCall() {
  }

  public ChatCompletionRequestMessageFunctionCall name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the function to call.
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ChatCompletionRequestMessageFunctionCall arguments(String arguments) {
    this.arguments = arguments;
    return this;
  }

   /**
   * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
   * @return arguments
  **/
  @javax.annotation.Nullable
  public String getArguments() {
    return arguments;
  }

  public void setArguments(String arguments) {
    this.arguments = arguments;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionRequestMessageFunctionCall chatCompletionRequestMessageFunctionCall = (ChatCompletionRequestMessageFunctionCall) o;
    return Objects.equals(this.name, chatCompletionRequestMessageFunctionCall.name) &&
        Objects.equals(this.arguments, chatCompletionRequestMessageFunctionCall.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionRequestMessageFunctionCall {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("arguments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChatCompletionRequestMessageFunctionCall
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChatCompletionRequestMessageFunctionCall.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChatCompletionRequestMessageFunctionCall is not found in the empty JSON string", ChatCompletionRequestMessageFunctionCall.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChatCompletionRequestMessageFunctionCall.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChatCompletionRequestMessageFunctionCall` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("arguments") != null && !jsonObj.get("arguments").isJsonNull()) && !jsonObj.get("arguments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `arguments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChatCompletionRequestMessageFunctionCall.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChatCompletionRequestMessageFunctionCall' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChatCompletionRequestMessageFunctionCall> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChatCompletionRequestMessageFunctionCall.class));

       return (TypeAdapter<T>) new TypeAdapter<ChatCompletionRequestMessageFunctionCall>() {
           @Override
           public void write(JsonWriter out, ChatCompletionRequestMessageFunctionCall value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChatCompletionRequestMessageFunctionCall read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChatCompletionRequestMessageFunctionCall given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChatCompletionRequestMessageFunctionCall
  * @throws IOException if the JSON string is invalid with respect to ChatCompletionRequestMessageFunctionCall
  */
  public static ChatCompletionRequestMessageFunctionCall fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChatCompletionRequestMessageFunctionCall.class);
  }

 /**
  * Convert an instance of ChatCompletionRequestMessageFunctionCall to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
