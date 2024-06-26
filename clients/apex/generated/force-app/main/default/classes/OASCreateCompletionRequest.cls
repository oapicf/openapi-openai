/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASCreateCompletionRequest
 */
public class OASCreateCompletionRequest implements OAS.MappedProperties {
    /**
     * Get model
     * @return model
     */
    public OASCreateCompletionRequestModel model { get; set; }

    /**
     * Get prompt
     * @return prompt
     */
    public OASCreateCompletionRequestPrompt prompt { get; set; }

    /**
     * Generates `best_of` completions server-side and returns the "best" (the one with the highest log probability per token). Results cannot be streamed.\n\nWhen used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.\n\n**Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.\n
     * minimum: 0
     * maximum: 20
     * @return bestOf
     */
    public Integer bestOf { get; set; }

    /**
     * Echo back the prompt in addition to the completion\n
     * @return echo
     */
    public Boolean echo { get; set; }

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model\'s likelihood to repeat the same line verbatim.\n\n[See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)\n
     * minimum: -2
     * maximum: 2
     * @return frequencyPenalty
     */
    public Double frequencyPenalty { get; set; }

    /**
     * Modify the likelihood of specified tokens appearing in the completion.\n\nAccepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.\n\nAs an example, you can pass `{"50256": -100}` to prevent the <|endoftext|> token from being generated.\n
     * @return logitBias
     */
    public Map<String, Integer> logitBias { get; set; }

    /**
     * Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.\n\nThe maximum value for `logprobs` is 5.\n
     * minimum: 0
     * maximum: 5
     * @return logprobs
     */
    public Integer logprobs { get; set; }

    /**
     * The maximum number of [tokens](/tokenizer) that can be generated in the completion.\n\nThe token count of your prompt plus `max_tokens` cannot exceed the model\'s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.\n
     * minimum: 0
     * @return maxTokens
     */
    public Integer maxTokens { get; set; }

    /**
     * How many completions to generate for each prompt.\n\n**Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.\n
     * minimum: 1
     * maximum: 128
     * @return n
     */
    public Integer n { get; set; }

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model\'s likelihood to talk about new topics.\n\n[See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)\n
     * minimum: -2
     * maximum: 2
     * @return presencePenalty
     */
    public Double presencePenalty { get; set; }

    /**
     * If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.\n\nDeterminism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.\n
     * minimum: -9223372036854775808
     * maximum: 9223372036854775807
     * @return seed
     */
    public Integer seed { get; set; }

    /**
     * Get stop
     * @return stop
     */
    public OASCreateCompletionRequestStop stop { get; set; }

    /**
     * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).\n
     * @return stream
     */
    public Boolean stream { get; set; }

