const utils = require('../utils/utils');
const FineTuneDPOMethod_hyperparameters = require('../models/FineTuneDPOMethod_hyperparameters');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...FineTuneDPOMethod_hyperparameters.fields(`${keyPrefix}hyperparameters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hyperparameters': utils.removeIfEmpty(FineTuneDPOMethod_hyperparameters.mapping(bundle, `${keyPrefix}hyperparameters`)),
        }
    },
}
