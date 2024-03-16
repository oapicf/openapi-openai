<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionResponseMessage
{
    /**
     * The role of the author of this message.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * The contents of the message.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageFunctionCall::class})
     * @var \App\DTO\ChatCompletionRequestMessageFunctionCall|null
     */
    public $function_call;

}
