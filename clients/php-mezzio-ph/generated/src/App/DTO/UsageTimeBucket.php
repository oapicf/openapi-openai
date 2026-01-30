<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class UsageTimeBucket
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="start_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $start_time;

    /**
     * @DTA\Data(field="end_time")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $end_time;

    /**
     * @DTA\Data(field="result")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection74::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection74::class})
     * @var \App\DTO\Collection74|null
     */
    public $result;

}
