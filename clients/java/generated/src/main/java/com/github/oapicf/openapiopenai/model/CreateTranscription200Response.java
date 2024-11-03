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
import com.github.oapicf.openapiopenai.model.CreateTranscriptionResponseJson;
import com.github.oapicf.openapiopenai.model.CreateTranscriptionResponseVerboseJson;
import com.github.oapicf.openapiopenai.model.TranscriptionSegment;
import com.github.oapicf.openapiopenai.model.TranscriptionWord;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T11:06:04.801466369Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateTranscription200Response extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateTranscription200Response.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateTranscription200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateTranscription200Response' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateTranscriptionResponseJson> adapterCreateTranscriptionResponseJson = gson.getDelegateAdapter(this, TypeToken.get(CreateTranscriptionResponseJson.class));
            final TypeAdapter<CreateTranscriptionResponseVerboseJson> adapterCreateTranscriptionResponseVerboseJson = gson.getDelegateAdapter(this, TypeToken.get(CreateTranscriptionResponseVerboseJson.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateTranscription200Response>() {
                @Override
                public void write(JsonWriter out, CreateTranscription200Response value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `CreateTranscriptionResponseJson`
                    if (value.getActualInstance() instanceof CreateTranscriptionResponseJson) {
                        JsonElement element = adapterCreateTranscriptionResponseJson.toJsonTree((CreateTranscriptionResponseJson)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CreateTranscriptionResponseVerboseJson`
                    if (value.getActualInstance() instanceof CreateTranscriptionResponseVerboseJson) {
                        JsonElement element = adapterCreateTranscriptionResponseVerboseJson.toJsonTree((CreateTranscriptionResponseVerboseJson)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: CreateTranscriptionResponseJson, CreateTranscriptionResponseVerboseJson");
                }

                @Override
                public CreateTranscription200Response read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize CreateTranscriptionResponseJson
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateTranscriptionResponseJson.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateTranscriptionResponseJson;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateTranscriptionResponseJson'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateTranscriptionResponseJson failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateTranscriptionResponseJson'", e);
                    }
                    // deserialize CreateTranscriptionResponseVerboseJson
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CreateTranscriptionResponseVerboseJson.validateJsonElement(jsonElement);
                        actualAdapter = adapterCreateTranscriptionResponseVerboseJson;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CreateTranscriptionResponseVerboseJson'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CreateTranscriptionResponseVerboseJson failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CreateTranscriptionResponseVerboseJson'", e);
                    }

                    if (match == 1) {
                        CreateTranscription200Response ret = new CreateTranscription200Response();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateTranscription200Response: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public CreateTranscription200Response() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateTranscription200Response(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("CreateTranscriptionResponseJson", CreateTranscriptionResponseJson.class);
        schemas.put("CreateTranscriptionResponseVerboseJson", CreateTranscriptionResponseVerboseJson.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return CreateTranscription200Response.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * CreateTranscriptionResponseJson, CreateTranscriptionResponseVerboseJson
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof CreateTranscriptionResponseJson) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CreateTranscriptionResponseVerboseJson) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be CreateTranscriptionResponseJson, CreateTranscriptionResponseVerboseJson");
    }

    /**
     * Get the actual instance, which can be the following:
     * CreateTranscriptionResponseJson, CreateTranscriptionResponseVerboseJson
     *
     * @return The actual instance (CreateTranscriptionResponseJson, CreateTranscriptionResponseVerboseJson)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `CreateTranscriptionResponseJson`. If the actual instance is not `CreateTranscriptionResponseJson`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateTranscriptionResponseJson`
     * @throws ClassCastException if the instance is not `CreateTranscriptionResponseJson`
     */
    public CreateTranscriptionResponseJson getCreateTranscriptionResponseJson() throws ClassCastException {
        return (CreateTranscriptionResponseJson)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CreateTranscriptionResponseVerboseJson`. If the actual instance is not `CreateTranscriptionResponseVerboseJson`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CreateTranscriptionResponseVerboseJson`
     * @throws ClassCastException if the instance is not `CreateTranscriptionResponseVerboseJson`
     */
    public CreateTranscriptionResponseVerboseJson getCreateTranscriptionResponseVerboseJson() throws ClassCastException {
        return (CreateTranscriptionResponseVerboseJson)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateTranscription200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with CreateTranscriptionResponseJson
        try {
            CreateTranscriptionResponseJson.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateTranscriptionResponseJson failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CreateTranscriptionResponseVerboseJson
        try {
            CreateTranscriptionResponseVerboseJson.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CreateTranscriptionResponseVerboseJson failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for CreateTranscription200Response with oneOf schemas: CreateTranscriptionResponseJson, CreateTranscriptionResponseVerboseJson. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of CreateTranscription200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateTranscription200Response
     * @throws IOException if the JSON string is invalid with respect to CreateTranscription200Response
     */
    public static CreateTranscription200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateTranscription200Response.class);
    }

    /**
     * Convert an instance of CreateTranscription200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

