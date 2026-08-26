import { DynamicModule, Module, Provider } from '@nestjs/common';
import { ApiImplementations } from './api-implementations'
import { AssistantsApi } from './api';
import { AssistantsApiController } from './controllers';
import { AudioApi } from './api';
import { AudioApiController } from './controllers';
import { AuditLogsApi } from './api';
import { AuditLogsApiController } from './controllers';
import { BatchApi } from './api';
import { BatchApiController } from './controllers';
import { ChatApi } from './api';
import { ChatApiController } from './controllers';
import { CompletionsApi } from './api';
import { CompletionsApiController } from './controllers';
import { DefaultApi } from './api';
import { DefaultApiController } from './controllers';
import { EmbeddingsApi } from './api';
import { EmbeddingsApiController } from './controllers';
import { FilesApi } from './api';
import { FilesApiController } from './controllers';
import { FineTuningApi } from './api';
import { FineTuningApiController } from './controllers';
import { ImagesApi } from './api';
import { ImagesApiController } from './controllers';
import { InvitesApi } from './api';
import { InvitesApiController } from './controllers';
import { ModelsApi } from './api';
import { ModelsApiController } from './controllers';
import { ModerationsApi } from './api';
import { ModerationsApiController } from './controllers';
import { ProjectsApi } from './api';
import { ProjectsApiController } from './controllers';
import { RealtimeApi } from './api';
import { RealtimeApiController } from './controllers';
import { UploadsApi } from './api';
import { UploadsApiController } from './controllers';
import { UsageApi } from './api';
import { UsageApiController } from './controllers';
import { UsersApi } from './api';
import { UsersApiController } from './controllers';
import { VectorStoresApi } from './api';
import { VectorStoresApiController } from './controllers';

export type ApiModuleConfiguration = {
  /**
  * your Api implementations
  */
  apiImplementations: ApiImplementations,
  /**
  * additional Providers that may be used by your implementations
  */
  providers?: Provider[],
}

@Module({})
export class ApiModule {
  static forRoot(configuration: ApiModuleConfiguration): DynamicModule {
      const providers: Provider[] = [
        {
          provide: AssistantsApi,
          useClass: configuration.apiImplementations.assistantsApi
        },
        {
          provide: AudioApi,
          useClass: configuration.apiImplementations.audioApi
        },
        {
          provide: AuditLogsApi,
          useClass: configuration.apiImplementations.auditLogsApi
        },
        {
          provide: BatchApi,
          useClass: configuration.apiImplementations.batchApi
        },
        {
          provide: ChatApi,
          useClass: configuration.apiImplementations.chatApi
        },
        {
          provide: CompletionsApi,
          useClass: configuration.apiImplementations.completionsApi
        },
        {
          provide: DefaultApi,
          useClass: configuration.apiImplementations.defaultApi
        },
        {
          provide: EmbeddingsApi,
          useClass: configuration.apiImplementations.embeddingsApi
        },
        {
          provide: FilesApi,
          useClass: configuration.apiImplementations.filesApi
        },
        {
          provide: FineTuningApi,
          useClass: configuration.apiImplementations.fineTuningApi
        },
        {
          provide: ImagesApi,
          useClass: configuration.apiImplementations.imagesApi
        },
        {
          provide: InvitesApi,
          useClass: configuration.apiImplementations.invitesApi
        },
        {
          provide: ModelsApi,
          useClass: configuration.apiImplementations.modelsApi
        },
        {
          provide: ModerationsApi,
          useClass: configuration.apiImplementations.moderationsApi
        },
        {
          provide: ProjectsApi,
          useClass: configuration.apiImplementations.projectsApi
        },
        {
          provide: RealtimeApi,
          useClass: configuration.apiImplementations.realtimeApi
        },
        {
          provide: UploadsApi,
          useClass: configuration.apiImplementations.uploadsApi
        },
        {
          provide: UsageApi,
          useClass: configuration.apiImplementations.usageApi
        },
        {
          provide: UsersApi,
          useClass: configuration.apiImplementations.usersApi
        },
        {
          provide: VectorStoresApi,
          useClass: configuration.apiImplementations.vectorStoresApi
        },
        ...(configuration.providers || []),
      ];

      return {
        module: ApiModule,
        controllers: [
          AssistantsApiController,
          AudioApiController,
          AuditLogsApiController,
          BatchApiController,
          ChatApiController,
          CompletionsApiController,
          DefaultApiController,
          EmbeddingsApiController,
          FilesApiController,
          FineTuningApiController,
          ImagesApiController,
          InvitesApiController,
          ModelsApiController,
          ModerationsApiController,
          ProjectsApiController,
          RealtimeApiController,
          UploadsApiController,
          UsageApiController,
          UsersApiController,
          VectorStoresApiController,
        ],
        providers: [...providers],
        exports: [...providers]
      }
    }
}