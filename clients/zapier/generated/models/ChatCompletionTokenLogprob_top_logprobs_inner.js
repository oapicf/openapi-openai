const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}token`,
                label: `The token. - [${labelPrefix}token]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}logprob`,
                label: `The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. - [${labelPrefix}logprob]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}bytes`,
                label: `A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. - [${labelPrefix}bytes]`,
                required: true,
                list: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'token': bundle.inputData?.[`${keyPrefix}token`],
            'logprob': bundle.inputData?.[`${keyPrefix}logprob`],
            'bytes': bundle.inputData?.[`${keyPrefix}bytes`],
        }
    },
}
