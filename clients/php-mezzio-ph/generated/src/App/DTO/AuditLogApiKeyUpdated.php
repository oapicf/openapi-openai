<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The details for events with this &#x60;type&#x60;.
 */
class AuditLogApiKeyUpdated
{
    /**
     * The tracking ID of the API key.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="changes_requested", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogApiKeyUpdatedChangesRequested::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogApiKeyUpdatedChangesRequested::class})
     * @var \App\DTO\AuditLogApiKeyUpdatedChangesRequested|null
     */
    public $changes_requested;

}
