<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A list of files attached to a vector store.
 */
class VectorStoreFileObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * The object type, which is always &#x60;vector_store.file&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $object = null;

    /**
     * The total vector store usage in bytes. Note that this may be different from the original file size.
     * @DTA\Data(field="usage_bytes")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $usage_bytes = null;

    /**
     * The Unix timestamp (in seconds) for when the vector store file was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $created_at = null;

    /**
     * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
     * @DTA\Data(field="vector_store_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $vector_store_id = null;

    /**
     * The status of the vector store file, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60;, or &#x60;failed&#x60;. The status &#x60;completed&#x60; indicates that the vector store file is ready for use.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $status = null;

    /**
     * @DTA\Data(field="last_error")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreFileObjectLastError::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreFileObjectLastError::class})
     */
    public ?\App\DTO\VectorStoreFileObjectLastError $last_error = null;

    /**
     * @DTA\Data(field="chunking_strategy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreFileObjectChunkingStrategy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreFileObjectChunkingStrategy::class})
     */
    public ?\App\DTO\VectorStoreFileObjectChunkingStrategy $chunking_strategy = null;

}
