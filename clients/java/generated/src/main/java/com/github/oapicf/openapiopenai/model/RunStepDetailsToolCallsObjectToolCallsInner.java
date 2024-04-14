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
import com.github.oapicf.openapiopenai.model.RunStepDetailsToolCallsCodeObject;
import com.github.oapicf.openapiopenai.model.RunStepDetailsToolCallsCodeObjectCodeInterpreter;
import com.github.oapicf.openapiopenai.model.RunStepDetailsToolCallsFunctionObject;
import com.github.oapicf.openapiopenai.model.RunStepDetailsToolCallsFunctionObjectFunction;
import com.github.oapicf.openapiopenai.model.RunStepDetailsToolCallsRetrievalObject;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.github.oapicf.openapiopenai.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-14T13:36:26.918687560Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RunStepDetailsToolCallsObjectToolCallsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(RunStepDetailsToolCallsObjectToolCallsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RunStepDetailsToolCallsObjectToolCallsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RunStepDetailsToolCallsObjectToolCallsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RunStepDetailsToolCallsCodeObject> adapterRunStepDetailsToolCallsCodeObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsCodeObject.class));
            final TypeAdapter<RunStepDetailsToolCallsRetrievalObject> adapterRunStepDetailsToolCallsRetrievalObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsRetrievalObject.class));
            final TypeAdapter<RunStepDetailsToolCallsFunctionObject> adapterRunStepDetailsToolCallsFunctionObject = gson.getDelegateAdapter(this, TypeToken.get(RunStepDetailsToolCallsFunctionObject.class));

            return (TypeAdapter<T>) new TypeAdapter<RunStepDetailsToolCallsObjectToolCallsInner>() {
                @Override
                public void write(JsonWriter out, RunStepDetailsToolCallsObjectToolCallsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `RunStepDetailsToolCallsCodeObject`
                    if (value.getActualInstance() instanceof RunStepDetailsToolCallsCodeObject) {
                      JsonElement element = adapterRunStepDetailsToolCallsCodeObject.toJsonTree((RunStepDetailsToolCallsCodeObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RunStepDetailsToolCallsRetrievalObject`
                    if (value.getActualInstance() instanceof RunStepDetailsToolCallsRetrievalObject) {
                      JsonElement element = adapterRunStepDetailsToolCallsRetrievalObject.toJsonTree((RunStepDetailsToolCallsRetrievalObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    // check if the actual instance is of the type `RunStepDetailsToolCallsFunctionObject`
                    if (value.getActualInstance() instanceof RunStepDetailsToolCallsFunctionObject) {
                      JsonElement element = adapterRunStepDetailsToolCallsFunctionObject.toJsonTree((RunStepDetailsToolCallsFunctionObject)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject");
                }

                @Override
                public RunStepDetailsToolCallsObjectToolCallsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize RunStepDetailsToolCallsCodeObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsToolCallsCodeObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsToolCallsCodeObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsToolCallsCodeObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsCodeObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsToolCallsCodeObject'", e);
                    }
                    // deserialize RunStepDetailsToolCallsRetrievalObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsToolCallsRetrievalObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsToolCallsRetrievalObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsToolCallsRetrievalObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsRetrievalObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsToolCallsRetrievalObject'", e);
                    }
                    // deserialize RunStepDetailsToolCallsFunctionObject
                    try {
                      // validate the JSON object to see if any exception is thrown
                      RunStepDetailsToolCallsFunctionObject.validateJsonElement(jsonElement);
                      actualAdapter = adapterRunStepDetailsToolCallsFunctionObject;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'RunStepDetailsToolCallsFunctionObject'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsFunctionObject failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'RunStepDetailsToolCallsFunctionObject'", e);
                    }

                    if (match == 1) {
                        RunStepDetailsToolCallsObjectToolCallsInner ret = new RunStepDetailsToolCallsObjectToolCallsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for RunStepDetailsToolCallsObjectToolCallsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public RunStepDetailsToolCallsObjectToolCallsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public RunStepDetailsToolCallsObjectToolCallsInner(RunStepDetailsToolCallsCodeObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RunStepDetailsToolCallsObjectToolCallsInner(RunStepDetailsToolCallsFunctionObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public RunStepDetailsToolCallsObjectToolCallsInner(RunStepDetailsToolCallsRetrievalObject o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("RunStepDetailsToolCallsCodeObject", RunStepDetailsToolCallsCodeObject.class);
        schemas.put("RunStepDetailsToolCallsRetrievalObject", RunStepDetailsToolCallsRetrievalObject.class);
        schemas.put("RunStepDetailsToolCallsFunctionObject", RunStepDetailsToolCallsFunctionObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return RunStepDetailsToolCallsObjectToolCallsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof RunStepDetailsToolCallsCodeObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepDetailsToolCallsRetrievalObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof RunStepDetailsToolCallsFunctionObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject
     *
     * @return The actual instance (RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `RunStepDetailsToolCallsCodeObject`. If the actual instance is not `RunStepDetailsToolCallsCodeObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsToolCallsCodeObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsToolCallsCodeObject`
     */
    public RunStepDetailsToolCallsCodeObject getRunStepDetailsToolCallsCodeObject() throws ClassCastException {
        return (RunStepDetailsToolCallsCodeObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepDetailsToolCallsRetrievalObject`. If the actual instance is not `RunStepDetailsToolCallsRetrievalObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsToolCallsRetrievalObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsToolCallsRetrievalObject`
     */
    public RunStepDetailsToolCallsRetrievalObject getRunStepDetailsToolCallsRetrievalObject() throws ClassCastException {
        return (RunStepDetailsToolCallsRetrievalObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `RunStepDetailsToolCallsFunctionObject`. If the actual instance is not `RunStepDetailsToolCallsFunctionObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `RunStepDetailsToolCallsFunctionObject`
     * @throws ClassCastException if the instance is not `RunStepDetailsToolCallsFunctionObject`
     */
    public RunStepDetailsToolCallsFunctionObject getRunStepDetailsToolCallsFunctionObject() throws ClassCastException {
        return (RunStepDetailsToolCallsFunctionObject)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RunStepDetailsToolCallsObjectToolCallsInner
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with RunStepDetailsToolCallsCodeObject
    try {
      RunStepDetailsToolCallsCodeObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsCodeObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RunStepDetailsToolCallsRetrievalObject
    try {
      RunStepDetailsToolCallsRetrievalObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsRetrievalObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with RunStepDetailsToolCallsFunctionObject
    try {
      RunStepDetailsToolCallsFunctionObject.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for RunStepDetailsToolCallsFunctionObject failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for RunStepDetailsToolCallsObjectToolCallsInner with oneOf schemas: RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of RunStepDetailsToolCallsObjectToolCallsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RunStepDetailsToolCallsObjectToolCallsInner
  * @throws IOException if the JSON string is invalid with respect to RunStepDetailsToolCallsObjectToolCallsInner
  */
  public static RunStepDetailsToolCallsObjectToolCallsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RunStepDetailsToolCallsObjectToolCallsInner.class);
  }

 /**
  * Convert an instance of RunStepDetailsToolCallsObjectToolCallsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

