<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer.
 */
class RealtimeServerEventInputAudioBufferSpeechStopped
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;input_audio_buffer.speech_stopped&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  &#x60;min_silence_duration_ms&#x60; configured in the Session.
     * @DTA\Data(field="audio_end_ms")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $audio_end_ms = null;

    /**
     * The ID of the user message item that will be created.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

}
