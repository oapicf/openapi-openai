package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CompletionUsage;
import org.openapitools.server.model.CreateCompletionResponseChoicesInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
 */
public class CreateCompletionResponse   {

    private String id;
    private List<@Valid CreateCompletionResponseChoicesInner> choices = new ArrayList<>();
    private Integer created;
    private String model;
    private String systemFingerprint;

    /**
    * The object type, which is always \"text_completion\"
    */
    public enum ObjectEnum {
        TEXT_COMPLETION("text_completion");

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
    public CreateCompletionResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateCompletionResponse.
     *
     * @param id A unique identifier for the completion.
     * @param choices The list of completion choices the model generated for the input prompt.
     * @param created The Unix timestamp (in seconds) of when the completion was created.
     * @param model The model used for completion.
     * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
     * @param _object The object type, which is always \&quot;text_completion\&quot;
     * @param usage usage
     */
    public CreateCompletionResponse(
        String id, 
        List<@Valid CreateCompletionResponseChoicesInner> choices, 
        Integer created, 
        String model, 
        String systemFingerprint, 
        ObjectEnum _object, 
        CompletionUsage usage
    ) {
        this.id = id;
        this.choices = choices;
        this.created = created;
        this.model = model;
        this.systemFingerprint = systemFingerprint;
        this._object = _object;
        this.usage = usage;
    }



    /**
     * A unique identifier for the completion.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The list of completion choices the model generated for the input prompt.
     * @return choices
     */
    public List<@Valid CreateCompletionResponseChoicesInner> getChoices() {
        return choices;
    }

    public void setChoices(List<@Valid CreateCompletionResponseChoicesInner> choices) {
        this.choices = choices;
    }

    /**
     * The Unix timestamp (in seconds) of when the completion was created.
     * @return created
     */
    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     * The model used for completion.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
     * The object type, which is always \"text_completion\"
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
        sb.append("class CreateCompletionResponse {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    choices: ").append(toIndentedString(choices)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

