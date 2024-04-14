const utils = require('../utils/utils');
const RunStepObject = require('../models/RunStepObject');
const RunStepStreamEvent_oneOf = require('../models/RunStepStreamEvent_oneOf');
const RunStepStreamEvent_oneOf_1 = require('../models/RunStepStreamEvent_oneOf_1');
const RunStepStreamEvent_oneOf_2 = require('../models/RunStepStreamEvent_oneOf_2');
const RunStepStreamEvent_oneOf_3 = require('../models/RunStepStreamEvent_oneOf_3');
const RunStepStreamEvent_oneOf_4 = require('../models/RunStepStreamEvent_oneOf_4');
const RunStepStreamEvent_oneOf_5 = require('../models/RunStepStreamEvent_oneOf_5');
const RunStepStreamEvent_oneOf_6 = require('../models/RunStepStreamEvent_oneOf_6');

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
                    'thread.run.step.expired',
                ],
            },
            ...RunStepObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(RunStepObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
