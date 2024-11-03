package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ChatCompletionFunctions;
import org.openapitools.server.api.model.ChatCompletionRequestMessage;
import org.openapitools.server.api.model.ChatCompletionTool;
import org.openapitools.server.api.model.ChatCompletionToolChoiceOption;
import org.openapitools.server.api.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.server.api.model.CreateChatCompletionRequestModel;
import org.openapitools.server.api.model.CreateChatCompletionRequestResponseFormat;
import org.openapitools.server.api.model.CreateChatCompletionRequestStop;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionRequest   {
  
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();
  private CreateChatCompletionRequestModel model;
  private BigDecimal frequencyPenalty = new BigDecimal("0");
  private Map<String, Integer> logitBias;
  private Boolean logprobs = false;
  private Integer topLogprobs;
  private Integer maxTokens;
  private Integer n = 1;
  private BigDecimal presencePenalty = new BigDecimal("0");
  private CreateChatCompletionRequestResponseFormat responseFormat;
  private Integer seed;
  private CreateChatCompletionRequestStop stop = null;
  private Boolean stream = false;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private List<ChatCompletionTool> tools = new ArrayList<>();
  private ChatCompletionToolChoiceOption toolChoice;
  private String user;
  private CreateChatCompletionRequestFunctionCall functionCall;
  private List<ChatCompletionFunctions> functions = new ArrayList<>();

  public CreateChatCompletionRequest () {

  }

  public CreateChatCompletionRequest (List<ChatCompletionRequestMessage> messages, CreateChatCompletionRequestModel model, BigDecimal frequencyPenalty, Map<String, Integer> logitBias, Boolean logprobs, Integer topLogprobs, Integer maxTokens, Integer n, BigDecimal presencePenalty, CreateChatCompletionRequestResponseFormat responseFormat, Integer seed, CreateChatCompletionRequestStop stop, Boolean stream, BigDecimal temperature, BigDecimal topP, List<ChatCompletionTool> tools, ChatCompletionToolChoiceOption toolChoice, String user, CreateChatCompletionRequestFunctionCall functionCall, List<ChatCompletionFunctions> functions) {
    this.messages = messages;
    this.model = model;
    this.frequencyPenalty = frequencyPenalty;
    this.logitBias = logitBias;
    this.logprobs = logprobs;
    this.topLogprobs = topLogprobs;
    this.maxTokens = maxTokens;
    this.n = n;
    this.presencePenalty = presencePenalty;
    this.responseFormat = responseFormat;
    this.seed = seed;
    this.stop = stop;
    this.stream = stream;
    this.temperature = temperature;
    this.topP = topP;
    this.tools = tools;
    this.toolChoice = toolChoice;
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

    
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
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
        Objects.equals(frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(logprobs, createChatCompletionRequest.logprobs) &&
        Objects.equals(topLogprobs, createChatCompletionRequest.topLogprobs) &&
        Objects.equals(maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(n, createChatCompletionRequest.n) &&
        Objects.equals(presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(responseFormat, createChatCompletionRequest.responseFormat) &&
        Objects.equals(seed, createChatCompletionRequest.seed) &&
        Objects.equals(stop, createChatCompletionRequest.stop) &&
        Objects.equals(stream, createChatCompletionRequest.stream) &&
        Objects.equals(temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(topP, createChatCompletionRequest.topP) &&
        Objects.equals(tools, createChatCompletionRequest.tools) &&
        Objects.equals(toolChoice, createChatCompletionRequest.toolChoice) &&
        Objects.equals(user, createChatCompletionRequest.user) &&
        Objects.equals(functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(functions, createChatCompletionRequest.functions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messages, model, frequencyPenalty, logitBias, logprobs, topLogprobs, maxTokens, n, presencePenalty, responseFormat, seed, stop, stream, temperature, topP, tools, toolChoice, user, functionCall, functions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequest {\n");
    
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    topLogprobs: ").append(toIndentedString(topLogprobs)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
    sb.append("    toolChoice: ").append(toIndentedString(toolChoice)).append("\n");
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
