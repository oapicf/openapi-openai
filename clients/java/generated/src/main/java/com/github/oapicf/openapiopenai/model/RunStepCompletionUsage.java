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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.github.oapicf.openapiopenai.JSON;

/**
 * Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T13:36:26.918687560Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunStepCompletionUsage {
  public static final String SERIALIZED_NAME_COMPLETION_TOKENS = "completion_tokens";
  @SerializedName(SERIALIZED_NAME_COMPLETION_TOKENS)
  private Integer completionTokens;

  public static final String SERIALIZED_NAME_PROMPT_TOKENS = "prompt_tokens";
  @SerializedName(SERIALIZED_NAME_PROMPT_TOKENS)
  private Integer promptTokens;

  public static final String SERIALIZED_NAME_TOTAL_TOKENS = "total_tokens";
  @SerializedName(SERIALIZED_NAME_TOTAL_TOKENS)
  private Integer totalTokens;

  public RunStepCompletionUsage() {
  }

  public RunStepCompletionUsage completionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
    return this;
  }

   /**
   * Number of completion tokens used over the course of the run step.
   * @return completionTokens
  **/
  @javax.annotation.Nonnull
  public Integer getCompletionTokens() {
    return completionTokens;
  }

  public void setCompletionTokens(Integer completionTokens) {
    this.completionTokens = completionTokens;
  }


  public RunStepCompletionUsage promptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
    return this;
  }

   /**
   * Number of prompt tokens used over the course of the run step.
   * @return promptTokens
  **/
  @javax.annotation.Nonnull
  public Integer getPromptTokens() {
    return promptTokens;
  }

  public void setPromptTokens(Integer promptTokens) {
    this.promptTokens = promptTokens;
  }


  public RunStepCompletionUsage totalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
    return this;
  }

   /**
   * Total number of tokens used (prompt + completion).
   * @return totalTokens
  **/
  @javax.annotation.Nonnull
  public Integer getTotalTokens() {
    return totalTokens;
  }

  public void setTotalTokens(Integer totalTokens) {
    this.totalTokens = totalTokens;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepCompletionUsage runStepCompletionUsage = (RunStepCompletionUsage) o;
    return Objects.equals(this.completionTokens, runStepCompletionUsage.completionTokens) &&
        Objects.equals(this.promptTokens, runStepCompletionUsage.promptTokens) &&
        Objects.equals(this.totalTokens, runStepCompletionUsage.totalTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTokens, promptTokens, totalTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepCompletionUsage {\n");
    sb.append("    completionTokens: ").append(toIndentedString(completionTokens)).append("\n");
    sb.append("    promptTokens: ").append(toIndentedString(promptTokens)).append("\n");
    sb.append("    totalTokens: ").append(toIndentedString(totalTokens)).append("\n");
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
    openapiFields.add("completion_tokens");
    openapiFields.add("prompt_tokens");
    openapiFields.add("total_tokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("completion_tokens");
    openapiRequiredFields.add("prompt_tokens");
    openapiRequiredFields.add("total_tokens");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunStepCompletionUsage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunStepCompletionUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunStepCompletionUsage is not found in the empty JSON string", RunStepCompletionUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunStepCompletionUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunStepCompletionUsage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunStepCompletionUsage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunStepCompletionUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunStepCompletionUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunStepCompletionUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunStepCompletionUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<RunStepCompletionUsage>() {
           @Override
           public void write(JsonWriter out, RunStepCompletionUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunStepCompletionUsage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RunStepCompletionUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunStepCompletionUsage
  * @throws IOException if the JSON string is invalid with respect to RunStepCompletionUsage
  */
  public static RunStepCompletionUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStepCompletionUsage.class);
  }

 /**
  * Convert an instance of RunStepCompletionUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

