<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateEditResponseChoicesInner
{
    /**
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * @DTA\Data(field="logprobs", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     * @var \App\DTO\CreateCompletionResponseChoicesInnerLogprobs|null
     */
    public $logprobs;

    /**
     * @DTA\Data(field="finish_reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $finish_reason;

}
