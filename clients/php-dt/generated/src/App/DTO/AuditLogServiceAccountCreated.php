<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The details for events with this &#x60;type&#x60;.
 */
class AuditLogServiceAccountCreated
{
    /**
     * The service account ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogServiceAccountCreatedData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogServiceAccountCreatedData::class})
     */
    public ?\App\DTO\AuditLogServiceAccountCreatedData $data = null;

}
