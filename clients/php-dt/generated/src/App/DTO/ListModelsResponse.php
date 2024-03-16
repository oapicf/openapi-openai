<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ListModelsResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection21::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection21::class})
     */
    public ?\App\DTO\Collection21 $data = null;

}
