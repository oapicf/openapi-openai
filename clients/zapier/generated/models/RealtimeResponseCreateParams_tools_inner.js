const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the tool, i.e. `function`. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'function',
                ],
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the function. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything).  - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}parameters`,
                label: `Parameters of the function in JSON Schema. - [${labelPrefix}parameters]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'parameters': bundle.inputData?.[`${keyPrefix}parameters`],
        }
    },
}
