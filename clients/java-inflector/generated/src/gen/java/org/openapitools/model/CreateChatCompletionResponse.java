package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CompletionUsage;
import org.openapitools.model.CreateChatCompletionResponseChoicesInner;



/**
 * Represents a chat completion response returned by model, based on the provided input.
 **/

@ApiModel(description = "Represents a chat completion response returned by model, based on the provided input.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionResponse   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("choices")
  private List<CreateChatCompletionResponseChoicesInner> choices = new ArrayList<>();

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
   * The object type, which is always `chat.completion`.
   */
  public enum ObjectEnum {
    CHAT_COMPLETION("chat.completion");

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
  private CompletionUsage usage;

  /**
   * A unique identifier for the chat completion.
   **/
  public CreateChatCompletionResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A unique identifier for the chat completion.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * A list of chat completion choices. Can be more than one if `n` is greater than 1.
   **/
  public CreateChatCompletionResponse choices(List<CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of chat completion choices. Can be more than one if `n` is greater than 1.")
  @JsonProperty("choices")
  public List<CreateChatCompletionResponseChoicesInner> getChoices() {
    return choices;
  }
  public void setChoices(List<CreateChatCompletionResponseChoicesInner> choices) {
    this.choices = choices;
  }

  /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   **/
  public CreateChatCompletionResponse created(Integer created) {
    this.created = created;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The Unix timestamp (in seconds) of when the chat completion was created.")
  @JsonProperty("created")
  public Integer getCreated() {
    return created;
  }
  public void setCreated(Integer created) {
    this.created = created;
  }

  /**
   * The model used for the chat completion.
   **/
  public CreateChatCompletionResponse model(String model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The model used for the chat completion.")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
   **/
  public CreateChatCompletionResponse serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

  
  @ApiModelProperty(example = "scale", value = "The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.")
  @JsonProperty("service_tier")
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }
  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
   **/
  public CreateChatCompletionResponse systemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
    return this;
  }

  
  @ApiModelProperty(value = "This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. ")
  @JsonProperty("system_fingerprint")
  public String getSystemFingerprint() {
    return systemFingerprint;
  }
  public void setSystemFingerprint(String systemFingerprint) {
    this.systemFingerprint = systemFingerprint;
  }

  /**
   * The object type, which is always `chat.completion`.
   **/
  public CreateChatCompletionResponse _object(ObjectEnum _object) {
    this._object = _object;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The object type, which is always `chat.completion`.")
  @JsonProperty("object")
  public ObjectEnum getObject() {
    return _object;
  }
  public void setObject(ObjectEnum _object) {
    this._object = _object;
  }

  /**
   **/
  public CreateChatCompletionResponse usage(CompletionUsage usage) {
    this.usage = usage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("usage")
  public CompletionUsage getUsage() {
    return usage;
  }
  public void setUsage(CompletionUsage usage) {
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
    CreateChatCompletionResponse createChatCompletionResponse = (CreateChatCompletionResponse) o;
    return Objects.equals(id, createChatCompletionResponse.id) &&
        Objects.equals(choices, createChatCompletionResponse.choices) &&
        Objects.equals(created, createChatCompletionResponse.created) &&
        Objects.equals(model, createChatCompletionResponse.model) &&
        Objects.equals(serviceTier, createChatCompletionResponse.serviceTier) &&
        Objects.equals(systemFingerprint, createChatCompletionResponse.systemFingerprint) &&
        Objects.equals(_object, createChatCompletionResponse._object) &&
        Objects.equals(usage, createChatCompletionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, choices, created, model, serviceTier, systemFingerprint, _object, usage);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

