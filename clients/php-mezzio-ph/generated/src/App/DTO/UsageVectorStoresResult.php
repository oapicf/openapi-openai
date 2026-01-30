<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The aggregated vector stores usage details of the specific time bucket.
 */
class UsageVectorStoresResult
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The vector stores usage in bytes.
     * @DTA\Data(field="usage_bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $usage_bytes;

    /**
     * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     * @DTA\Data(field="project_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $project_id;

}
