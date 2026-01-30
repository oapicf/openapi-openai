<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when an earlier assistant audio message item is truncated by the  client with a &#x60;conversation.item.truncate&#x60; event. This event is used to  synchronize the server&#39;s understanding of the audio with the client&#39;s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn&#39;t been heard by the user.
 */
class RealtimeServerEventConversationItemTruncated
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;conversation.item.truncated&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The ID of the assistant message item that was truncated.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * The index of the content part that was truncated.
     * @DTA\Data(field="content_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $content_index = null;

    /**
     * The duration up to which the audio was truncated, in milliseconds.
     * @DTA\Data(field="audio_end_ms")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $audio_end_ms = null;

}
