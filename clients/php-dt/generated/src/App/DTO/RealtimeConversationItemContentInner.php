<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class RealtimeConversationItemContentInner
{
    /**
     * The content type (&#x60;input_text&#x60;, &#x60;input_audio&#x60;, &#x60;item_reference&#x60;, &#x60;text&#x60;).
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * The text content, used for &#x60;input_text&#x60; and &#x60;text&#x60; content types.
     * @DTA\Data(field="text", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $text = null;

    /**
     * ID of a previous conversation item to reference (for &#x60;item_reference&#x60; content types in &#x60;response.create&#x60; events). These can reference both client and server created items.
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * Base64-encoded audio bytes, used for &#x60;input_audio&#x60; content type.
     * @DTA\Data(field="audio", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $audio = null;

    /**
     * The transcript of the audio, used for &#x60;input_audio&#x60; content type.
     * @DTA\Data(field="transcript", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $transcript = null;

}
