<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
 */
class AssistantFileObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;assistant.file&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the assistant file was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The assistant ID that the file is attached to.
     * @DTA\Data(field="assistant_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $assistant_id = null;

}
