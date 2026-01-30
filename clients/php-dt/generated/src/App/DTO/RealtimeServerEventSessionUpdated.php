<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error.
 */
class RealtimeServerEventSessionUpdated
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;session.updated&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="session")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeSession::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeSession::class})
     */
    public ?\App\DTO\RealtimeSession $session = null;

}
