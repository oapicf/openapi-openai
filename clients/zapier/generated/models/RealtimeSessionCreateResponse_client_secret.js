const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}value`,
                label: `Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side.  - [${labelPrefix}value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}expires_at`,
                label: `Timestamp for when the token expires. Currently, all tokens expire after one minute.  - [${labelPrefix}expires_at]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
        }
    },
}
