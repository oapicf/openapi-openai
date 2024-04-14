import {interfaces} from 'inversify';

import { AssistantsService } from './api/assistants.service';
import { AudioService } from './api/audio.service';
import { ChatService } from './api/chat.service';
import { CompletionsService } from './api/completions.service';
import { EmbeddingsService } from './api/embeddings.service';
import { FilesService } from './api/files.service';
import { FineTuningService } from './api/fineTuning.service';
import { ImagesService } from './api/images.service';
import { ModelsService } from './api/models.service';
import { ModerationsService } from './api/moderations.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<AssistantsService>('AssistantsService').to(AssistantsService).inSingletonScope();
        container.bind<AudioService>('AudioService').to(AudioService).inSingletonScope();
        container.bind<ChatService>('ChatService').to(ChatService).inSingletonScope();
        container.bind<CompletionsService>('CompletionsService').to(CompletionsService).inSingletonScope();
        container.bind<EmbeddingsService>('EmbeddingsService').to(EmbeddingsService).inSingletonScope();
        container.bind<FilesService>('FilesService').to(FilesService).inSingletonScope();
        container.bind<FineTuningService>('FineTuningService').to(FineTuningService).inSingletonScope();
        container.bind<ImagesService>('ImagesService').to(ImagesService).inSingletonScope();
        container.bind<ModelsService>('ModelsService').to(ModelsService).inSingletonScope();
        container.bind<ModerationsService>('ModerationsService').to(ModerationsService).inSingletonScope();
    }
}
