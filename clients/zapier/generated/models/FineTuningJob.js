const utils = require('../utils/utils');
const FineTuneMethod = require('../models/FineTuneMethod');
const FineTuningJob_error = require('../models/FineTuningJob_error');
const FineTuningJob_hyperparameters = require('../models/FineTuningJob_hyperparameters');
const FineTuningJob_integrations_inner = require('../models/FineTuningJob_integrations_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The object identifier, which can be referenced in the API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the fine-tuning job was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            ...FineTuningJob_error.fields(`${keyPrefix}error`, isInput),
            {
                key: `${keyPrefix}fine_tuned_model`,
                label: `The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. - [${labelPrefix}fine_tuned_model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}finished_at`,
                label: `The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. - [${labelPrefix}finished_at]`,
                required: true,
                type: 'integer',
            },
            ...FineTuningJob_hyperparameters.fields(`${keyPrefix}hyperparameters`, isInput),
            {
                key: `${keyPrefix}model`,
                label: `The base model that is being fine-tuned. - [${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"fine_tuning.job\". - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'fine_tuning.job',
                ],
            },
            {
                key: `${keyPrefix}organization_id`,
                label: `The organization that owns the fine-tuning job. - [${labelPrefix}organization_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}result_files`,
                label: `The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). - [${labelPrefix}result_files]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'validating_files',
                    'queued',
                    'running',
                    'succeeded',
                    'failed',
                    'cancelled',
                ],
            },
            {
                key: `${keyPrefix}trained_tokens`,
                label: `The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. - [${labelPrefix}trained_tokens]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}training_file`,
                label: `The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). - [${labelPrefix}training_file]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}validation_file`,
                label: `The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). - [${labelPrefix}validation_file]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}integrations`,
                label: `[${labelPrefix}integrations]`,
                children: FineTuningJob_integrations_inner.fields(`${keyPrefix}integrations${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}seed`,
                label: `The seed used for the fine-tuning job. - [${labelPrefix}seed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}estimated_finish`,
                label: `The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. - [${labelPrefix}estimated_finish]`,
                type: 'integer',
            },
            ...FineTuneMethod.fields(`${keyPrefix}method`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'error': utils.removeIfEmpty(FineTuningJob_error.mapping(bundle, `${keyPrefix}error`)),
            'fine_tuned_model': bundle.inputData?.[`${keyPrefix}fine_tuned_model`],
            'finished_at': bundle.inputData?.[`${keyPrefix}finished_at`],
            'hyperparameters': utils.removeIfEmpty(FineTuningJob_hyperparameters.mapping(bundle, `${keyPrefix}hyperparameters`)),
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'organization_id': bundle.inputData?.[`${keyPrefix}organization_id`],
            'result_files': bundle.inputData?.[`${keyPrefix}result_files`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'trained_tokens': bundle.inputData?.[`${keyPrefix}trained_tokens`],
            'training_file': bundle.inputData?.[`${keyPrefix}training_file`],
            'validation_file': bundle.inputData?.[`${keyPrefix}validation_file`],
            'integrations': utils.childMapping(bundle.inputData?.[`${keyPrefix}integrations`], `${keyPrefix}integrations`, FineTuningJob_integrations_inner),
            'seed': bundle.inputData?.[`${keyPrefix}seed`],
            'estimated_finish': bundle.inputData?.[`${keyPrefix}estimated_finish`],
            'method': utils.removeIfEmpty(FineTuneMethod.mapping(bundle, `${keyPrefix}method`)),
        }
    },
}
