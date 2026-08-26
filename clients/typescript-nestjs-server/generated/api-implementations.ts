import { Type } from '@nestjs/common';
import { AssistantsApi } from './api';
import { AudioApi } from './api';
import { AuditLogsApi } from './api';
import { BatchApi } from './api';
import { ChatApi } from './api';
import { CompletionsApi } from './api';
import { DefaultApi } from './api';
import { EmbeddingsApi } from './api';
import { FilesApi } from './api';
import { FineTuningApi } from './api';
import { ImagesApi } from './api';
import { InvitesApi } from './api';
import { ModelsApi } from './api';
import { ModerationsApi } from './api';
import { ProjectsApi } from './api';
import { RealtimeApi } from './api';
import { UploadsApi } from './api';
import { UsageApi } from './api';
import { UsersApi } from './api';
import { VectorStoresApi } from './api';

/**
 * Provide this type to {@link ApiModule} to provide your API implementations
**/
export type ApiImplementations = {
  assistantsApi: Type<AssistantsApi>
  audioApi: Type<AudioApi>
  auditLogsApi: Type<AuditLogsApi>
  batchApi: Type<BatchApi>
  chatApi: Type<ChatApi>
  completionsApi: Type<CompletionsApi>
  defaultApi: Type<DefaultApi>
  embeddingsApi: Type<EmbeddingsApi>
  filesApi: Type<FilesApi>
  fineTuningApi: Type<FineTuningApi>
  imagesApi: Type<ImagesApi>
  invitesApi: Type<InvitesApi>
  modelsApi: Type<ModelsApi>
  moderationsApi: Type<ModerationsApi>
  projectsApi: Type<ProjectsApi>
  realtimeApi: Type<RealtimeApi>
  uploadsApi: Type<UploadsApi>
  usageApi: Type<UsageApi>
  usersApi: Type<UsersApi>
  vectorStoresApi: Type<VectorStoresApi>
};
