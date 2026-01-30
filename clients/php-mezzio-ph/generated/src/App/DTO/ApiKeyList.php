<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ApiKeyList
{
    /**
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     * @var \App\DTO\Collection63|null
     */
    public $data;

    /**
     * @DTA\Data(field="has_more", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_more;

    /**
     * @DTA\Data(field="first_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $first_id;

    /**
     * @DTA\Data(field="last_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $last_id;

}
