<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent.
 */
class RealtimeClientEventConversationItemCreate
{
    /**
     * Optional client-generated ID used to identify this event.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;conversation.item.create&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added.
     * @DTA\Data(field="previous_item_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $previous_item_id;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeConversationItem::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeConversationItem::class})
     * @var \App\DTO\RealtimeConversationItem|null
     */
    public $item;

}
