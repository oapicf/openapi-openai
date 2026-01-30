package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CreateChatCompletionStreamResponseChoicesInner;
import com.prokarma.pkmst.model.CreateChatCompletionStreamResponseUsage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */
@ApiModel(description = "Represents a streamed chunk of a chat completion response returned by model, based on the provided input.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-29T14:08:20.194647079Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionStreamResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("choices")
  
  private List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  @JsonProperty("created")
  private Integer created;

  @JsonProperty("model")
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

    @Override
    @JsonValue
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
      return null;
    }
  }

  @JsonProperty("service_tier")
  private ServiceTierEnum serviceTier;

  @JsonProperty("system_fingerprint")
  private String systemFingerprint;

  /**
   * The object type, which is always `chat.completion.chunk`.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION_CHUNK("chat.completion.chunk");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("object")
  private ObjectEnum _object;

  @JsonProperty("usage")
  private CreateChatCompletionStreamResponseUsage usage;

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the chat completion. Each chunk has the same ID.
   * @return id
   */
  @ApiModelProperty(required = true, value = "A unique identifier for the chat completion. Each chunk has the same ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionStreamResponse choices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  public CreateChatCompletionStreamResponse addChoicesItem(CreateChatCompletionStreamResponseChoicesInner choicesItem) {
    if (this.choices == null) {
      this.choices = new ArrayList<>();
    }
    this.choices.add(choicesItem);
    return this;
  }

  /**
   * A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
   * @return choices
   */
  @ApiModelProperty(required = true, value = "A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. ")
  public List<CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
   * @return created
   */
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public CreateChatCompletionStreamResponse model(String model) {
    this.model = model;
    return this;
  }

  /**
   * The model to generate the completion.
   * @return model
   */
  @ApiModelProperty(required = true, value = "The model to generate the completion.")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionStreamResponse serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

  /**
   * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
   * @return serviceTier
   */
  @ApiModelProperty(example = "scale", value = "The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.")
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

  public CreateChatCompletionStreamResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
   */
  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  public CreateChatCompletionStreamResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  /**
   * The object type, which is always `chat.completion.chunk`.
   * @return _object
   */
  @ApiModelProperty(required = true, value = "The object type, which is always `chat.completion.chunk`.")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CreateChatCompletionStreamResponse usage(CreateChatCompletionStreamResponseUsage usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @ApiModelProperty(value = "")
  public CreateChatCompletionStreamResponseUsage getUsage() {
    return usage;
  }

  public void setUsage(CreateChatCompletionStreamResponseUsage usage) {
    this.usage = usage;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

