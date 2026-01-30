<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation.
 */
class RealtimeServerEventConversationItemCreated
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;conversation.item.created&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation.
     * @DTA\Data(field="previous_item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $previous_item_id = null;

    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeConversationItem::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeConversationItem::class})
     */
    public ?\App\DTO\RealtimeConversationItem $item = null;

}
