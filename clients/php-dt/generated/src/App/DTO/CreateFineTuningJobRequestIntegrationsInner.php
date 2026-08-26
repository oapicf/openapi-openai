<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateFineTuningJobRequestIntegrationsInner
{
    /**
     * The type of integration to enable. Currently, only \&quot;wandb\&quot; (Weights and Biases) is supported.
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
