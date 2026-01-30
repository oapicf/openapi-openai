<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class CreateFineTuningJobRequest
{
    /**
     * @DTA\Data(field="model")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestModel::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestModel::class})
     */
    public ?\App\DTO\CreateFineTuningJobRequestModel $model = null;

    /**
     * The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose &#x60;fine-tune&#x60;.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @DTA\Data(field="training_file")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $training_file = null;

    /**
     * @DTA\Data(field="hyperparameters", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparameters::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\CreateFineTuningJobRequestHyperparameters::class})
     */
    public ?\App\DTO\CreateFineTuningJobRequestHyperparameters $hyperparameters = null;

    /**
     * A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a &#x60;suffix&#x60; of \&quot;custom-model-name\&quot; would produce a model name like &#x60;ft:gpt-4o-mini:openai:custom-model-name:7p4lURel&#x60;.
     * @DTA\Data(field="suffix", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"min":1, "max":64})
     */
    public ?string $suffix = null;

    /**
     * The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose &#x60;fine-tune&#x60;.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
     * @DTA\Data(field="validation_file", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $validation_file = null;

    /**
     * A list of integrations to enable for your fine-tuning job.
     * @DTA\Data(field="integrations", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection44::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection44::class})
     */
    public ?\App\DTO\Collection44 $integrations = null;

    /**
     * The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.
     * @DTA\Data(field="seed", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":0, "max":2147483647})
     */
    public ?int $seed = null;

    /**
     * @DTA\Data(field="method", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\FineTuneMethod::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\FineTuneMethod::class})
     */
    public ?\App\DTO\FineTuneMethod $method = null;

}
