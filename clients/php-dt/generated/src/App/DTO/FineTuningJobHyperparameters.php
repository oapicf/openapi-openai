<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 */
class FineTuningJobHyperparameters
{
    /**
     * @DTA\Data(field="n_epochs")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuningJobHyperparametersNEpochs::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuningJobHyperparametersNEpochs::class})
     */
    public ?\App\DTO\FineTuningJobHyperparametersNEpochs $n_epochs = null;

}
