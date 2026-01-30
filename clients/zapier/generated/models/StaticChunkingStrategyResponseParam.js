const utils = require('../utils/utils');
const StaticChunkingStrategy = require('../models/StaticChunkingStrategy');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always `static`. - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'static',
                ],
            },
            ...StaticChunkingStrategy.fields(`${keyPrefix}static`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'static': utils.removeIfEmpty(StaticChunkingStrategy.mapping(bundle, `${keyPrefix}static`)),
        }
    },
}
