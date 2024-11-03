export * from './assistantsApi';
import { AssistantsApi } from './assistantsApi';
export * from './audioApi';
import { AudioApi } from './audioApi';
export * from './chatApi';
import { ChatApi } from './chatApi';
export * from './completionsApi';
import { CompletionsApi } from './completionsApi';
export * from './embeddingsApi';
import { EmbeddingsApi } from './embeddingsApi';
export * from './filesApi';
import { FilesApi } from './filesApi';
export * from './fineTuningApi';
import { FineTuningApi } from './fineTuningApi';
export * from './imagesApi';
import { ImagesApi } from './imagesApi';
export * from './modelsApi';
import { ModelsApi } from './modelsApi';
export * from './moderationsApi';
import { ModerationsApi } from './moderationsApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AssistantsApi, AudioApi, ChatApi, CompletionsApi, EmbeddingsApi, FilesApi, FineTuningApi, ImagesApi, ModelsApi, ModerationsApi];
