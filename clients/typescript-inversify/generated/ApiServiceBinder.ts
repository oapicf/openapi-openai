import {interfaces} from 'inversify';

import { OpenAIService } from './api/openAI.service';

export class ApiServiceBinder {
    public static with(container: interfaces.Container) {
        container.bind<OpenAIService>('OpenAIService').to(OpenAIService).inSingletonScope();
    }
}
