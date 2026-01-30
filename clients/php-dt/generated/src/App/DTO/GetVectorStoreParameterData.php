<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getVectorStore
 */
class GetVectorStoreParameterData
{
    /**
     * The ID of the vector store to retrieve.
     * @DTA\Data(subset="path", field="vector_store_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $vector_store_id = null;

}
