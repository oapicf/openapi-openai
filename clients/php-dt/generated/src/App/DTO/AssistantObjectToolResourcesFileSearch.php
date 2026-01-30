<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AssistantObjectToolResourcesFileSearch
{
    /**
     * The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.
     * @DTA\Data(field="vector_store_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection2::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection2::class})
     */
    public ?\App\DTO\Collection2 $vector_store_ids = null;

}
