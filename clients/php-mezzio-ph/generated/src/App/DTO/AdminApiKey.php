<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AdminApiKey
{
    /**
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="redacted_value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $redacted_value;

    /**
     * @DTA\Data(field="value", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $value;

    /**
     * @DTA\Data(field="created_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * @DTA\Data(field="owner", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AdminApiKeyOwner::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AdminApiKeyOwner::class})
     * @var \App\DTO\AdminApiKeyOwner|null
     */
    public $owner;

}
