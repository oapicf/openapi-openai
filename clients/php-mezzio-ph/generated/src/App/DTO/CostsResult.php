<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The aggregated costs details of the specific time bucket.
 */
class CostsResult
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * @DTA\Data(field="amount", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CostsResultAmount::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CostsResultAmount::class})
     * @var \App\DTO\CostsResultAmount|null
     */
    public $amount;

    /**
     * When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
     * @DTA\Data(field="line_item", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $line_item;

    /**
     * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
     * @DTA\Data(field="project_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $project_id;

}
