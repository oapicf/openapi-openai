<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The session in which the audit logged action was performed.
 */
class AuditLogActorSession
{
    /**
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActorUser::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActorUser::class})
     */
    public ?\App\DTO\AuditLogActorUser $user = null;

    /**
     * The IP address from which the action was performed.
     * @DTA\Data(field="ip_address", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $ip_address = null;

}
