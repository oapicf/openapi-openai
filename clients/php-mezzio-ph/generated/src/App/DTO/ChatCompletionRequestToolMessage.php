<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ChatCompletionRequestToolMessage
{
    /**
     * The role of the messages author, in this case &#x60;tool&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $role;

    /**
     * The contents of the tool message.
     * @DTA\Data(field="content")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $content;

    /**
     * Tool call that this message is responding to.
     * @DTA\Data(field="tool_call_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $tool_call_id;

}
