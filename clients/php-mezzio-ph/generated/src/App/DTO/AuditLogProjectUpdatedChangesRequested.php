<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to update the project.
 */
class AuditLogProjectUpdatedChangesRequested
{
    /**
     * The title of the project as seen on the dashboard.
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $title;

}
