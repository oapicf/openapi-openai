<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel.
 */
class RealtimeClientEventResponseCancel
{
    /**
     * Optional client-generated ID used to identify this event.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;response.cancel&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation.
     * @DTA\Data(field="response_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_id;

}
