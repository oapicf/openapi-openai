const utils = require('../utils/utils');
const RunObject = require('../models/RunObject');
const RunStreamEvent_oneOf = require('../models/RunStreamEvent_oneOf');
const RunStreamEvent_oneOf_1 = require('../models/RunStreamEvent_oneOf_1');
const RunStreamEvent_oneOf_2 = require('../models/RunStreamEvent_oneOf_2');
const RunStreamEvent_oneOf_3 = require('../models/RunStreamEvent_oneOf_3');
const RunStreamEvent_oneOf_4 = require('../models/RunStreamEvent_oneOf_4');
const RunStreamEvent_oneOf_5 = require('../models/RunStreamEvent_oneOf_5');
const RunStreamEvent_oneOf_6 = require('../models/RunStreamEvent_oneOf_6');
const RunStreamEvent_oneOf_7 = require('../models/RunStreamEvent_oneOf_7');
const RunStreamEvent_oneOf_8 = require('../models/RunStreamEvent_oneOf_8');
const RunStreamEvent_oneOf_9 = require('../models/RunStreamEvent_oneOf_9');

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
                    'thread.run.expired',
                ],
            },
            ...RunObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(RunObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
