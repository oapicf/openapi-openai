const utils = require('../utils/utils');

module.exports = {
        fields: (key) => (
            {
                label: `The role of the author of a message - [${key.replaceAll('__', '.')}]`,
                choices: [
                    'system',
                    'user',
                    'assistant',
                    'tool',
                    'function',
                ],
            }
        )
    }
