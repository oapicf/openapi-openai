<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ChatCompletionStreamResponseDelta
{
    /**
     * The role of the author of this message.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * The contents of the chunk message.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content = null;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageFunctionCall::class})
     */
    public ?\App\DTO\ChatCompletionRequestMessageFunctionCall $function_call = null;

}
