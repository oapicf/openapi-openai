<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateCompletionResponseChoicesInner
{
    /**
     * @DTA\Data(field="text")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $text;

    /**
     * @DTA\Data(field="index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * @DTA\Data(field="logprobs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseChoicesInnerLogprobs::class})
     * @var \App\DTO\CreateCompletionResponseChoicesInnerLogprobs|null
     */
    public $logprobs;

    /**
     * @DTA\Data(field="finish_reason")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $finish_reason;

}
