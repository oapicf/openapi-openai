<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProjectApiKeyOwner
{
    /**
     * &#x60;user&#x60; or &#x60;service_account&#x60;
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProjectUser::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProjectUser::class})
     */
    public ?\App\DTO\ProjectUser $user = null;

    /**
     * @DTA\Data(field="service_account", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProjectServiceAccount::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProjectServiceAccount::class})
     */
    public ?\App\DTO\ProjectServiceAccount $service_account = null;

}
