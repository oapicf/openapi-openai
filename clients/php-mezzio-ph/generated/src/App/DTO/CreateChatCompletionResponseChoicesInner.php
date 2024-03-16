<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateChatCompletionResponseChoicesInner
{
    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $index;

    /**
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionResponseMessage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionResponseMessage::class})
     * @var \App\DTO\ChatCompletionResponseMessage|null
     */
    public $message;

    /**
     * @DTA\Data(field="finish_reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $finish_reason;

}
