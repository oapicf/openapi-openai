const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}hate`,
                label: `Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment. - [${labelPrefix}hate]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}hate/threatening`,
                label: `Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. - [${labelPrefix}hate/threatening]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}harassment`,
                label: `Content that expresses, incites, or promotes harassing language towards any target. - [${labelPrefix}harassment]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}harassment/threatening`,
                label: `Harassment content that also includes violence or serious harm towards any target. - [${labelPrefix}harassment/threatening]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}self-harm`,
                label: `Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders. - [${labelPrefix}self-harm]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}self-harm/intent`,
                label: `Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders. - [${labelPrefix}self-harm/intent]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}self-harm/instructions`,
                label: `Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts. - [${labelPrefix}self-harm/instructions]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}sexual`,
                label: `Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness). - [${labelPrefix}sexual]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}sexual/minors`,
                label: `Sexual content that includes an individual who is under 18 years old. - [${labelPrefix}sexual/minors]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}violence`,
                label: `Content that depicts death, violence, or physical injury. - [${labelPrefix}violence]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}violence/graphic`,
                label: `Content that depicts death, violence, or physical injury in graphic detail. - [${labelPrefix}violence/graphic]`,
                required: true,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'hate': bundle.inputData?.[`${keyPrefix}hate`],
            'hate/threatening': bundle.inputData?.[`${keyPrefix}hate/threatening`],
            'harassment': bundle.inputData?.[`${keyPrefix}harassment`],
            'harassment/threatening': bundle.inputData?.[`${keyPrefix}harassment/threatening`],
            'self-harm': bundle.inputData?.[`${keyPrefix}self-harm`],
            'self-harm/intent': bundle.inputData?.[`${keyPrefix}self-harm/intent`],
            'self-harm/instructions': bundle.inputData?.[`${keyPrefix}self-harm/instructions`],
            'sexual': bundle.inputData?.[`${keyPrefix}sexual`],
            'sexual/minors': bundle.inputData?.[`${keyPrefix}sexual/minors`],
            'violence': bundle.inputData?.[`${keyPrefix}violence`],
            'violence/graphic': bundle.inputData?.[`${keyPrefix}violence/graphic`],
        }
    },
}
