<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * A batch of files attached to a vector store.
 */
class VectorStoreFileBatchObject
{
    /**
     * The identifier, which can be referenced in API endpoints.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * The object type, which is always &#x60;vector_store.file_batch&#x60;.
     * @DTA\Data(field="object")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $object;

    /**
     * The Unix timestamp (in seconds) for when the vector store files batch was created.
     * @DTA\Data(field="created_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $created_at;

    /**
     * The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
     * @DTA\Data(field="vector_store_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $vector_store_id;

    /**
     * The status of the vector store files batch, which can be either &#x60;in_progress&#x60;, &#x60;completed&#x60;, &#x60;cancelled&#x60; or &#x60;failed&#x60;.
     * @DTA\Data(field="status")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $status;

    /**
     * @DTA\Data(field="file_counts")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VectorStoreFileBatchObjectFileCounts::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VectorStoreFileBatchObjectFileCounts::class})
     * @var \App\DTO\VectorStoreFileBatchObjectFileCounts|null
     */
    public $file_counts;

}
