<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Learn about [image inputs](/docs/guides/vision).
 */
class ChatCompletionRequestMessageContentPartImage
{
    /**
     * The type of the content part.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="image_url")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartImageImageUrl::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ChatCompletionRequestMessageContentPartImageImageUrl::class})
     * @var \App\DTO\ChatCompletionRequestMessageContentPartImageImageUrl|null
     */
    public $image_url;

}
