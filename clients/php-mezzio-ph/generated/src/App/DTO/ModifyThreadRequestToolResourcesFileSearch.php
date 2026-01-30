<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ModifyThreadRequestToolResourcesFileSearch
{
    /**
     * The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread.
     * @DTA\Data(field="vector_store_ids", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection131::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection131::class})
     * @var \App\DTO\Collection131|null
     */
    public $vector_store_ids;

}
