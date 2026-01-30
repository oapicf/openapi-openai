<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled.
 */
class RealtimeServerEventResponseFunctionCallArgumentsDone
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

    /**
     * The event type, must be &#x60;response.function_call_arguments.done&#x60;.
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
     * The ID of the function call item.
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
     * The ID of the function call.
     * @DTA\Data(field="call_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $call_id = null;

    /**
     * The final arguments as a JSON string.
     * @DTA\Data(field="arguments")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $arguments = null;

}
