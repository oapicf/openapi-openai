export * from './assistants.service';
import { AssistantsService } from './assistants.service';
export * from './audio.service';
import { AudioService } from './audio.service';
export * from './chat.service';
import { ChatService } from './chat.service';
export * from './completions.service';
import { CompletionsService } from './completions.service';
export * from './embeddings.service';
import { EmbeddingsService } from './embeddings.service';
export * from './files.service';
import { FilesService } from './files.service';
export * from './fineTuning.service';
import { FineTuningService } from './fineTuning.service';
export * from './images.service';
import { ImagesService } from './images.service';
export * from './models.service';
import { ModelsService } from './models.service';
export * from './moderations.service';
import { ModerationsService } from './moderations.service';
export const APIS = [AssistantsService, AudioService, ChatService, CompletionsService, EmbeddingsService, FilesService, FineTuningService, ImagesService, ModelsService, ModerationsService];
