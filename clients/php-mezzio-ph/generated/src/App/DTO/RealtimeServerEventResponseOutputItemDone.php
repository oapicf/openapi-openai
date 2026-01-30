<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled.
 */
class RealtimeServerEventResponseOutputItemDone
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;response.output_item.done&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The ID of the Response to which the item belongs.
     * @DTA\Data(field="response_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_id;

    /**
     * The index of the output item in the Response.
     * @DTA\Data(field="output_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $output_index;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeConversationItem::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeConversationItem::class})
     * @var \App\DTO\RealtimeConversationItem|null
     */
    public $item;

}
