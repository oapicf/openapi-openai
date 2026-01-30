<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getVectorStoreFileBatch
 */
class GetVectorStoreFileBatchParameterData
{
    /**
     * The ID of the file batch being retrieved.
     * @DTA\Data(subset="path", field="batch_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $batch_id = null;

    /**
     * The ID of the vector store that the file batch belongs to.
     * @DTA\Data(subset="path", field="vector_store_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $vector_store_id = null;

}
