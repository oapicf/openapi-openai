<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ApiKeyList
{
    /**
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     */
    public ?\App\DTO\Collection63 $data = null;

    /**
     * @DTA\Data(field="has_more", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_more = null;

    /**
     * @DTA\Data(field="first_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $first_id = null;

    /**
     * @DTA\Data(field="last_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $last_id = null;

}
