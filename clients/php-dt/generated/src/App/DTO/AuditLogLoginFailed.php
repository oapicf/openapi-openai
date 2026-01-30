<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The details for events with this &#x60;type&#x60;.
 */
class AuditLogLoginFailed
{
    /**
     * The error code of the failure.
     * @DTA\Data(field="error_code", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error_code = null;

    /**
     * The error message of the failure.
     * @DTA\Data(field="error_message", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $error_message = null;

}
