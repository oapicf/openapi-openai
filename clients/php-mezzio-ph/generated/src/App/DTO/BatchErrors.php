<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BatchErrors
{
    /**
     * The object type, which is always &#x60;list&#x60;.
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="data", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection13::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection13::class})
     * @var \App\DTO\Collection13|null
     */
    public $data;

}
