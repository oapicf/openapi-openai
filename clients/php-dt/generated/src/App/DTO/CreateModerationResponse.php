<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateModerationResponse
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * @DTA\Data(field="results")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     */
    public ?\App\DTO\Collection22 $results = null;

}
