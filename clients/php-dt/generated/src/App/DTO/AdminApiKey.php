<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AdminApiKey
{
    /**
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="redacted_value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $redacted_value = null;

    /**
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $value = null;

    /**
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdminApiKeyOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdminApiKeyOwner::class})
     */
    public ?\App\DTO\AdminApiKeyOwner $owner = null;

}
