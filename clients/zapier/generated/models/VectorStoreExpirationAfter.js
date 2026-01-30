const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}anchor`,
                label: `Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`. - [${labelPrefix}anchor]`,
                required: true,
                type: 'string',
                choices: [
                    'last_active_at',
                ],
            },
            {
                key: `${keyPrefix}days`,
                label: `The number of days after the anchor time that the vector store will expire. - [${labelPrefix}days]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'anchor': bundle.inputData?.[`${keyPrefix}anchor`],
            'days': bundle.inputData?.[`${keyPrefix}days`],
        }
    },
}
