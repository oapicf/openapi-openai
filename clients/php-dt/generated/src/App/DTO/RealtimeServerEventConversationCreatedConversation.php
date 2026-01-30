<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The conversation resource.
 */
class RealtimeServerEventConversationCreatedConversation
{
    /**
     * The unique ID of the conversation.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, must be &#x60;realtime.conversation&#x60;.
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

}