    /**
     * The suffix that comes after a completion of inserted text.\n\nThis parameter is only supported for `gpt-3.5-turbo-instruct`.\n
     * @return suffix
     */
    public String suffix { get; set; }

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.\n\nWe generally recommend altering this or `top_p` but not both.\n
     * minimum: 0
     * maximum: 2
     * @return temperature
     */
    public Double temperature { get; set; }

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.\n\nWe generally recommend altering this or `temperature` but not both.\n
     * minimum: 0
     * maximum: 1
     * @return topP
     */
    public Double topP { get; set; }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).\n
     * @return user
     */
    public String user { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'best_of' => 'bestOf',
        'frequency_penalty' => 'frequencyPenalty',
        'logit_bias' => 'logitBias',
        'max_tokens' => 'maxTokens',
        'presence_penalty' => 'presencePenalty',
        'top_p' => 'topP'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'best_of' => 'bestOf',
        'frequency_penalty' => 'frequencyPenalty',
        'logit_bias' => 'logitBias',
        'max_tokens' => 'maxTokens',
        'presence_penalty' => 'presencePenalty',
        'top_p' => 'topP'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'best_of' => 'bestOf',
        'frequency_penalty' => 'frequencyPenalty',
        'logit_bias' => 'logitBias',
        'max_tokens' => 'maxTokens',
        'presence_penalty' => 'presencePenalty',
        'top_p' => 'topP'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'best_of' => 'bestOf',
        'frequency_penalty' => 'frequencyPenalty',
        'logit_bias' => 'logitBias',
        'max_tokens' => 'maxTokens',
        'presence_penalty' => 'presencePenalty',
        'top_p' => 'topP'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'best_of' => 'bestOf',
        'frequency_penalty' => 'frequencyPenalty',
        'logit_bias' => 'logitBias',
        'max_tokens' => 'maxTokens',
        'presence_penalty' => 'presencePenalty',
        'top_p' => 'topP'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'best_of' => 'bestOf',
        'frequency_penalty' => 'frequencyPenalty',
        'logit_bias' => 'logitBias',
        'max_tokens' => 'maxTokens',
        'presence_penalty' => 'presencePenalty',
        'top_p' => 'topP'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASCreateCompletionRequest() {
        bestOf = 1;
        echo = false;
        frequencyPenalty = 0;
        logitBias = new Map<String, Integer>();
        maxTokens = 16;
        n = 1;
        presencePenalty = 0;
        stream = false;
        temperature = 1;
        topP = 1;
    }

    public static OASCreateCompletionRequest getExample() {
        OASCreateCompletionRequest createCompletionRequest = new OASCreateCompletionRequest();
          createCompletionRequest.model = OASCreateCompletionRequestModel.getExample();
          createCompletionRequest.prompt = OASCreateCompletionRequestPrompt.getExample();
          createCompletionRequest.bestOf = 0;
          createCompletionRequest.echo = true;
          createCompletionRequest.frequencyPenalty = 1.3579;
          createCompletionRequest.logitBias = new Map<String, Integer>{'key'=>0};
          createCompletionRequest.logprobs = 0;
          createCompletionRequest.maxTokens = 16;
          createCompletionRequest.n = 1;
          createCompletionRequest.presencePenalty = 1.3579;
          createCompletionRequest.seed = 0;
          createCompletionRequest.stop = OASCreateCompletionRequestStop.getExample();
          createCompletionRequest.stream = true;
          createCompletionRequest.suffix = 'test.';
          createCompletionRequest.temperature = 1;
          createCompletionRequest.topP = 1;
          createCompletionRequest.user = 'user-1234';
        return createCompletionRequest;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASCreateCompletionRequest) {           
            OASCreateCompletionRequest createCompletionRequest = (OASCreateCompletionRequest) obj;
            return this.model == createCompletionRequest.model
                && this.prompt == createCompletionRequest.prompt
                && this.bestOf == createCompletionRequest.bestOf
                && this.echo == createCompletionRequest.echo
                && this.frequencyPenalty == createCompletionRequest.frequencyPenalty
                && this.logitBias == createCompletionRequest.logitBias
                && this.logprobs == createCompletionRequest.logprobs
                && this.maxTokens == createCompletionRequest.maxTokens
                && this.n == createCompletionRequest.n
                && this.presencePenalty == createCompletionRequest.presencePenalty
                && this.seed == createCompletionRequest.seed
                && this.stop == createCompletionRequest.stop
                && this.stream == createCompletionRequest.stream
                && this.suffix == createCompletionRequest.suffix
                && this.temperature == createCompletionRequest.temperature
                && this.topP == createCompletionRequest.topP
                && this.user == createCompletionRequest.user;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (model == null ? 0 : System.hashCode(model));
        hashCode = (17 * hashCode) + (prompt == null ? 0 : System.hashCode(prompt));
        hashCode = (17 * hashCode) + (bestOf == null ? 0 : System.hashCode(bestOf));
        hashCode = (17 * hashCode) + (echo == null ? 0 : System.hashCode(echo));
        hashCode = (17 * hashCode) + (frequencyPenalty == null ? 0 : System.hashCode(frequencyPenalty));
        hashCode = (17 * hashCode) + (logitBias == null ? 0 : System.hashCode(logitBias));
        hashCode = (17 * hashCode) + (logprobs == null ? 0 : System.hashCode(logprobs));
        hashCode = (17 * hashCode) + (maxTokens == null ? 0 : System.hashCode(maxTokens));
        hashCode = (17 * hashCode) + (n == null ? 0 : System.hashCode(n));
        hashCode = (17 * hashCode) + (presencePenalty == null ? 0 : System.hashCode(presencePenalty));
        hashCode = (17 * hashCode) + (seed == null ? 0 : System.hashCode(seed));
        hashCode = (17 * hashCode) + (stop == null ? 0 : System.hashCode(stop));
        hashCode = (17 * hashCode) + (stream == null ? 0 : System.hashCode(stream));
        hashCode = (17 * hashCode) + (suffix == null ? 0 : System.hashCode(suffix));
        hashCode = (17 * hashCode) + (temperature == null ? 0 : System.hashCode(temperature));
        hashCode = (17 * hashCode) + (topP == null ? 0 : System.hashCode(topP));
        hashCode = (17 * hashCode) + (user == null ? 0 : System.hashCode(user));
        return hashCode;
    }
}

