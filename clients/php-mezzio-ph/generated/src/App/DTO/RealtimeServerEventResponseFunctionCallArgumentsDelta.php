<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Returned when the model-generated function call arguments are updated.
 */
class RealtimeServerEventResponseFunctionCallArgumentsDelta
{
    /**
     * The unique ID of the server event.
     * @DTA\Data(field="event_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event_id;

    /**
     * The event type, must be &#x60;response.function_call_arguments.delta&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * The ID of the response.
     * @DTA\Data(field="response_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $response_id;

    /**
     * The ID of the function call item.
     * @DTA\Data(field="item_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $item_id;

    /**
     * The index of the output item in the response.
     * @DTA\Data(field="output_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $output_index;

    /**
     * The ID of the function call.
     * @DTA\Data(field="call_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $call_id;

    /**
     * The arguments delta as a JSON string.
     * @DTA\Data(field="delta")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $delta;

}
