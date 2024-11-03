<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
 */
class RunStreamEventOneOf2
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $event;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObject::class})
     * @var \App\DTO\RunObject|null
     */
    public $data;

}
