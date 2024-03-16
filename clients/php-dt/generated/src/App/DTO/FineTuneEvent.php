<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class FineTuneEvent
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $level = null;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $message = null;

}
