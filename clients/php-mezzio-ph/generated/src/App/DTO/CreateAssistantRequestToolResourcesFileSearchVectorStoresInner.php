<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
{
    /**
     * A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store.
     * @DTA\Data(field="file_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection7::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection7::class})
     * @var \App\DTO\Collection7|null
     */
    public $file_ids;

    /**
     * @DTA\Data(field="chunking_strategy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy::class})
     * @var \App\DTO\CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy|null
     */
    public $chunking_strategy;

    /**
     * Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
     * @DTA\Data(field="metadata", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"object"})
     * @var object|null
     */
    public $metadata;

}
