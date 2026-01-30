package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ChatCompletionFunctions;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessage;
import org.openapitools.vertxweb.server.model.ChatCompletionStreamOptions;
import org.openapitools.vertxweb.server.model.ChatCompletionTool;
import org.openapitools.vertxweb.server.model.ChatCompletionToolChoiceOption;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestAudio;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestModel;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestResponseFormat;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestStop;
import org.openapitools.vertxweb.server.model.PredictionContent;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionRequest   {
  
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();
  private CreateChatCompletionRequestModel model;
  private Boolean store = false;


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
      return value;
    }
  }

  private ReasoningEffortEnum reasoningEffort = ReasoningEffortEnum.MEDIUM;
  private Map<String, String> metadata;
  private BigDecimal frequencyPenalty = new BigDecimal("0");
  private Map<String, Integer> logitBias;
  private Boolean logprobs = false;
  private Integer topLogprobs;
  private Integer maxTokens;
  private Integer maxCompletionTokens;
  private Integer n = 1;


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
      return value;
    }
  }

  private List<ModalitiesEnum> modalities;
  private PredictionContent prediction;
  private CreateChatCompletionRequestAudio audio;
  private BigDecimal presencePenalty = new BigDecimal("0");
  private CreateChatCompletionRequestResponseFormat responseFormat;
  private Integer seed;


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
      return value;
    }
  }

  private ServiceTierEnum serviceTier = ServiceTierEnum.AUTO;
  private CreateChatCompletionRequestStop stop = null;
  private Boolean stream = false;
  private ChatCompletionStreamOptions streamOptions;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private List<ChatCompletionTool> tools = new ArrayList<>();
  private ChatCompletionToolChoiceOption toolChoice;
  private Boolean parallelToolCalls = true;
  private String user;
  private CreateChatCompletionRequestFunctionCall functionCall;
  private List<ChatCompletionFunctions> functions = new ArrayList<>();

  public CreateChatCompletionRequest () {

  }

  public CreateChatCompletionRequest (List<ChatCompletionRequestMessage> messages, CreateChatCompletionRequestModel model, Boolean store, ReasoningEffortEnum reasoningEffort, Map<String, String> metadata, BigDecimal frequencyPenalty, Map<String, Integer> logitBias, Boolean logprobs, Integer topLogprobs, Integer maxTokens, Integer maxCompletionTokens, Integer n, List<ModalitiesEnum> modalities, PredictionContent prediction, CreateChatCompletionRequestAudio audio, BigDecimal presencePenalty, CreateChatCompletionRequestResponseFormat responseFormat, Integer seed, ServiceTierEnum serviceTier, CreateChatCompletionRequestStop stop, Boolean stream, ChatCompletionStreamOptions streamOptions, BigDecimal temperature, BigDecimal topP, List<ChatCompletionTool> tools, ChatCompletionToolChoiceOption toolChoice, Boolean parallelToolCalls, String user, CreateChatCompletionRequestFunctionCall functionCall, List<ChatCompletionFunctions> functions) {
    this.messages = messages;
    this.model = model;
    this.store = store;
    this.reasoningEffort = reasoningEffort;
    this.metadata = metadata;
    this.frequencyPenalty = frequencyPenalty;
    this.logitBias = logitBias;
    this.logprobs = logprobs;
    this.topLogprobs = topLogprobs;
    this.maxTokens = maxTokens;
    this.maxCompletionTokens = maxCompletionTokens;
    this.n = n;
    this.modalities = modalities;
    this.prediction = prediction;
    this.audio = audio;
    this.presencePenalty = presencePenalty;
    this.responseFormat = responseFormat;
    this.seed = seed;
    this.serviceTier = serviceTier;
    this.stop = stop;
    this.stream = stream;
    this.streamOptions = streamOptions;
    this.temperature = temperature;
    this.topP = topP;
    this.tools = tools;
    this.toolChoice = toolChoice;
    this.parallelToolCalls = parallelToolCalls;
    this.user = user;
    this.functionCall = functionCall;
    this.functions = functions;
  }

    
  @JsonProperty("messages")
  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

    
  @JsonProperty("model")
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }
  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("store")
  public Boolean getStore() {
    return store;
  }
  public void setStore(Boolean store) {
    this.store = store;
  }

    
  @JsonProperty("reasoning_effort")
  public ReasoningEffortEnum getReasoningEffort() {
    return reasoningEffort;
  }
  public void setReasoningEffort(ReasoningEffortEnum reasoningEffort) {
    this.reasoningEffort = reasoningEffort;
  }

    
  @JsonProperty("metadata")
  public Map<String, String> getMetadata() {
    return metadata;
  }
  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

    
  @JsonProperty("frequency_penalty")
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }
  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

    
  @JsonProperty("logit_bias")
  public Map<String, Integer> getLogitBias() {
    return logitBias;
  }
  public void setLogitBias(Map<String, Integer> logitBias) {
    this.logitBias = logitBias;
  }

    
  @JsonProperty("logprobs")
  public Boolean getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(Boolean logprobs) {
    this.logprobs = logprobs;
  }

    
  @JsonProperty("top_logprobs")
  public Integer getTopLogprobs() {
    return topLogprobs;
  }
  public void setTopLogprobs(Integer topLogprobs) {
    this.topLogprobs = topLogprobs;
  }

    
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }
  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

    
  @JsonProperty("max_completion_tokens")
  public Integer getMaxCompletionTokens() {
    return maxCompletionTokens;
  }
  public void setMaxCompletionTokens(Integer maxCompletionTokens) {
    this.maxCompletionTokens = maxCompletionTokens;
  }

    
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

    
  @JsonProperty("modalities")
  public List<ModalitiesEnum> getModalities() {
    return modalities;
  }
  public void setModalities(List<ModalitiesEnum> modalities) {
    this.modalities = modalities;
  }

    
  @JsonProperty("prediction")
  public PredictionContent getPrediction() {
    return prediction;
  }
  public void setPrediction(PredictionContent prediction) {
    this.prediction = prediction;
  }

    
  @JsonProperty("audio")
  public CreateChatCompletionRequestAudio getAudio() {
    return audio;
  }
  public void setAudio(CreateChatCompletionRequestAudio audio) {
    this.audio = audio;
  }

    
  @JsonProperty("presence_penalty")
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }
  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

    
  @JsonProperty("response_format")
  public CreateChatCompletionRequestResponseFormat getResponseFormat() {
    return responseFormat;
  }
  public void setResponseFormat(CreateChatCompletionRequestResponseFormat responseFormat) {
    this.responseFormat = responseFormat;
  }

    
  @JsonProperty("seed")
  public Integer getSeed() {
    return seed;
  }
  public void setSeed(Integer seed) {
    this.seed = seed;
  }

    
  @JsonProperty("service_tier")
  public ServiceTierEnum getServiceTier() {
    return serviceTier;
  }
  public void setServiceTier(ServiceTierEnum serviceTier) {
    this.serviceTier = serviceTier;
  }

    
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }
  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

    
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

    
  @JsonProperty("stream_options")
  public ChatCompletionStreamOptions getStreamOptions() {
    return streamOptions;
  }
  public void setStreamOptions(ChatCompletionStreamOptions streamOptions) {
    this.streamOptions = streamOptions;
  }

    
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

    
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

    
  @JsonProperty("tools")
  public List<ChatCompletionTool> getTools() {
    return tools;
  }
  public void setTools(List<ChatCompletionTool> tools) {
    this.tools = tools;
  }

    
  @JsonProperty("tool_choice")
  public ChatCompletionToolChoiceOption getToolChoice() {
    return toolChoice;
  }
  public void setToolChoice(ChatCompletionToolChoiceOption toolChoice) {
    this.toolChoice = toolChoice;
  }

    
  @JsonProperty("parallel_tool_calls")
  public Boolean getParallelToolCalls() {
    return parallelToolCalls;
  }
  public void setParallelToolCalls(Boolean parallelToolCalls) {
    this.parallelToolCalls = parallelToolCalls;
  }

    
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
  }

    
  @JsonProperty("function_call")
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
  }

    
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
