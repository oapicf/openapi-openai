const utils = require('../utils/utils');
const RunObject_required_action_submit_tool_outputs = require('../models/RunObject_required_action_submit_tool_outputs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `For now, this is always `submit_tool_outputs`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'submit_tool_outputs',
                ],
            },
            ...RunObject_required_action_submit_tool_outputs.fields(`${keyPrefix}submit_tool_outputs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'submit_tool_outputs': utils.removeIfEmpty(RunObject_required_action_submit_tool_outputs.mapping(bundle, `${keyPrefix}submit_tool_outputs`)),
        }
    },
}
