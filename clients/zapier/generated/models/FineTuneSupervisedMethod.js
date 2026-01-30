const utils = require('../utils/utils');
const FineTuneSupervisedMethod_hyperparameters = require('../models/FineTuneSupervisedMethod_hyperparameters');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FineTuneSupervisedMethod_hyperparameters.fields(`${keyPrefix}hyperparameters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hyperparameters': utils.removeIfEmpty(FineTuneSupervisedMethod_hyperparameters.mapping(bundle, `${keyPrefix}hyperparameters`)),
        }
    },
}
