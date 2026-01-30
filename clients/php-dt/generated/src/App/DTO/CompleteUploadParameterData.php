<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for completeUpload
 */
class CompleteUploadParameterData
{
    /**
     * The ID of the Upload.
     * @DTA\Data(subset="path", field="upload_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $upload_id = null;

}
