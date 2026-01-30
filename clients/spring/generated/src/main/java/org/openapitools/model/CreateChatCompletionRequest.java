package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionRequestMessage;
import org.openapitools.model.ChatCompletionStreamOptions;
import org.openapitools.model.ChatCompletionTool;
import org.openapitools.model.ChatCompletionToolChoiceOption;
import org.openapitools.model.CreateChatCompletionRequestAudio;
import org.openapitools.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.model.CreateChatCompletionRequestModel;
import org.openapitools.model.CreateChatCompletionRequestResponseFormat;
import org.openapitools.model.CreateChatCompletionRequestStop;
import org.openapitools.model.PredictionContent;
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
 * CreateChatCompletionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-29T14:17:25.623752677Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionRequest {

  @Valid
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  private CreateChatCompletionRequestModel model;

  private JsonNullable<Boolean> store = JsonNullable.<Boolean>undefined();

  /**
   * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
   */
  public enum ReasoningEffortEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private final String value;

    ReasoningEffortEnum(String value) {
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
    public static ReasoningEffortEnum fromValue(String value) {
      for (ReasoningEffortEnum b : ReasoningEffortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ReasoningEffortEnum reasoningEffort = ReasoningEffortEnum.MEDIUM;

  @Valid
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  private JsonNullable<@DecimalMin(value = "-2") @DecimalMax(value = "2") BigDecimal> frequencyPenalty = JsonNullable.<BigDecimal>undefined();

  @Valid
  private JsonNullable<Map<String, Integer>> logitBias = JsonNullable.<Map<String, Integer>>undefined();

  private JsonNullable<Boolean> logprobs = JsonNullable.<Boolean>undefined();

  private JsonNullable<@Min(value = 0) @Max(value = 20) Integer> topLogprobs = JsonNullable.<Integer>undefined();

  @Deprecated
  private JsonNullable<Integer> maxTokens = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxCompletionTokens = JsonNullable.<Integer>undefined();

  private JsonNullable<@Min(value = 1) @Max(value = 128) Integer> n = JsonNullable.<Integer>undefined();

  /**
   * Gets or Sets modalities
   */
  public enum ModalitiesEnum {
    TEXT("text"),
    
    AUDIO("audio");

    private final String value;

    ModalitiesEnum(String value) {
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
    public static ModalitiesEnum fromValue(String value) {
      for (ModalitiesEnum b : ModalitiesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private JsonNullable<List<ModalitiesEnum>> modalities = JsonNullable.<List<ModalitiesEnum>>undefined();

  private JsonNullable<PredictionContent> prediction = JsonNullable.<PredictionContent>undefined();

  private JsonNullable<CreateChatCompletionRequestAudio> audio = JsonNullable.<CreateChatCompletionRequestAudio>undefined();

  private JsonNullable<@DecimalMin(value = "-2") @DecimalMax(value = "2") BigDecimal> presencePenalty = JsonNullable.<BigDecimal>undefined();

  private @Nullable CreateChatCompletionRequestResponseFormat responseFormat;

  private JsonNullable<@Min(value = -9223372036854776000) @Max(value = 9223372036854776000) Integer> seed = JsonNullable.<Integer>undefined();

  /**
   * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
   */
  public enum ServiceTierEnum {
    AUTO("auto"),
    
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

  private CreateChatCompletionRequestStop stop = null;

  private JsonNullable<Boolean> stream = JsonNullable.<Boolean>undefined();

  private JsonNullable<ChatCompletionStreamOptions> streamOptions = JsonNullable.<ChatCompletionStreamOptions>undefined();

  private JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "2") BigDecimal> temperature = JsonNullable.<BigDecimal>undefined();

  private JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "1") BigDecimal> topP = JsonNullable.<BigDecimal>undefined();

  @Valid
  private List<@Valid ChatCompletionTool> tools = new ArrayList<>();

  private @Nullable ChatCompletionToolChoiceOption toolChoice;

  private Boolean parallelToolCalls = true;

  private @Nullable String user;

  @Deprecated
  private @Nullable CreateChatCompletionRequestFunctionCall functionCall;

  @Deprecated
  @Valid
  private List<@Valid ChatCompletionFunctions> functions = new ArrayList<>();

  public CreateChatCompletionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateChatCompletionRequest(List<ChatCompletionRequestMessage> messages, CreateChatCompletionRequestModel model) {
    this.messages = messages;
    this.model = model;
  }

  public CreateChatCompletionRequest messages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }

  /**
   * A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). 
   * @return messages
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "messages", description = "A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("messages")
  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }

  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
   */
  @NotNull @Valid 
  @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("model")
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }

  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  public CreateChatCompletionRequest store(Boolean store) {
    this.store = JsonNullable.of(store);
    return this;
  }

  /**
   * Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
   * @return store
   */
  
  @Schema(name = "store", description = "Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("store")
  public JsonNullable<Boolean> getStore() {
    return store;
  }

  public void setStore(JsonNullable<Boolean> store) {
    this.store = store;
  }

  public CreateChatCompletionRequest reasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
    return this;
  }

  /**
   * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
   * @return reasoningEffort
   */
  
  @Schema(name = "reasoning_effort", description = "**o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reasoning_effort")
  public ReasoningEffortEnum getReasoningEffort() {
    return reasoningEffort;
  }

  public void setReasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

  public CreateChatCompletionRequest metadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.of(metadata);
    return this;
  }

  public CreateChatCompletionRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.of(new HashMap<>());
    }
    this.metadata.get().put(key, metadataItem);
    return this;
  }

  /**
   * Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
   * @return metadata
   */
  
  @Schema(name = "metadata", description = "Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public JsonNullable<Map<String, String>> getMetadata() {
    return metadata;
  }

  public void setMetadata(JsonNullable<Map<String, String>> metadata) {
    this.metadata = metadata;
  }

  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = JsonNullable.of(frequencyPenalty);
    return this;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
   */
  @Valid @DecimalMin(value = "-2") @DecimalMax(value = "2") 
  @Schema(name = "frequency_penalty", description = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency_penalty")
  public JsonNullable<@DecimalMin(value = "-2") @DecimalMax(value = "2") BigDecimal> getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(JsonNullable<BigDecimal> frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    this.logitBias = JsonNullable.of(logitBias);
    return this;
  }

  public CreateChatCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    if (this.logitBias == null || !this.logitBias.isPresent()) {
      this.logitBias = JsonNullable.of(new HashMap<>());
    }
    this.logitBias.get().put(key, logitBiasItem);
    return this;
  }

  /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   * @return logitBias
   */
  
  @Schema(name = "logit_bias", description = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logit_bias")
  public JsonNullable<Map<String, Integer>> getLogitBias() {
    return logitBias;
  }

  public void setLogitBias(JsonNullable<Map<String, Integer>> logitBias) {
    this.logitBias = logitBias;
  }

  public CreateChatCompletionRequest logprobs(Boolean logprobs) {
    this.logprobs = JsonNullable.of(logprobs);
    return this;
  }

  /**
   * Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. 
   * @return logprobs
   */
  
  @Schema(name = "logprobs", description = "Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logprobs")
  public JsonNullable<Boolean> getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(JsonNullable<Boolean> logprobs) {
    this.logprobs = logprobs;
  }

  public CreateChatCompletionRequest topLogprobs(Integer topLogprobs) {
    this.topLogprobs = JsonNullable.of(topLogprobs);
    return this;
  }

  /**
   * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. 
   * minimum: 0
   * maximum: 20
   * @return topLogprobs
   */
  @Min(value = 0) @Max(value = 20) 
  @Schema(name = "top_logprobs", description = "An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_logprobs")
  public JsonNullable<@Min(value = 0) @Max(value = 20) Integer> getTopLogprobs() {
    return topLogprobs;
  }

  public void setTopLogprobs(JsonNullable<Integer> topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = JsonNullable.of(maxTokens);
    return this;
  }

  /**
   * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). 
   * @return maxTokens
   * @deprecated
   */
  
  @Schema(name = "max_tokens", description = "The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_tokens")
  @Deprecated
  public JsonNullable<Integer> getMaxTokens() {
    return maxTokens;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setMaxTokens(JsonNullable<Integer> maxTokens) {
    this.maxTokens = maxTokens;
  }

  public CreateChatCompletionRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = JsonNullable.of(maxCompletionTokens);
    return this;
  }

  /**
   * An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
   * @return maxCompletionTokens
   */
  
  @Schema(name = "max_completion_tokens", description = "An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_completion_tokens")
  public JsonNullable<Integer> getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(JsonNullable<Integer> maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public CreateChatCompletionRequest n(Integer n) {
    this.n = JsonNullable.of(n);
    return this;
  }

  /**
   * How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
   * minimum: 1
   * maximum: 128
   * @return n
   */
  @Min(value = 1) @Max(value = 128) 
  @Schema(name = "n", example = "1", description = "How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("n")
  public JsonNullable<@Min(value = 1) @Max(value = 128) Integer> getN() {
    return n;
  }

  public void setN(JsonNullable<Integer> n) {
    this.n = n;
  }

  public CreateChatCompletionRequest modalities(List<ModalitiesEnum> modalities) {
    this.modalities = JsonNullable.of(modalities);
    return this;
  }

  public CreateChatCompletionRequest addModalitiesItem(ModalitiesEnum modalitiesItem) {
    if (this.modalities == null || !this.modalities.isPresent()) {
      this.modalities = JsonNullable.of(new ArrayList<>());
    }
    this.modalities.get().add(modalitiesItem);
    return this;
  }

  /**
   * Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` 
   * @return modalities
   */
  
  @Schema(name = "modalities", description = "Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modalities")
  public JsonNullable<List<ModalitiesEnum>> getModalities() {
    return modalities;
  }

  public void setModalities(JsonNullable<List<ModalitiesEnum>> modalities) {
    this.modalities = modalities;
  }

  public CreateChatCompletionRequest prediction(PredictionContent prediction) {
    this.prediction = JsonNullable.of(prediction);
    return this;
  }

  /**
   * Get prediction
   * @return prediction
   */
  @Valid 
  @Schema(name = "prediction", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prediction")
  public JsonNullable<PredictionContent> getPrediction() {
    return prediction;
  }

  public void setPrediction(JsonNullable<PredictionContent> prediction) {
    this.prediction = prediction;
  }

  public CreateChatCompletionRequest audio(CreateChatCompletionRequestAudio audio) {
    this.audio = JsonNullable.of(audio);
    return this;
  }

  /**
   * Get audio
   * @return audio
   */
  @Valid 
  @Schema(name = "audio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audio")
  public JsonNullable<CreateChatCompletionRequestAudio> getAudio() {
    return audio;
  }

  public void setAudio(JsonNullable<CreateChatCompletionRequestAudio> audio) {
    this.audio = audio;
  }

  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = JsonNullable.of(presencePenalty);
    return this;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
   */
  @Valid @DecimalMin(value = "-2") @DecimalMax(value = "2") 
  @Schema(name = "presence_penalty", description = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("presence_penalty")
  public JsonNullable<@DecimalMin(value = "-2") @DecimalMax(value = "2") BigDecimal> getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(JsonNullable<BigDecimal> presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public CreateChatCompletionRequest responseFormat(@Nullable CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  /**
   * Get responseFormat
   * @return responseFormat
   */
  @Valid 
  @Schema(name = "response_format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response_format")
  public @Nullable CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(@Nullable CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateChatCompletionRequest seed(Integer seed) {
    this.seed = JsonNullable.of(seed);
    return this;
  }

  /**
   * This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
   * minimum: -9223372036854776000
   * maximum: 9223372036854776000
   * @return seed
   */
  @Min(value = -9223372036854776000) @Max(value = 9223372036854776000) 
  @Schema(name = "seed", description = "This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seed")
  public JsonNullable<@Min(value = -9223372036854776000) @Max(value = 9223372036854776000) Integer> getSeed() {
    return seed;
  }

  public void setSeed(JsonNullable<Integer> seed) {
    this.seed = seed;
  }

  public CreateChatCompletionRequest serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = JsonNullable.of(serviceTier);
    return this;
  }

  /**
   * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
   * @return serviceTier
   */
  
  @Schema(name = "service_tier", description = "Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_tier")
  public JsonNullable<ServiceTierEnum> getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(JsonNullable<ServiceTierEnum> serviceTier) {
    this.serviceTier = serviceTier;
  }

  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

  /**
   * Get stop
   * @return stop
   */
  @Valid 
  @Schema(name = "stop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }

  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = JsonNullable.of(stream);
    return this;
  }

  /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
   * @return stream
   */
  
  @Schema(name = "stream", description = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stream")
  public JsonNullable<Boolean> getStream() {
    return stream;
  }

  public void setStream(JsonNullable<Boolean> stream) {
    this.stream = stream;
  }

  public CreateChatCompletionRequest streamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = JsonNullable.of(streamOptions);
    return this;
  }

  /**
   * Get streamOptions
   * @return streamOptions
   */
  @Valid 
  @Schema(name = "stream_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stream_options")
  public JsonNullable<ChatCompletionStreamOptions> getStreamOptions() {
    return streamOptions;
  }

  public void setStreamOptions(JsonNullable<ChatCompletionStreamOptions> streamOptions) {
    this.streamOptions = streamOptions;
  }

  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = JsonNullable.of(temperature);
    return this;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
   */
  @Valid @DecimalMin(value = "0") @DecimalMax(value = "2") 
  @Schema(name = "temperature", example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temperature")
  public JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "2") BigDecimal> getTemperature() {
    return temperature;
  }

  public void setTemperature(JsonNullable<BigDecimal> temperature) {
    this.temperature = temperature;
  }

  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = JsonNullable.of(topP);
    return this;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
   */
  @Valid @DecimalMin(value = "0") @DecimalMax(value = "1") 
  @Schema(name = "top_p", example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("top_p")
  public JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "1") BigDecimal> getTopP() {
    return topP;
  }

  public void setTopP(JsonNullable<BigDecimal> topP) {
    this.topP = topP;
  }

  public CreateChatCompletionRequest tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  public CreateChatCompletionRequest addToolsItem(ChatCompletionTool toolsItem) {
    if (this.tools == null) {
      this.tools = new ArrayList<>();
    }
    this.tools.add(toolsItem);
    return this;
  }

  /**
   * A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
   * @return tools
   */
  @Valid 
  @Schema(name = "tools", description = "A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tools")
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public CreateChatCompletionRequest toolChoice(@Nullable ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  /**
   * Get toolChoice
   * @return toolChoice
   */
  @Valid 
  @Schema(name = "tool_choice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_choice")
  public @Nullable ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(@Nullable ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public CreateChatCompletionRequest parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
   */
  
  @Schema(name = "parallel_tool_calls", description = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  public CreateChatCompletionRequest user(@Nullable String user) {
    this.user = user;
    return this;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
   * @return user
   */
  
  @Schema(name = "user", example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public @Nullable String getUser() {
    return user;
  }

  public void setUser(@Nullable String user) {
    this.user = user;
  }

  public CreateChatCompletionRequest functionCall(@Nullable CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  /**
   * Get functionCall
   * @return functionCall
   * @deprecated
   */
  @Valid 
  @Schema(name = "function_call", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function_call")
  @Deprecated
  public @Nullable CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setFunctionCall(@Nullable CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  public CreateChatCompletionRequest functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

  /**
   * Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
   * @return functions
   * @deprecated
   */
  @Valid @Size(min = 1, max = 128) 
  @Schema(name = "functions", description = "Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. ", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions")
  @Deprecated
  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  /**
   * @deprecated
   */
  @Deprecated
  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateChatCompletionRequest createChatCompletionRequest = (CreateChatCompletionRequest) o;
    return Objects.equals(this.messages, createChatCompletionRequest.messages) &&
        Objects.equals(this.model, createChatCompletionRequest.model) &&
        equalsNullable(this.store, createChatCompletionRequest.store) &&
        Objects.equals(this.reasoningEffort, createChatCompletionRequest.reasoningEffort) &&
        equalsNullable(this.metadata, createChatCompletionRequest.metadata) &&
        equalsNullable(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        equalsNullable(this.logitBias, createChatCompletionRequest.logitBias) &&
        equalsNullable(this.logprobs, createChatCompletionRequest.logprobs) &&
        equalsNullable(this.topLogprobs, createChatCompletionRequest.topLogprobs) &&
        equalsNullable(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        equalsNullable(this.maxCompletionTokens, createChatCompletionRequest.maxCompletionTokens) &&
        equalsNullable(this.n, createChatCompletionRequest.n) &&
        equalsNullable(this.modalities, createChatCompletionRequest.modalities) &&
        equalsNullable(this.prediction, createChatCompletionRequest.prediction) &&
        equalsNullable(this.audio, createChatCompletionRequest.audio) &&
        equalsNullable(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(this.responseFormat, createChatCompletionRequest.responseFormat) &&
        equalsNullable(this.seed, createChatCompletionRequest.seed) &&
        equalsNullable(this.serviceTier, createChatCompletionRequest.serviceTier) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        equalsNullable(this.stream, createChatCompletionRequest.stream) &&
        equalsNullable(this.streamOptions, createChatCompletionRequest.streamOptions) &&
        equalsNullable(this.temperature, createChatCompletionRequest.temperature) &&
        equalsNullable(this.topP, createChatCompletionRequest.topP) &&
        Objects.equals(this.tools, createChatCompletionRequest.tools) &&
        Objects.equals(this.toolChoice, createChatCompletionRequest.toolChoice) &&
        Objects.equals(this.parallelToolCalls, createChatCompletionRequest.parallelToolCalls) &&
        Objects.equals(this.user, createChatCompletionRequest.user) &&
        Objects.equals(this.functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(this.functions, createChatCompletionRequest.functions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, model, hashCodeNullable(store), reasoningEffort, hashCodeNullable(metadata), hashCodeNullable(frequencyPenalty), hashCodeNullable(logitBias), hashCodeNullable(logprobs), hashCodeNullable(topLogprobs), hashCodeNullable(maxTokens), hashCodeNullable(maxCompletionTokens), hashCodeNullable(n), hashCodeNullable(modalities), hashCodeNullable(prediction), hashCodeNullable(audio), hashCodeNullable(presencePenalty), responseFormat, hashCodeNullable(seed), hashCodeNullable(serviceTier), stop, hashCodeNullable(stream), hashCodeNullable(streamOptions), hashCodeNullable(temperature), hashCodeNullable(topP), tools, toolChoice, parallelToolCalls, user, functionCall, functions);
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
    sb.append("class CreateChatCompletionRequest {\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    reasoningEffort: ").append(toIndentedString(reasoningEffort)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    maxCompletionTokens: ").append(toIndentedString(maxCompletionTokens)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    prediction: ").append(toIndentedString(prediction)).append("\n");
    sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    serviceTier: ").append(toIndentedString(serviceTier)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    streamOptions: ").append(toIndentedString(streamOptions)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
    sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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

