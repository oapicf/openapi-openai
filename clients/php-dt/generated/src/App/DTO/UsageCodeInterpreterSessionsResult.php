<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The aggregated code interpreter sessions usage details of the specific time bucket.
 */
class UsageCodeInterpreterSessionsResult
{
    /**
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The number of code interpreter sessions.
     * @DTA\Data(field="sessions")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $sessions = null;

    /**
     * When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     * @DTA\Data(field="project_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $project_id = null;

}
