<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ChatCompletionRequestSystemMessage
{
    /**
     * The contents of the system message.
     * @DTA\Data(field="content")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $content = null;

    /**
     * The role of the messages author, in this case &#x60;system&#x60;.
     * @DTA\Data(field="role")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $role = null;

    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $name = null;

}
