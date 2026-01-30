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
     * @var \App\DTO\FineTunePreferenceRequestInputInput|null
     */
    public $input;

    /**
     * The preferred completion message for the output.
     * @DTA\Data(field="preferred_completion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\FineTunePreferenceRequestInputPreferredCompletionInner[]|null
     */
    public $preferred_completion;

    /**
     * The non-preferred completion message for the output.
     * @DTA\Data(field="non_preferred_completion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\FineTunePreferenceRequestInputPreferredCompletionInner[]|null
     */
    public $non_preferred_completion;

}
