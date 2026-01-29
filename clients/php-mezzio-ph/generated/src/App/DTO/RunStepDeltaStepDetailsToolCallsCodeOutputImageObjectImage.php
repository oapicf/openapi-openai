<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
{
    /**
     * The [file](/docs/api-reference/files) ID of the image.
     * @DTA\Data(field="file_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $file_id;

}
