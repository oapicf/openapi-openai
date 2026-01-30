const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}data`,
                label: `Base64 encoded audio data. - [${labelPrefix}data]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}format`,
                label: `The format of the encoded audio data. Currently supports \"wav\" and \"mp3\".  - [${labelPrefix}format]`,
                required: true,
                type: 'string',
                choices: [
                    'wav',
                    'mp3',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'format': bundle.inputData?.[`${keyPrefix}format`],
        }
    },
}
