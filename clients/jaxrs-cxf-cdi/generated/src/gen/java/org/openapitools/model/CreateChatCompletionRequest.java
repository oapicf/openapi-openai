package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChatCompletionFunctions;
import org.openapitools.model.ChatCompletionRequestMessage;
import org.openapitools.model.CreateChatCompletionRequestFunctionCall;
import org.openapitools.model.CreateChatCompletionRequestModel;
import org.openapitools.model.CreateChatCompletionRequestStop;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class CreateChatCompletionRequest   {
  
  private CreateChatCompletionRequestModel model;

  private List<@Valid ChatCompletionRequestMessage> messages = new ArrayList<>();

  private List<@Valid ChatCompletionFunctions> functions;

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

  /**
   **/
  public CreateChatCompletionRequest model(CreateChatCompletionRequestModel model) {
    this.model = model;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("model")
  @NotNull
  public CreateChatCompletionRequestModel getModel() {
    return model;
  }
  public void setModel(CreateChatCompletionRequestModel model) {
    this.model = model;
  }


  /**
   * A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
   **/
  public CreateChatCompletionRequest messages(List<@Valid ChatCompletionRequestMessage> messages) {
    this.messages = messages;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).")
  @JsonProperty("messages")
  @NotNull
 @Size(min=1)  public List<@Valid ChatCompletionRequestMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<@Valid ChatCompletionRequestMessage> messages) {
    this.messages = messages;
  }

  public CreateChatCompletionRequest addMessagesItem(ChatCompletionRequestMessage messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<>();
    }
    this.messages.add(messagesItem);
    return this;
  }


  /**
   * A list of functions the model may generate JSON inputs for.
   **/
  public CreateChatCompletionRequest functions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
    return this;
  }

  
  @ApiModelProperty(value = "A list of functions the model may generate JSON inputs for.")
  @JsonProperty("functions")
 @Size(min=1)  public List<@Valid ChatCompletionFunctions> getFunctions() {
    return functions;
  }
  public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
    this.functions = functions;
  }

  public CreateChatCompletionRequest addFunctionsItem(ChatCompletionFunctions functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
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
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
   * minimum: 0
   * maximum: 2
   **/
  public CreateChatCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
  @JsonProperty("temperature")
 @DecimalMin("0") @DecimalMax("2")  public BigDecimal getTemperature() {
    return temperature;
  }
  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }


  /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
   * minimum: 0
   * maximum: 1
   **/
  public CreateChatCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
  @JsonProperty("top_p")
 @DecimalMin("0") @DecimalMax("1")  public BigDecimal getTopP() {
    return topP;
  }
  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }


  /**
   * How many chat completion choices to generate for each input message.
   * minimum: 1
   * maximum: 128
   **/
  public CreateChatCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

  
  @ApiModelProperty(example = "1", value = "How many chat completion choices to generate for each input message.")
  @JsonProperty("n")
 @Min(1) @Max(128)  public Integer getN() {
    return n;
  }
  public void setN(Integer n) {
    this.n = n;
  }


  /**
   * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
   **/
  public CreateChatCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

  
  @ApiModelProperty(value = "If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). ")
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }
  public void setStream(Boolean stream) {
    this.stream = stream;
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
   * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
   **/
  public CreateChatCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

  
  @ApiModelProperty(value = "The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. ")
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }
  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }


  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   **/
  public CreateChatCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

  
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
  @JsonProperty("presence_penalty")
 @DecimalMin("-2") @DecimalMax("2")  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }
  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }


  /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   **/
  public CreateChatCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

  
  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
  @JsonProperty("frequency_penalty")
 @DecimalMin("-2") @DecimalMax("2")  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }
  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }


  /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
   **/
  public CreateChatCompletionRequest logitBias(Object logitBias) {
    this.logitBias = logitBias;
    return this;
  }

  
  @ApiModelProperty(value = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. ")
  @JsonProperty("logit_bias")
  public Object getLogitBias() {
    return logitBias;
  }
  public void setLogitBias(Object logitBias) {
    this.logitBias = logitBias;
  }


  /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   **/
  public CreateChatCompletionRequest user(String user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
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
    return Objects.equals(this.model, createChatCompletionRequest.model) &&
        Objects.equals(this.messages, createChatCompletionRequest.messages) &&
        Objects.equals(this.functions, createChatCompletionRequest.functions) &&
        Objects.equals(this.functionCall, createChatCompletionRequest.functionCall) &&
        Objects.equals(this.temperature, createChatCompletionRequest.temperature) &&
        Objects.equals(this.topP, createChatCompletionRequest.topP) &&
        Objects.equals(this.n, createChatCompletionRequest.n) &&
        Objects.equals(this.stream, createChatCompletionRequest.stream) &&
        Objects.equals(this.stop, createChatCompletionRequest.stop) &&
        Objects.equals(this.maxTokens, createChatCompletionRequest.maxTokens) &&
        Objects.equals(this.presencePenalty, createChatCompletionRequest.presencePenalty) &&
        Objects.equals(this.frequencyPenalty, createChatCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.logitBias, createChatCompletionRequest.logitBias) &&
        Objects.equals(this.user, createChatCompletionRequest.user);
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

