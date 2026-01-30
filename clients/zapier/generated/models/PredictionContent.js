const utils = require('../utils/utils');
const PredictionContent_content = require('../models/PredictionContent_content');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of the predicted content you want to provide. This type is currently always `content`.  - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'content',
                ],
            },
            ...PredictionContent_content.fields(`${keyPrefix}content`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'content': utils.removeIfEmpty(PredictionContent_content.mapping(bundle, `${keyPrefix}content`)),
        }
    },
}
