const utils = require('../utils/utils');
const FineTuningJob_hyperparameters_n_epochs = require('../models/FineTuningJob_hyperparameters_n_epochs');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FineTuningJob_hyperparameters_n_epochs.fields(`${keyPrefix}n_epochs`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'n_epochs': utils.removeIfEmpty(FineTuningJob_hyperparameters_n_epochs.mapping(bundle, `${keyPrefix}n_epochs`)),
        }
    },
}
