<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateChatCompletionStreamResponseChoicesInner
{
    /**
     * @DTA\Data(field="delta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionStreamResponseDelta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionStreamResponseDelta::class})
     */
    public ?\App\DTO\ChatCompletionStreamResponseDelta $delta = null;

    /**
     * @DTA\Data(field="logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateChatCompletionResponseChoicesInnerLogprobs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateChatCompletionResponseChoicesInnerLogprobs::class})
     */
    public ?\App\DTO\CreateChatCompletionResponseChoicesInnerLogprobs $logprobs = null;

    /**
     * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, &#x60;tool_calls&#x60; if the model called a tool, or &#x60;function_call&#x60; (deprecated) if the model called a function.
     * @DTA\Data(field="finish_reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $finish_reason = null;

    /**
     * The index of the choice in the list of choices.
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

}
