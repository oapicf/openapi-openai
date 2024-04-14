<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateFileRequest
{
    /**
     * The File object (not file name) to be uploaded.
     * @DTA\Data(field="file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file = null;

    /**
     * The intended purpose of the uploaded file.  Use \&quot;fine-tune\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \&quot;assistants\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning.
     * @DTA\Data(field="purpose")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purpose = null;

}
