const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}total`,
                label: `Total number of requests in the batch. - [${labelPrefix}total]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}completed`,
                label: `Number of requests that have been completed successfully. - [${labelPrefix}completed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}failed`,
                label: `Number of requests that have failed. - [${labelPrefix}failed]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'total': bundle.inputData?.[`${keyPrefix}total`],
            'completed': bundle.inputData?.[`${keyPrefix}completed`],
            'failed': bundle.inputData?.[`${keyPrefix}failed`],
        }
    },
}
