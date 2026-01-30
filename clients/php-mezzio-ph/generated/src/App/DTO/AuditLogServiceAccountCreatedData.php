<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to create the service account.
 */
class AuditLogServiceAccountCreatedData
{
    /**
     * The role of the service account. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

}
