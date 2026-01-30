const utils = require('../utils/utils');
const ResponseFormatJsonObject = require('../models/ResponseFormatJsonObject');
const ResponseFormatJsonSchema = require('../models/ResponseFormatJsonSchema');
const ResponseFormatJsonSchema_json_schema = require('../models/ResponseFormatJsonSchema_json_schema');
const ResponseFormatText = require('../models/ResponseFormatText');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The type of response format being defined: `text` - [${labelPrefix}type]`,
                required: true,
                type: 'string',
                choices: [
                    'text',
                    'json_object',
                    'json_schema',
                ],
            },
            ...ResponseFormatJsonSchema_json_schema.fields(`${keyPrefix}json_schema`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'json_schema': utils.removeIfEmpty(ResponseFormatJsonSchema_json_schema.mapping(bundle, `${keyPrefix}json_schema`)),
        }
    },
}
