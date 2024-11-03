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
import com.github.oapicf.openapiopenai.model.MessageContentImageFileObject;
import com.github.oapicf.openapiopenai.model.MessageContentImageFileObjectImageFile;
import com.github.oapicf.openapiopenai.model.MessageContentTextObject;
import com.github.oapicf.openapiopenai.model.MessageContentTextObjectText;
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
public class MessageObjectContentInner extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(MessageObjectContentInner.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MessageObjectContentInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MessageObjectContentInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MessageContentImageFileObject> adapterMessageContentImageFileObject = gson.getDelegateAdapter(this, TypeToken.get(MessageContentImageFileObject.class));
            final TypeAdapter<MessageContentTextObject> adapterMessageContentTextObject = gson.getDelegateAdapter(this, TypeToken.get(MessageContentTextObject.class));

            return (TypeAdapter<T>) new TypeAdapter<MessageObjectContentInner>() {
                @Override
                public void write(JsonWriter out, MessageObjectContentInner value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MessageContentImageFileObject`
                    if (value.getActualInstance() instanceof MessageContentImageFileObject) {
                        JsonElement element = adapterMessageContentImageFileObject.toJsonTree((MessageContentImageFileObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `MessageContentTextObject`
                    if (value.getActualInstance() instanceof MessageContentTextObject) {
                        JsonElement element = adapterMessageContentTextObject.toJsonTree((MessageContentTextObject)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MessageContentImageFileObject, MessageContentTextObject");
                }

                @Override
                public MessageObjectContentInner read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MessageContentImageFileObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageContentImageFileObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageContentImageFileObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageContentImageFileObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageContentImageFileObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageContentImageFileObject'", e);
                    }
                    // deserialize MessageContentTextObject
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MessageContentTextObject.validateJsonElement(jsonElement);
                        actualAdapter = adapterMessageContentTextObject;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MessageContentTextObject'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MessageContentTextObject failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MessageContentTextObject'", e);
                    }

                    if (match == 1) {
                        MessageObjectContentInner ret = new MessageObjectContentInner();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for MessageObjectContentInner: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public MessageObjectContentInner() {
        super("oneOf", Boolean.FALSE);
    }

    public MessageObjectContentInner(Object o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MessageContentImageFileObject", MessageContentImageFileObject.class);
        schemas.put("MessageContentTextObject", MessageContentTextObject.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return MessageObjectContentInner.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MessageContentImageFileObject, MessageContentTextObject
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MessageContentImageFileObject) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof MessageContentTextObject) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MessageContentImageFileObject, MessageContentTextObject");
    }

    /**
     * Get the actual instance, which can be the following:
     * MessageContentImageFileObject, MessageContentTextObject
     *
     * @return The actual instance (MessageContentImageFileObject, MessageContentTextObject)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MessageContentImageFileObject`. If the actual instance is not `MessageContentImageFileObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageContentImageFileObject`
     * @throws ClassCastException if the instance is not `MessageContentImageFileObject`
     */
    public MessageContentImageFileObject getMessageContentImageFileObject() throws ClassCastException {
        return (MessageContentImageFileObject)super.getActualInstance();
    }
    /**
     * Get the actual instance of `MessageContentTextObject`. If the actual instance is not `MessageContentTextObject`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MessageContentTextObject`
     * @throws ClassCastException if the instance is not `MessageContentTextObject`
     */
    public MessageContentTextObject getMessageContentTextObject() throws ClassCastException {
        return (MessageContentTextObject)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MessageObjectContentInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MessageContentImageFileObject
        try {
            MessageContentImageFileObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageContentImageFileObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with MessageContentTextObject
        try {
            MessageContentTextObject.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MessageContentTextObject failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            throw new IOException(String.format("The JSON string is invalid for MessageObjectContentInner with oneOf schemas: MessageContentImageFileObject, MessageContentTextObject. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of MessageObjectContentInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MessageObjectContentInner
     * @throws IOException if the JSON string is invalid with respect to MessageObjectContentInner
     */
    public static MessageObjectContentInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MessageObjectContentInner.class);
    }

    /**
     * Convert an instance of MessageObjectContentInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

