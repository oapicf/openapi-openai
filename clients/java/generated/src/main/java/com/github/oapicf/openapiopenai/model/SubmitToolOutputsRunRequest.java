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
import com.github.oapicf.openapiopenai.model.SubmitToolOutputsRunRequestToolOutputsInner;
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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.openapiopenai.JSON;

/**
 * SubmitToolOutputsRunRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T11:06:04.801466369Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class SubmitToolOutputsRunRequest {
  public static final String SERIALIZED_NAME_TOOL_OUTPUTS = "tool_outputs";
  @SerializedName(SERIALIZED_NAME_TOOL_OUTPUTS)
  private List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs = new ArrayList<>();

  public static final String SERIALIZED_NAME_STREAM = "stream";
  @SerializedName(SERIALIZED_NAME_STREAM)
  private Boolean stream;

  public SubmitToolOutputsRunRequest() {
  }

  public SubmitToolOutputsRunRequest toolOutputs(List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
    this.toolOutputs = toolOutputs;
    return this;
  }

  public SubmitToolOutputsRunRequest addToolOutputsItem(SubmitToolOutputsRunRequestToolOutputsInner toolOutputsItem) {
    if (this.toolOutputs == null) {
      this.toolOutputs = new ArrayList<>();
    }
    this.toolOutputs.add(toolOutputsItem);
    return this;
  }

  /**
   * A list of tools for which the outputs are being submitted.
   * @return toolOutputs
   */
  @javax.annotation.Nonnull
  public List<SubmitToolOutputsRunRequestToolOutputsInner> getToolOutputs() {
    return toolOutputs;
  }

  public void setToolOutputs(List<SubmitToolOutputsRunRequestToolOutputsInner> toolOutputs) {
    this.toolOutputs = toolOutputs;
  }


  public SubmitToolOutputsRunRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  /**
   * If &#x60;true&#x60;, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a &#x60;data: [DONE]&#x60; message. 
   * @return stream
   */
  @javax.annotation.Nullable
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitToolOutputsRunRequest submitToolOutputsRunRequest = (SubmitToolOutputsRunRequest) o;
    return Objects.equals(this.toolOutputs, submitToolOutputsRunRequest.toolOutputs) &&
        Objects.equals(this.stream, submitToolOutputsRunRequest.stream);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(toolOutputs, stream);
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
    sb.append("class SubmitToolOutputsRunRequest {\n");
    sb.append("    toolOutputs: ").append(toIndentedString(toolOutputs)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
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
    openapiFields.add("tool_outputs");
    openapiFields.add("stream");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tool_outputs");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SubmitToolOutputsRunRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SubmitToolOutputsRunRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitToolOutputsRunRequest is not found in the empty JSON string", SubmitToolOutputsRunRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SubmitToolOutputsRunRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitToolOutputsRunRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitToolOutputsRunRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("tool_outputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tool_outputs` to be an array in the JSON string but got `%s`", jsonObj.get("tool_outputs").toString()));
      }

      JsonArray jsonArraytoolOutputs = jsonObj.getAsJsonArray("tool_outputs");
      // validate the required field `tool_outputs` (array)
      for (int i = 0; i < jsonArraytoolOutputs.size(); i++) {
        SubmitToolOutputsRunRequestToolOutputsInner.validateJsonElement(jsonArraytoolOutputs.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitToolOutputsRunRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitToolOutputsRunRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitToolOutputsRunRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitToolOutputsRunRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitToolOutputsRunRequest>() {
           @Override
           public void write(JsonWriter out, SubmitToolOutputsRunRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitToolOutputsRunRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SubmitToolOutputsRunRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SubmitToolOutputsRunRequest
   * @throws IOException if the JSON string is invalid with respect to SubmitToolOutputsRunRequest
   */
  public static SubmitToolOutputsRunRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitToolOutputsRunRequest.class);
  }

  /**
   * Convert an instance of SubmitToolOutputsRunRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

