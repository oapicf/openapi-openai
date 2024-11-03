<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MessageStreamEvent
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MessageObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MessageObject::class})
     * @var \App\DTO\MessageObject|null
     */
    public $data;

}
