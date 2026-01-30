const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}scopes`,
                label: `A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]` - [${labelPrefix}scopes]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scopes': bundle.inputData?.[`${keyPrefix}scopes`],
        }
    },
}
