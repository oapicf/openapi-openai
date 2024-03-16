<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateCompletionResponseChoicesInner
{
    /**
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

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
     * @DTA\Data(field="finish_reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $finish_reason = null;

}
