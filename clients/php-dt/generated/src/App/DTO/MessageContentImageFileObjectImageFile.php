<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MessageContentImageFileObjectImageFile
{
    /**
     * The [File](/docs/api-reference/files) ID of the image in the message content. Set &#x60;purpose&#x3D;\&quot;vision\&quot;&#x60; when uploading the File if you need to later display the file content.
     * @DTA\Data(field="file_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $file_id = null;

    /**
     * Specifies the detail level of the image if specified by the user. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
     * @DTA\Data(field="detail", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $detail = null;

}
