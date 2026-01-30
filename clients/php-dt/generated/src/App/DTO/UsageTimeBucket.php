<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UsageTimeBucket
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="start_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $start_time = null;

    /**
     * @DTA\Data(field="end_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $end_time = null;

    /**
     * @DTA\Data(field="result")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection74::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection74::class})
     */
    public ?\App\DTO\Collection74 $result = null;

}
