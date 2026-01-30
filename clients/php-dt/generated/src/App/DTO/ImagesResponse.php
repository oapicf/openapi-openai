<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ImagesResponse
{
    /**
     * @DTA\Data(field="created")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection47::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection47::class})
     */
    public ?\App\DTO\Collection47 $data = null;

}
