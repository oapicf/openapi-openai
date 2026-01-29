<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getAssistant
 */
class GetAssistantParameterData
{
    /**
     * The ID of the assistant to retrieve.
     * @DTA\Data(subset="path", field="assistant_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $assistant_id = null;

}
