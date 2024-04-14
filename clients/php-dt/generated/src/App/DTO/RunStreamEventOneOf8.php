<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 */
class RunStreamEventOneOf8
{
    /**
     * @DTA\Data(field="event")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $event = null;

    /**
     * @DTA\Data(field="data")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\RunObject::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\RunObject::class})
     */
    public ?\App\DTO\RunObject $data = null;

}
