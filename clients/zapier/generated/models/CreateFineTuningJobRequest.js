const utils = require('../utils/utils');
const CreateFineTuningJobRequest_hyperparameters = require('../models/CreateFineTuningJobRequest_hyperparameters');
const CreateFineTuningJobRequest_integrations_inner = require('../models/CreateFineTuningJobRequest_integrations_inner');
const CreateFineTuningJobRequest_model = require('../models/CreateFineTuningJobRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateFineTuningJobRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}training_file`,
                label: `The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  - [${labelPrefix}training_file]`,
                required: true,
                type: 'string',
            },
            ...CreateFineTuningJobRequest_hyperparameters.fields(`${keyPrefix}hyperparameters`, isInput),
            {
                key: `${keyPrefix}suffix`,
                label: `A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.  - [${labelPrefix}suffix]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}validation_file`,
                label: `The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.  - [${labelPrefix}validation_file]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}integrations`,
                label: `[${labelPrefix}integrations]`,
                children: CreateFineTuningJobRequest_integrations_inner.fields(`${keyPrefix}integrations${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}seed`,
                label: `The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.  - [${labelPrefix}seed]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'model': utils.removeIfEmpty(CreateFineTuningJobRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'training_file': bundle.inputData?.[`${keyPrefix}training_file`],
            'hyperparameters': utils.removeIfEmpty(CreateFineTuningJobRequest_hyperparameters.mapping(bundle, `${keyPrefix}hyperparameters`)),
            'suffix': bundle.inputData?.[`${keyPrefix}suffix`],
            'validation_file': bundle.inputData?.[`${keyPrefix}validation_file`],
            'integrations': utils.childMapping(bundle.inputData?.[`${keyPrefix}integrations`], `${keyPrefix}integrations`, CreateFineTuningJobRequest_integrations_inner),
            'seed': bundle.inputData?.[`${keyPrefix}seed`],
        }
    },
}
