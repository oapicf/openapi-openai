package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CompletionUsage;
import org.openapitools.server.model.CreateChatCompletionResponseChoicesInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
public class CreateChatCompletionResponse   {

    private String id;
    private List<@Valid CreateChatCompletionResponseChoicesInner> choices = new ArrayList<>();
    private Integer created;
    private String model;

    /**
    * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
    */
    public enum ServiceTierEnum {
        SCALE("scale"),
        DEFAULT("default");

        private String value;

        ServiceTierEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ServiceTierEnum fromValue(String text) {
            for (ServiceTierEnum b : ServiceTierEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ServiceTierEnum serviceTier;
    private String systemFingerprint;

    /**
    * The object type, which is always `chat.completion`.
    */
    public enum ObjectEnum {
        CHAT_COMPLETION("chat.completion");

        private String value;

        ObjectEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private CompletionUsage usage;

    /**
     * Default constructor.
     */
    public CreateChatCompletionResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionResponse.
     *
     * @param id A unique identifier for the chat completion.
     * @param choices A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
     * @param created The Unix timestamp (in seconds) of when the chat completion was created.
     * @param model The model used for the chat completion.
     * @param serviceTier The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request.
     * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
     * @param _object The object type, which is always &#x60;chat.completion&#x60;.
     * @param usage usage
     */
    public CreateChatCompletionResponse(
        String id, 
        List<@Valid CreateChatCompletionResponseChoicesInner> choices, 
        Integer created, 
        String model, 
        ServiceTierEnum serviceTier, 
        String systemFingerprint, 
        ObjectEnum _object, 
        CompletionUsage usage
    ) {
        this.id = id;
        this.choices = choices;
        this.created = created;
        this.model = model;
        this.serviceTier = serviceTier;
        this.systemFingerprint = systemFingerprint;
        this._object = _object;
        this.usage = usage;
    }



    /**
     * A unique identifier for the chat completion.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * A list of chat completion choices. Can be more than one if `n` is greater than 1.
     * @return choices
     */
    public List<@Valid CreateChatCompletionResponseChoicesInner> getChoices() {
        return choices;
    }

    public void setChoices(List<@Valid CreateChatCompletionResponseChoicesInner> choices) {
        this.choices = choices;
    }

    /**
     * The Unix timestamp (in seconds) of when the chat completion was created.
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * The model used for the chat completion.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
     * @return serviceTier
     */
    public ServiceTierEnum getServiceTier() {
        return serviceTier;
    }

    public void setServiceTier(ServiceTierEnum serviceTier) {
        this.serviceTier = serviceTier;
    }

    /**
     * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
     * @return systemFingerprint
     */
    public String getSystemFingerprint() {
        return systemFingerprint;
    }

    public void setSystemFingerprint(String systemFingerprint) {
        this.systemFingerprint = systemFingerprint;
    }

    /**
     * The object type, which is always `chat.completion`.
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * Get usage
     * @return usage
     */
    public CompletionUsage getUsage() {
        return usage;
    }

    public void setUsage(CompletionUsage usage) {
        this.usage = usage;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    serviceTier: ").append(toIndentedString(serviceTier)).append("\n");
        sb.append("    systemFingerprint: ").append(toIndentedString(systemFingerprint)).append("\n");
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

