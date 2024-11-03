const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}content`,
                label: `The contents of the system message. - [${labelPrefix}content]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}role`,
                label: `The role of the messages author, in this case `system`. - [${labelPrefix}role]`,
                required: true,
                type: 'string',
                choices: [
                    'system',
                ],
            },
            {
                key: `${keyPrefix}name`,
                label: `An optional name for the participant. Provides the model information to differentiate between participants of the same role. - [${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'content': bundle.inputData?.[`${keyPrefix}content`],
            'role': bundle.inputData?.[`${keyPrefix}role`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
