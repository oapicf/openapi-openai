const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Project's public ID - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: `Project membership role - [${labelPrefix}role]`,
                type: 'string',
                choices: [
                    'member',
                    'owner',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
        }
    },
}
