<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */
class FineTunePreferenceRequestInput
{
    /**
     * @DTA\Data(field="input", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTunePreferenceRequestInputInput::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTunePreferenceRequestInputInput::class})
     */
    public ?\App\DTO\FineTunePreferenceRequestInputInput $input = null;

    /**
     * The preferred completion message for the output.
     * @DTA\Data(field="preferred_completion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $preferred_completion = null;

    /**
     * The non-preferred completion message for the output.
     * @DTA\Data(field="non_preferred_completion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $non_preferred_completion = null;

}
