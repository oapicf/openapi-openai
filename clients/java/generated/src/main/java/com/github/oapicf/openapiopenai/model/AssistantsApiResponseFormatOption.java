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
import com.github.oapicf.openapiopenai.model.AssistantsApiResponseFormat;
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
public class AssistantsApiResponseFormatOption extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AssistantsApiResponseFormatOption.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AssistantsApiResponseFormatOption.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AssistantsApiResponseFormatOption' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<String> adapterString = gson.getDelegateAdapter(this, TypeToken.get(String.class));
            final TypeAdapter<AssistantsApiResponseFormat> adapterAssistantsApiResponseFormat = gson.getDelegateAdapter(this, TypeToken.get(AssistantsApiResponseFormat.class));

            return (TypeAdapter<T>) new TypeAdapter<AssistantsApiResponseFormatOption>() {
                @Override
                public void write(JsonWriter out, AssistantsApiResponseFormatOption value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `String`
                    if (value.getActualInstance() instanceof String) {
                      JsonPrimitive primitive = adapterString.toJsonTree((String)value.getActualInstance()).getAsJsonPrimitive();
                      elementAdapter.write(out, primitive);
                      return;
                    }
                    // check if the actual instance is of the type `AssistantsApiResponseFormat`
                    if (value.getActualInstance() instanceof AssistantsApiResponseFormat) {
                      JsonElement element = adapterAssistantsApiResponseFormat.toJsonTree((AssistantsApiResponseFormat)value.getActualInstance());
                      elementAdapter.write(out, element);
                      return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: AssistantsApiResponseFormat, String");
                }

                @Override
                public AssistantsApiResponseFormatOption read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize String
                    try {
                      // validate the JSON object to see if any exception is thrown
                      if(!jsonElement.getAsJsonPrimitive().isString()) {
                        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
                      }
                      actualAdapter = adapterString;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'String'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'String'", e);
                    }
                    // deserialize AssistantsApiResponseFormat
                    try {
                      // validate the JSON object to see if any exception is thrown
                      AssistantsApiResponseFormat.validateJsonElement(jsonElement);
                      actualAdapter = adapterAssistantsApiResponseFormat;
                      match++;
                      log.log(Level.FINER, "Input data matches schema 'AssistantsApiResponseFormat'");
                    } catch (Exception e) {
                      // deserialization failed, continue
                      errorMessages.add(String.format("Deserialization for AssistantsApiResponseFormat failed with `%s`.", e.getMessage()));
                      log.log(Level.FINER, "Input data does not match schema 'AssistantsApiResponseFormat'", e);
                    }

                    if (match == 1) {
                        AssistantsApiResponseFormatOption ret = new AssistantsApiResponseFormatOption();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for AssistantsApiResponseFormatOption: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AssistantsApiResponseFormatOption() {
        super("oneOf", Boolean.FALSE);
    }

    public AssistantsApiResponseFormatOption(AssistantsApiResponseFormat o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AssistantsApiResponseFormatOption(String o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("String", String.class);
        schemas.put("AssistantsApiResponseFormat", AssistantsApiResponseFormat.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AssistantsApiResponseFormatOption.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * AssistantsApiResponseFormat, String
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof String) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AssistantsApiResponseFormat) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AssistantsApiResponseFormat, String");
    }

    /**
     * Get the actual instance, which can be the following:
     * AssistantsApiResponseFormat, String
     *
     * @return The actual instance (AssistantsApiResponseFormat, String)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `String`. If the actual instance is not `String`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `String`
     * @throws ClassCastException if the instance is not `String`
     */
    public String getString() throws ClassCastException {
        return (String)super.getActualInstance();
    }
    /**
     * Get the actual instance of `AssistantsApiResponseFormat`. If the actual instance is not `AssistantsApiResponseFormat`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AssistantsApiResponseFormat`
     * @throws ClassCastException if the instance is not `AssistantsApiResponseFormat`
     */
    public AssistantsApiResponseFormat getAssistantsApiResponseFormat() throws ClassCastException {
        return (AssistantsApiResponseFormat)super.getActualInstance();
    }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to AssistantsApiResponseFormatOption
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with String
    try {
      if(!jsonElement.getAsJsonPrimitive().isString()) {
        throw new IllegalArgumentException(String.format("Expected json element to be of type String in the JSON string but got `%s`", jsonElement.toString()));
      }
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for String failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with AssistantsApiResponseFormat
    try {
      AssistantsApiResponseFormat.validateJsonElement(jsonElement);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for AssistantsApiResponseFormat failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for AssistantsApiResponseFormatOption with oneOf schemas: AssistantsApiResponseFormat, String. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
    }
  }

 /**
  * Create an instance of AssistantsApiResponseFormatOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssistantsApiResponseFormatOption
  * @throws IOException if the JSON string is invalid with respect to AssistantsApiResponseFormatOption
  */
  public static AssistantsApiResponseFormatOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssistantsApiResponseFormatOption.class);
  }

 /**
  * Convert an instance of AssistantsApiResponseFormatOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

