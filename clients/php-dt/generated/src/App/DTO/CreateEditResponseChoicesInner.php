<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateEditResponseChoicesInner
{
    /**
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * @DTA\Data(field="logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     */
    public ?\App\DTO\CreateCompletionResponseChoicesInnerLogprobs $logprobs = null;

    /**
     * @DTA\Data(field="finish_reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $finish_reason = null;

}
