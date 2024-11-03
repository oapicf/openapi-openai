const utils = require('../utils/utils');
const CreateFineTuningJobRequest_integrations_inner_type = require('../models/CreateFineTuningJobRequest_integrations_inner_type');
const CreateFineTuningJobRequest_integrations_inner_wandb = require('../models/CreateFineTuningJobRequest_integrations_inner_wandb');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateFineTuningJobRequest_integrations_inner_type.fields(`${keyPrefix}type`, isInput),
            ...CreateFineTuningJobRequest_integrations_inner_wandb.fields(`${keyPrefix}wandb`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': utils.removeIfEmpty(CreateFineTuningJobRequest_integrations_inner_type.mapping(bundle, `${keyPrefix}type`)),
            'wandb': utils.removeIfEmpty(CreateFineTuningJobRequest_integrations_inner_wandb.mapping(bundle, `${keyPrefix}wandb`)),
        }
    },
}
