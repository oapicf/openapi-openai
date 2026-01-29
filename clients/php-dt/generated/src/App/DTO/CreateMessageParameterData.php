<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for createMessage
 */
class CreateMessageParameterData
{
    /**
     * The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @DTA\Data(subset="path", field="thread_id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $thread_id = null;

}
