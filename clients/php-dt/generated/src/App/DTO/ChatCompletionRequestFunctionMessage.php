<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ChatCompletionRequestFunctionMessage
{
    /**
     * The role of the messages author, in this case &#x60;function&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * The contents of the function message.
     * @DTA\Data(field="content")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content = null;

    /**
     * The name of the function to call.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
