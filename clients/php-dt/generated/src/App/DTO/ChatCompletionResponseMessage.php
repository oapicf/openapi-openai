<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A chat completion message generated by the model.
 */
class ChatCompletionResponseMessage
{
    /**
     * The contents of the message.
     * @DTA\Data(field="content")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content = null;

    /**
     * The tool calls generated by the model, such as function calls.
     * @DTA\Data(field="tool_calls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     */
    public ?\App\DTO\Collection5 $tool_calls = null;

    /**
     * The role of the author of this message.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestAssistantMessageFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestAssistantMessageFunctionCall::class})
     */
    public ?\App\DTO\ChatCompletionRequestAssistantMessageFunctionCall $function_call = null;

}
