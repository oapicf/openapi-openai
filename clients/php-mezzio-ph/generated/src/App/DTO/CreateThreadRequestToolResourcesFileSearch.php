<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class CreateThreadRequestToolResourcesFileSearch
{
    /**
     * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.
     * @DTA\Data(field="vector_store_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection128::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection128::class})
     * @var \App\DTO\Collection128|null
     */
    public $vector_store_ids;

    /**
     * A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread.
     * @DTA\Data(field="vector_stores", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection130::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection130::class})
     * @var \App\DTO\Collection130|null
     */
    public $vector_stores;

}
