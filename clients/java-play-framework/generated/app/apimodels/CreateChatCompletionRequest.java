package apimodels;

import apimodels.ChatCompletionFunctions;
import apimodels.ChatCompletionRequestMessage;
import apimodels.ChatCompletionStreamOptions;
import apimodels.ChatCompletionTool;
import apimodels.ChatCompletionToolChoiceOption;
import apimodels.CreateChatCompletionRequestAudio;
import apimodels.CreateChatCompletionRequestFunctionCall;
import apimodels.CreateChatCompletionRequestModel;
import apimodels.CreateChatCompletionRequestResponseFormat;
import apimodels.CreateChatCompletionRequestStop;
import apimodels.PredictionContent;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CreateChatCompletionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-29T14:08:26.021556086Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateChatCompletionRequest   {
  @JsonProperty("messages")
  @NotNull
@Size(min=1)
@Valid

  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();

  @JsonProperty("model")
  @NotNull
@Valid

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

    private final String value;

    ReasoningEffortEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("reasoning_effort")
  
  private ReasoningEffortEnum reasoningEffort = ReasoningEffortEnum.MEDIUM;

  @JsonProperty("metadata")
  
  private Map<String, String> metadata = null;

  @JsonProperty("frequency_penalty")
  @DecimalMin("-2")
@DecimalMax("2")
@Valid

  private BigDecimal frequencyPenalty = new BigDecimal("0");

  @JsonProperty("logit_bias")
  
  private Map<String, Integer> logitBias = null;

  @JsonProperty("logprobs")
  
  private Boolean logprobs = false;

  @JsonProperty("top_logprobs")
  @Min(0)
@Max(20)

  private Integer topLogprobs;

  @JsonProperty("max_tokens")
  
  private Integer maxTokens;

  @JsonProperty("max_completion_tokens")
  
  private Integer maxCompletionTokens;

  @JsonProperty("n")
  @Min(1)
@Max(128)

  private Integer n = 1;

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

    @Override
    @JsonValue
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

  @JsonProperty("modalities")
  
  private List<ModalitiesEnum> modalities = null;

  @JsonProperty("prediction")
  @Valid

  private PredictionContent prediction;

  @JsonProperty("audio")
  @Valid

  private CreateChatCompletionRequestAudio audio;

  @JsonProperty("presence_penalty")
  @DecimalMin("-2")
@DecimalMax("2")
@Valid

  private BigDecimal presencePenalty = new BigDecimal("0");

  @JsonProperty("response_format")
  @Valid

  private CreateChatCompletionRequestResponseFormat responseFormat;

  @JsonProperty("seed")
  @Min(-9223372036854776000)
@Max(9223372036854776000)

  private Integer seed;

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
  
  private ServiceTierEnum serviceTier = ServiceTierEnum.AUTO;

  @JsonProperty("stop")
  @Valid

  private CreateChatCompletionRequestStop stop = null;

  @JsonProperty("stream")
  
  private Boolean stream = false;

  @JsonProperty("stream_options")
  @Valid

  private ChatCompletionStreamOptions streamOptions;

  @JsonProperty("temperature")
  @DecimalMin("0")
@DecimalMax("2")
@Valid

  private BigDecimal temperature = new BigDecimal("1");

  @JsonProperty("top_p")
  @DecimalMin("0")
@DecimalMax("1")
@Valid

  private BigDecimal topP = new BigDecimal("1");

  @JsonProperty("tools")
  @Valid

  private List<@Valid ChatCompletionTool> tools = null;

  @JsonProperty("tool_choice")
  @Valid

  private ChatCompletionToolChoiceOption toolChoice;

  @JsonProperty("parallel_tool_calls")
  
  private Boolean parallelToolCalls = true;

  @JsonProperty("user")
  
  private String user;

  @JsonProperty("function_call")
  @Valid

  private CreateChatCompletionRequestFunctionCall functionCall;

  @JsonProperty("functions")
  @Size(min=1,max=128)
@Valid

  private List<@Valid ChatCompletionFunctions> functions = null;

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
  **/
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
  **/
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }

  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

  public CreateChatCompletionRequest store(Boolean store) {
    this.store = store;
    return this;
  }

   /**
   * Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
   * @return store
  **/
  public Boolean getStore() {
    return store;
  }

  public void setStore(Boolean store) {
    this.store = store;
  }

  public CreateChatCompletionRequest reasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
    return this;
  }

   /**
   * **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
   * @return reasoningEffort
  **/
  public ReasoningEffortEnum getReasoningEffort() {
    return reasoningEffort;
  }

  public void setReasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

  public CreateChatCompletionRequest metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public CreateChatCompletionRequest putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
   * @return metadata
  **/
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

   /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
  **/
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public CreateChatCompletionRequest logitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
    return this;
  }

  public CreateChatCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
    if (this.logitBias == null) {
      this.logitBias = new HashMap<>();
    }
    this.logitBias.put(key, logitBiasItem);
    return this;
  }

   /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   * @return logitBias
  **/
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }

  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }

  public CreateChatCompletionRequest logprobs(Boolean logprobs) {
    this.logprobs = logprobs;
    return this;
  }

   /**
   * Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. 
   * @return logprobs
  **/
  public Boolean getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(Boolean logprobs) {
    this.logprobs = logprobs;
  }

  public CreateChatCompletionRequest topLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
    return this;
  }

   /**
   * An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. 
   * minimum: 0
   * maximum: 20
   * @return topLogprobs
  **/
  public Integer getTopLogprobs() {
    return topLogprobs;
  }

  public void setTopLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

   /**
   * The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). 
   * @return maxTokens
  **/
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  public CreateChatCompletionRequest maxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
    return this;
  }

   /**
   * An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
   * @return maxCompletionTokens
  **/
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }

  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

   /**
   * How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
   * minimum: 1
   * maximum: 128
   * @return n
  **/
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateChatCompletionRequest modalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
    return this;
  }

  public CreateChatCompletionRequest addModalitiesItem(ModalitiesEnum modalitiesItem) {
    if (this.modalities == null) {
      this.modalities = new ArrayList<>();
    }
    this.modalities.add(modalitiesItem);
    return this;
  }

   /**
   * Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` 
   * @return modalities
  **/
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }

  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

  public CreateChatCompletionRequest prediction(PredictionContent prediction) {
    this.prediction = prediction;
    return this;
  }

   /**
   * Get prediction
   * @return prediction
  **/
  public PredictionContent getPrediction() {
    return prediction;
  }

  public void setPrediction(PredictionContent prediction) {
    this.prediction = prediction;
  }

  public CreateChatCompletionRequest audio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
    return this;
  }

   /**
   * Get audio
   * @return audio
  **/
  public CreateChatCompletionRequestAudio getAudio() {
    return audio;
  }

  public void setAudio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
  }

  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

   /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
  **/
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public CreateChatCompletionRequest responseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
    return this;
  }

   /**
   * Get responseFormat
   * @return responseFormat
  **/
  public CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }

  public void setResponseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

  public CreateChatCompletionRequest seed(Integer seed) {
    this.seed = seed;
    return this;
  }

   /**
   * This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
   * minimum: -9223372036854776000
   * maximum: 9223372036854776000
   * @return seed
  **/
  public Integer getSeed() {
    return seed;
  }

  public void setSeed(Integer seed) {
    this.seed = seed;
  }

  public CreateChatCompletionRequest serviceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
    return this;
  }

   /**
   * Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
   * @return serviceTier
  **/
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }

  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

  public CreateChatCompletionRequest stop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

   /**
   * Get stop
   * @return stop
  **/
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }

  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

   /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
   * @return stream
  **/
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  public CreateChatCompletionRequest streamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
    return this;
  }

   /**
   * Get streamOptions
   * @return streamOptions
  **/
  public ChatCompletionStreamOptions getStreamOptions() {
    return streamOptions;
  }

  public void setStreamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
  }

  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

   /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
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
  **/
  public List<@Valid ChatCompletionTool> getTools() {
    return tools;
  }

  public void setTools(List<@Valid ChatCompletionTool> tools) {
    this.tools = tools;
  }

  public CreateChatCompletionRequest toolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
    return this;
  }

   /**
   * Get toolChoice
   * @return toolChoice
  **/
  public ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }

  public void setToolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

  public CreateChatCompletionRequest parallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
    return this;
  }

   /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   * @return parallelToolCalls
  **/
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }

  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

   /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
   * @return user
  **/
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public CreateChatCompletionRequest functionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
    return this;
  }

   /**
   * Get functionCall
   * @return functionCall
  **/
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }

  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
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
  **/
  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

