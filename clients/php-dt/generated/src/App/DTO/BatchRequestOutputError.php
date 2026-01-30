<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
 */
class BatchRequestOutputError
{
    /**
     * A machine-readable error code.
     * @DTA\Data(field="code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $code = null;

    /**
     * A human-readable error message.
     * @DTA\Data(field="message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
