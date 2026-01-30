<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data.
 */
class RealtimeServerEventResponseDone
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;response.done&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="response")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponse::class})
     * @var \App\DTO\RealtimeResponse|null
     */
    public $response;

}
