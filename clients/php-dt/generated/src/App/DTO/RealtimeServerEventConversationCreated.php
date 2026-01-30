<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a conversation is created. Emitted right after session creation.
 */
class RealtimeServerEventConversationCreated
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;conversation.created&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="conversation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeServerEventConversationCreatedConversation::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeServerEventConversationCreatedConversation::class})
     */
    public ?\App\DTO\RealtimeServerEventConversationCreatedConversation $conversation = null;

}
