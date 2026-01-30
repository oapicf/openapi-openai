const utils = require('../utils/utils');
const RunStepDetailsToolCallsFileSearchRankingOptionsObject = require('../models/RunStepDetailsToolCallsFileSearchRankingOptionsObject');
const RunStepDetailsToolCallsFileSearchResultObject = require('../models/RunStepDetailsToolCallsFileSearchResultObject');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...RunStepDetailsToolCallsFileSearchRankingOptionsObject.fields(`${keyPrefix}ranking_options`, isInput),
            {
                key: `${keyPrefix}results`,
                label: `[${labelPrefix}results]`,
                children: RunStepDetailsToolCallsFileSearchResultObject.fields(`${keyPrefix}results${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ranking_options': utils.removeIfEmpty(RunStepDetailsToolCallsFileSearchRankingOptionsObject.mapping(bundle, `${keyPrefix}ranking_options`)),
            'results': utils.childMapping(bundle.inputData?.[`${keyPrefix}results`], `${keyPrefix}results`, RunStepDetailsToolCallsFileSearchResultObject),
        }
    },
}
