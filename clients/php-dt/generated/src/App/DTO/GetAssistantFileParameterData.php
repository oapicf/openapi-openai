<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getAssistantFile
 */
class GetAssistantFileParameterData
{
    /**
     * The ID of the assistant who the file belongs to.
     * @DTA\Data(subset="path", field="assistant_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $assistant_id = null;

    /**
     * The ID of the file we&#39;re getting.
     * @DTA\Data(subset="path", field="file_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $file_id = null;

}
