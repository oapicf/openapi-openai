const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}user_id`,
                label: `The ID of the user. - [${labelPrefix}user_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: ``owner` or `member` - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'owner',
                    'member',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
        }
    },
}
