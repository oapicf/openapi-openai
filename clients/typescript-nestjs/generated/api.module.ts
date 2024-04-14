import { DynamicModule, Module, Global, Provider } from '@nestjs/common';
import { HttpModule, HttpService } from '@nestjs/axios';
import { AsyncConfiguration, Configuration, ConfigurationFactory } from './configuration';

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

@Global()
@Module({
  imports:      [ HttpModule ],
  exports:      [
    AssistantsService,
    AudioService,
    ChatService,
    CompletionsService,
    EmbeddingsService,
    FilesService,
    FineTuningService,
    ImagesService,
    ModelsService,
    ModerationsService
  ],
  providers: [
    AssistantsService,
    AudioService,
    ChatService,
    CompletionsService,
    EmbeddingsService,
    FilesService,
    FineTuningService,
    ImagesService,
    ModelsService,
    ModerationsService
  ]
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): DynamicModule {
        return {
            module: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    /**
     * Register the module asynchronously.
     */
    static forRootAsync(options: AsyncConfiguration): DynamicModule {
        const providers = [...this.createAsyncProviders(options)];
        return {
            module: ApiModule,
            imports: options.imports || [],
            providers,
            exports: providers,
        };
    }

    private static createAsyncProviders(options: AsyncConfiguration): Provider[] {
        if (options.useClass) {
            return [
                this.createAsyncConfigurationProvider(options),
                {
                    provide: options.useClass,
                    useClass: options.useClass,
                },
            ];
        }
        return [this.createAsyncConfigurationProvider(options)];
    }

    private static createAsyncConfigurationProvider(
        options: AsyncConfiguration,
    ): Provider {
        if (options.useFactory) {
            return {
                provide: Configuration,
                useFactory: options.useFactory,
                inject: options.inject || [],
            };
        }
        return {
            provide: Configuration,
            useFactory: async (optionsFactory: ConfigurationFactory) =>
                await optionsFactory.createConfiguration(),
            inject: (options.useExisting && [options.useExisting]) || (options.useClass && [options.useClass]) || [],
        };
    }

    constructor( httpService: HttpService) { }
}
