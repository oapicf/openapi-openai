<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateChatCompletionResponseChoicesInner
{
    /**
     * @DTA\Data(field="index", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $index = null;

    /**
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionResponseMessage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionResponseMessage::class})
     */
    public ?\App\DTO\ChatCompletionResponseMessage $message = null;

    /**
     * @DTA\Data(field="finish_reason", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $finish_reason = null;

}
