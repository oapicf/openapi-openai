<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ListFineTunesResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection18::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection18::class})
     * @var \App\DTO\Collection18|null
     */
    public $data;

}
