const utils = require('../utils/utils');
const RunStepDeltaObject_delta_step_details = require('../models/RunStepDeltaObject_delta_step_details');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...RunStepDeltaObject_delta_step_details.fields(`${keyPrefix}step_details`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'step_details': utils.removeIfEmpty(RunStepDeltaObject_delta_step_details.mapping(bundle, `${keyPrefix}step_details`)),
        }
    },
}
