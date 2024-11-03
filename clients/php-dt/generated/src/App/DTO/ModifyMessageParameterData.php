<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for modifyMessage
 */
class ModifyMessageParameterData
{
    /**
     * The ID of the thread to which this message belongs.
     * @DTA\Data(subset="path", field="thread_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $thread_id = null;

    /**
     * The ID of the message to modify.
     * @DTA\Data(subset="path", field="message_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $message_id = null;

}
