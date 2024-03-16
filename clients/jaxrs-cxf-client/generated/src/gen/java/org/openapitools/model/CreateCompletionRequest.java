package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateCompletionRequestModel;
import org.openapitools.model.CreateCompletionRequestPrompt;
import org.openapitools.model.CreateCompletionRequestStop;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateCompletionRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private CreateCompletionRequestModel model;

  @ApiModelProperty(required = true, value = "")
  private CreateCompletionRequestPrompt prompt = <|endoftext|>;

  @ApiModelProperty(example = "test.", value = "The suffix that comes after a completion of inserted text.")
 /**
   * The suffix that comes after a completion of inserted text.
  **/
  private String suffix;

  @ApiModelProperty(example = "16", value = "The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. ")
 /**
   * The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
  **/
  private Integer maxTokens = 16;

  @ApiModelProperty(example = "1", value = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ")
 /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  **/
  private BigDecimal temperature = new BigDecimal("1");

  @ApiModelProperty(example = "1", value = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ")
 /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  **/
  private BigDecimal topP = new BigDecimal("1");

  @ApiModelProperty(example = "1", value = "How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. ")
 /**
   * How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  **/
  private Integer n = 1;

  @ApiModelProperty(value = "Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). ")
 /**
   * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
  **/
  private Boolean stream = false;

  @ApiModelProperty(value = "Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. ")
 /**
   * Include the log probabilities on the `logprobs` most likely tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
  **/
  private Integer logprobs;

  @ApiModelProperty(value = "Echo back the prompt in addition to the completion ")
 /**
   * Echo back the prompt in addition to the completion 
  **/
  private Boolean echo = false;

  @ApiModelProperty(value = "")
  private CreateCompletionRequestStop stop = null;

  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
 /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  **/
  private BigDecimal presencePenalty = new BigDecimal("0");

  @ApiModelProperty(value = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) ")
 /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
  **/
  private BigDecimal frequencyPenalty = new BigDecimal("0");

  @ApiModelProperty(value = "Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. ")
 /**
   * Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  **/
  private Integer bestOf = 1;

  @ApiModelProperty(value = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. ")
 /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
  **/
  private Object logitBias;

  @ApiModelProperty(example = "user-1234", value = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ")
 /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
  **/
  private String user;
 /**
   * Get model
   * @return model
  **/
  @JsonProperty("model")
  public CreateCompletionRequestModel getModel() {
    return model;
  }

  public void setModel(CreateCompletionRequestModel model) {
    this.model = model;
  }

  public CreateCompletionRequest model(CreateCompletionRequestModel model) {
    this.model = model;
    return this;
  }

 /**
   * Get prompt
   * @return prompt
  **/
  @JsonProperty("prompt")
  public CreateCompletionRequestPrompt getPrompt() {
    return prompt;
  }

  public void setPrompt(CreateCompletionRequestPrompt prompt) {
    this.prompt = prompt;
  }

  public CreateCompletionRequest prompt(CreateCompletionRequestPrompt prompt) {
    this.prompt = prompt;
    return this;
  }

 /**
   * The suffix that comes after a completion of inserted text.
   * @return suffix
  **/
  @JsonProperty("suffix")
  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public CreateCompletionRequest suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

 /**
   * The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens. 
   * minimum: 0
   * @return maxTokens
  **/
  @JsonProperty("max_tokens")
  public Integer getMaxTokens() {
    return maxTokens;
  }

  public void setMaxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
  }

  public CreateCompletionRequest maxTokens(Integer maxTokens) {
    this.maxTokens = maxTokens;
    return this;
  }

 /**
   * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
   * minimum: 0
   * maximum: 2
   * @return temperature
  **/
  @JsonProperty("temperature")
  public BigDecimal getTemperature() {
    return temperature;
  }

  public void setTemperature(BigDecimal temperature) {
    this.temperature = temperature;
  }

  public CreateCompletionRequest temperature(BigDecimal temperature) {
    this.temperature = temperature;
    return this;
  }

 /**
   * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
   * minimum: 0
   * maximum: 1
   * @return topP
  **/
  @JsonProperty("top_p")
  public BigDecimal getTopP() {
    return topP;
  }

  public void setTopP(BigDecimal topP) {
    this.topP = topP;
  }

  public CreateCompletionRequest topP(BigDecimal topP) {
    this.topP = topP;
    return this;
  }

 /**
   * How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
   * minimum: 1
   * maximum: 128
   * @return n
  **/
  @JsonProperty("n")
  public Integer getN() {
    return n;
  }

  public void setN(Integer n) {
    this.n = n;
  }

  public CreateCompletionRequest n(Integer n) {
    this.n = n;
    return this;
  }

 /**
   * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb). 
   * @return stream
  **/
  @JsonProperty("stream")
  public Boolean getStream() {
    return stream;
  }

  public void setStream(Boolean stream) {
    this.stream = stream;
  }

  public CreateCompletionRequest stream(Boolean stream) {
    this.stream = stream;
    return this;
  }

 /**
   * Include the log probabilities on the &#x60;logprobs&#x60; most likely tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. 
   * minimum: 0
   * maximum: 5
   * @return logprobs
  **/
  @JsonProperty("logprobs")
  public Integer getLogprobs() {
    return logprobs;
  }

  public void setLogprobs(Integer logprobs) {
    this.logprobs = logprobs;
  }

  public CreateCompletionRequest logprobs(Integer logprobs) {
    this.logprobs = logprobs;
    return this;
  }

 /**
   * Echo back the prompt in addition to the completion 
   * @return echo
  **/
  @JsonProperty("echo")
  public Boolean getEcho() {
    return echo;
  }

  public void setEcho(Boolean echo) {
    this.echo = echo;
  }

  public CreateCompletionRequest echo(Boolean echo) {
    this.echo = echo;
    return this;
  }

 /**
   * Get stop
   * @return stop
  **/
  @JsonProperty("stop")
  public CreateCompletionRequestStop getStop() {
    return stop;
  }

  public void setStop(CreateCompletionRequestStop stop) {
    this.stop = stop;
  }

  public CreateCompletionRequest stop(CreateCompletionRequestStop stop) {
    this.stop = stop;
    return this;
  }

 /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return presencePenalty
  **/
  @JsonProperty("presence_penalty")
  public BigDecimal getPresencePenalty() {
    return presencePenalty;
  }

  public void setPresencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
  }

  public CreateCompletionRequest presencePenalty(BigDecimal presencePenalty) {
    this.presencePenalty = presencePenalty;
    return this;
  }

 /**
   * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details) 
   * minimum: -2
   * maximum: 2
   * @return frequencyPenalty
  **/
  @JsonProperty("frequency_penalty")
  public BigDecimal getFrequencyPenalty() {
    return frequencyPenalty;
  }

  public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
  }

  public CreateCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
    this.frequencyPenalty = frequencyPenalty;
    return this;
  }

 /**
   * Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
   * minimum: 0
   * maximum: 20
   * @return bestOf
  **/
  @JsonProperty("best_of")
  public Integer getBestOf() {
    return bestOf;
  }

  public void setBestOf(Integer bestOf) {
    this.bestOf = bestOf;
  }

  public CreateCompletionRequest bestOf(Integer bestOf) {
    this.bestOf = bestOf;
    return this;
  }

 /**
   * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated. 
   * @return logitBias
  **/
  @JsonProperty("logit_bias")
  public Object getLogitBias() {
    return logitBias;
  }

  public void setLogitBias(Object logitBias) {
    this.logitBias = logitBias;
  }

  public CreateCompletionRequest logitBias(Object logitBias) {
    this.logitBias = logitBias;
    return this;
  }

 /**
   * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
   * @return user
  **/
  @JsonProperty("user")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public CreateCompletionRequest user(String user) {
    this.user = user;
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
    CreateCompletionRequest createCompletionRequest = (CreateCompletionRequest) o;
    return Objects.equals(this.model, createCompletionRequest.model) &&
        Objects.equals(this.prompt, createCompletionRequest.prompt) &&
        Objects.equals(this.suffix, createCompletionRequest.suffix) &&
        Objects.equals(this.maxTokens, createCompletionRequest.maxTokens) &&
        Objects.equals(this.temperature, createCompletionRequest.temperature) &&
        Objects.equals(this.topP, createCompletionRequest.topP) &&
        Objects.equals(this.n, createCompletionRequest.n) &&
        Objects.equals(this.stream, createCompletionRequest.stream) &&
        Objects.equals(this.logprobs, createCompletionRequest.logprobs) &&
        Objects.equals(this.echo, createCompletionRequest.echo) &&
        Objects.equals(this.stop, createCompletionRequest.stop) &&
        Objects.equals(this.presencePenalty, createCompletionRequest.presencePenalty) &&
        Objects.equals(this.frequencyPenalty, createCompletionRequest.frequencyPenalty) &&
        Objects.equals(this.bestOf, createCompletionRequest.bestOf) &&
        Objects.equals(this.logitBias, createCompletionRequest.logitBias) &&
        Objects.equals(this.user, createCompletionRequest.user);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

