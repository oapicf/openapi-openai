const utils = require('../utils/utils');
const FineTuningJobCheckpoint_metrics = require('../models/FineTuningJobCheckpoint_metrics');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The checkpoint identifier, which can be referenced in the API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the checkpoint was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}fine_tuned_model_checkpoint`,
                label: `The name of the fine-tuned checkpoint model that is created. - [${labelPrefix}fine_tuned_model_checkpoint]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}step_number`,
                label: `The step number that the checkpoint was created at. - [${labelPrefix}step_number]`,
                required: true,
                type: 'integer',
            },
            ...FineTuningJobCheckpoint_metrics.fields(`${keyPrefix}metrics`, isInput),
            {
                key: `${keyPrefix}fine_tuning_job_id`,
                label: `The name of the fine-tuning job that this checkpoint was created from. - [${labelPrefix}fine_tuning_job_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"fine_tuning.job.checkpoint\". - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'fine_tuning.job.checkpoint',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'fine_tuned_model_checkpoint': bundle.inputData?.[`${keyPrefix}fine_tuned_model_checkpoint`],
            'step_number': bundle.inputData?.[`${keyPrefix}step_number`],
            'metrics': utils.removeIfEmpty(FineTuningJobCheckpoint_metrics.mapping(bundle, `${keyPrefix}metrics`)),
            'fine_tuning_job_id': bundle.inputData?.[`${keyPrefix}fine_tuning_job_id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
        }
    },
}
