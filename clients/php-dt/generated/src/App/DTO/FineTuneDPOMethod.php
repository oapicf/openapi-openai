<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Configuration for the DPO fine-tuning method.
 */
class FineTuneDPOMethod
{
    /**
     * @DTA\Data(field="hyperparameters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneDPOMethodHyperparameters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneDPOMethodHyperparameters::class})
     */
    public ?\App\DTO\FineTuneDPOMethodHyperparameters $hyperparameters = null;

}
