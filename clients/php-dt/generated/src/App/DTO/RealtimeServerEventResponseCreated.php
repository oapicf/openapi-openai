<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of &#x60;in_progress&#x60;.
 */
class RealtimeServerEventResponseCreated
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;response.created&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="response")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeResponse::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeResponse::class})
     */
    public ?\App\DTO\RealtimeResponse $response = null;

}
