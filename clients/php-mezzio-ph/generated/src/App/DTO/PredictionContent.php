<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Static predicted output content, such as the content of a text file that is being regenerated.
 */
class PredictionContent
{
    /**
     * The type of the predicted content you want to provide. This type is currently always &#x60;content&#x60;.
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="content")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PredictionContentContent::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PredictionContentContent::class})
     * @var \App\DTO\PredictionContentContent|null
     */
    public $content;

}
