<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateChatCompletionResponse
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created = null;

    /**
     * @DTA\Data(field="model")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $model = null;

    /**
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection3::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection3::class})
     */
    public ?\App\DTO\Collection3 $choices = null;

    /**
     * @DTA\Data(field="usage", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseUsage::class})
     */
    public ?\App\DTO\CreateCompletionResponseUsage $usage = null;

}
