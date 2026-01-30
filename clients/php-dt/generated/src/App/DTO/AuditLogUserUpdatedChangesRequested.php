<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to update the user.
 */
class AuditLogUserUpdatedChangesRequested
{
    /**
     * The role of the user. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

}
