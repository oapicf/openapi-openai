const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}tool_call_id`,
                label: `The ID of the tool call in the `required_action` object within the run object the output is being submitted for. - [${labelPrefix}tool_call_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}output`,
                label: `The output of the tool call to be submitted to continue the run. - [${labelPrefix}output]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'tool_call_id': bundle.inputData?.[`${keyPrefix}tool_call_id`],
            'output': bundle.inputData?.[`${keyPrefix}output`],
        }
    },
}
