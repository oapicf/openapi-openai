const utils = require('../utils/utils');
const FineTuneDPOMethod = require('../models/FineTuneDPOMethod');
const FineTuneSupervisedMethod = require('../models/FineTuneSupervisedMethod');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of method. Is either `supervised` or `dpo`. - [${labelPrefix}type]`,
                type: 'string',
                choices: [
                    'supervised',
                    'dpo',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'supervised': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}supervised`)),
            'dpo': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}dpo`)),
        }
    },
}
