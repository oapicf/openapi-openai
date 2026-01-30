const utils = require('../utils/utils');
const FineTunePreferenceRequestInput_input = require('../models/FineTunePreferenceRequestInput_input');
const FineTunePreferenceRequestInput_preferred_completion_inner = require('../models/FineTunePreferenceRequestInput_preferred_completion_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FineTunePreferenceRequestInput_input.fields(`${keyPrefix}input`, isInput),
            {
                key: `${keyPrefix}preferred_completion`,
                label: `[${labelPrefix}preferred_completion]`,
                children: FineTunePreferenceRequestInput_preferred_completion_inner.fields(`${keyPrefix}preferred_completion${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}non_preferred_completion`,
                label: `[${labelPrefix}non_preferred_completion]`,
                children: FineTunePreferenceRequestInput_preferred_completion_inner.fields(`${keyPrefix}non_preferred_completion${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'input': utils.removeIfEmpty(FineTunePreferenceRequestInput_input.mapping(bundle, `${keyPrefix}input`)),
            'preferred_completion': utils.childMapping(bundle.inputData?.[`${keyPrefix}preferred_completion`], `${keyPrefix}preferred_completion`, FineTunePreferenceRequestInput_preferred_completion_inner),
            'non_preferred_completion': utils.childMapping(bundle.inputData?.[`${keyPrefix}non_preferred_completion`], `${keyPrefix}non_preferred_completion`, FineTunePreferenceRequestInput_preferred_completion_inner),
        }
    },
}
