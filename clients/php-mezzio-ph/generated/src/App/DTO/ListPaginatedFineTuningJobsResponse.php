<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ListPaginatedFineTuningJobsResponse
{
    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection42::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection42::class})
     * @var \App\DTO\Collection42|null
     */
    public $data;

    /**
     * @DTA\Data(field="has_more")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $has_more;

    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

}
