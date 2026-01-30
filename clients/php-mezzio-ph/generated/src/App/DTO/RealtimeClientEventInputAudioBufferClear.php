<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event.
 */
class RealtimeClientEventInputAudioBufferClear
{
    /**
     * Optional client-generated ID used to identify this event.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;input_audio_buffer.clear&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

}
