<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The details for events with this &#x60;type&#x60;.
 */
class AuditLogUserAdded
{
    /**
     * The user ID.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogUserAddedData::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogUserAddedData::class})
     * @var \App\DTO\AuditLogUserAddedData|null
     */
    public $data;

}
