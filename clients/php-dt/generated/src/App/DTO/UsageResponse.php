<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class UsageResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection75::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection75::class})
     */
    public ?\App\DTO\Collection75 $data = null;

    /**
     * @DTA\Data(field="has_more")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_more = null;

    /**
     * @DTA\Data(field="next_page")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $next_page = null;

}
