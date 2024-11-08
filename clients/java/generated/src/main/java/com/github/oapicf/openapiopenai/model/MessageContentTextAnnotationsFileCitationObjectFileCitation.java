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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.openapiopenai.JSON;

/**
 * MessageContentTextAnnotationsFileCitationObjectFileCitation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T11:06:04.801466369Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageContentTextAnnotationsFileCitationObjectFileCitation {
  public static final String SERIALIZED_NAME_FILE_ID = "file_id";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_QUOTE = "quote";
  @SerializedName(SERIALIZED_NAME_QUOTE)
  private String quote;

  public MessageContentTextAnnotationsFileCitationObjectFileCitation() {
  }

  public MessageContentTextAnnotationsFileCitationObjectFileCitation fileId(String fileId) {
    this.fileId = fileId;
    return this;
  }

  /**
   * The ID of the specific File the citation is from.
   * @return fileId
   */
  @javax.annotation.Nonnull
  public String getFileId() {
    return fileId;
  }

  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public MessageContentTextAnnotationsFileCitationObjectFileCitation quote(String quote) {
    this.quote = quote;
    return this;
  }

  /**
   * The specific quote in the file.
   * @return quote
   */
  @javax.annotation.Nonnull
  public String getQuote() {
    return quote;
  }

  public void setQuote(String quote) {
    this.quote = quote;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageContentTextAnnotationsFileCitationObjectFileCitation messageContentTextAnnotationsFileCitationObjectFileCitation = (MessageContentTextAnnotationsFileCitationObjectFileCitation) o;
    return Objects.equals(this.fileId, messageContentTextAnnotationsFileCitationObjectFileCitation.fileId) &&
        Objects.equals(this.quote, messageContentTextAnnotationsFileCitationObjectFileCitation.quote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileId, quote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageContentTextAnnotationsFileCitationObjectFileCitation {\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    quote: ").append(toIndentedString(quote)).append("\n");
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
    openapiFields.add("file_id");
    openapiFields.add("quote");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file_id");
    openapiRequiredFields.add("quote");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MessageContentTextAnnotationsFileCitationObjectFileCitation
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MessageContentTextAnnotationsFileCitationObjectFileCitation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageContentTextAnnotationsFileCitationObjectFileCitation is not found in the empty JSON string", MessageContentTextAnnotationsFileCitationObjectFileCitation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MessageContentTextAnnotationsFileCitationObjectFileCitation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageContentTextAnnotationsFileCitationObjectFileCitation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageContentTextAnnotationsFileCitationObjectFileCitation.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("file_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `file_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("file_id").toString()));
      }
      if (!jsonObj.get("quote").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quote` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quote").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageContentTextAnnotationsFileCitationObjectFileCitation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageContentTextAnnotationsFileCitationObjectFileCitation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageContentTextAnnotationsFileCitationObjectFileCitation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageContentTextAnnotationsFileCitationObjectFileCitation.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageContentTextAnnotationsFileCitationObjectFileCitation>() {
           @Override
           public void write(JsonWriter out, MessageContentTextAnnotationsFileCitationObjectFileCitation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageContentTextAnnotationsFileCitationObjectFileCitation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MessageContentTextAnnotationsFileCitationObjectFileCitation
   * @throws IOException if the JSON string is invalid with respect to MessageContentTextAnnotationsFileCitationObjectFileCitation
   */
  public static MessageContentTextAnnotationsFileCitationObjectFileCitation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageContentTextAnnotationsFileCitationObjectFileCitation.class);
  }

  /**
   * Convert an instance of MessageContentTextAnnotationsFileCitationObjectFileCitation to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

