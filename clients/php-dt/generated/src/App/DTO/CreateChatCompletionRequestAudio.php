<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio).
 */
class CreateChatCompletionRequestAudio
{
    /**
     * The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive).
     * @DTA\Data(field="voice")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $voice = null;

    /**
     * Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;.
     * @DTA\Data(field="format")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $format = null;

}
