<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The payload used to create the invite.
 */
class AuditLogInviteSentData
{
    /**
     * The email invited to the organization.
     * @DTA\Data(field="email", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $email;

    /**
     * The role the email was invited to be. Is either &#x60;owner&#x60; or &#x60;member&#x60;.
     * @DTA\Data(field="role", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

}
