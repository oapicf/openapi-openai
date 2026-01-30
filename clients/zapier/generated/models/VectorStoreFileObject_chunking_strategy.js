const utils = require('../utils/utils');
const OtherChunkingStrategyResponseParam = require('../models/OtherChunkingStrategyResponseParam');
const StaticChunkingStrategy = require('../models/StaticChunkingStrategy');
const StaticChunkingStrategyResponseParam = require('../models/StaticChunkingStrategyResponseParam');

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
                    'other',
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
