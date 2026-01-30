const utils = require('../utils/utils');
const FineTuneDPOMethod_hyperparameters_batch_size = require('../models/FineTuneDPOMethod_hyperparameters_batch_size');
const FineTuneDPOMethod_hyperparameters_beta = require('../models/FineTuneDPOMethod_hyperparameters_beta');
const FineTuneDPOMethod_hyperparameters_learning_rate_multiplier = require('../models/FineTuneDPOMethod_hyperparameters_learning_rate_multiplier');
const FineTuneDPOMethod_hyperparameters_n_epochs = require('../models/FineTuneDPOMethod_hyperparameters_n_epochs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FineTuneDPOMethod_hyperparameters_beta.fields(`${keyPrefix}beta`, isInput),
            ...FineTuneDPOMethod_hyperparameters_batch_size.fields(`${keyPrefix}batch_size`, isInput),
            ...FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.fields(`${keyPrefix}learning_rate_multiplier`, isInput),
            ...FineTuneDPOMethod_hyperparameters_n_epochs.fields(`${keyPrefix}n_epochs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'beta': utils.removeIfEmpty(FineTuneDPOMethod_hyperparameters_beta.mapping(bundle, `${keyPrefix}beta`)),
            'batch_size': utils.removeIfEmpty(FineTuneDPOMethod_hyperparameters_batch_size.mapping(bundle, `${keyPrefix}batch_size`)),
            'learning_rate_multiplier': utils.removeIfEmpty(FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.mapping(bundle, `${keyPrefix}learning_rate_multiplier`)),
            'n_epochs': utils.removeIfEmpty(FineTuneDPOMethod_hyperparameters_n_epochs.mapping(bundle, `${keyPrefix}n_epochs`)),
        }
    },
}
