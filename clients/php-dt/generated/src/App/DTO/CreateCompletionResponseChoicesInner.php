<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateCompletionResponseChoicesInner
{
    /**
     * The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, or &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters.
     * @DTA\Data(field="finish_reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $finish_reason = null;

    /**
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * @DTA\Data(field="logprobs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     */
    public ?\App\DTO\CreateCompletionResponseChoicesInnerLogprobs $logprobs = null;

    /**
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

}
