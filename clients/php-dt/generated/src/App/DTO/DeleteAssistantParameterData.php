<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for deleteAssistant
 */
class DeleteAssistantParameterData
{
    /**
     * The ID of the assistant to delete.
     * @DTA\Data(subset="path", field="assistant_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $assistant_id = null;

}
