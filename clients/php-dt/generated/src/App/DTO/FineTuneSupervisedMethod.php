<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Configuration for the supervised fine-tuning method.
 */
class FineTuneSupervisedMethod
{
    /**
     * @DTA\Data(field="hyperparameters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneSupervisedMethodHyperparameters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneSupervisedMethodHyperparameters::class})
     */
    public ?\App\DTO\FineTuneSupervisedMethodHyperparameters $hyperparameters = null;

}
