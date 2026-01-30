<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Details of the error.
 */
class RealtimeServerEventErrorError
{
    /**
     * The type of error (e.g., \&quot;invalid_request_error\&quot;, \&quot;server_error\&quot;).
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * Error code, if any.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code = null;

    /**
     * A human-readable error message.
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

    /**
     * Parameter related to the error, if any.
     * @DTA\Data(field="param", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $param = null;

    /**
     * The event_id of the client event that caused the error, if applicable.
     * @DTA\Data(field="event_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event_id = null;

}
