const AssistantsApi = require('../apis/AssistantsApi');
const AudioApi = require('../apis/AudioApi');
const ChatApi = require('../apis/ChatApi');
const CompletionsApi = require('../apis/CompletionsApi');
const EmbeddingsApi = require('../apis/EmbeddingsApi');
const FilesApi = require('../apis/FilesApi');
const FineTuningApi = require('../apis/FineTuningApi');
const ImagesApi = require('../apis/ImagesApi');
const ModelsApi = require('../apis/ModelsApi');
const ModerationsApi = require('../apis/ModerationsApi');
const { triggerMiddleware, isTrigger, searchMiddleware, hasSearchRequisites, isSearchAction, isCreateAction } = require('../utils/utils');

const actions = {
    [AssistantsApi.cancelRun.key]: AssistantsApi.cancelRun,
    [AssistantsApi.createAssistant.key]: AssistantsApi.createAssistant,
    [AssistantsApi.createAssistantFile.key]: AssistantsApi.createAssistantFile,
    [AssistantsApi.createMessage.key]: AssistantsApi.createMessage,
    [AssistantsApi.createRun.key]: AssistantsApi.createRun,
    [AssistantsApi.createThread.key]: AssistantsApi.createThread,
    [AssistantsApi.createThreadAndRun.key]: AssistantsApi.createThreadAndRun,
    [AssistantsApi.deleteAssistant.key]: AssistantsApi.deleteAssistant,
    [AssistantsApi.deleteAssistantFile.key]: AssistantsApi.deleteAssistantFile,
    [AssistantsApi.deleteThread.key]: AssistantsApi.deleteThread,
    [AssistantsApi.getAssistant.key]: AssistantsApi.getAssistant,
    [AssistantsApi.getAssistantFile.key]: AssistantsApi.getAssistantFile,
    [AssistantsApi.getMessage.key]: AssistantsApi.getMessage,
    [AssistantsApi.getMessageFile.key]: AssistantsApi.getMessageFile,
    [AssistantsApi.getRun.key]: AssistantsApi.getRun,
    [AssistantsApi.getRunStep.key]: AssistantsApi.getRunStep,
    [AssistantsApi.getThread.key]: AssistantsApi.getThread,
    [AssistantsApi.listAssistantFiles.key]: AssistantsApi.listAssistantFiles,
    [AssistantsApi.listAssistants.key]: AssistantsApi.listAssistants,
    [AssistantsApi.listMessageFiles.key]: AssistantsApi.listMessageFiles,
    [AssistantsApi.listMessages.key]: AssistantsApi.listMessages,
    [AssistantsApi.listRunSteps.key]: AssistantsApi.listRunSteps,
    [AssistantsApi.listRuns.key]: AssistantsApi.listRuns,
    [AssistantsApi.modifyAssistant.key]: AssistantsApi.modifyAssistant,
    [AssistantsApi.modifyMessage.key]: AssistantsApi.modifyMessage,
    [AssistantsApi.modifyRun.key]: AssistantsApi.modifyRun,
    [AssistantsApi.modifyThread.key]: AssistantsApi.modifyThread,
    [AssistantsApi.submitToolOuputsToRun.key]: AssistantsApi.submitToolOuputsToRun,
    [AudioApi.createSpeech.key]: AudioApi.createSpeech,
    [AudioApi.createTranscription.key]: AudioApi.createTranscription,
    [AudioApi.createTranslation.key]: AudioApi.createTranslation,
    [ChatApi.createChatCompletion.key]: ChatApi.createChatCompletion,
    [CompletionsApi.createCompletion.key]: CompletionsApi.createCompletion,
    [EmbeddingsApi.createEmbedding.key]: EmbeddingsApi.createEmbedding,
    [FilesApi.createFile.key]: FilesApi.createFile,
    [FilesApi.deleteFile.key]: FilesApi.deleteFile,
    [FilesApi.downloadFile.key]: FilesApi.downloadFile,
    [FilesApi.listFiles.key]: FilesApi.listFiles,
    [FilesApi.retrieveFile.key]: FilesApi.retrieveFile,
    [FineTuningApi.cancelFineTuningJob.key]: FineTuningApi.cancelFineTuningJob,
    [FineTuningApi.createFineTuningJob.key]: FineTuningApi.createFineTuningJob,
    [FineTuningApi.listFineTuningEvents.key]: FineTuningApi.listFineTuningEvents,
    [FineTuningApi.listFineTuningJobCheckpoints.key]: FineTuningApi.listFineTuningJobCheckpoints,
    [FineTuningApi.listPaginatedFineTuningJobs.key]: FineTuningApi.listPaginatedFineTuningJobs,
    [FineTuningApi.retrieveFineTuningJob.key]: FineTuningApi.retrieveFineTuningJob,
    [ImagesApi.createImage.key]: ImagesApi.createImage,
    [ImagesApi.createImageEdit.key]: ImagesApi.createImageEdit,
    [ImagesApi.createImageVariation.key]: ImagesApi.createImageVariation,
    [ModelsApi.deleteModel.key]: ModelsApi.deleteModel,
    [ModelsApi.listModels.key]: ModelsApi.listModels,
    [ModelsApi.retrieveModel.key]: ModelsApi.retrieveModel,
    [ModerationsApi.createModeration.key]: ModerationsApi.createModeration,
}

module.exports = {
    searchActions: () => Object.entries(actions).reduce((actions, [key, value]) => isSearchAction(key) && hasSearchRequisites(value) ? {...actions, [key]: searchMiddleware(value)} : actions, {}),
    createActions: () => Object.entries(actions).reduce((actions, [key, value]) => isCreateAction(key) ? {...actions, [key]: value} : actions, {}),
    triggers: () => Object.entries(actions).reduce((actions, [key, value]) => isTrigger(key) ? {...actions, [key]: triggerMiddleware(value)} : actions, {}),
}
