<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateChatCompletionResponse
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $model;

    /**
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection3::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection3::class})
     * @var \App\DTO\Collection3|null
     */
    public $choices;

    /**
     * @DTA\Data(field="usage", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseUsage::class})
     * @var \App\DTO\CreateCompletionResponseUsage|null
     */
    public $usage;

}
