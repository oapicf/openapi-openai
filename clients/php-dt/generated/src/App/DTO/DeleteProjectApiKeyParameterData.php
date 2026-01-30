<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for deleteProjectApiKey
 */
class DeleteProjectApiKeyParameterData
{
    /**
     * The ID of the project.
     * @DTA\Data(subset="path", field="project_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $project_id = null;

    /**
     * The ID of the API key.
     * @DTA\Data(subset="path", field="key_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $key_id = null;

}
