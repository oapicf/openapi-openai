const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always \"fine_tuning.job.event\". - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'fine_tuning.job.event',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `The object identifier. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `The Unix timestamp (in seconds) for when the fine-tuning job was created. - [${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}level`,
                label: `The log level of the event. - [${labelPrefix}level]`,
                required: true,
                type: 'string',
                choices: [
                    'info',
                    'warn',
                    'error',
                ],
            },
            {
                key: `${keyPrefix}message`,
                label: `The message of the event. - [${labelPrefix}message]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `The type of event. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'message',
                    'metrics',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `The data associated with the event. - [${labelPrefix}data]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
        }
    },
}
