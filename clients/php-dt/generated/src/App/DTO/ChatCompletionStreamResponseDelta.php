<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A chat completion delta generated by streamed model responses.
 */
class ChatCompletionStreamResponseDelta
{
    /**
     * The contents of the chunk message.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content = null;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionStreamResponseDeltaFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionStreamResponseDeltaFunctionCall::class})
     */
    public ?\App\DTO\ChatCompletionStreamResponseDeltaFunctionCall $function_call = null;

    /**
     * @DTA\Data(field="tool_calls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $tool_calls = null;

    /**
     * The role of the author of this message.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

}
