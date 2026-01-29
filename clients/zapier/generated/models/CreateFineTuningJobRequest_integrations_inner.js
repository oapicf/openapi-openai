const utils = require('../utils/utils');
const CreateFineTuningJobRequest_integrations_inner_wandb = require('../models/CreateFineTuningJobRequest_integrations_inner_wandb');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `[${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'wandb',
                ],
            },
            ...CreateFineTuningJobRequest_integrations_inner_wandb.fields(`${keyPrefix}wandb`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'wandb': utils.removeIfEmpty(CreateFineTuningJobRequest_integrations_inner_wandb.mapping(bundle, `${keyPrefix}wandb`)),
        }
    },
}
