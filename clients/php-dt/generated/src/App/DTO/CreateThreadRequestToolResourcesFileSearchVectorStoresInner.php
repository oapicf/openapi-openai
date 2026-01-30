<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateThreadRequestToolResourcesFileSearchVectorStoresInner
{
    /**
     * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.
     * @DTA\Data(field="file_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection129::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection129::class})
     */
    public ?\App\DTO\Collection129 $file_ids = null;

    /**
     * @DTA\Data(field="chunking_strategy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::class})
     */
    public ?\App\DTO\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy $chunking_strategy = null;

    /**
     * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     */
    public ?object $metadata = null;

}
