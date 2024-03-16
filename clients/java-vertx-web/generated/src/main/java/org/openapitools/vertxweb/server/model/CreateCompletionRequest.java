package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CreateCompletionRequestModel;
import org.openapitools.vertxweb.server.model.CreateCompletionRequestPrompt;
import org.openapitools.vertxweb.server.model.CreateCompletionRequestStop;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCompletionRequest   {
  
  private CreateCompletionRequestModel model;
  private CreateCompletionRequestPrompt prompt = <|endoftext|>;
  private String suffix;
  private Integer maxTokens = 16;
  private BigDecimal temperature = new BigDecimal("1");
  private BigDecimal topP = new BigDecimal("1");
  private Integer n = 1;
  private Boolean stream = false;
  private Integer logprobs;
  private Boolean echo = false;
  private CreateCompletionRequestStop stop = null;
  private BigDecimal presencePenalty = new BigDecimal("0");
  private BigDecimal frequencyPenalty = new BigDecimal("0");
  private Integer bestOf = 1;
  private Object logitBias;
  private String user;

  public CreateCompletionRequest () {

  }

  public CreateCompletionRequest (CreateCompletionRequestModel model, CreateCompletionRequestPrompt prompt, String suffix, Integer maxTokens, BigDecimal temperature, BigDecimal topP, Integer n, Boolean stream, Integer logprobs, Boolean echo, CreateCompletionRequestStop stop, BigDecimal presencePenalty, BigDecimal frequencyPenalty, Integer bestOf, Object logitBias, String user) {
    this.model = model;
    this.prompt = prompt;
    this.suffix = suffix;
    this.maxTokens = maxTokens;
    this.temperature = temperature;
    this.topP = topP;
    this.n = n;
    this.stream = stream;
    this.logprobs = logprobs;
    this.echo = echo;
    this.stop = stop;
    this.presencePenalty = presencePenalty;
    this.frequencyPenalty = frequencyPenalty;
    this.bestOf = bestOf;
    this.logitBias = logitBias;
    this.user = user;
  }

    
  @JsonProperty("model")
  public CreateCompletionRequestModel getModel() {
    return model;
  }
  public void setModel(CreateCompletionRequestModel model) {
    this.model = model;
  }

    
  @JsonProperty("prompt")
  public CreateCompletionRequestPrompt getPrompt() {
    return prompt;
  }
  public void setPrompt(CreateCompletionRequestPrompt prompt) {
    this.prompt = prompt;
  }

    
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

    
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }
  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
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

    
  @JsonProperty("logprobs")
  public Integer getLogprobs() {
    return logprobs;
  }
  public void setLogprobs(Integer logprobs) {
    this.logprobs = logprobs;
  }

    
  @JsonProperty("echo")
  public Boolean getEcho() {
    return echo;
  }
  public void setEcho(Boolean echo) {
    this.echo = echo;
  }

    
  @JsonProperty("stop")
  public CreateCompletionRequestStop getStop() {
    return stop;
  }
  public void setStop(CreateCompletionRequestStop stop) {
    this.stop = stop;
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

    
  @JsonProperty("best_of")
  public Integer getBestOf() {
    return bestOf;
  }
  public void setBestOf(Integer bestOf) {
    this.bestOf = bestOf;
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
    CreateCompletionRequest createCompletionRequest = (CreateCompletionRequest) o;
    return Objects.equals(model, createCompletionRequest.model) &&
        Objects.equals(prompt, createCompletionRequest.prompt) &&
        Objects.equals(suffix, createCompletionRequest.suffix) &&
        Objects.equals(maxTokens, createCompletionRequest.maxTokens) &&
        Objects.equals(temperature, createCompletionRequest.temperature) &&
        Objects.equals(topP, createCompletionRequest.topP) &&
        Objects.equals(n, createCompletionRequest.n) &&
        Objects.equals(stream, createCompletionRequest.stream) &&
        Objects.equals(logprobs, createCompletionRequest.logprobs) &&
        Objects.equals(echo, createCompletionRequest.echo) &&
        Objects.equals(stop, createCompletionRequest.stop) &&
        Objects.equals(presencePenalty, createCompletionRequest.presencePenalty) &&
        Objects.equals(frequencyPenalty, createCompletionRequest.frequencyPenalty) &&
        Objects.equals(bestOf, createCompletionRequest.bestOf) &&
        Objects.equals(logitBias, createCompletionRequest.logitBias) &&
        Objects.equals(user, createCompletionRequest.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(model, prompt, suffix, maxTokens, temperature, topP, n, stream, logprobs, echo, stop, presencePenalty, frequencyPenalty, bestOf, logitBias, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCompletionRequest {\n");
    
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
    sb.append("    n: ").append(toIndentedString(n)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
    sb.append("    echo: ").append(toIndentedString(echo)).append("\n");
    sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
    sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
    sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
    sb.append("    bestOf: ").append(toIndentedString(bestOf)).append("\n");
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
