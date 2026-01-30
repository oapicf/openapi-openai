<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
 */
class VectorStoreObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The object type, which is always &#x60;vector_store&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The Unix timestamp (in seconds) for when the vector store was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The name of the vector store.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The total number of bytes used by the files in the vector store.
     * @DTA\Data(field="usage_bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $usage_bytes;

    /**
     * @DTA\Data(field="file_counts")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreObjectFileCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreObjectFileCounts::class})
     * @var \App\DTO\VectorStoreObjectFileCounts|null
     */
    public $file_counts;

    /**
     * The status of the vector store, which can be either &#x60;expired&#x60;, &#x60;in_progress&#x60;, or &#x60;completed&#x60;. A status of &#x60;completed&#x60; indicates that the vector store is ready for use.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * @DTA\Data(field="expires_after", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreExpirationAfter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreExpirationAfter::class})
     * @var \App\DTO\VectorStoreExpirationAfter|null
     */
    public $expires_after;

    /**
     * The Unix timestamp (in seconds) for when the vector store will expire.
     * @DTA\Data(field="expires_at", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $expires_at;

    /**
     * The Unix timestamp (in seconds) for when the vector store was last active.
     * @DTA\Data(field="last_active_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $last_active_at;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata")
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

}
