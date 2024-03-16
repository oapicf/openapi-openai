<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateEditResponse
{
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
     * @DTA\Data(field="choices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection9::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection9::class})
     * @var \App\DTO\Collection9|null
     */
    public $choices;

    /**
     * @DTA\Data(field="usage")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateCompletionResponseUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateCompletionResponseUsage::class})
     * @var \App\DTO\CreateCompletionResponseUsage|null
     */
    public $usage;

}
