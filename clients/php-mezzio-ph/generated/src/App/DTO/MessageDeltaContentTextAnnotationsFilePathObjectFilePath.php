<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MessageDeltaContentTextAnnotationsFilePathObjectFilePath
{
    /**
     * The ID of the file that was generated.
     * @DTA\Data(field="file_id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $file_id;

}
