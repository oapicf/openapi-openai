import {interfaces} from 'inversify';

import { AssistantsService } from './api/assistants.service';
import { AudioService } from './api/audio.service';
import { AuditLogsService } from './api/auditLogs.service';
import { BatchService } from './api/batch.service';
import { ChatService } from './api/chat.service';
import { CompletionsService } from './api/completions.service';
import { DefaultService } from './api/default.service';
import { EmbeddingsService } from './api/embeddings.service';
import { FilesService } from './api/files.service';
import { FineTuningService } from './api/fineTuning.service';
import { ImagesService } from './api/images.service';
import { InvitesService } from './api/invites.service';
import { ModelsService } from './api/models.service';
import { ModerationsService } from './api/moderations.service';
import { ProjectsService } from './api/projects.service';
import { RealtimeService } from './api/realtime.service';
import { UploadsService } from './api/uploads.service';
import { UsageService } from './api/usage.service';
import { UsersService } from './api/users.service';
import { VectorStoresService } from './api/vectorStores.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AssistantsService>('AssistantsService').to(AssistantsService).inSingletonScope();
        container.bind<AudioService>('AudioService').to(AudioService).inSingletonScope();
        container.bind<AuditLogsService>('AuditLogsService').to(AuditLogsService).inSingletonScope();
        container.bind<BatchService>('BatchService').to(BatchService).inSingletonScope();
        container.bind<ChatService>('ChatService').to(ChatService).inSingletonScope();
        container.bind<CompletionsService>('CompletionsService').to(CompletionsService).inSingletonScope();
        container.bind<DefaultService>('DefaultService').to(DefaultService).inSingletonScope();
        container.bind<EmbeddingsService>('EmbeddingsService').to(EmbeddingsService).inSingletonScope();
        container.bind<FilesService>('FilesService').to(FilesService).inSingletonScope();
        container.bind<FineTuningService>('FineTuningService').to(FineTuningService).inSingletonScope();
        container.bind<ImagesService>('ImagesService').to(ImagesService).inSingletonScope();
        container.bind<InvitesService>('InvitesService').to(InvitesService).inSingletonScope();
        container.bind<ModelsService>('ModelsService').to(ModelsService).inSingletonScope();
        container.bind<ModerationsService>('ModerationsService').to(ModerationsService).inSingletonScope();
        container.bind<ProjectsService>('ProjectsService').to(ProjectsService).inSingletonScope();
        container.bind<RealtimeService>('RealtimeService').to(RealtimeService).inSingletonScope();
        container.bind<UploadsService>('UploadsService').to(UploadsService).inSingletonScope();
        container.bind<UsageService>('UsageService').to(UsageService).inSingletonScope();
        container.bind<UsersService>('UsersService').to(UsersService).inSingletonScope();
        container.bind<VectorStoresService>('VectorStoresService').to(VectorStoresService).inSingletonScope();
    }
}
