const utils = require('../utils/utils');
const RunStepDeltaObject_delta = require('../models/RunStepDeltaObject_delta');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The identifier of the run step, which can be referenced in API endpoints. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}object`,
                label: `The object type, which is always `thread.run.step.delta`. - [${labelPrefix}object]`,
                required: true,
                type: 'string',
                choices: [
                    'thread.run.step.delta',
                ],
            },
            ...RunStepDeltaObject_delta.fields(`${keyPrefix}delta`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'object': bundle.inputData?.[`${keyPrefix}object`],
            'delta': utils.removeIfEmpty(RunStepDeltaObject_delta.mapping(bundle, `${keyPrefix}delta`)),
        }
    },
}
