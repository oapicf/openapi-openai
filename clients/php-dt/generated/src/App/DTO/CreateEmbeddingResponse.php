<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateEmbeddingResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection12::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection12::class})
     */
    public ?\App\DTO\Collection12 $data = null;

    /**
     * @DTA\Data(field="usage")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateEmbeddingResponseUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateEmbeddingResponseUsage::class})
     */
    public ?\App\DTO\CreateEmbeddingResponseUsage $usage = null;

}
