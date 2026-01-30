<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string.
 */
class RealtimeClientEventSessionUpdate
{
    /**
     * Optional client-generated ID used to identify this event.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;session.update&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="session")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeSessionCreateRequest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeSessionCreateRequest::class})
     */
    public ?\App\DTO\RealtimeSessionCreateRequest $session = null;

}
