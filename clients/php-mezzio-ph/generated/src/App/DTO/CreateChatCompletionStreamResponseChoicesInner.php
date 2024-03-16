<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateChatCompletionStreamResponseChoicesInner
{
    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * @DTA\Data(field="delta", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionStreamResponseDelta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionStreamResponseDelta::class})
     * @var \App\DTO\ChatCompletionStreamResponseDelta|null
     */
    public $delta;

    /**
     * @DTA\Data(field="finish_reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $finish_reason;

}
