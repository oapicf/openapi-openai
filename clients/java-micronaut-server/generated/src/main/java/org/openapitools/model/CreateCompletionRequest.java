/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateCompletionRequestModel;
import org.openapitools.model.CreateCompletionRequestPrompt;
import org.openapitools.model.CreateCompletionRequestStop;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateCompletionRequest
 */
@JsonPropertyOrder({
  CreateCompletionRequest.JSON_PROPERTY_MODEL,
  CreateCompletionRequest.JSON_PROPERTY_PROMPT,
  CreateCompletionRequest.JSON_PROPERTY_BEST_OF,
  CreateCompletionRequest.JSON_PROPERTY_ECHO,
  CreateCompletionRequest.JSON_PROPERTY_FREQUENCY_PENALTY,
  CreateCompletionRequest.JSON_PROPERTY_LOGIT_BIAS,
  CreateCompletionRequest.JSON_PROPERTY_LOGPROBS,
  CreateCompletionRequest.JSON_PROPERTY_MAX_TOKENS,
  CreateCompletionRequest.JSON_PROPERTY_N,
  CreateCompletionRequest.JSON_PROPERTY_PRESENCE_PENALTY,
  CreateCompletionRequest.JSON_PROPERTY_SEED,
  CreateCompletionRequest.JSON_PROPERTY_STOP,
  CreateCompletionRequest.JSON_PROPERTY_STREAM,
  CreateCompletionRequest.JSON_PROPERTY_SUFFIX,
  CreateCompletionRequest.JSON_PROPERTY_TEMPERATURE,
  CreateCompletionRequest.JSON_PROPERTY_TOP_P,
  CreateCompletionRequest.JSON_PROPERTY_USER
})
@JsonTypeName("CreateCompletionRequest")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class CreateCompletionRequest {
    public static final String JSON_PROPERTY_MODEL = "model";
    private CreateCompletionRequestModel model;

    public static final String JSON_PROPERTY_PROMPT = "prompt";
    private CreateCompletionRequestPrompt prompt = <|endoftext|>;

    public static final String JSON_PROPERTY_BEST_OF = "best_of";
    private Integer bestOf = 1;

    public static final String JSON_PROPERTY_ECHO = "echo";
    private Boolean echo = false;

    public static final String JSON_PROPERTY_FREQUENCY_PENALTY = "frequency_penalty";
    private BigDecimal frequencyPenalty = new BigDecimal("0");

    public static final String JSON_PROPERTY_LOGIT_BIAS = "logit_bias";
    private Map<String, Integer> logitBias = null;

    public static final String JSON_PROPERTY_LOGPROBS = "logprobs";
    private Integer logprobs;

    public static final String JSON_PROPERTY_MAX_TOKENS = "max_tokens";
    private Integer maxTokens = 16;

    public static final String JSON_PROPERTY_N = "n";
    private Integer n = 1;

    public static final String JSON_PROPERTY_PRESENCE_PENALTY = "presence_penalty";
    private BigDecimal presencePenalty = new BigDecimal("0");

    public static final String JSON_PROPERTY_SEED = "seed";
    private Integer seed;

    public static final String JSON_PROPERTY_STOP = "stop";
    private CreateCompletionRequestStop stop = null;

    public static final String JSON_PROPERTY_STREAM = "stream";
    private Boolean stream = false;

    public static final String JSON_PROPERTY_SUFFIX = "suffix";
    private String suffix;

    public static final String JSON_PROPERTY_TEMPERATURE = "temperature";
    private BigDecimal temperature = new BigDecimal("1");

    public static final String JSON_PROPERTY_TOP_P = "top_p";
    private BigDecimal topP = new BigDecimal("1");

    public static final String JSON_PROPERTY_USER = "user";
    private String user;

    public CreateCompletionRequest(CreateCompletionRequestModel model, CreateCompletionRequestPrompt prompt) {
        this.model = model;
        this.prompt = prompt;
    }

    public CreateCompletionRequest model(CreateCompletionRequestModel model) {
        this.model = model;
        return this;
    }

    /**
     * Get model
     * @return model
     **/
    @Valid
    @NotNull
    @Schema(name = "model", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateCompletionRequestModel getModel() {
        return model;
    }

    @JsonProperty(JSON_PROPERTY_MODEL)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setModel(CreateCompletionRequestModel model) {
        this.model = model;
    }

    public CreateCompletionRequest prompt(CreateCompletionRequestPrompt prompt) {
        this.prompt = prompt;
        return this;
    }

    /**
     * Get prompt
     * @return prompt
     **/
    @Valid
    @Nullable
    @Schema(name = "prompt", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_PROMPT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CreateCompletionRequestPrompt getPrompt() {
        return prompt;
    }

    @JsonProperty(JSON_PROPERTY_PROMPT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setPrompt(CreateCompletionRequestPrompt prompt) {
        this.prompt = prompt;
    }

    public CreateCompletionRequest bestOf(Integer bestOf) {
        this.bestOf = bestOf;
        return this;
    }

    /**
     * Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
     * minimum: 0
     * maximum: 20
     * @return bestOf
     **/
    @Nullable
    @Min(0)
    @Max(20)
    @Schema(name = "best_of", description = "Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_BEST_OF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getBestOf() {
        return bestOf;
    }

    @JsonProperty(JSON_PROPERTY_BEST_OF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setBestOf(Integer bestOf) {
        this.bestOf = bestOf;
    }

    public CreateCompletionRequest echo(Boolean echo) {
        this.echo = echo;
        return this;
    }

    /**
     * Echo back the prompt in addition to the completion 
     * @return echo
     **/
    @Nullable
    @Schema(name = "echo", description = "Echo back the prompt in addition to the completion ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ECHO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getEcho() {
        return echo;
    }

    @JsonProperty(JSON_PROPERTY_ECHO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEcho(Boolean echo) {
        this.echo = echo;
    }

    public CreateCompletionRequest frequencyPenalty(BigDecimal frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
        return this;
    }

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
     * minimum: -2
     * maximum: 2
     * @return frequencyPenalty
     **/
    @Nullable
    @DecimalMin("-2")
    @DecimalMax("2")
    @Schema(name = "frequency_penalty", description = "Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_FREQUENCY_PENALTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getFrequencyPenalty() {
        return frequencyPenalty;
    }

    @JsonProperty(JSON_PROPERTY_FREQUENCY_PENALTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setFrequencyPenalty(BigDecimal frequencyPenalty) {
        this.frequencyPenalty = frequencyPenalty;
    }

    public CreateCompletionRequest logitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
        return this;
    }

    public CreateCompletionRequest putLogitBiasItem(String key, Integer logitBiasItem) {
        if (this.logitBias == null) {
            this.logitBias = new HashMap<>();
        }
        this.logitBias.put(key, logitBiasItem);
        return this;
  }

    /**
     * Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated. 
     * @return logitBias
     **/
    @Nullable
    @Schema(name = "logit_bias", description = "Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_LOGIT_BIAS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Map<String, Integer> getLogitBias() {
        return logitBias;
    }

    @JsonProperty(JSON_PROPERTY_LOGIT_BIAS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLogitBias(Map<String, Integer> logitBias) {
        this.logitBias = logitBias;
    }

    public CreateCompletionRequest logprobs(Integer logprobs) {
        this.logprobs = logprobs;
        return this;
    }

    /**
     * Include the log probabilities on the &#x60;logprobs&#x60; most likely output tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. 
     * minimum: 0
     * maximum: 5
     * @return logprobs
     **/
    @Nullable
    @Min(0)
    @Max(5)
    @Schema(name = "logprobs", description = "Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_LOGPROBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getLogprobs() {
        return logprobs;
    }

    @JsonProperty(JSON_PROPERTY_LOGPROBS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLogprobs(Integer logprobs) {
        this.logprobs = logprobs;
    }

    public CreateCompletionRequest maxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
        return this;
    }

    /**
     * The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
     * minimum: 0
     * @return maxTokens
     **/
    @Nullable
    @Min(0)
    @Schema(name = "max_tokens", example = "16", description = "The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_MAX_TOKENS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getMaxTokens() {
        return maxTokens;
    }

    @JsonProperty(JSON_PROPERTY_MAX_TOKENS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setMaxTokens(Integer maxTokens) {
        this.maxTokens = maxTokens;
    }

    public CreateCompletionRequest n(Integer n) {
        this.n = n;
        return this;
    }

    /**
     * How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
     * minimum: 1
     * maximum: 128
     * @return n
     **/
    @Nullable
    @Min(1)
    @Max(128)
    @Schema(name = "n", example = "1", description = "How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_N)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getN() {
        return n;
    }

    @JsonProperty(JSON_PROPERTY_N)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setN(Integer n) {
        this.n = n;
    }

    public CreateCompletionRequest presencePenalty(BigDecimal presencePenalty) {
        this.presencePenalty = presencePenalty;
        return this;
    }

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
     * minimum: -2
     * maximum: 2
     * @return presencePenalty
     **/
    @Nullable
    @DecimalMin("-2")
    @DecimalMax("2")
    @Schema(name = "presence_penalty", description = "Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_PRESENCE_PENALTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getPresencePenalty() {
        return presencePenalty;
    }

    @JsonProperty(JSON_PROPERTY_PRESENCE_PENALTY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPresencePenalty(BigDecimal presencePenalty) {
        this.presencePenalty = presencePenalty;
    }

    public CreateCompletionRequest seed(Integer seed) {
        this.seed = seed;
        return this;
    }

    /**
     * If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. 
     * minimum: -9223372036854775808
     * maximum: 9223372036854775807
     * @return seed
     **/
    @Nullable
    @Min(-9223372036854775808)
    @Max(9223372036854775807)
    @Schema(name = "seed", description = "If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getSeed() {
        return seed;
    }

    @JsonProperty(JSON_PROPERTY_SEED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSeed(Integer seed) {
        this.seed = seed;
    }

    public CreateCompletionRequest stop(CreateCompletionRequestStop stop) {
        this.stop = stop;
        return this;
    }

    /**
     * Get stop
     * @return stop
     **/
    @Valid
    @Nullable
    @Schema(name = "stop", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public CreateCompletionRequestStop getStop() {
        return stop;
    }

    @JsonProperty(JSON_PROPERTY_STOP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStop(CreateCompletionRequestStop stop) {
        this.stop = stop;
    }

    public CreateCompletionRequest stream(Boolean stream) {
        this.stream = stream;
        return this;
    }

    /**
     * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
     * @return stream
     **/
    @Nullable
    @Schema(name = "stream", description = "Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_STREAM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getStream() {
        return stream;
    }

    @JsonProperty(JSON_PROPERTY_STREAM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStream(Boolean stream) {
        this.stream = stream;
    }

    public CreateCompletionRequest suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * The suffix that comes after a completion of inserted text.  This parameter is only supported for &#x60;gpt-3.5-turbo-instruct&#x60;. 
     * @return suffix
     **/
    @Nullable
    @Schema(name = "suffix", example = "test.", description = "The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SUFFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getSuffix() {
        return suffix;
    }

    @JsonProperty(JSON_PROPERTY_SUFFIX)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public CreateCompletionRequest temperature(BigDecimal temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
     * minimum: 0
     * maximum: 2
     * @return temperature
     **/
    @Nullable
    @DecimalMin("0")
    @DecimalMax("2")
    @Schema(name = "temperature", example = "1", description = "What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TEMPERATURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getTemperature() {
        return temperature;
    }

    @JsonProperty(JSON_PROPERTY_TEMPERATURE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public CreateCompletionRequest topP(BigDecimal topP) {
        this.topP = topP;
        return this;
    }

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
     * minimum: 0
     * maximum: 1
     * @return topP
     **/
    @Nullable
    @DecimalMin("0")
    @DecimalMax("1")
    @Schema(name = "top_p", example = "1", description = "An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_TOP_P)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public BigDecimal getTopP() {
        return topP;
    }

    @JsonProperty(JSON_PROPERTY_TOP_P)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTopP(BigDecimal topP) {
        this.topP = topP;
    }

    public CreateCompletionRequest user(String user) {
        this.user = user;
        return this;
    }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @return user
     **/
    @Nullable
    @Schema(name = "user", example = "user-1234", description = "A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUser() {
        return user;
    }

    @JsonProperty(JSON_PROPERTY_USER)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
        return Objects.equals(this.model, createCompletionRequest.model) &&
            Objects.equals(this.prompt, createCompletionRequest.prompt) &&
            Objects.equals(this.bestOf, createCompletionRequest.bestOf) &&
            Objects.equals(this.echo, createCompletionRequest.echo) &&
            Objects.equals(this.frequencyPenalty, createCompletionRequest.frequencyPenalty) &&
            Objects.equals(this.logitBias, createCompletionRequest.logitBias) &&
            Objects.equals(this.logprobs, createCompletionRequest.logprobs) &&
            Objects.equals(this.maxTokens, createCompletionRequest.maxTokens) &&
            Objects.equals(this.n, createCompletionRequest.n) &&
            Objects.equals(this.presencePenalty, createCompletionRequest.presencePenalty) &&
            Objects.equals(this.seed, createCompletionRequest.seed) &&
            Objects.equals(this.stop, createCompletionRequest.stop) &&
            Objects.equals(this.stream, createCompletionRequest.stream) &&
            Objects.equals(this.suffix, createCompletionRequest.suffix) &&
            Objects.equals(this.temperature, createCompletionRequest.temperature) &&
            Objects.equals(this.topP, createCompletionRequest.topP) &&
            Objects.equals(this.user, createCompletionRequest.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, prompt, bestOf, echo, frequencyPenalty, logitBias, logprobs, maxTokens, n, presencePenalty, seed, stop, stream, suffix, temperature, topP, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCompletionRequest {\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    bestOf: ").append(toIndentedString(bestOf)).append("\n");
        sb.append("    echo: ").append(toIndentedString(echo)).append("\n");
        sb.append("    frequencyPenalty: ").append(toIndentedString(frequencyPenalty)).append("\n");
        sb.append("    logitBias: ").append(toIndentedString(logitBias)).append("\n");
        sb.append("    logprobs: ").append(toIndentedString(logprobs)).append("\n");
        sb.append("    maxTokens: ").append(toIndentedString(maxTokens)).append("\n");
        sb.append("    n: ").append(toIndentedString(n)).append("\n");
        sb.append("    presencePenalty: ").append(toIndentedString(presencePenalty)).append("\n");
        sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
        sb.append("    stop: ").append(toIndentedString(stop)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    topP: ").append(toIndentedString(topP)).append("\n");
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
