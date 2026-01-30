<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item.
 */
class RealtimeServerEventConversationItemInputAudioTranscriptionFailed
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;conversation.item.input_audio_transcription.failed&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The ID of the user message item.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * The index of the content part containing the audio.
     * @DTA\Data(field="content_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $content_index = null;

    /**
     * @DTA\Data(field="error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeServerEventConversationItemInputAudioTranscriptionFailedError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeServerEventConversationItemInputAudioTranscriptionFailedError::class})
     */
    public ?\App\DTO\RealtimeServerEventConversationItemInputAudioTranscriptionFailedError $error = null;

}
