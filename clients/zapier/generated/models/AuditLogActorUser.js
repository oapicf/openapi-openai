const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The user id. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}email`,
                label: `The user email. - [${labelPrefix}email]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'email': bundle.inputData?.[`${keyPrefix}email`],
        }
    },
}
