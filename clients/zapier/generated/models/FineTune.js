const utils = require('../utils/utils');
const FineTuneEvent = require('../models/FineTuneEvent');
const OpenAIFile = require('../models/OpenAIFile');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `[${labelPrefix}object]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `[${labelPrefix}updated_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}model`,
                label: `[${labelPrefix}model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}fine_tuned_model`,
                label: `[${labelPrefix}fine_tuned_model]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}organization_id`,
                label: `[${labelPrefix}organization_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `[${labelPrefix}status]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}hyperparams`,
                label: `[${labelPrefix}hyperparams]`,
                required: true,
                dict: true,
            },
            {
                key: `${keyPrefix}training_files`,
                label: `[${labelPrefix}training_files]`,
                children: OpenAIFile.fields(`${keyPrefix}training_files${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}validation_files`,
                label: `[${labelPrefix}validation_files]`,
                children: OpenAIFile.fields(`${keyPrefix}validation_files${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}result_files`,
                label: `[${labelPrefix}result_files]`,
                children: OpenAIFile.fields(`${keyPrefix}result_files${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}events`,
                label: `[${labelPrefix}events]`,
                children: FineTuneEvent.fields(`${keyPrefix}events${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'model': bundle.inputData?.[`${keyPrefix}model`],
            'fine_tuned_model': bundle.inputData?.[`${keyPrefix}fine_tuned_model`],
            'organization_id': bundle.inputData?.[`${keyPrefix}organization_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'hyperparams': bundle.inputData?.[`${keyPrefix}hyperparams`],
            'training_files': utils.childMapping(bundle.inputData?.[`${keyPrefix}training_files`], `${keyPrefix}training_files`, OpenAIFile),
            'validation_files': utils.childMapping(bundle.inputData?.[`${keyPrefix}validation_files`], `${keyPrefix}validation_files`, OpenAIFile),
            'result_files': utils.childMapping(bundle.inputData?.[`${keyPrefix}result_files`], `${keyPrefix}result_files`, OpenAIFile),
            'events': utils.childMapping(bundle.inputData?.[`${keyPrefix}events`], `${keyPrefix}events`, FineTuneEvent),
        }
    },
}
