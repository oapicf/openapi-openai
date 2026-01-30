const utils = require('../utils/utils');
const CreateFineTuningJobRequest_hyperparameters_batch_size = require('../models/CreateFineTuningJobRequest_hyperparameters_batch_size');
const CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier = require('../models/CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier');
const CreateFineTuningJobRequest_hyperparameters_n_epochs = require('../models/CreateFineTuningJobRequest_hyperparameters_n_epochs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateFineTuningJobRequest_hyperparameters_batch_size.fields(`${keyPrefix}batch_size`, isInput),
            ...CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.fields(`${keyPrefix}learning_rate_multiplier`, isInput),
            ...CreateFineTuningJobRequest_hyperparameters_n_epochs.fields(`${keyPrefix}n_epochs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'batch_size': utils.removeIfEmpty(CreateFineTuningJobRequest_hyperparameters_batch_size.mapping(bundle, `${keyPrefix}batch_size`)),
            'learning_rate_multiplier': utils.removeIfEmpty(CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.mapping(bundle, `${keyPrefix}learning_rate_multiplier`)),
            'n_epochs': utils.removeIfEmpty(CreateFineTuningJobRequest_hyperparameters_n_epochs.mapping(bundle, `${keyPrefix}n_epochs`)),
        }
    },
}
