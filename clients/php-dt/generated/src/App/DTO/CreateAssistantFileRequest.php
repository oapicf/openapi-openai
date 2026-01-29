<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateAssistantFileRequest
{
    /**
     * A [File](/docs/api-reference/files) ID (with &#x60;purpose&#x3D;\&quot;assistants\&quot;&#x60;) that the assistant should use. Useful for tools like &#x60;retrieval&#x60; and &#x60;code_interpreter&#x60; that can access files.
     * @DTA\Data(field="file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file_id = null;

}
