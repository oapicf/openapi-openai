package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateChatCompletionStreamResponseChoicesInner;
import org.openapitools.model.CreateChatCompletionStreamResponseUsage;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 */

@Schema(name = "CreateChatCompletionStreamResponse", description = "Represents a streamed chunk of a chat completion response returned by model, based on the provided input.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionStreamResponse {

  private String id;

  @Valid
  private List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();

  private Integer created;

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private JsonNullable<ServiceTierEnum> serviceTier = JsonNullable.<ServiceTierEnum>undefined();

  private @Nullable String systemFingerprint;

  /**
   * The object type, which is always `chat.completion.chunk`.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION_CHUNK("chat.completion.chunk");

    private final String value;

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
    public static ObjectEnum fromValue(String value) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ObjectEnum _object;

  private JsonNullable<CreateChatCompletionStreamResponseUsage> usage = JsonNullable.<CreateChatCompletionStreamResponseUsage>undefined();

  public CreateChatCompletionStreamResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionStreamResponse(String id, List<@Valid CreateChatCompletionStreamResponseChoicesInner> choices, Integer created, String model, ObjectEnum _object) {
    this.id = id;
    this.choices = choices;
    this.created = created;
    this.model = model;
    this._object = _object;
  }

  public CreateChatCompletionStreamResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * A unique identifier for the chat completion. Each chunk has the same ID.
   * @return id
   */
  @NotNull 
  @Schema(name = "id", description = "A unique identifier for the chat completion. Each chunk has the same ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
   */
  @NotNull @Valid 
  @Schema(name = "choices", description = "A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("choices")
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
   */
  @NotNull 
  @Schema(name = "created", description = "The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created")
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
  @NotNull 
  @Schema(name = "model", description = "The model to generate the completion.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CreateChatCompletionStreamResponse serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = JsonNullable.of(serviceTier);
    return this;
  }

  /**
   * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
   * @return serviceTier
   */
  
  @Schema(name = "service_tier", example = "scale", description = "The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_tier")
  public JsonNullable<ServiceTierEnum> getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(JsonNullable<ServiceTierEnum> serviceTier) {
    this.serviceTier = serviceTier;
  }

  public CreateChatCompletionStreamResponse systemFingerprint(@Nullable String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
   * @return systemFingerprint
   */
  
  @Schema(name = "system_fingerprint", description = "This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("system_fingerprint")
  public @Nullable String getSystemFingerprint() {
    return systemFingerprint;
  }

  public void setSystemFingerprint(@Nullable String systemFingerprint) {
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
  @NotNull 
  @Schema(name = "object", description = "The object type, which is always `chat.completion.chunk`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }

  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  public CreateChatCompletionStreamResponse usage(CreateChatCompletionStreamResponseUsage usage) {
    this.usage = JsonNullable.of(usage);
    return this;
  }

  /**
   * Get usage
   * @return usage
   */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public JsonNullable<CreateChatCompletionStreamResponseUsage> getUsage() {
    return usage;
  }

  public void setUsage(JsonNullable<CreateChatCompletionStreamResponseUsage> usage) {
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
        equalsNullable(this.serviceTier, createChatCompletionStreamResponse.serviceTier) &&
        Objects.equals(this.systemFingerprint, createChatCompletionStreamResponse.systemFingerprint) &&
        Objects.equals(this._object, createChatCompletionStreamResponse._object) &&
        equalsNullable(this.usage, createChatCompletionStreamResponse.usage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, hashCodeNullable(serviceTier), systemFingerprint, _object, hashCodeNullable(usage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

