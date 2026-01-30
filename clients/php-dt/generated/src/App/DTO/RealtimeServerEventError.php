<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default.
 */
class RealtimeServerEventError
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;error&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeServerEventErrorError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeServerEventErrorError::class})
     */
    public ?\App\DTO\RealtimeServerEventErrorError $error = null;

}
