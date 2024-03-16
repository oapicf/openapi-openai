const utils = require('../utils/utils');
const CreateFineTuneRequest_model = require('../models/CreateFineTuneRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}training_file`,
                label: `The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  - [${labelPrefix}training_file]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}validation_file`,
                label: `The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys \"prompt\" and \"completion\". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details.  - [${labelPrefix}validation_file]`,
                type: 'string',
            },
            ...CreateFineTuneRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}n_epochs`,
                label: `The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset.  - [${labelPrefix}n_epochs]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}batch_size`,
                label: `The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets.  - [${labelPrefix}batch_size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}learning_rate_multiplier`,
                label: `The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results.  - [${labelPrefix}learning_rate_multiplier]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}prompt_loss_weight`,
                label: `The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt.  - [${labelPrefix}prompt_loss_weight]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}compute_classification_metrics`,
                label: `If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification.  - [${labelPrefix}compute_classification_metrics]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}classification_n_classes`,
                label: `The number of classes in a classification task.  This parameter is required for multiclass classification.  - [${labelPrefix}classification_n_classes]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}classification_positive_class`,
                label: `The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification.  - [${labelPrefix}classification_positive_class]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}classification_betas`,
                label: `If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall.  - [${labelPrefix}classification_betas]`,
                list: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}suffix`,
                label: `A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`.  - [${labelPrefix}suffix]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'training_file': bundle.inputData?.[`${keyPrefix}training_file`],
            'validation_file': bundle.inputData?.[`${keyPrefix}validation_file`],
            'model': utils.removeIfEmpty(CreateFineTuneRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'n_epochs': bundle.inputData?.[`${keyPrefix}n_epochs`],
            'batch_size': bundle.inputData?.[`${keyPrefix}batch_size`],
            'learning_rate_multiplier': bundle.inputData?.[`${keyPrefix}learning_rate_multiplier`],
            'prompt_loss_weight': bundle.inputData?.[`${keyPrefix}prompt_loss_weight`],
            'compute_classification_metrics': bundle.inputData?.[`${keyPrefix}compute_classification_metrics`],
            'classification_n_classes': bundle.inputData?.[`${keyPrefix}classification_n_classes`],
            'classification_positive_class': bundle.inputData?.[`${keyPrefix}classification_positive_class`],
            'classification_betas': bundle.inputData?.[`${keyPrefix}classification_betas`],
            'suffix': bundle.inputData?.[`${keyPrefix}suffix`],
        }
    },
}
