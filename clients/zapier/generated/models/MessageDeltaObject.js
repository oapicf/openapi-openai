const utils = require('../utils/utils');
const MessageDeltaObject_delta = require('../models/MessageDeltaObject_delta');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier of the message, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `thread.message.delta`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.message.delta',
                ],
            },
            ...MessageDeltaObject_delta.fields(`${keyPrefix}delta`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'delta': utils.removeIfEmpty(MessageDeltaObject_delta.mapping(bundle, `${keyPrefix}delta`)),
        }
    },
}
