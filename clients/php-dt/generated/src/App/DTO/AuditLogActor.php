<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The actor who performed the audit logged action.
 */
class AuditLogActor
{
    /**
     * The type of actor. Is either &#x60;session&#x60; or &#x60;api_key&#x60;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="session", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActorSession::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActorSession::class})
     */
    public ?\App\DTO\AuditLogActorSession $session = null;

    /**
     * @DTA\Data(field="api_key", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActorApiKey::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActorApiKey::class})
     */
    public ?\App\DTO\AuditLogActorApiKey $api_key = null;

}
