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
import com.github.oapicf.openapiopenai.model.ChatCompletionStreamResponseDelta;
import com.github.oapicf.openapiopenai.model.CreateChatCompletionResponseChoicesInnerLogprobs;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * CreateChatCompletionStreamResponseChoicesInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T13:36:26.918687560Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CreateChatCompletionStreamResponseChoicesInner {
  public static final String SERIALIZED_NAME_DELTA = "delta";
  @SerializedName(SERIALIZED_NAME_DELTA)
  private ChatCompletionStreamResponseDelta delta;

  public static final String SERIALIZED_NAME_LOGPROBS = "logprobs";
  @SerializedName(SERIALIZED_NAME_LOGPROBS)
  private CreateChatCompletionResponseChoicesInnerLogprobs logprobs;

  /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   */
  @JsonAdapter(FinishReasonEnum.Adapter.class)
  public enum FinishReasonEnum {
    STOP("stop"),
    
    LENGTH("length"),
    
    TOOL_CALLS("tool_calls"),
    
    CONTENT_FILTER("content_filter"),
    
    FUNCTION_CALL("function_call");

    private String value;

    FinishReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static FinishReasonEnum fromValue(String value) {
      for (FinishReasonEnum b : FinishReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<FinishReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final FinishReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public FinishReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return FinishReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      FinishReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_FINISH_REASON = "finish_reason";
  @SerializedName(SERIALIZED_NAME_FINISH_REASON)
  private FinishReasonEnum finishReason;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Integer index;

  public CreateChatCompletionStreamResponseChoicesInner() {
  }

  public CreateChatCompletionStreamResponseChoicesInner delta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @javax.annotation.Nonnull
  public ChatCompletionStreamResponseDelta getDelta() {
    return delta;
  }

  public void setDelta(ChatCompletionStreamResponseDelta delta) {
    this.delta = delta;
  }


  public CreateChatCompletionStreamResponseChoicesInner logprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Get logprobs
   * @return logprobs
  **/
  @javax.annotation.Nullable
  public CreateChatCompletionResponseChoicesInnerLogprobs getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(CreateChatCompletionResponseChoicesInnerLogprobs logprobs) {
    this.logprobs = logprobs;
  }


  public CreateChatCompletionStreamResponseChoicesInner finishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
    return this;
  }

   /**
   * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function. 
   * @return finishReason
  **/
  @javax.annotation.Nullable
  public FinishReasonEnum getFinishReason() {
    return finishReason;
  }

  public void setFinishReason(FinishReasonEnum finishReason) {
    this.finishReason = finishReason;
  }


  public CreateChatCompletionStreamResponseChoicesInner index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The index of the choice in the list of choices.
   * @return index
  **/
  @javax.annotation.Nonnull
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionStreamResponseChoicesInner createChatCompletionStreamResponseChoicesInner = (CreateChatCompletionStreamResponseChoicesInner) o;
    return Objects.equals(this.delta, createChatCompletionStreamResponseChoicesInner.delta) &&
        Objects.equals(this.logprobs, createChatCompletionStreamResponseChoicesInner.logprobs) &&
        Objects.equals(this.finishReason, createChatCompletionStreamResponseChoicesInner.finishReason) &&
        Objects.equals(this.index, createChatCompletionStreamResponseChoicesInner.index);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(delta, logprobs, finishReason, index);
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
    sb.append("class CreateChatCompletionStreamResponseChoicesInner {\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
    openapiFields.add("delta");
    openapiFields.add("logprobs");
    openapiFields.add("finish_reason");
    openapiFields.add("index");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("delta");
    openapiRequiredFields.add("finish_reason");
    openapiRequiredFields.add("index");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateChatCompletionStreamResponseChoicesInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateChatCompletionStreamResponseChoicesInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateChatCompletionStreamResponseChoicesInner is not found in the empty JSON string", CreateChatCompletionStreamResponseChoicesInner.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateChatCompletionStreamResponseChoicesInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateChatCompletionStreamResponseChoicesInner` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateChatCompletionStreamResponseChoicesInner.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `delta`
      ChatCompletionStreamResponseDelta.validateJsonElement(jsonObj.get("delta"));
      // validate the optional field `logprobs`
      if (jsonObj.get("logprobs") != null && !jsonObj.get("logprobs").isJsonNull()) {
        CreateChatCompletionResponseChoicesInnerLogprobs.validateJsonElement(jsonObj.get("logprobs"));
      }
      if ((jsonObj.get("finish_reason") != null && !jsonObj.get("finish_reason").isJsonNull()) && !jsonObj.get("finish_reason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `finish_reason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("finish_reason").toString()));
      }
      // validate the required field `finish_reason`
      FinishReasonEnum.validateJsonElement(jsonObj.get("finish_reason"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateChatCompletionStreamResponseChoicesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateChatCompletionStreamResponseChoicesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateChatCompletionStreamResponseChoicesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateChatCompletionStreamResponseChoicesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateChatCompletionStreamResponseChoicesInner>() {
           @Override
           public void write(JsonWriter out, CreateChatCompletionStreamResponseChoicesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateChatCompletionStreamResponseChoicesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateChatCompletionStreamResponseChoicesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateChatCompletionStreamResponseChoicesInner
  * @throws IOException if the JSON string is invalid with respect to CreateChatCompletionStreamResponseChoicesInner
  */
  public static CreateChatCompletionStreamResponseChoicesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateChatCompletionStreamResponseChoicesInner.class);
  }

 /**
  * Convert an instance of CreateChatCompletionStreamResponseChoicesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

