const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of error. - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}code`,
                label: `Error code, if any. - [${labelPrefix}code]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
        }
    },
}
