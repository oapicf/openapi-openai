<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for deleteVectorStoreFile
 */
class DeleteVectorStoreFileParameterData
{
    /**
     * The ID of the file to delete.
     * @DTA\Data(subset="path", field="file_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $file_id = null;

    /**
     * The ID of the vector store that the file belongs to.
     * @DTA\Data(subset="path", field="vector_store_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $vector_store_id = null;

}
