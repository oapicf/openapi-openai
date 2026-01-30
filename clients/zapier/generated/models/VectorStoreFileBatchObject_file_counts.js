const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}in_progress`,
                label: `The number of files that are currently being processed. - [${labelPrefix}in_progress]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}completed`,
                label: `The number of files that have been processed. - [${labelPrefix}completed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}failed`,
                label: `The number of files that have failed to process. - [${labelPrefix}failed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cancelled`,
                label: `The number of files that where cancelled. - [${labelPrefix}cancelled]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}total`,
                label: `The total number of files. - [${labelPrefix}total]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'in_progress': bundle.inputData?.[`${keyPrefix}in_progress`],
            'completed': bundle.inputData?.[`${keyPrefix}completed`],
            'failed': bundle.inputData?.[`${keyPrefix}failed`],
            'cancelled': bundle.inputData?.[`${keyPrefix}cancelled`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
        }
    },
}
