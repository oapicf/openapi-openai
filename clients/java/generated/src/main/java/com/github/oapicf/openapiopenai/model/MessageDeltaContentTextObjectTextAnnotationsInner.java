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
import com.github.oapicf.openapiopenai.model.MessageDeltaContentTextAnnotationsFileCitationObject;
import com.github.oapicf.openapiopenai.model.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;
import com.github.oapicf.openapiopenai.model.MessageDeltaContentTextAnnotationsFilePathObject;
import com.github.oapicf.openapiopenai.model.MessageDeltaContentTextAnnotationsFilePathObjectFilePath;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-03T11:06:04.801466369Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MessageDeltaContentTextObjectTextAnnotationsInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MessageDeltaContentTextObjectTextAnnotationsInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MessageDeltaContentTextObjectTextAnnotationsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MessageDeltaContentTextObjectTextAnnotationsInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MessageDeltaContentTextAnnotationsFileCitationObject> adapterMessageDeltaContentTextAnnotationsFileCitationObject = gson.getDelegateAdapter(this, TypeToken.get(MessageDeltaContentTextAnnotationsFileCitationObject.class));
            final TypeAdapter<MessageDeltaContentTextAnnotationsFilePathObject> adapterMessageDeltaContentTextAnnotationsFilePathObject = gson.getDelegateAdapter(this, TypeToken.get(MessageDeltaContentTextAnnotationsFilePathObject.class));

            return (TypeAdapter<T>) new TypeAdapter<MessageDeltaContentTextObjectTextAnnotationsInner>() {
                @Override
                public void write(JsonWriter out, MessageDeltaContentTextObjectTextAnnotationsInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MessageDeltaContentTextAnnotationsFileCitationObject`
                    if (value.getActualInstance() instanceof MessageDeltaContentTextAnnotationsFileCitationObject) {
                        JsonElement element = adapterMessageDeltaContentTextAnnotationsFileCitationObject.toJsonTree((MessageDeltaContentTextAnnotationsFileCitationObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageDeltaContentTextAnnotationsFilePathObject`
                    if (value.getActualInstance() instanceof MessageDeltaContentTextAnnotationsFilePathObject) {
                        JsonElement element = adapterMessageDeltaContentTextAnnotationsFilePathObject.toJsonTree((MessageDeltaContentTextAnnotationsFilePathObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject");
                }

                @Override
                public MessageDeltaContentTextObjectTextAnnotationsInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MessageDeltaContentTextAnnotationsFileCitationObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageDeltaContentTextAnnotationsFileCitationObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageDeltaContentTextAnnotationsFileCitationObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageDeltaContentTextAnnotationsFileCitationObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageDeltaContentTextAnnotationsFileCitationObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageDeltaContentTextAnnotationsFileCitationObject'", e);
                    }
                    // deserialize MessageDeltaContentTextAnnotationsFilePathObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageDeltaContentTextAnnotationsFilePathObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageDeltaContentTextAnnotationsFilePathObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageDeltaContentTextAnnotationsFilePathObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageDeltaContentTextAnnotationsFilePathObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageDeltaContentTextAnnotationsFilePathObject'", e);
                    }

                    if (match == 1) {
                        MessageDeltaContentTextObjectTextAnnotationsInner ret = new MessageDeltaContentTextObjectTextAnnotationsInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for MessageDeltaContentTextObjectTextAnnotationsInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MessageDeltaContentTextObjectTextAnnotationsInner() {
        super("oneOf", Boolean.FALSE);
    }

    public MessageDeltaContentTextObjectTextAnnotationsInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MessageDeltaContentTextAnnotationsFileCitationObject", MessageDeltaContentTextAnnotationsFileCitationObject.class);
        schemas.put("MessageDeltaContentTextAnnotationsFilePathObject", MessageDeltaContentTextAnnotationsFilePathObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MessageDeltaContentTextObjectTextAnnotationsInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MessageDeltaContentTextAnnotationsFileCitationObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageDeltaContentTextAnnotationsFilePathObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject
     *
     * @return The actual instance (MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageDeltaContentTextAnnotationsFileCitationObject`. If the actual instance is not `MessageDeltaContentTextAnnotationsFileCitationObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDeltaContentTextAnnotationsFileCitationObject`
     * @throws ClassCastException if the instance is not `MessageDeltaContentTextAnnotationsFileCitationObject`
     */
    public MessageDeltaContentTextAnnotationsFileCitationObject getMessageDeltaContentTextAnnotationsFileCitationObject() throws ClassCastException {
        return (MessageDeltaContentTextAnnotationsFileCitationObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageDeltaContentTextAnnotationsFilePathObject`. If the actual instance is not `MessageDeltaContentTextAnnotationsFilePathObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageDeltaContentTextAnnotationsFilePathObject`
     * @throws ClassCastException if the instance is not `MessageDeltaContentTextAnnotationsFilePathObject`
     */
    public MessageDeltaContentTextAnnotationsFilePathObject getMessageDeltaContentTextAnnotationsFilePathObject() throws ClassCastException {
        return (MessageDeltaContentTextAnnotationsFilePathObject)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MessageDeltaContentTextObjectTextAnnotationsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MessageDeltaContentTextAnnotationsFileCitationObject
        try {
            MessageDeltaContentTextAnnotationsFileCitationObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageDeltaContentTextAnnotationsFileCitationObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageDeltaContentTextAnnotationsFilePathObject
        try {
            MessageDeltaContentTextAnnotationsFilePathObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageDeltaContentTextAnnotationsFilePathObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for MessageDeltaContentTextObjectTextAnnotationsInner with oneOf schemas: MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of MessageDeltaContentTextObjectTextAnnotationsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MessageDeltaContentTextObjectTextAnnotationsInner
     * @throws IOException if the JSON string is invalid with respect to MessageDeltaContentTextObjectTextAnnotationsInner
     */
    public static MessageDeltaContentTextObjectTextAnnotationsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MessageDeltaContentTextObjectTextAnnotationsInner.class);
    }

    /**
     * Convert an instance of MessageDeltaContentTextObjectTextAnnotationsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

