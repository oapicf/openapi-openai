<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for modifyVectorStore
 */
class ModifyVectorStoreParameterData
{
    /**
     * The ID of the vector store to modify.
     * @DTA\Data(subset="path", field="vector_store_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $vector_store_id = null;

}
