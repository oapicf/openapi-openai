<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ListFilesResponse
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection39::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection39::class})
     */
    public ?\App\DTO\Collection39 $data = null;

    /**
     * @DTA\Data(field="first_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $first_id = null;

    /**
     * @DTA\Data(field="last_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $last_id = null;

    /**
     * @DTA\Data(field="has_more")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $has_more = null;

}
