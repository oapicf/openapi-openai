<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when the model-generated transcription of audio output is updated.
 */
class RealtimeServerEventResponseAudioTranscriptDelta
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;response.audio_transcript.delta&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The ID of the response.
     * @DTA\Data(field="response_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_id;

    /**
     * The ID of the item.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * The index of the output item in the response.
     * @DTA\Data(field="output_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $output_index;

    /**
     * The index of the content part in the item&#39;s content array.
     * @DTA\Data(field="content_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $content_index;

    /**
     * The transcript delta.
     * @DTA\Data(field="delta")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $delta;

}
