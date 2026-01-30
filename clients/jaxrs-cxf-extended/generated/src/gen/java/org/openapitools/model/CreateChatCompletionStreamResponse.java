package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;
import org.openapitools.model.CreateChatCompletionStreamResponseUsage;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */
@ApiModel(description="Represents a streamed chunk of a chat completion response returned by model, based on the provided input.")

public class CreateChatCompletionStreamResponse  {
  
 /**
  * A unique identifier for the chat completion. Each chunk has the same ID.
  */
  @ApiModelProperty(required = true, value = "A unique identifier for the chat completion. Each chunk has the same ID.")
  private String id;

 /**
  * A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
  */
  @ApiModelProperty(required = true, value = "A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. ")
  @Valid
  private List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

 /**
  * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.")
  private Integer created;

 /**
  * The model to generate the completion.
  */
  @ApiModelProperty(required = true, value = "The model to generate the completion.")
  private String model;

public enum ServiceTierEnum {

    @JsonProperty("scale") SCALE(String.valueOf("scale")),
    @JsonProperty("default") DEFAULT(String.valueOf("default"));

    private String value;

    ServiceTierEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ServiceTierEnum fromValue(String value) {
        for (ServiceTierEnum b : ServiceTierEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}

 /**
  * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  */
  @ApiModelProperty(example = "scale", value = "The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.")
  private ServiceTierEnum serviceTier;

 /**
  * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  */
  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  private String systemFingerprint;

public enum ObjectEnum {

    @JsonProperty("chat.completion.chunk") CHAT_COMPLETION_CHUNK(String.valueOf("chat.completion.chunk"));

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
  * The object type, which is always `chat.completion.chunk`.
  */
  @ApiModelProperty(required = true, value = "The object type, which is always `chat.completion.chunk`.")
  private ObjectEnum _object;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionStreamResponseUsage usage;
 /**
  * A unique identifier for the chat completion. Each chunk has the same ID.
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
  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
  * A list of chat completion choices. Can contain more than one elements if &#x60;n&#x60; is greater than 1. Can also be empty for the last chunk if you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60;. 
  * @return choices
  */
  @JsonProperty("choices")
  @NotNull
  public List<@Valid CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
 public void setChoices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * Sets the <code>choices</code> property.
   */
  public CreateChatCompletionStreamResponse choices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  /**
   * Adds a new item to the <code>choices</code> list.
   */
  public CreateChatCompletionStreamResponse addChoicesItem(CreateChatCompletionStreamResponseChoicesInner choicesItem) {
    this.choices.add(choicesItem);
    return this;
  }

 /**
  * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
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
  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

 /**
  * The model to generate the completion.
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
  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

 /**
  * The service tier used for processing the request. This field is only included if the &#x60;service_tier&#x60; parameter is specified in the request.
  * @return serviceTier
  */
  @JsonProperty("service_tier")
  public String getServiceTier() {
    return serviceTier == null ? null : serviceTier.value();
  }

  /**
   * Sets the <code>serviceTier</code> property.
   */
 public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

  /**
   * Sets the <code>serviceTier</code> property.
   */
  public CreateChatCompletionStreamResponse serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

 /**
  * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the &#x60;seed&#x60; request parameter to understand when backend changes have been made that might impact determinism. 
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
  public CreateChatCompletionStreamResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

 /**
  * The object type, which is always &#x60;chat.completion.chunk&#x60;.
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
  public CreateChatCompletionStreamResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

 /**
  * Get usage
  * @return usage
  */
  @JsonProperty("usage")
  public CreateChatCompletionStreamResponseUsage getUsage() {
    return usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
 public void setUsage(CreateChatCompletionStreamResponseUsage usage) {
    this.usage = usage;
  }

  /**
   * Sets the <code>usage</code> property.
   */
  public CreateChatCompletionStreamResponse usage(CreateChatCompletionStreamResponseUsage usage) {
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
    CreateChatCompletionStreamResponse createChatCompletionStreamResponse = (CreateChatCompletionStreamResponse) o;
    return Objects.equals(this.id, createChatCompletionStreamResponse.id) &&
        Objects.equals(this.choices, createChatCompletionStreamResponse.choices) &&
        Objects.equals(this.created, createChatCompletionStreamResponse.created) &&
        Objects.equals(this.model, createChatCompletionStreamResponse.model) &&
        Objects.equals(this.serviceTier, createChatCompletionStreamResponse.serviceTier) &&
        Objects.equals(this.systemFingerprint, createChatCompletionStreamResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionStreamResponse._object) &&
        Objects.equals(this.usage, createChatCompletionStreamResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, serviceTier, systemFingerprint, _object, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionStreamResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

