package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-01-29T14:07:47.634062747Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CreateChatCompletionRequest   {
  @JsonProperty("messages")
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  @JsonProperty("model")
  private CreateChatCompletionRequestModel model;

  @JsonProperty("store")
  private Boolean store = false;

  /**
   * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
   */
  public enum ReasoningEffortEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    ReasoningEffortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ReasoningEffortEnum fromValue(String text) {
      for (ReasoningEffortEnum b : ReasoningEffortEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("reasoning_effort")
  private ReasoningEffortEnum reasoningEffort = ReasoningEffortEnum.MEDIUM;

  @JsonProperty("metadata")
  private Map<String, String> metadata = null;

  @JsonProperty("frequency_penalty")
  private BigDecimal frequencyPenalty = new BigDecimal("0");

  @JsonProperty("logit_bias")
  private Map<String, Integer> logitBias = null;

  @JsonProperty("logprobs")
  private Boolean logprobs = false;

  @JsonProperty("top_logprobs")
  private Integer topLogprobs;

  @JsonProperty("max_tokens")
  private Integer maxTokens;

  @JsonProperty("max_completion_tokens")
  private Integer maxCompletionTokens;

  @JsonProperty("n")
  private Integer n = 1;

  /**
   * Gets or Sets modalities
   */
  public enum ModalitiesEnum {
    TEXT("text"),
    
    AUDIO("audio");

    private String value;

    ModalitiesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModalitiesEnum fromValue(String text) {
      for (ModalitiesEnum b : ModalitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("modalities")
  private List<ModalitiesEnum> modalities = null;

  @JsonProperty("prediction")
  private PredictionContent prediction;

  @JsonProperty("audio")
  private CreateChatCompletionRequestAudio audio;

  @JsonProperty("presence_penalty")
  private BigDecimal presencePenalty = new BigDecimal("0");

  @JsonProperty("response_format")
  private CreateChatCompletionRequestResponseFormat responseFormat;

  @JsonProperty("seed")
  private Integer seed;

  /**
   * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
   */
  public enum ServiceTierEnum {
    AUTO("auto"),
    
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
  private ServiceTierEnum serviceTier = ServiceTierEnum.AUTO;

  @JsonProperty("stop")
  private CreateChatCompletionRequestStop stop = null;

  @JsonProperty("stream")
  private Boolean stream = false;

  @JsonProperty("stream_options")
  private ChatCompletionStreamOptions streamOptions;

  @JsonProperty("temperature")
  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("tools")
  private List<ChatCompletionTool> tools = null;

  @JsonProperty("tool_choice")
  private ChatCompletionToolChoiceOption toolChoice;

  @JsonProperty("parallel_tool_calls")
  private Boolean parallelToolCalls = true;

  @JsonProperty("user")
  private String user;

  @JsonProperty("function_call")
  private CreateChatCompletionRequestFunctionCall functionCall;

  @JsonProperty("functions")
  private List<ChatCompletionFunctions> functions = null;

  /**
   * A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). 
   **/
  public CreateChatCompletionRequest messages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). ")
  @JsonProperty("messages")
  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  /**
   **/
  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }
  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  /**
   * Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
   **/
  public CreateChatCompletionRequest store(Boolean store) {
    this.store = store;
    return this;
  }

  
  @ApiModelProperty(value = "Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. ")
  @JsonProperty("store")
  public Boolean getStore() {
    return store;
  }
  public void setStore(Boolean store) {
    this.store = store;
  }

  /**
   * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
   **/
  public CreateChatCompletionRequest reasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
    return this;
  }

  
  @ApiModelProperty(value = "**o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. ")
  @JsonProperty("reasoning_effort")
  public ReasoningEffortEnum getReasoningEffort() {
    return reasoningEffort;
  }
  public void setReasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

  /**
   * Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
   **/
  public CreateChatCompletionRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  
  @ApiModelProperty(value = "Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). ")
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. 
   * minimum: -2
   * maximum: 2
   **/
  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

  
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. ")
  @JsonProperty("frequency_penalty")
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }
  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   **/
  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
    return this;
  }

  
  @ApiModelProperty(value = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ")
  @JsonProperty("logit_bias")
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }
  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }

  /**
   * Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. 
   **/
  public CreateChatCompletionRequest logprobs(Boolean logprobs) {
    this.logprobs = logprobs;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. ")
  @JsonProperty("logprobs")
  public Boolean getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(Boolean logprobs) {
    this.logprobs = logprobs;
  }

  /**
   * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. 
   * minimum: 0
   * maximum: 20
   **/
  public CreateChatCompletionRequest topLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

  
  @ApiModelProperty(value = "An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. ")
  @JsonProperty("top_logprobs")
  public Integer getTopLogprobs() {
    return topLogprobs;
  }
  public void setTopLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  /**
   * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). 
   **/
  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). ")
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }
  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  /**
   * An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
   **/
  public CreateChatCompletionRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

  
  @ApiModelProperty(value = "An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). ")
  @JsonProperty("max_completion_tokens")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  /**
   * How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
   * minimum: 1
   * maximum: 128
   **/
  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.")
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

  /**
   * Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` 
   **/
  public CreateChatCompletionRequest modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  
  @ApiModelProperty(value = "Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` ")
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }
  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  /**
   **/
  public CreateChatCompletionRequest prediction(PredictionContent prediction) {
    this.prediction = prediction;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("prediction")
  public PredictionContent getPrediction() {
    return prediction;
  }
  public void setPrediction(PredictionContent prediction) {
    this.prediction = prediction;
  }

  /**
   **/
  public CreateChatCompletionRequest audio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audio")
  public CreateChatCompletionRequestAudio getAudio() {
    return audio;
  }
  public void setAudio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
  }

  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. 
   * minimum: -2
   * maximum: 2
   **/
  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

  
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. ")
  @JsonProperty("presence_penalty")
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }
  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  /**
   **/
  public CreateChatCompletionRequest responseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response_format")
  public CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

  /**
   * This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
   * minimum: -9223372036854776000
   * maximum: 9223372036854776000
   **/
  public CreateChatCompletionRequest seed(Integer seed) {
    this.seed = seed;
    return this;
  }

  
  @ApiModelProperty(value = "This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. ")
  @JsonProperty("seed")
  public Integer getSeed() {
    return seed;
  }
  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  /**
   * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
   **/
  public CreateChatCompletionRequest serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

  
  @ApiModelProperty(value = "Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. ")
  @JsonProperty("service_tier")
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }
  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

  /**
   **/
  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }
  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
   **/
  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  
  @ApiModelProperty(value = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). ")
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  /**
   **/
  public CreateChatCompletionRequest streamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("stream_options")
  public ChatCompletionStreamOptions getStreamOptions() {
    return streamOptions;
  }
  public void setStreamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
  }

  /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   **/
  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. ")
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   **/
  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  /**
   * A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
   **/
  public CreateChatCompletionRequest tools(List<ChatCompletionTool> tools) {
    this.tools = tools;
    return this;
  }

  
  @ApiModelProperty(value = "A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. ")
  @JsonProperty("tools")
  public List<ChatCompletionTool> getTools() {
    return tools;
  }
  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }

  /**
   **/
  public CreateChatCompletionRequest toolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tool_choice")
  public ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   **/
  public CreateChatCompletionRequest parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.")
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
   **/
  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). ")
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

  /**
   **/
  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("function_call")
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

  /**
   * Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
   **/
  public CreateChatCompletionRequest functions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  
  @ApiModelProperty(value = "Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. ")
  @JsonProperty("functions")
  public List<ChatCompletionFunctions> getFunctions() {
    return functions;
  }
  public void setFunctions(List<ChatCompletionFunctions> functions) {
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
    return Objects.equals(messages, createChatCompletionRequest.messages) &&
        Objects.equals(model, createChatCompletionRequest.model) &&
        Objects.equals(store, createChatCompletionRequest.store) &&
        Objects.equals(reasoningEffort, createChatCompletionRequest.reasoningEffort) &&
        Objects.equals(metadata, createChatCompletionRequest.metadata) &&
        Objects.equals(frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(logprobs, createChatCompletionRequest.logprobs) &&
        Objects.equals(topLogprobs, createChatCompletionRequest.topLogprobs) &&
        Objects.equals(maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(maxCompletionTokens, createChatCompletionRequest.maxCompletionTokens) &&
        Objects.equals(n, createChatCompletionRequest.n) &&
        Objects.equals(modalities, createChatCompletionRequest.modalities) &&
        Objects.equals(prediction, createChatCompletionRequest.prediction) &&
        Objects.equals(audio, createChatCompletionRequest.audio) &&
        Objects.equals(presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(responseFormat, createChatCompletionRequest.responseFormat) &&
        Objects.equals(seed, createChatCompletionRequest.seed) &&
        Objects.equals(serviceTier, createChatCompletionRequest.serviceTier) &&
        Objects.equals(stop, createChatCompletionRequest.stop) &&
        Objects.equals(stream, createChatCompletionRequest.stream) &&
        Objects.equals(streamOptions, createChatCompletionRequest.streamOptions) &&
        Objects.equals(temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(topP, createChatCompletionRequest.topP) &&
        Objects.equals(tools, createChatCompletionRequest.tools) &&
        Objects.equals(toolChoice, createChatCompletionRequest.toolChoice) &&
        Objects.equals(parallelToolCalls, createChatCompletionRequest.parallelToolCalls) &&
        Objects.equals(user, createChatCompletionRequest.user) &&
        Objects.equals(functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(functions, createChatCompletionRequest.functions);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

