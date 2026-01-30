<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead.
 */
class ChatCompletionRequestSystemMessage
{
    /**
     * @DTA\Data(field="content")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestSystemMessageContent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestSystemMessageContent::class})
     * @var \App\DTO\ChatCompletionRequestSystemMessageContent|null
     */
    public $content;

    /**
     * The role of the messages author, in this case &#x60;system&#x60;.
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

}
