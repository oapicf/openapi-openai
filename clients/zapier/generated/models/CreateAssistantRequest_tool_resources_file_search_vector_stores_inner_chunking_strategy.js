const utils = require('../utils/utils');
const Auto_Chunking_Strategy = require('../models/Auto_Chunking_Strategy');
const Static_Chunking_Strategy = require('../models/Static_Chunking_Strategy');
const Static_Chunking_Strategy_static = require('../models/Static_Chunking_Strategy_static');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `auto`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'auto',
                    'static',
                ],
            },
            ...Static_Chunking_Strategy_static.fields(`${keyPrefix}static`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'static': utils.removeIfEmpty(Static_Chunking_Strategy_static.mapping(bundle, `${keyPrefix}static`)),
        }
    },
}
