<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration.
 */
class RealtimeServerEventSessionCreated
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;session.created&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="session")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeSession::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeSession::class})
     * @var \App\DTO\RealtimeSession|null
     */
    public $session;

}
