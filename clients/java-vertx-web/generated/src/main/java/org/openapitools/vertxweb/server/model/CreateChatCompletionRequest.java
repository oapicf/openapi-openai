package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ChatCompletionFunctions;
import org.openapitools.vertxweb.server.model.ChatCompletionRequestMessage;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestModel;
import org.openapitools.vertxweb.server.model.CreateChatCompletionRequestStop;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateChatCompletionRequest   {
  
  private CreateChatCompletionRequestModel model;
  private List<ChatCompletionRequestMessage> messages = new ArrayList<>();
  private List<ChatCompletionFunctions> functions;
  private CreateChatCompletionRequestFunctionCall functionCall;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private Integer n = 1;
  private Boolean stream = false;
  private CreateChatCompletionRequestStop stop = null;
  private Integer maxTokens;
  private BigDecimal presencePenalty = new BigDecimal("0");
  private BigDecimal frequencyPenalty = new BigDecimal("0");
  private Object logitBias;
  private String user;

  public CreateChatCompletionRequest () {

  }

  public CreateChatCompletionRequest (CreateChatCompletionRequestModel model, List<ChatCompletionRequestMessage> messages, List<ChatCompletionFunctions> functions, CreateChatCompletionRequestFunctionCall functionCall, BigDecimal temperature, BigDecimal topP, Integer n, Boolean stream, CreateChatCompletionRequestStop stop, Integer maxTokens, BigDecimal presencePenalty, BigDecimal frequencyPenalty, Object logitBias, String user) {
    this.model = model;
    this.messages = messages;
    this.functions = functions;
    this.functionCall = functionCall;
    this.temperature = temperature;
    this.topP = topP;
    this.n = n;
    this.stream = stream;
    this.stop = stop;
    this.maxTokens = maxTokens;
    this.presencePenalty = presencePenalty;
    this.frequencyPenalty = frequencyPenalty;
    this.logitBias = logitBias;
    this.user = user;
  }

    
  @JsonProperty("model")
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }
  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("messages")
  public List<ChatCompletionRequestMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

    
  @JsonProperty("functions")
  public List<ChatCompletionFunctions> getFunctions() {
    return functions;
  }
  public void setFunctions(List<ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

    
  @JsonProperty("function_call")
  public CreateChatCompletionRequestFunctionCall getFunctionCall() {
    return functionCall;
  }
  public void setFunctionCall(CreateChatCompletionRequestFunctionCall functionCall) {
    this.functionCall = functionCall;
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

    
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }

    
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }
  public void setStream(Boolean stream) {
    this.stream = stream;
  }

    
  @JsonProperty("stop")
  public CreateChatCompletionRequestStop getStop() {
    return stop;
  }
  public void setStop(CreateChatCompletionRequestStop stop) {
    this.stop = stop;
  }

    
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }
  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

    
  @JsonProperty("presence_penalty")
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }
  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

    
  @JsonProperty("frequency_penalty")
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }
  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

    
  @JsonProperty("logit_bias")
  public Object getLogitBias() {
    return logitBias;
  }
  public void setLogitBias(Object logitBias) {
    this.logitBias = logitBias;
  }

    
  @JsonProperty("user")
  public String getUser() {
    return user;
  }
  public void setUser(String user) {
    this.user = user;
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
    return Objects.equals(model, createChatCompletionRequest.model) &&
        Objects.equals(messages, createChatCompletionRequest.messages) &&
        Objects.equals(functions, createChatCompletionRequest.functions) &&
        Objects.equals(functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(topP, createChatCompletionRequest.topP) &&
        Objects.equals(n, createChatCompletionRequest.n) &&
        Objects.equals(stream, createChatCompletionRequest.stream) &&
        Objects.equals(stop, createChatCompletionRequest.stop) &&
        Objects.equals(maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(user, createChatCompletionRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, messages, functions, functionCall, temperature, topP, n, stream, stop, maxTokens, presencePenalty, frequencyPenalty, logitBias, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateChatCompletionRequest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    functionCall: ").append(toIndentedString(functionCall)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
