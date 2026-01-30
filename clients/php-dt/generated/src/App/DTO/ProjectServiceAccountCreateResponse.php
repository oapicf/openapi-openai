<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ProjectServiceAccountCreateResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * Service accounts can only have one role of type &#x60;member&#x60;
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="api_key")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ProjectServiceAccountApiKey::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ProjectServiceAccountApiKey::class})
     */
    public ?\App\DTO\ProjectServiceAccountApiKey $api_key = null;

}
