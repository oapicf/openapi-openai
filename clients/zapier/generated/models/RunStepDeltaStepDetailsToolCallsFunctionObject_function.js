const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The name of the function. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}arguments`,
                label: `The arguments passed to the function. - [${labelPrefix}arguments]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}output`,
                label: `The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet. - [${labelPrefix}output]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'arguments': bundle.inputData?.[`${keyPrefix}arguments`],
            'output': bundle.inputData?.[`${keyPrefix}output`],
        }
    },
}
