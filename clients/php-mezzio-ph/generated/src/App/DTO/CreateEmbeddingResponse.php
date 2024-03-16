<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateEmbeddingResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection12::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection12::class})
     * @var \App\DTO\Collection12|null
     */
    public $data;

    /**
     * @DTA\Data(field="usage")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEmbeddingResponseUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEmbeddingResponseUsage::class})
     * @var \App\DTO\CreateEmbeddingResponseUsage|null
     */
    public $usage;

}
