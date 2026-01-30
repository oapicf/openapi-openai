<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a new Item is created during Response generation.
 */
class RealtimeServerEventResponseOutputItemAdded
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;response.output_item.added&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The ID of the Response to which the item belongs.
     * @DTA\Data(field="response_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_id = null;

    /**
     * The index of the output item in the Response.
     * @DTA\Data(field="output_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $output_index = null;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeConversationItem::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeConversationItem::class})
     */
    public ?\App\DTO\RealtimeConversationItem $item = null;

}
