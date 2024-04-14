const utils = require('../utils/utils');
const SubmitToolOutputsRunRequest_tool_outputs_inner = require('../models/SubmitToolOutputsRunRequest_tool_outputs_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}tool_outputs`,
                label: `[${labelPrefix}tool_outputs]`,
                children: SubmitToolOutputsRunRequest_tool_outputs_inner.fields(`${keyPrefix}tool_outputs${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}stream`,
                label: `If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.  - [${labelPrefix}stream]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tool_outputs': utils.childMapping(bundle.inputData?.[`${keyPrefix}tool_outputs`], `${keyPrefix}tool_outputs`, SubmitToolOutputsRunRequest_tool_outputs_inner),
            'stream': bundle.inputData?.[`${keyPrefix}stream`],
        }
    },
}
