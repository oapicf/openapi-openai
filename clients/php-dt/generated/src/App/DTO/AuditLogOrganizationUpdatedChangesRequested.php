<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to update the organization settings.
 */
class AuditLogOrganizationUpdatedChangesRequested
{
    /**
     * The organization title.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * The organization description.
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * The organization name.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="settings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogOrganizationUpdatedChangesRequestedSettings::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogOrganizationUpdatedChangesRequestedSettings::class})
     */
    public ?\App\DTO\AuditLogOrganizationUpdatedChangesRequestedSettings $settings = null;

}
