<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionRequestMessage
{
    /**
     * The role of the messages author. One of &#x60;system&#x60;, &#x60;user&#x60;, &#x60;assistant&#x60;, or &#x60;function&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * The contents of the message. &#x60;content&#x60; is required for all messages except assistant messages with function calls.
     * @DTA\Data(field="content", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content;

    /**
     * The name of the author of this message. &#x60;name&#x60; is required if role is &#x60;function&#x60;, and it should be the name of the function whose response is in the &#x60;content&#x60;. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="function_call", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageFunctionCall::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageFunctionCall::class})
     * @var \App\DTO\ChatCompletionRequestMessageFunctionCall|null
     */
    public $function_call;

}
