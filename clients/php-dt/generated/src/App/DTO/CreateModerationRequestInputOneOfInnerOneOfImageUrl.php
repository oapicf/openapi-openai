<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Contains either an image URL or a data URL for a base64 encoded image.
 */
class CreateModerationRequestInputOneOfInnerOneOfImageUrl
{
    /**
     * Either a URL of the image or the base64 encoded image data.
     * @DTA\Data(field="url")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $url = null;

}
