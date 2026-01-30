<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents if a given text input is potentially harmful.
 */
class CreateModerationResponse
{
    /**
     * The unique identifier for the moderation request.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The model used to generate the moderation results.
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * A list of moderation objects.
     * @DTA\Data(field="results")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     * @var \App\DTO\Collection62|null
     */
    public $results;

}
