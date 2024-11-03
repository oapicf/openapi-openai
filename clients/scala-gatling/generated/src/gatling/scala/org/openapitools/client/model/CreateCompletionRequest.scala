
package org.openapitools.client.model


case class CreateCompletionRequest (
    _model: CreateCompletionRequestModel,
    _prompt: CreateCompletionRequestPrompt,
    /* Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.  */
    _bestOf: Option[Integer],
    /* Echo back the prompt in addition to the completion  */
    _echo: Option[Boolean],
    /* Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  */
    _frequencyPenalty: Option[Number],
    /* Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated.  */
    _logitBias: Option[Map[String, Integer]],
    /* Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5.  */
    _logprobs: Option[Integer],
    /* The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.  */
    _maxTokens: Option[Integer],
    /* How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`.  */
    _n: Option[Integer],
    /* Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details)  */
    _presencePenalty: Option[Number],
    /* If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend.  */
    _seed: Option[Integer],
    _stop: Option[CreateCompletionRequestStop],
    /* Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions).  */
    _stream: Option[Boolean],
    /* The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`.  */
    _suffix: Option[String],
    /* What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  */
    _temperature: Option[Number],
    /* An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  */
    _topP: Option[Number],
    /* A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).  */
    _user: Option[String]
)
object CreateCompletionRequest {
    def toStringBody(var_model: Object, var_prompt: Object, var_bestOf: Object, var_echo: Object, var_frequencyPenalty: Object, var_logitBias: Object, var_logprobs: Object, var_maxTokens: Object, var_n: Object, var_presencePenalty: Object, var_seed: Object, var_stop: Object, var_stream: Object, var_suffix: Object, var_temperature: Object, var_topP: Object, var_user: Object) =
        s"""
        | {
        | "model":$var_model,"prompt":$var_prompt,"bestOf":$var_bestOf,"echo":$var_echo,"frequencyPenalty":$var_frequencyPenalty,"logitBias":$var_logitBias,"logprobs":$var_logprobs,"maxTokens":$var_maxTokens,"n":$var_n,"presencePenalty":$var_presencePenalty,"seed":$var_seed,"stop":$var_stop,"stream":$var_stream,"suffix":$var_suffix,"temperature":$var_temperature,"topP":$var_topP,"user":$var_user
        | }
        """.stripMargin
}
