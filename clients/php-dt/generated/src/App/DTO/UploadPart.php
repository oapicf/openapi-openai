<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The upload Part represents a chunk of bytes we can add to an Upload object.
 */
class UploadPart
{
    /**
     * The upload Part unique identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The Unix timestamp (in seconds) for when the Part was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The ID of the Upload object that this Part was added to.
     * @DTA\Data(field="upload_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $upload_id = null;

    /**
     * The object type, which is always &#x60;upload.part&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

}
