package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateChatCompletionResponseChoicesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Represents a chat completion response returned by model, based on the provided input.
 **/
@ApiModel(description="Represents a chat completion response returned by model, based on the provided input.")

public class CreateChatCompletionResponse  {
  
  @ApiModelProperty(required = true, value = "A unique identifier for the chat completion.")
 /**
   * A unique identifier for the chat completion.
  **/
  private String id;

  @ApiModelProperty(required = true, value = "A list of chat completion choices. Can be more than one if `n` is greater than 1.")
 /**
   * A list of chat completion choices. Can be more than one if `n` is greater than 1.
  **/
  private List<CreateChatCompletionResponseChoicesInner> choices = new ArrayList<>();

  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the chat completion was created.")
 /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
  **/
  private Integer created;

  @ApiModelProperty(required = true, value = "The model used for the chat completion.")
 /**
   * The model used for the chat completion.
  **/
  private String model;

  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
 /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  **/
  private String systemFingerprint;

public enum ObjectEnum {

CHAT_COMPLETION(String.valueOf("chat.completion"));


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

  @ApiModelProperty(required = true, value = "The object type, which is always `chat.completion`.")
 /**
   * The object type, which is always `chat.completion`.
  **/
  private ObjectEnum _object;

  @ApiModelProperty(value = "")
  private CompletionUsage usage;
 /**
   * A unique identifier for the chat completion.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * A list of chat completion choices. Can be more than one if &#x60;n&#x60; is greater than 1.
   * @return choices
  **/
  @JsonProperty("choices")
  public List<CreateChatCompletionResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionResponse choices(List<CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionResponse addChoicesItem(CreateChatCompletionResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   * @return created
  **/
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
   * The model used for the chat completion.
   * @return model
  **/
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
  **/
  @JsonProperty("system_fingerprint")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  public CreateChatCompletionResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

 /**
   * The object type, which is always &#x60;chat.completion&#x60;.
   * @return _object
  **/
  @JsonProperty("object")
  public String getObject() {
    if (_object == null) {
      return null;
    }
    return _object.value();
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CreateChatCompletionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
   * Get usage
   * @return usage
  **/
  @JsonProperty("usage")
  public CompletionUsage getUsage() {
    return usage;
  }

  public void setUsage(CompletionUsage usage) {
    this.usage = usage;
  }

  public CreateChatCompletionResponse usage(CompletionUsage usage) {
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
    CreateChatCompletionResponse createChatCompletionResponse = (CreateChatCompletionResponse) o;
    return Objects.equals(this.id, createChatCompletionResponse.id) &&
        Objects.equals(this.choices, createChatCompletionResponse.choices) &&
        Objects.equals(this.created, createChatCompletionResponse.created) &&
        Objects.equals(this.model, createChatCompletionResponse.model) &&
        Objects.equals(this.systemFingerprint, createChatCompletionResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionResponse._object) &&
        Objects.equals(this.usage, createChatCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, systemFingerprint, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionResponse {\n");
    
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

