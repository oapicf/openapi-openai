<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateAssistantRequestToolResourcesFileSearch
{
    /**
     * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.
     * @DTA\Data(field="vector_store_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     */
    public ?\App\DTO\Collection6 $vector_store_ids = null;

    /**
     * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.
     * @DTA\Data(field="vector_stores", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection8::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection8::class})
     */
    public ?\App\DTO\Collection8 $vector_stores = null;

}
