const utils = require('../utils/utils');
const AutoChunkingStrategyRequestParam = require('../models/AutoChunkingStrategyRequestParam');
const StaticChunkingStrategy = require('../models/StaticChunkingStrategy');
const StaticChunkingStrategyRequestParam = require('../models/StaticChunkingStrategyRequestParam');

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
