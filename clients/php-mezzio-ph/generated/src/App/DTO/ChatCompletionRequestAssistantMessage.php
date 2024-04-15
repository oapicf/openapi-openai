<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionRequestAssistantMessage
{
    /**
     * The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content;

    /**
     * The role of the messages author, in this case &#x60;assistant&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The tool calls generated by the model, such as function calls.
     * @DTA\Data(field="tool_calls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection5::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection5::class})
     * @var \App\DTO\Collection5|null
     */
    public $tool_calls;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestAssistantMessageFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestAssistantMessageFunctionCall::class})
     * @var \App\DTO\ChatCompletionRequestAssistantMessageFunctionCall|null
     */
    public $function_call;

}