const utils = require('../utils/utils');
const RunStepDeltaStepDetailsMessageCreationObject_message_creation = require('../models/RunStepDeltaStepDetailsMessageCreationObject_message_creation');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `message_creation`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'message_creation',
                ],
            },
            ...RunStepDeltaStepDetailsMessageCreationObject_message_creation.fields(`${keyPrefix}message_creation`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'message_creation': utils.removeIfEmpty(RunStepDeltaStepDetailsMessageCreationObject_message_creation.mapping(bundle, `${keyPrefix}message_creation`)),
        }
    },
}
