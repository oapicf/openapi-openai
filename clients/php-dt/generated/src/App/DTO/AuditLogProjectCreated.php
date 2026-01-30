<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The details for events with this &#x60;type&#x60;.
 */
class AuditLogProjectCreated
{
    /**
     * The project ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogProjectCreatedData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogProjectCreatedData::class})
     */
    public ?\App\DTO\AuditLogProjectCreatedData $data = null;

}
