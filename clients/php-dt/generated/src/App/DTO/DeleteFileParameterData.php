<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for deleteFile
 */
class DeleteFileParameterData
{
    /**
     * The ID of the file to use for this request
     * @DTA\Data(subset="path", field="file_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $file_id = null;

}
