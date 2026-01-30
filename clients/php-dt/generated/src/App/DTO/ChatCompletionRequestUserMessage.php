<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Messages sent by an end user, containing prompts or additional context information.
 */
class ChatCompletionRequestUserMessage
{
    /**
     * @DTA\Data(field="content")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestUserMessageContent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestUserMessageContent::class})
     */
    public ?\App\DTO\ChatCompletionRequestUserMessageContent $content = null;

    /**
     * The role of the messages author, in this case &#x60;user&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
