const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The file identifier, which can be referenced in the API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}bytes`,
                label: `The size of the file, in bytes. - [${labelPrefix}bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the file was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}filename`,
                label: `The name of the file. - [${labelPrefix}filename]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `file`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'file',
                ],
            },
            {
                key: `${keyPrefix}purpose`,
                label: `The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`. - [${labelPrefix}purpose]`,
                required: true,
                type: 'string',
                choices: [
                    'assistants',
                    'assistants_output',
                    'batch',
                    'batch_output',
                    'fine-tune',
                    'fine-tune-results',
                    'vision',
                ],
            },
            {
                key: `${keyPrefix}status`,
                label: `Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'uploaded',
                    'processed',
                    'error',
                ],
            },
            {
                key: `${keyPrefix}status_details`,
                label: `Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. - [${labelPrefix}status_details]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'bytes': bundle.inputData?.[`${keyPrefix}bytes`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'filename': bundle.inputData?.[`${keyPrefix}filename`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'purpose': bundle.inputData?.[`${keyPrefix}purpose`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'status_details': bundle.inputData?.[`${keyPrefix}status_details`],
        }
    },
}
