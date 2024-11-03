const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}reason`,
                label: `The reason the message is incomplete. - [${labelPrefix}reason]`,
                required: true,
                type: 'string',
                choices: [
                    'content_filter',
                    'max_tokens',
                    'run_cancelled',
                    'run_expired',
                    'run_failed',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
        }
    },
}
