package org.openapitools.vertxweb.server;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.openapi.RouterBuilder;
import io.vertx.ext.web.openapi.RouterBuilderOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.openapitools.vertxweb.server.api.AssistantsApiHandler;
import org.openapitools.vertxweb.server.api.AssistantsApiImpl;
import org.openapitools.vertxweb.server.api.AudioApiHandler;
import org.openapitools.vertxweb.server.api.AudioApiImpl;
import org.openapitools.vertxweb.server.api.ChatApiHandler;
import org.openapitools.vertxweb.server.api.ChatApiImpl;
import org.openapitools.vertxweb.server.api.CompletionsApiHandler;
import org.openapitools.vertxweb.server.api.CompletionsApiImpl;
import org.openapitools.vertxweb.server.api.EmbeddingsApiHandler;
import org.openapitools.vertxweb.server.api.EmbeddingsApiImpl;
import org.openapitools.vertxweb.server.api.FilesApiHandler;
import org.openapitools.vertxweb.server.api.FilesApiImpl;
import org.openapitools.vertxweb.server.api.FineTuningApiHandler;
import org.openapitools.vertxweb.server.api.FineTuningApiImpl;
import org.openapitools.vertxweb.server.api.ImagesApiHandler;
import org.openapitools.vertxweb.server.api.ImagesApiImpl;
import org.openapitools.vertxweb.server.api.ModelsApiHandler;
import org.openapitools.vertxweb.server.api.ModelsApiImpl;
import org.openapitools.vertxweb.server.api.ModerationsApiHandler;
import org.openapitools.vertxweb.server.api.ModerationsApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final AssistantsApiHandler assistantsHandler = new AssistantsApiHandler(new AssistantsApiImpl());
    private final AudioApiHandler audioHandler = new AudioApiHandler(new AudioApiImpl());
    private final ChatApiHandler chatHandler = new ChatApiHandler(new ChatApiImpl());
    private final CompletionsApiHandler completionsHandler = new CompletionsApiHandler(new CompletionsApiImpl());
    private final EmbeddingsApiHandler embeddingsHandler = new EmbeddingsApiHandler(new EmbeddingsApiImpl());
    private final FilesApiHandler filesHandler = new FilesApiHandler(new FilesApiImpl());
    private final FineTuningApiHandler fineTuningHandler = new FineTuningApiHandler(new FineTuningApiImpl());
    private final ImagesApiHandler imagesHandler = new ImagesApiHandler(new ImagesApiImpl());
    private final ModelsApiHandler modelsHandler = new ModelsApiHandler(new ModelsApiImpl());
    private final ModerationsApiHandler moderationsHandler = new ModerationsApiHandler(new ModerationsApiImpl());

    @Override
    public void start(Promise<Void> startPromise) {
        RouterBuilder.create(vertx, specFile)
            .map(builder -> {
              builder.setOptions(new RouterBuilderOptions()
                  // For production use case, you need to enable this flag and provide the proper security handler
                  .setRequireSecurityHandlers(false)
              );
              
              assistantsHandler.mount(builder);
              audioHandler.mount(builder);
              chatHandler.mount(builder);
              completionsHandler.mount(builder);
              embeddingsHandler.mount(builder);
              filesHandler.mount(builder);
              fineTuningHandler.mount(builder);
              imagesHandler.mount(builder);
              modelsHandler.mount(builder);
              moderationsHandler.mount(builder);

              Router router = builder.createRouter();
              router.errorHandler(400, this::validationFailureHandler);

              return router;
            })
            .compose(router ->
                vertx.createHttpServer()
                    .requestHandler(router)
                    .listen(8080)
            )
            .onSuccess(server -> logger.info("Http verticle deploy successful"))
            .onFailure(t -> logger.error("Http verticle failed to deploy", t))
            // Complete the start promise
            .<Void>mapEmpty().onComplete(startPromise);
    }

    private void validationFailureHandler(RoutingContext rc) {
         rc.response().setStatusCode(400)
                 .end("Bad Request : " + rc.failure().getMessage());
    }
}
