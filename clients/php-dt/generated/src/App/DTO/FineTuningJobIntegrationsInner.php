<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class FineTuningJobIntegrationsInner
{
    /**
     * The type of the integration being enabled for the fine-tuning job
     * @DTA\Data(field="type")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

    /**
     * @DTA\Data(field="wandb")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestIntegrationsInnerWandb::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestIntegrationsInnerWandb::class})
     */
    public ?\App\DTO\CreateFineTuningJobRequestIntegrationsInnerWandb $wandb = null;

}
