const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}email`,
                label: `The email invited to the organization. - [${labelPrefix}email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: `The role the email was invited to be. Is either `owner` or `member`. - [${labelPrefix}role]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'email': bundle.inputData?.[`${keyPrefix}email`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
        }
    },
}
