<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for listFiles
 */
class ListFilesParameterData
{
    /**
     * Only return files with the given purpose.
     * @DTA\Data(subset="query", field="purpose", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $purpose = null;

}
