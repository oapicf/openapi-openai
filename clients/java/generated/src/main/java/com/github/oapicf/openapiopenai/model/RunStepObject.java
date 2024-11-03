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
import com.github.oapicf.openapiopenai.model.RunStepCompletionUsage;
import com.github.oapicf.openapiopenai.model.RunStepObjectLastError;
import com.github.oapicf.openapiopenai.model.RunStepObjectStepDetails;
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
 * Represents a step in execution of a run. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T11:06:04.801466369Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RunStepObject {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  /**
   * The object type, which is always &#x60;thread.run.step&#x60;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    THREAD_RUN_STEP("thread.run.step");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ObjectEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      ObjectEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private ObjectEnum _object;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Integer createdAt;

  public static final String SERIALIZED_NAME_ASSISTANT_ID = "assistant_id";
  @SerializedName(SERIALIZED_NAME_ASSISTANT_ID)
  private String assistantId;

  public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
  @SerializedName(SERIALIZED_NAME_THREAD_ID)
  private String threadId;

  public static final String SERIALIZED_NAME_RUN_ID = "run_id";
  @SerializedName(SERIALIZED_NAME_RUN_ID)
  private String runId;

  /**
   * The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MESSAGE_CREATION("message_creation"),
    
    TOOL_CALLS("tool_calls");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
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

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    IN_PROGRESS("in_progress"),
    
    CANCELLED("cancelled"),
    
    FAILED("failed"),
    
    COMPLETED("completed"),
    
    EXPIRED("expired");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StatusEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_STEP_DETAILS = "step_details";
  @SerializedName(SERIALIZED_NAME_STEP_DETAILS)
  private RunStepObjectStepDetails stepDetails;

  public static final String SERIALIZED_NAME_LAST_ERROR = "last_error";
  @SerializedName(SERIALIZED_NAME_LAST_ERROR)
  private RunStepObjectLastError lastError;

  public static final String SERIALIZED_NAME_EXPIRED_AT = "expired_at";
  @SerializedName(SERIALIZED_NAME_EXPIRED_AT)
  private Integer expiredAt;

  public static final String SERIALIZED_NAME_CANCELLED_AT = "cancelled_at";
  @SerializedName(SERIALIZED_NAME_CANCELLED_AT)
  private Integer cancelledAt;

  public static final String SERIALIZED_NAME_FAILED_AT = "failed_at";
  @SerializedName(SERIALIZED_NAME_FAILED_AT)
  private Integer failedAt;

  public static final String SERIALIZED_NAME_COMPLETED_AT = "completed_at";
  @SerializedName(SERIALIZED_NAME_COMPLETED_AT)
  private Integer completedAt;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_USAGE = "usage";
  @SerializedName(SERIALIZED_NAME_USAGE)
  private RunStepCompletionUsage usage;

  public RunStepObject() {
  }

  public RunStepObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the run step, which can be referenced in API endpoints.
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public RunStepObject _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always &#x60;thread.run.step&#x60;.
   * @return _object
   */
  @javax.annotation.Nonnull
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }


  public RunStepObject createdAt(Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step was created.
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public Integer getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Integer createdAt) {
    this.createdAt = createdAt;
  }


  public RunStepObject assistantId(String assistantId) {
    this.assistantId = assistantId;
    return this;
  }

  /**
   * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
   * @return assistantId
   */
  @javax.annotation.Nonnull
  public String getAssistantId() {
    return assistantId;
  }

  public void setAssistantId(String assistantId) {
    this.assistantId = assistantId;
  }


  public RunStepObject threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * The ID of the [thread](/docs/api-reference/threads) that was run.
   * @return threadId
   */
  @javax.annotation.Nonnull
  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public RunStepObject runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
   * @return runId
   */
  @javax.annotation.Nonnull
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }


  public RunStepObject type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of run step, which can be either &#x60;message_creation&#x60; or &#x60;tool_calls&#x60;.
   * @return type
   */
  @javax.annotation.Nonnull
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RunStepObject status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the run step, which can be either &#x60;in_progress&#x60;, &#x60;cancelled&#x60;, &#x60;failed&#x60;, &#x60;completed&#x60;, or &#x60;expired&#x60;.
   * @return status
   */
  @javax.annotation.Nonnull
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public RunStepObject stepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
    return this;
  }

  /**
   * Get stepDetails
   * @return stepDetails
   */
  @javax.annotation.Nonnull
  public RunStepObjectStepDetails getStepDetails() {
    return stepDetails;
  }

  public void setStepDetails(RunStepObjectStepDetails stepDetails) {
    this.stepDetails = stepDetails;
  }


  public RunStepObject lastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
    return this;
  }

  /**
   * Get lastError
   * @return lastError
   */
  @javax.annotation.Nullable
  public RunStepObjectLastError getLastError() {
    return lastError;
  }

  public void setLastError(RunStepObjectLastError lastError) {
    this.lastError = lastError;
  }


  public RunStepObject expiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
   * @return expiredAt
   */
  @javax.annotation.Nullable
  public Integer getExpiredAt() {
    return expiredAt;
  }

  public void setExpiredAt(Integer expiredAt) {
    this.expiredAt = expiredAt;
  }


  public RunStepObject cancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step was cancelled.
   * @return cancelledAt
   */
  @javax.annotation.Nullable
  public Integer getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(Integer cancelledAt) {
    this.cancelledAt = cancelledAt;
  }


  public RunStepObject failedAt(Integer failedAt) {
    this.failedAt = failedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step failed.
   * @return failedAt
   */
  @javax.annotation.Nullable
  public Integer getFailedAt() {
    return failedAt;
  }

  public void setFailedAt(Integer failedAt) {
    this.failedAt = failedAt;
  }


  public RunStepObject completedAt(Integer completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) for when the run step completed.
   * @return completedAt
   */
  @javax.annotation.Nullable
  public Integer getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Integer completedAt) {
    this.completedAt = completedAt;
  }


  public RunStepObject metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
   * @return metadata
   */
  @javax.annotation.Nullable
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public RunStepObject usage(RunStepCompletionUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @javax.annotation.Nullable
  public RunStepCompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(RunStepCompletionUsage usage) {
    this.usage = usage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RunStepObject runStepObject = (RunStepObject) o;
    return Objects.equals(this.id, runStepObject.id) &&
        Objects.equals(this._object, runStepObject._object) &&
        Objects.equals(this.createdAt, runStepObject.createdAt) &&
        Objects.equals(this.assistantId, runStepObject.assistantId) &&
        Objects.equals(this.threadId, runStepObject.threadId) &&
        Objects.equals(this.runId, runStepObject.runId) &&
        Objects.equals(this.type, runStepObject.type) &&
        Objects.equals(this.status, runStepObject.status) &&
        Objects.equals(this.stepDetails, runStepObject.stepDetails) &&
        Objects.equals(this.lastError, runStepObject.lastError) &&
        Objects.equals(this.expiredAt, runStepObject.expiredAt) &&
        Objects.equals(this.cancelledAt, runStepObject.cancelledAt) &&
        Objects.equals(this.failedAt, runStepObject.failedAt) &&
        Objects.equals(this.completedAt, runStepObject.completedAt) &&
        Objects.equals(this.metadata, runStepObject.metadata) &&
        Objects.equals(this.usage, runStepObject.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, createdAt, assistantId, threadId, runId, type, status, stepDetails, lastError, expiredAt, cancelledAt, failedAt, completedAt, metadata, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RunStepObject {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    assistantId: ").append(toIndentedString(assistantId)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stepDetails: ").append(toIndentedString(stepDetails)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
    sb.append("    expiredAt: ").append(toIndentedString(expiredAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("object");
    openapiFields.add("created_at");
    openapiFields.add("assistant_id");
    openapiFields.add("thread_id");
    openapiFields.add("run_id");
    openapiFields.add("type");
    openapiFields.add("status");
    openapiFields.add("step_details");
    openapiFields.add("last_error");
    openapiFields.add("expired_at");
    openapiFields.add("cancelled_at");
    openapiFields.add("failed_at");
    openapiFields.add("completed_at");
    openapiFields.add("metadata");
    openapiFields.add("usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("object");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("assistant_id");
    openapiRequiredFields.add("thread_id");
    openapiRequiredFields.add("run_id");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("step_details");
    openapiRequiredFields.add("last_error");
    openapiRequiredFields.add("expired_at");
    openapiRequiredFields.add("cancelled_at");
    openapiRequiredFields.add("failed_at");
    openapiRequiredFields.add("completed_at");
    openapiRequiredFields.add("metadata");
    openapiRequiredFields.add("usage");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to RunStepObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RunStepObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RunStepObject is not found in the empty JSON string", RunStepObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!RunStepObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RunStepObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RunStepObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      // validate the required field `object`
      ObjectEnum.validateJsonElement(jsonObj.get("object"));
      if (!jsonObj.get("assistant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assistant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assistant_id").toString()));
      }
      if (!jsonObj.get("thread_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thread_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thread_id").toString()));
      }
      if (!jsonObj.get("run_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `run_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("run_id").toString()));
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the required field `type`
      TypeEnum.validateJsonElement(jsonObj.get("type"));
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the required field `status`
      StatusEnum.validateJsonElement(jsonObj.get("status"));
      // validate the required field `step_details`
      RunStepObjectStepDetails.validateJsonElement(jsonObj.get("step_details"));
      // validate the required field `last_error`
      RunStepObjectLastError.validateJsonElement(jsonObj.get("last_error"));
      // validate the required field `usage`
      RunStepCompletionUsage.validateJsonElement(jsonObj.get("usage"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RunStepObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RunStepObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RunStepObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RunStepObject.class));

       return (TypeAdapter<T>) new TypeAdapter<RunStepObject>() {
           @Override
           public void write(JsonWriter out, RunStepObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RunStepObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of RunStepObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of RunStepObject
   * @throws IOException if the JSON string is invalid with respect to RunStepObject
   */
  public static RunStepObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStepObject.class);
  }

  /**
   * Convert an instance of RunStepObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

