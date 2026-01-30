<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The Upload object can accept byte chunks in the form of Parts.
 */
class Upload
{
    /**
     * The Upload unique identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The Unix timestamp (in seconds) for when the Upload was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The name of the file to be uploaded.
     * @DTA\Data(field="filename")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $filename = null;

    /**
     * The intended number of bytes to be uploaded.
     * @DTA\Data(field="bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $bytes = null;

    /**
     * The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
     * @DTA\Data(field="purpose")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $purpose = null;

    /**
     * The status of the Upload.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * The Unix timestamp (in seconds) for when the Upload was created.
     * @DTA\Data(field="expires_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $expires_at = null;

    /**
     * The object type, which is always \&quot;upload\&quot;.
     * @DTA\Data(field="object", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * @DTA\Data(field="file", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\OpenAIFile::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\OpenAIFile::class})
     */
    public ?\App\DTO\OpenAIFile $file = null;

}
