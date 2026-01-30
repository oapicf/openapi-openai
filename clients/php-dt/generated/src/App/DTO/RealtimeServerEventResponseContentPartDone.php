<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled.
 */
class RealtimeServerEventResponseContentPartDone
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;response.content_part.done&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The ID of the response.
     * @DTA\Data(field="response_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $response_id = null;

    /**
     * The ID of the item.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $item_id = null;

    /**
     * The index of the output item in the response.
     * @DTA\Data(field="output_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $output_index = null;

    /**
     * The index of the content part in the item&#39;s content array.
     * @DTA\Data(field="content_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $content_index = null;

    /**
     * @DTA\Data(field="part")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RealtimeServerEventResponseContentPartDonePart::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RealtimeServerEventResponseContentPartDonePart::class})
     */
    public ?\App\DTO\RealtimeServerEventResponseContentPartDonePart $part = null;

}
