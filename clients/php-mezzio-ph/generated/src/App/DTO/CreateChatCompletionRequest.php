<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateChatCompletionRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateChatCompletionRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateChatCompletionRequestModel::class})
     * @var \App\DTO\CreateChatCompletionRequestModel|null
     */
    public $model;

    /**
     * A list of messages comprising the conversation so far. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_format_inputs_to_ChatGPT_models.ipynb).
     * @DTA\Data(field="messages")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     * @var \App\DTO\Collection|null
     */
    public $messages;

    /**
     * A list of functions the model may generate JSON inputs for.
     * @DTA\Data(field="functions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection2::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection2::class})
     * @var \App\DTO\Collection2|null
     */
    public $functions;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateChatCompletionRequestFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateChatCompletionRequestFunctionCall::class})
     * @var \App\DTO\CreateChatCompletionRequestFunctionCall|null
     */
    public $function_call;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2, "inclusive":true})
     * @var float|null
     */
    public $temperature;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.
     * @DTA\Data(field="top_p", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":0, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":1, "inclusive":true})
     * @var float|null
     */
    public $top_p;

    /**
     * How many chat completion choices to generate for each input message.
     * @DTA\Data(field="n", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":1, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":128, "inclusive":true})
     * @var int|null
     */
    public $n;

    /**
     * If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb).
     * @DTA\Data(field="stream", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $stream;

    /**
     * @DTA\Data(field="stop", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateChatCompletionRequestStop::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateChatCompletionRequestStop::class})
     * @var \App\DTO\CreateChatCompletionRequestStop|null
     */
    public $stop;

    /**
     * The maximum number of [tokens](/tokenizer) to generate in the chat completion.  The total length of input tokens and generated tokens is limited by the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.
     * @DTA\Data(field="max_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_tokens;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)
     * @DTA\Data(field="presence_penalty", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2, "inclusive":true})
     * @var float|null
     */
    public $presence_penalty;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)
     * @DTA\Data(field="frequency_penalty", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2, "inclusive":true})
     * @var float|null
     */
    public $frequency_penalty;

    /**
     * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.
     * @DTA\Data(field="logit_bias", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $logit_bias;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $user;

}
