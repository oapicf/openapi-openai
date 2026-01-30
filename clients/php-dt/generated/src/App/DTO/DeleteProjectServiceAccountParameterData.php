<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for deleteProjectServiceAccount
 */
class DeleteProjectServiceAccountParameterData
{
    /**
     * The ID of the project.
     * @DTA\Data(subset="path", field="project_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $project_id = null;

    /**
     * The ID of the service account.
     * @DTA\Data(subset="path", field="service_account_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $service_account_id = null;

}
