const utils = require('../utils/utils');
const MessageDeltaObject = require('../models/MessageDeltaObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}event`,
                label: `[${labelPrefix}event]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.message.delta',
                ],
            },
            ...MessageDeltaObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(MessageDeltaObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
