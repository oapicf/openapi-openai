<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ListFilesResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection13::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection13::class})
     * @var \App\DTO\Collection13|null
     */
    public $data;

}
