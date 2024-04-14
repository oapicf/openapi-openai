const utils = require('../utils/utils');
const RunStepDeltaObject = require('../models/RunStepDeltaObject');

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
                    'thread.run.step.delta',
                ],
            },
            ...RunStepDeltaObject.fields(`${keyPrefix}data`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'event': bundle.inputData?.[`${keyPrefix}event`],
            'data': utils.removeIfEmpty(RunStepDeltaObject.mapping(bundle, `${keyPrefix}data`)),
        }
    },
}
