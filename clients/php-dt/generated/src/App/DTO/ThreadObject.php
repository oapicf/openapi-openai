<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Represents a thread that contains [messages](/docs/api-reference/messages).
 */
class ThreadObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;thread&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The Unix timestamp (in seconds) for when the thread was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * @DTA\Data(field="tool_resources")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ModifyThreadRequestToolResources::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ModifyThreadRequestToolResources::class})
     */
    public ?\App\DTO\ModifyThreadRequestToolResources $tool_resources = null;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metadata = null;

}
