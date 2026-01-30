package apimodels;

import apimodels.CreateChatCompletionStreamResponseChoicesInner;
import apimodels.CreateChatCompletionStreamResponseUsage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionStreamResponse   {
  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("choices")
  @NotNull
@Valid

  private List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  @JsonProperty("created")
  @NotNull

  private Integer created;

  @JsonProperty("model")
  @NotNull

  private String model;

  /**
   * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
   */
  public enum ServiceTierEnum {
    SCALE("scale"),
    
    DEFAULT("default");

    private final String value;

    ServiceTierEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceTierEnum fromValue(String value) {
      for (ServiceTierEnum b : ServiceTierEnum.values()) {
        if (b.value.equals(value)) {
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

    private final String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("object")
  @NotNull

  private ObjectEnum _object;

  @JsonProperty("usage")
  @Valid

  private CreateChatCompletionStreamResponseUsage usage;

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * A unique identifier for the chat completion. Each chunk has the same ID.
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateChatCompletionStreamResponse choices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
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
  **/
  public List<@Valid CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }

  public void setChoices(List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }

  public CreateChatCompletionStreamResponse created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
   * @return created
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(id, createChatCompletionStreamResponse.id) &&
        Objects.equals(choices, createChatCompletionStreamResponse.choices) &&
        Objects.equals(created, createChatCompletionStreamResponse.created) &&
        Objects.equals(model, createChatCompletionStreamResponse.model) &&
        Objects.equals(serviceTier, createChatCompletionStreamResponse.serviceTier) &&
        Objects.equals(systemFingerprint, createChatCompletionStreamResponse.systemFingerprint) &&
        Objects.equals(_object, createChatCompletionStreamResponse._object) &&
        Objects.equals(usage, createChatCompletionStreamResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, serviceTier, systemFingerprint, _object, usage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

