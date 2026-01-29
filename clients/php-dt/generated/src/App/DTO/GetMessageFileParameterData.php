<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getMessageFile
 */
class GetMessageFileParameterData
{
    /**
     * The ID of the thread to which the message and File belong.
     * @DTA\Data(subset="path", field="thread_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $thread_id = null;

    /**
     * The ID of the file being retrieved.
     * @DTA\Data(subset="path", field="file_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $file_id = null;

    /**
     * The ID of the message the file belongs to.
     * @DTA\Data(subset="path", field="message_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $message_id = null;

}
