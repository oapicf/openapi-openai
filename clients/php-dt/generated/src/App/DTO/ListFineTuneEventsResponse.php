<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ListFineTuneEventsResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection20::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection20::class})
     */
    public ?\App\DTO\Collection20 $data = null;

}
