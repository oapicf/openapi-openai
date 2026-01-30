<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only.
 */
class RealtimeClientEventResponseCreate
{
    /**
     * Optional client-generated ID used to identify this event.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;response.create&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="response", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponseCreateParams::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponseCreateParams::class})
     */
    public ?\App\DTO\RealtimeResponseCreateParams $response = null;

}
