export * from './assistantsApi';
import { AssistantsApi } from './assistantsApi';
export * from './audioApi';
import { AudioApi } from './audioApi';
export * from './auditLogsApi';
import { AuditLogsApi } from './auditLogsApi';
export * from './batchApi';
import { BatchApi } from './batchApi';
export * from './chatApi';
import { ChatApi } from './chatApi';
export * from './completionsApi';
import { CompletionsApi } from './completionsApi';
export * from './defaultApi';
import { DefaultApi } from './defaultApi';
export * from './embeddingsApi';
import { EmbeddingsApi } from './embeddingsApi';
export * from './filesApi';
import { FilesApi } from './filesApi';
export * from './fineTuningApi';
import { FineTuningApi } from './fineTuningApi';
export * from './imagesApi';
import { ImagesApi } from './imagesApi';
export * from './invitesApi';
import { InvitesApi } from './invitesApi';
export * from './modelsApi';
import { ModelsApi } from './modelsApi';
export * from './moderationsApi';
import { ModerationsApi } from './moderationsApi';
export * from './projectsApi';
import { ProjectsApi } from './projectsApi';
export * from './realtimeApi';
import { RealtimeApi } from './realtimeApi';
export * from './uploadsApi';
import { UploadsApi } from './uploadsApi';
export * from './usageApi';
import { UsageApi } from './usageApi';
export * from './usersApi';
import { UsersApi } from './usersApi';
export * from './vectorStoresApi';
import { VectorStoresApi } from './vectorStoresApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AssistantsApi, AudioApi, AuditLogsApi, BatchApi, ChatApi, CompletionsApi, DefaultApi, EmbeddingsApi, FilesApi, FineTuningApi, ImagesApi, InvitesApi, ModelsApi, ModerationsApi, ProjectsApi, RealtimeApi, UploadsApi, UsageApi, UsersApi, VectorStoresApi];
