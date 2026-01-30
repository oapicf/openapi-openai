<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for updateProjectRateLimits
 */
class UpdateProjectRateLimitsParameterData
{
    /**
     * The ID of the project.
     * @DTA\Data(subset="path", field="project_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $project_id = null;

    /**
     * The ID of the rate limit.
     * @DTA\Data(subset="path", field="rate_limit_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $rate_limit_id = null;

}
