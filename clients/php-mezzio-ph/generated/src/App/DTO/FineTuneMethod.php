<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The method used for fine-tuning.
 */
class FineTuneMethod
{
    /**
     * The type of method. Is either &#x60;supervised&#x60; or &#x60;dpo&#x60;.
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

    /**
     * @DTA\Data(field="supervised", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneSupervisedMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneSupervisedMethod::class})
     * @var \App\DTO\FineTuneSupervisedMethod|null
     */
    public $supervised;

    /**
     * @DTA\Data(field="dpo", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneDPOMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneDPOMethod::class})
     * @var \App\DTO\FineTuneDPOMethod|null
     */
    public $dpo;

}
