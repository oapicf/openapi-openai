<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ThreadStreamEvent
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ThreadObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ThreadObject::class})
     * @var \App\DTO\ThreadObject|null
     */
    public $data;

}
