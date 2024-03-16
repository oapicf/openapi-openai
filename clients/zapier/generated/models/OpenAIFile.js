const utils = require('../utils/utils');

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
                key: `${keyPrefix}bytes`,
                label: `[${labelPrefix}bytes]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}filename`,
                label: `[${labelPrefix}filename]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}purpose`,
                label: `[${labelPrefix}purpose]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `[${labelPrefix}status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status_details`,
                label: `[${labelPrefix}status_details]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'bytes': bundle.inputData?.[`${keyPrefix}bytes`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'filename': bundle.inputData?.[`${keyPrefix}filename`],
            'purpose': bundle.inputData?.[`${keyPrefix}purpose`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'status_details': bundle.inputData?.[`${keyPrefix}status_details`],
        }
    },
}
