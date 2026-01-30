<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateAssistantRequestToolResourcesFileSearch
{
    /**
     * The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.
     * @DTA\Data(field="vector_store_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection6::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection6::class})
     * @var \App\DTO\Collection6|null
     */
    public $vector_store_ids;

    /**
     * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.
     * @DTA\Data(field="vector_stores", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection8::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection8::class})
     * @var \App\DTO\Collection8|null
     */
    public $vector_stores;

}
