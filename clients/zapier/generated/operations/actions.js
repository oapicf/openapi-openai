const OpenAIApi = require('../apis/OpenAIApi');
const { searchMiddleware, hasSearchRequisites, isSearchAction } = require('../utils/utils');

const actions = {
    [OpenAIApi.cancelFineTune.key]: OpenAIApi.cancelFineTune,
    [OpenAIApi.createChatCompletion.key]: OpenAIApi.createChatCompletion,
    [OpenAIApi.createCompletion.key]: OpenAIApi.createCompletion,
    [OpenAIApi.createEdit.key]: OpenAIApi.createEdit,
    [OpenAIApi.createEmbedding.key]: OpenAIApi.createEmbedding,
    [OpenAIApi.createFile.key]: OpenAIApi.createFile,
    [OpenAIApi.createFineTune.key]: OpenAIApi.createFineTune,
    [OpenAIApi.createImage.key]: OpenAIApi.createImage,
    [OpenAIApi.createImageEdit.key]: OpenAIApi.createImageEdit,
    [OpenAIApi.createImageVariation.key]: OpenAIApi.createImageVariation,
    [OpenAIApi.createModeration.key]: OpenAIApi.createModeration,
    [OpenAIApi.createTranscription.key]: OpenAIApi.createTranscription,
    [OpenAIApi.createTranslation.key]: OpenAIApi.createTranslation,
    [OpenAIApi.deleteFile.key]: OpenAIApi.deleteFile,
    [OpenAIApi.deleteModel.key]: OpenAIApi.deleteModel,
    [OpenAIApi.downloadFile.key]: OpenAIApi.downloadFile,
    [OpenAIApi.listFiles.key]: OpenAIApi.listFiles,
    [OpenAIApi.listFineTuneEvents.key]: OpenAIApi.listFineTuneEvents,
    [OpenAIApi.listFineTunes.key]: OpenAIApi.listFineTunes,
    [OpenAIApi.listModels.key]: OpenAIApi.listModels,
    [OpenAIApi.retrieveFile.key]: OpenAIApi.retrieveFile,
    [OpenAIApi.retrieveFineTune.key]: OpenAIApi.retrieveFineTune,
    [OpenAIApi.retrieveModel.key]: OpenAIApi.retrieveModel,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => !isSearchAction(key) ? {...actions, [key]: value} : actions, {}),
}