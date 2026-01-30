const utils = require('../utils/utils');
const RealtimeResponse_usage_input_token_details = require('../models/RealtimeResponse_usage_input_token_details');
const RealtimeResponse_usage_output_token_details = require('../models/RealtimeResponse_usage_output_token_details');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}total_tokens`,
                label: `The total number of tokens in the Response including input and output  text and audio tokens.  - [${labelPrefix}total_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}input_tokens`,
                label: `The number of input tokens used in the Response, including text and  audio tokens.  - [${labelPrefix}input_tokens]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}output_tokens`,
                label: `The number of output tokens sent in the Response, including text and  audio tokens.  - [${labelPrefix}output_tokens]`,
                type: 'integer',
            },
            ...RealtimeResponse_usage_input_token_details.fields(`${keyPrefix}input_token_details`, isInput),
            ...RealtimeResponse_usage_output_token_details.fields(`${keyPrefix}output_token_details`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'total_tokens': bundle.inputData?.[`${keyPrefix}total_tokens`],
            'input_tokens': bundle.inputData?.[`${keyPrefix}input_tokens`],
            'output_tokens': bundle.inputData?.[`${keyPrefix}output_tokens`],
            'input_token_details': utils.removeIfEmpty(RealtimeResponse_usage_input_token_details.mapping(bundle, `${keyPrefix}input_token_details`)),
            'output_token_details': utils.removeIfEmpty(RealtimeResponse_usage_output_token_details.mapping(bundle, `${keyPrefix}output_token_details`)),
        }
    },
}
