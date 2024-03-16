<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class FineTuneEvent
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $level;

    /**
     * @DTA\Data(field="message")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $message;

}
