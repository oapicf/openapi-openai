<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateChatCompletionFunctionResponseChoicesInner
{
    /**
     * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function.
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

    /**
     * @DTA\Data(field="message")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionResponseMessage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionResponseMessage::class})
     */
    public ?\App\DTO\ChatCompletionResponseMessage $message = null;

}
