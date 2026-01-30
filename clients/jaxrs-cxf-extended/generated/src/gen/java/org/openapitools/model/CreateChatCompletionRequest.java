package org.openapitools.model;

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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateChatCompletionRequest  {
  
 /**
  * A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). 
  */
  @ApiModelProperty(required = true, value = "A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). ")
  @Valid
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  @ApiModelProperty(required = true, value = "")
  @Valid
  private CreateChatCompletionRequestModel model;

 /**
  * Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
  */
  @ApiModelProperty(value = "Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. ")
  private Boolean store = false;

public enum ReasoningEffortEnum {

    @JsonProperty("low") LOW(String.valueOf("low")),
    @JsonProperty("medium") MEDIUM(String.valueOf("medium")),
    @JsonProperty("high") HIGH(String.valueOf("high"));

    private String value;

    ReasoningEffortEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReasoningEffortEnum fromValue(String value) {
        for (ReasoningEffortEnum b : ReasoningEffortEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
  */
  @ApiModelProperty(value = "**o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. ")
  private ReasoningEffortEnum reasoningEffort = ReasoningEffortEnum.MEDIUM;

 /**
  * Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
  */
  @ApiModelProperty(value = "Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). ")
  private Map<String, String> metadata;

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. 
  */
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. ")
  @Valid
  private BigDecimal frequencyPenalty = new BigDecimal("0");

 /**
  * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  */
  @ApiModelProperty(value = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ")
  private Map<String, Integer> logitBias;

 /**
  * Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. 
  */
  @ApiModelProperty(value = "Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. ")
  private Boolean logprobs = false;

 /**
  * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. 
  */
  @ApiModelProperty(value = "An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. ")
  private Integer topLogprobs;

 /**
  * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). 
  */
  @ApiModelProperty(value = "The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). ")
  private Integer maxTokens;

 /**
  * An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
  */
  @ApiModelProperty(value = "An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). ")
  private Integer maxCompletionTokens;

 /**
  * How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
  */
  @ApiModelProperty(example = "1", value = "How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.")
  private Integer n = 1;

public enum ModalitiesEnum {

    @JsonProperty("text") TEXT(String.valueOf("text")),
    @JsonProperty("audio") AUDIO(String.valueOf("audio"));

    private String value;

    ModalitiesEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ModalitiesEnum fromValue(String value) {
        for (ModalitiesEnum b : ModalitiesEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` 
  */
  @ApiModelProperty(value = "Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` ")
  private List<ModalitiesEnum> modalities;

  @ApiModelProperty(value = "")
  @Valid
  private PredictionContent prediction;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionRequestAudio audio;

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. 
  */
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. ")
  @Valid
  private BigDecimal presencePenalty = new BigDecimal("0");

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionRequestResponseFormat responseFormat;

 /**
  * This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
  */
  @ApiModelProperty(value = "This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. ")
  private Integer seed;

public enum ServiceTierEnum {

    @JsonProperty("auto") AUTO(String.valueOf("auto")),
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
  * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
  */
  @ApiModelProperty(value = "Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. ")
  private ServiceTierEnum serviceTier = ServiceTierEnum.AUTO;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionRequestStop stop = null;

 /**
  * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
  */
  @ApiModelProperty(value = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). ")
  private Boolean stream = false;

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionStreamOptions streamOptions;

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. 
  */
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. ")
  @Valid
  private BigDecimal temperature = new BigDecimal("1");

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  */
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @Valid
  private BigDecimal topP = new BigDecimal("1");

 /**
  * A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
  */
  @ApiModelProperty(value = "A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. ")
  @Valid
  private List<@Valid ChatCompletionTool> tools = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ChatCompletionToolChoiceOption toolChoice;

 /**
  * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  */
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  private Boolean parallelToolCalls = true;

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  */
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ")
  private String user;

  @ApiModelProperty(value = "")
  @Valid
  private CreateChatCompletionRequestFunctionCall functionCall;

 /**
  * Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
  */
  @ApiModelProperty(value = "Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. ")
  @Valid
  private List<@Valid ChatCompletionFunctions> functions = new ArrayList<>();
 /**
  * A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). 
  * @return messages
  */
  @JsonProperty("messages")
  @NotNull
 @Size(min=1)  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
 public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  /**
   * Sets the <code>messages</code> property.
   */
  public CreateChatCompletionRequest messages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  /**
   * Adds a new item to the <code>messages</code> list.
   */
  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    this.messages.add(messagesItem);
    return this;
  }

 /**
  * Get model
  * @return model
  */
  @JsonProperty("model")
  @NotNull
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }

  /**
   * Sets the <code>model</code> property.
   */
 public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  /**
   * Sets the <code>model</code> property.
   */
  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

 /**
  * Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
  * @return store
  */
  @JsonProperty("store")
  public Boolean getStore() {
    return store;
  }

  /**
   * Sets the <code>store</code> property.
   */
 public void setStore(Boolean store) {
    this.store = store;
  }

  /**
   * Sets the <code>store</code> property.
   */
  public CreateChatCompletionRequest store(Boolean store) {
    this.store = store;
    return this;
  }

 /**
  * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are &#x60;low&#x60;, &#x60;medium&#x60;, and &#x60;high&#x60;. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
  * @return reasoningEffort
  */
  @JsonProperty("reasoning_effort")
  public String getReasoningEffort() {
    return reasoningEffort == null ? null : reasoningEffort.value();
  }

  /**
   * Sets the <code>reasoningEffort</code> property.
   */
 public void setReasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

  /**
   * Sets the <code>reasoningEffort</code> property.
   */
  public CreateChatCompletionRequest reasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
    return this;
  }

 /**
  * Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
  * @return metadata
  */
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
 public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * Sets the <code>metadata</code> property.
   */
  public CreateChatCompletionRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Puts a new item into the <code>metadata</code> map.
   */
  public CreateChatCompletionRequest putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim. 
  * minimum: -2
  * maximum: 2
  * @return frequencyPenalty
  */
  @JsonProperty("frequency_penalty")
 @DecimalMin("-2") @DecimalMax("2")  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }

  /**
   * Sets the <code>frequencyPenalty</code> property.
   */
 public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  /**
   * Sets the <code>frequencyPenalty</code> property.
   */
  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

 /**
  * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  * @return logitBias
  */
  @JsonProperty("logit_bias")
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }

  /**
   * Sets the <code>logitBias</code> property.
   */
 public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }

  /**
   * Sets the <code>logitBias</code> property.
   */
  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
    return this;
  }

  /**
   * Puts a new item into the <code>logitBias</code> map.
   */
  public CreateChatCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    this.logitBias.put(key, logitBiasItem);
    return this;
  }

 /**
  * Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the &#x60;content&#x60; of &#x60;message&#x60;. 
  * @return logprobs
  */
  @JsonProperty("logprobs")
  public Boolean getLogprobs() {
    return logprobs;
  }

  /**
   * Sets the <code>logprobs</code> property.
   */
 public void setLogprobs(Boolean logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * Sets the <code>logprobs</code> property.
   */
  public CreateChatCompletionRequest logprobs(Boolean logprobs) {
    this.logprobs = logprobs;
    return this;
  }

 /**
  * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. &#x60;logprobs&#x60; must be set to &#x60;true&#x60; if this parameter is used. 
  * minimum: 0
  * maximum: 20
  * @return topLogprobs
  */
  @JsonProperty("top_logprobs")
 @Min(0) @Max(20)  public Integer getTopLogprobs() {
    return topLogprobs;
  }

  /**
   * Sets the <code>topLogprobs</code> property.
   */
 public void setTopLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  /**
   * Sets the <code>topLogprobs</code> property.
   */
  public CreateChatCompletionRequest topLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

 /**
  * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of &#x60;max_completion_tokens&#x60;, and is not compatible with [o1 series models](/docs/guides/reasoning). 
  * @return maxTokens
  */
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }

  /**
   * Sets the <code>maxTokens</code> property.
   */
 public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  /**
   * Sets the <code>maxTokens</code> property.
   */
  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

 /**
  * An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
  * @return maxCompletionTokens
  */
  @JsonProperty("max_completion_tokens")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  /**
   * Sets the <code>maxCompletionTokens</code> property.
   */
 public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  /**
   * Sets the <code>maxCompletionTokens</code> property.
   */
  public CreateChatCompletionRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

 /**
  * How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep &#x60;n&#x60; as &#x60;1&#x60; to minimize costs.
  * minimum: 1
  * maximum: 128
  * @return n
  */
  @JsonProperty("n")
 @Min(1) @Max(128)  public Integer getN() {
    return n;
  }

  /**
   * Sets the <code>n</code> property.
   */
 public void setN(Integer n) {
    this.n = n;
  }

  /**
   * Sets the <code>n</code> property.
   */
  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

 /**
  * Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  &#x60;[\&quot;text\&quot;]&#x60;  The &#x60;gpt-4o-audio-preview&#x60; model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  &#x60;[\&quot;text\&quot;, \&quot;audio\&quot;]&#x60; 
  * @return modalities
  */
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  /**
   * Sets the <code>modalities</code> property.
   */
 public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  /**
   * Sets the <code>modalities</code> property.
   */
  public CreateChatCompletionRequest modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  /**
   * Adds a new item to the <code>modalities</code> list.
   */
  public CreateChatCompletionRequest addModalitiesItem(ModalitiesEnum modalitiesItem) {
    this.modalities.add(modalitiesItem);
    return this;
  }

 /**
  * Get prediction
  * @return prediction
  */
  @JsonProperty("prediction")
  public PredictionContent getPrediction() {
    return prediction;
  }

  /**
   * Sets the <code>prediction</code> property.
   */
 public void setPrediction(PredictionContent prediction) {
    this.prediction = prediction;
  }

  /**
   * Sets the <code>prediction</code> property.
   */
  public CreateChatCompletionRequest prediction(PredictionContent prediction) {
    this.prediction = prediction;
    return this;
  }

 /**
  * Get audio
  * @return audio
  */
  @JsonProperty("audio")
  public CreateChatCompletionRequestAudio getAudio() {
    return audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
 public void setAudio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
  }

  /**
   * Sets the <code>audio</code> property.
   */
  public CreateChatCompletionRequest audio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
    return this;
  }

 /**
  * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics. 
  * minimum: -2
  * maximum: 2
  * @return presencePenalty
  */
  @JsonProperty("presence_penalty")
 @DecimalMin("-2") @DecimalMax("2")  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }

  /**
   * Sets the <code>presencePenalty</code> property.
   */
 public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  /**
   * Sets the <code>presencePenalty</code> property.
   */
  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

 /**
  * Get responseFormat
  * @return responseFormat
  */
  @JsonProperty("response_format")
  public CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
 public void setResponseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * Sets the <code>responseFormat</code> property.
   */
  public CreateChatCompletionRequest responseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

 /**
  * This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result. Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. 
  * minimum: -9223372036854776000
  * maximum: 9223372036854776000
  * @return seed
  */
  @JsonProperty("seed")
 @Min(-9223372036854776000) @Max(9223372036854776000)  public Integer getSeed() {
    return seed;
  }

  /**
   * Sets the <code>seed</code> property.
   */
 public void setSeed(Integer seed) {
    this.seed = seed;
  }

  /**
   * Sets the <code>seed</code> property.
   */
  public CreateChatCompletionRequest seed(Integer seed) {
    this.seed = seed;
    return this;
  }

 /**
  * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to &#39;auto&#39;, and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to &#39;auto&#39;, and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to &#39;default&#39;, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is &#39;auto&#39;.    When this parameter is set, the response body will include the &#x60;service_tier&#x60; utilized. 
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
  public CreateChatCompletionRequest serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

 /**
  * Get stop
  * @return stop
  */
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }

  /**
   * Sets the <code>stop</code> property.
   */
 public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  /**
   * Sets the <code>stop</code> property.
   */
  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

 /**
  * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
  * @return stream
  */
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
 public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   * Sets the <code>stream</code> property.
   */
  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

 /**
  * Get streamOptions
  * @return streamOptions
  */
  @JsonProperty("stream_options")
  public ChatCompletionStreamOptions getStreamOptions() {
    return streamOptions;
  }

  /**
   * Sets the <code>streamOptions</code> property.
   */
 public void setStreamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
  }

  /**
   * Sets the <code>streamOptions</code> property.
   */
  public CreateChatCompletionRequest streamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
    return this;
  }

 /**
  * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or &#x60;top_p&#x60; but not both. 
  * minimum: 0
  * maximum: 2
  * @return temperature
  */
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
 public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * Sets the <code>temperature</code> property.
   */
  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
  * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
  * minimum: 0
  * maximum: 1
  * @return topP
  */
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
 public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * Sets the <code>topP</code> property.
   */
  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
  * A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
  * @return tools
  */
  @JsonProperty("tools")
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
 public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  /**
   * Sets the <code>tools</code> property.
   */
  public CreateChatCompletionRequest tools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  /**
   * Adds a new item to the <code>tools</code> list.
   */
  public CreateChatCompletionRequest addToolsItem(ChatCompletionTool toolsItem) {
    this.tools.add(toolsItem);
    return this;
  }

 /**
  * Get toolChoice
  * @return toolChoice
  */
  @JsonProperty("tool_choice")
  public ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  /**
   * Sets the <code>toolChoice</code> property.
   */
 public void setToolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Sets the <code>toolChoice</code> property.
   */
  public CreateChatCompletionRequest toolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

 /**
  * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  * @return parallelToolCalls
  */
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  /**
   * Sets the <code>parallelToolCalls</code> property.
   */
 public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  /**
   * Sets the <code>parallelToolCalls</code> property.
   */
  public CreateChatCompletionRequest parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

 /**
  * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  * @return user
  */
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  /**
   * Sets the <code>user</code> property.
   */
 public void setUser(String user) {
    this.user = user;
  }

  /**
   * Sets the <code>user</code> property.
   */
  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

 /**
  * Get functionCall
  * @return functionCall
  */
  @JsonProperty("function_call")
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
 public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Sets the <code>functionCall</code> property.
   */
  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

 /**
  * Deprecated in favor of &#x60;tools&#x60;.  A list of functions the model may generate JSON inputs for. 
  * @return functions
  */
  @JsonProperty("functions")
 @Size(min=1,max=128)  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

  /**
   * Sets the <code>functions</code> property.
   */
 public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  /**
   * Sets the <code>functions</code> property.
   */
  public CreateChatCompletionRequest functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  /**
   * Adds a new item to the <code>functions</code> list.
   */
  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    this.functions.add(functionsItem);
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
    CreateChatCompletionRequest createChatCompletionRequest = (CreateChatCompletionRequest) o;
    return Objects.equals(this.messages, createChatCompletionRequest.messages) &&
        Objects.equals(this.model, createChatCompletionRequest.model) &&
        Objects.equals(this.store, createChatCompletionRequest.store) &&
        Objects.equals(this.reasoningEffort, createChatCompletionRequest.reasoningEffort) &&
        Objects.equals(this.metadata, createChatCompletionRequest.metadata) &&
        Objects.equals(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(this.logprobs, createChatCompletionRequest.logprobs) &&
        Objects.equals(this.topLogprobs, createChatCompletionRequest.topLogprobs) &&
        Objects.equals(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(this.maxCompletionTokens, createChatCompletionRequest.maxCompletionTokens) &&
        Objects.equals(this.n, createChatCompletionRequest.n) &&
        Objects.equals(this.modalities, createChatCompletionRequest.modalities) &&
        Objects.equals(this.prediction, createChatCompletionRequest.prediction) &&
        Objects.equals(this.audio, createChatCompletionRequest.audio) &&
        Objects.equals(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(this.responseFormat, createChatCompletionRequest.responseFormat) &&
        Objects.equals(this.seed, createChatCompletionRequest.seed) &&
        Objects.equals(this.serviceTier, createChatCompletionRequest.serviceTier) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        Objects.equals(this.stream, createChatCompletionRequest.stream) &&
        Objects.equals(this.streamOptions, createChatCompletionRequest.streamOptions) &&
        Objects.equals(this.temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(this.topP, createChatCompletionRequest.topP) &&
        Objects.equals(this.tools, createChatCompletionRequest.tools) &&
        Objects.equals(this.toolChoice, createChatCompletionRequest.toolChoice) &&
        Objects.equals(this.parallelToolCalls, createChatCompletionRequest.parallelToolCalls) &&
        Objects.equals(this.user, createChatCompletionRequest.user) &&
        Objects.equals(this.functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(this.functions, createChatCompletionRequest.functions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, model, store, reasoningEffort, metadata, frequencyPenalty, logitBias, logprobs, topLogprobs, maxTokens, maxCompletionTokens, n, modalities, prediction, audio, presencePenalty, responseFormat, seed, serviceTier, stop, stream, streamOptions, temperature, topP, tools, toolChoice, parallelToolCalls, user, functionCall, functions);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

