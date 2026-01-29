package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateChatCompletionFunctionResponseChoicesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
@ApiModel(description="Represents a chat completion response returned by model, based on the provided input.")

public class CreateChatCompletionFunctionResponse  {
  
 /**
  * A unique identifier for the chat completion.
  */
  @ApiModelProperty(required = true, value = "A unique identifier for the chat completion.")
  private String id;

 /**
  * A list of chat completion choices. Can be more than one if `n` is greater than 1.
  */
  @ApiModelProperty(required = true, value = "A list of chat completion choices. Can be more than one if `n` is greater than 1.")
  @Valid
  private List<@Valid CreateChatCompletionFunctionResponseChoicesInner> choices = new ArrayList<>();

 /**
  * The Unix timestamp (in seconds) of when the chat completion was created.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the chat completion was created.")
  private Integer created;

 /**
  * The model used for the chat completion.
  */
  @ApiModelProperty(required = true, value = "The model used for the chat completion.")
  private String model;

 /**
  * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  */
  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  private String systemFingerprint;

public enum ObjectEnum {

    @JsonProperty("chat.completion") CHAT_COMPLETION(String.valueOf("chat.completion"));

    private String value;

    ObjectEnum (String v) {
        value = v;
    }

    public String value() {
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
}

 /**
  * The object type, which is always `chat.completion`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `chat.completion`.")
  private ObjectEnum _object;

  @ApiModelProperty(value = "")
  @Valid
  private CompletionUsage usage;
 /**
  * A unique identifier for the chat completion.
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public CreateChatCompletionFunctionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
  * @return choices
  */
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateChatCompletionFunctionResponseChoicesInner> getChoices() {
    return choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
 public void setChoices(List<@Valid CreateChatCompletionFunctionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
  public CreateChatCompletionFunctionResponse choices(List<@Valid CreateChatCompletionFunctionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  /**
   * Adds a new item to the <code>choices</code> list.
   */
  public CreateChatCompletionFunctionResponse addChoicesItem(CreateChatCompletionFunctionResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of when the chat completion was created.
  * @return created
  */
  @JsonProperty("created")
  @NotNull
  public Integer getCreated() {
    return created;
  }

  /**
   * Sets the <code>created</code> property.
   */
 public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * Sets the <code>created</code> property.
   */
  public CreateChatCompletionFunctionResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
  * The model used for the chat completion.
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public String getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(String model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateChatCompletionFunctionResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
  * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
  * @return systemFingerprint
  */
  @JsonProperty("system_fingerprint")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  /**
   * Sets the <code>systemFingerprint</code> property.
   */
 public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  /**
   * Sets the <code>systemFingerprint</code> property.
   */
  public CreateChatCompletionFunctionResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

 /**
  * The object type, which is always &#x60;chat.completion&#x60;.
  * @return _object
  */
  @JsonProperty("object")
  @NotNull
  public String getObject() {
    return _object == null ? null : _object.value();
  }

  /**
   * Sets the <code>_object</code> property.
   */
 public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   * Sets the <code>_object</code> property.
   */
  public CreateChatCompletionFunctionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  public CompletionUsage getUsage() {
    return usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
 public void setUsage(CompletionUsage usage) {
    this.usage = usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
  public CreateChatCompletionFunctionResponse usage(CompletionUsage usage) {
    this.usage = usage;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionFunctionResponse createChatCompletionFunctionResponse = (CreateChatCompletionFunctionResponse) o;
    return Objects.equals(this.id, createChatCompletionFunctionResponse.id) &&
        Objects.equals(this.choices, createChatCompletionFunctionResponse.choices) &&
        Objects.equals(this.created, createChatCompletionFunctionResponse.created) &&
        Objects.equals(this.model, createChatCompletionFunctionResponse.model) &&
        Objects.equals(this.systemFingerprint, createChatCompletionFunctionResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionFunctionResponse._object) &&
        Objects.equals(this.usage, createChatCompletionFunctionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionFunctionResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

