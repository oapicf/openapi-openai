<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.
 */
class RealtimeClientEventConversationItemTruncate
{
    /**
     * Optional client-generated ID used to identify this event.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;conversation.item.truncate&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The ID of the assistant message item to truncate. Only assistant message  items can be truncated.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * The index of the content part to truncate. Set this to 0.
     * @DTA\Data(field="content_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $content_index;

    /**
     * Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error.
     * @DTA\Data(field="audio_end_ms")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $audio_end_ms;

}
