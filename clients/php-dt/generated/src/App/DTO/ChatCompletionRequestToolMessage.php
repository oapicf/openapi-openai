<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ChatCompletionRequestToolMessage
{
    /**
     * The role of the messages author, in this case &#x60;tool&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * @DTA\Data(field="content")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestToolMessageContent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestToolMessageContent::class})
     */
    public ?\App\DTO\ChatCompletionRequestToolMessageContent $content = null;

    /**
     * Tool call that this message is responding to.
     * @DTA\Data(field="tool_call_id")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $tool_call_id = null;

}
