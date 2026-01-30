<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateVectorStoreFileBatchRequest
{
    /**
     * A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like &#x60;file_search&#x60; that can access files.
     * @DTA\Data(field="file_ids")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection149::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection149::class})
     * @var \App\DTO\Collection149|null
     */
    public $file_ids;

    /**
     * @DTA\Data(field="chunking_strategy", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChunkingStrategyRequestParam::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChunkingStrategyRequestParam::class})
     * @var \App\DTO\ChunkingStrategyRequestParam|null
     */
    public $chunking_strategy;

}
