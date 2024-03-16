<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateCompletionRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionRequestModel::class})
     */
    public ?\App\DTO\CreateCompletionRequestModel $model = null;

    /**
     * @DTA\Data(field="prompt")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionRequestPrompt::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionRequestPrompt::class})
     */
    public ?\App\DTO\CreateCompletionRequestPrompt $prompt = null;

    /**
     * The suffix that comes after a completion of inserted text.
     * @DTA\Data(field="suffix", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $suffix = null;

    /**
     * The maximum number of [tokens](/tokenizer) to generate in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.
     * @DTA\Data(field="max_tokens", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0})
     */
    public ?int $max_tokens = null;

    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both.
     * @DTA\Data(field="temperature", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":2})
     */
    public ?float $temperature = null;

    /**
     * An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both.
     * @DTA\Data(field="top_p", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":0, "max":1})
     */
    public ?float $top_p = null;

    /**
     * How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;.
     * @DTA\Data(field="n", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1, "max":128})
     */
    public ?int $n = null;

    /**
     * Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_stream_completions.ipynb).
     * @DTA\Data(field="stream", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $stream = null;

    /**
     * Include the log probabilities on the &#x60;logprobs&#x60; most likely tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5.
     * @DTA\Data(field="logprobs", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":5})
     */
    public ?int $logprobs = null;

    /**
     * Echo back the prompt in addition to the completion
     * @DTA\Data(field="echo", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $echo = null;

    /**
     * @DTA\Data(field="stop", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionRequestStop::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionRequestStop::class})
     */
    public ?\App\DTO\CreateCompletionRequestStop $stop = null;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)
     * @DTA\Data(field="presence_penalty", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":-2, "max":2})
     */
    public ?float $presence_penalty = null;

    /**
     * Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/api-reference/parameter-details)
     * @DTA\Data(field="frequency_penalty", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @DTA\Validator(name="Range", options={"min":-2, "max":2})
     */
    public ?float $frequency_penalty = null;

    /**
     * Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;.
     * @DTA\Data(field="best_of", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":20})
     */
    public ?int $best_of = null;

    /**
     * Modify the likelihood of specified tokens appearing in the completion.  Accepts a json object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) (which works for both GPT-2 and GPT-3) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated.
     * @DTA\Data(field="logit_bias", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $logit_bias = null;

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids).
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $user = null;

}
