package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateChatCompletionStreamResponseChoicesInner;
import org.openapitools.vertxweb.server.model.CreateChatCompletionStreamResponseUsage;

/**
 * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionStreamResponse   {
  
  private String id;
  private List<CreateChatCompletionStreamResponseChoicesInner> choices = new ArrayList<>();
  private Integer created;
  private String model;


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
      return value;
    }
  }

  private ServiceTierEnum serviceTier;
  private String systemFingerprint;


  public enum ObjectEnum {
    CHAT_COMPLETION_CHUNK("chat.completion.chunk");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ObjectEnum _object;
  private CreateChatCompletionStreamResponseUsage usage;

  public CreateChatCompletionStreamResponse () {

  }

  public CreateChatCompletionStreamResponse (String id, List<CreateChatCompletionStreamResponseChoicesInner> choices, Integer created, String model, ServiceTierEnum serviceTier, String systemFingerprint, ObjectEnum _object, CreateChatCompletionStreamResponseUsage usage) {
    this.id = id;
    this.choices = choices;
    this.created = created;
    this.model = model;
    this.serviceTier = serviceTier;
    this.systemFingerprint = systemFingerprint;
    this._object = _object;
    this.usage = usage;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("choices")
  public List<CreateChatCompletionStreamResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateChatCompletionStreamResponseChoicesInner> choices) {
    this.choices = choices;
  }

    
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

    
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

    
  @JsonProperty("service_tier")
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }
  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

    
  @JsonProperty("system_fingerprint")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }
  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

    
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

    
  @JsonProperty("usage")
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
