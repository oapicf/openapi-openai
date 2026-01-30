<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The API Key used to perform the audit logged action.
 */
class AuditLogActorApiKey
{
    /**
     * The tracking id of the API key.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The type of API key. Can be either &#x60;user&#x60; or &#x60;service_account&#x60;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActorUser::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActorUser::class})
     */
    public ?\App\DTO\AuditLogActorUser $user = null;

    /**
     * @DTA\Data(field="service_account", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AuditLogActorServiceAccount::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AuditLogActorServiceAccount::class})
     */
    public ?\App\DTO\AuditLogActorServiceAccount $service_account = null;

}
