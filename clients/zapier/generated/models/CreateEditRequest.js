const utils = require('../utils/utils');
const CreateEditRequest_model = require('../models/CreateEditRequest_model');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CreateEditRequest_model.fields(`${keyPrefix}model`, isInput),
            {
                key: `${keyPrefix}input`,
                label: `The input text to use as a starting point for the edit. - [${labelPrefix}input]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}instruction`,
                label: `The instruction that tells the model how to edit the prompt. - [${labelPrefix}instruction]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}n`,
                label: `How many edits to generate for the input and instruction. - [${labelPrefix}n]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}temperature`,
                label: `What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both.  - [${labelPrefix}temperature]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}top_p`,
                label: `An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  - [${labelPrefix}top_p]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'model': utils.removeIfEmpty(CreateEditRequest_model.mapping(bundle, `${keyPrefix}model`)),
            'input': bundle.inputData?.[`${keyPrefix}input`],
            'instruction': bundle.inputData?.[`${keyPrefix}instruction`],
            'n': bundle.inputData?.[`${keyPrefix}n`],
            'temperature': bundle.inputData?.[`${keyPrefix}temperature`],
            'top_p': bundle.inputData?.[`${keyPrefix}top_p`],
        }
    },
}
