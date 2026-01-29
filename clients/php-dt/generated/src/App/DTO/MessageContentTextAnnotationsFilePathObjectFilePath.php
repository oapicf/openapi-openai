<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MessageContentTextAnnotationsFilePathObjectFilePath
{
    /**
     * The ID of the file that was generated.
     * @DTA\Data(field="file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file_id = null;

}
