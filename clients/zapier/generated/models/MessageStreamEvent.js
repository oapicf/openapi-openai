const utils = require('../utils/utils');
const MessageObject = require('../models/MessageObject');
const MessageStreamEvent_oneOf = require('../models/MessageStreamEvent_oneOf');
const MessageStreamEvent_oneOf_1 = require('../models/MessageStreamEvent_oneOf_1');
const MessageStreamEvent_oneOf_2 = require('../models/MessageStreamEvent_oneOf_2');
const MessageStreamEvent_oneOf_3 = require('../models/MessageStreamEvent_oneOf_3');
const MessageStreamEvent_oneOf_4 = require('../models/MessageStreamEvent_oneOf_4');

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
                    'thread.message.incomplete',
                ],
            },
            ...MessageObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(MessageObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
