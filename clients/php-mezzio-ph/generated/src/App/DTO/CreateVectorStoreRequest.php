<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateVectorStoreRequest
{
    /**
     * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
     * @DTA\Data(field="file_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection148::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection148::class})
     * @var \App\DTO\Collection148|null
     */
    public $file_ids;

    /**
     * The name of the vector store.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="expires_after", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreExpirationAfter::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreExpirationAfter::class})
     * @var \App\DTO\VectorStoreExpirationAfter|null
     */
    public $expires_after;

    /**
     * @DTA\Data(field="chunking_strategy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateVectorStoreRequestChunkingStrategy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateVectorStoreRequestChunkingStrategy::class})
     * @var \App\DTO\CreateVectorStoreRequestChunkingStrategy|null
     */
    public $chunking_strategy;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

}
