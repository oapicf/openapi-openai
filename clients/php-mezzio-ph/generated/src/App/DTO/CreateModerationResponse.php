<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateModerationResponse
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * @DTA\Data(field="results")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection22::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection22::class})
     * @var \App\DTO\Collection22|null
     */
    public $results;

}
