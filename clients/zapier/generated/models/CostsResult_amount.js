const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `The numeric value of the cost. - [${labelPrefix}value]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}currency`,
                label: `Lowercase ISO-4217 currency e.g. \"usd\" - [${labelPrefix}currency]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
        }
    },
}
