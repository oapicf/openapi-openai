const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}error_code`,
                label: `The error code of the failure. - [${labelPrefix}error_code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}error_message`,
                label: `The error message of the failure. - [${labelPrefix}error_message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'error_code': bundle.inputData?.[`${keyPrefix}error_code`],
            'error_message': bundle.inputData?.[`${keyPrefix}error_message`],
        }
    },
}
