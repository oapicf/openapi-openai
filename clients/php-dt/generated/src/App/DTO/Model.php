<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class Model
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
     * @DTA\Data(field="owned_by")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $owned_by = null;

}
