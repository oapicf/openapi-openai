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
import org.openapitools.vertxweb.server.api.AuditLogsApiHandler;
import org.openapitools.vertxweb.server.api.AuditLogsApiImpl;
import org.openapitools.vertxweb.server.api.BatchApiHandler;
import org.openapitools.vertxweb.server.api.BatchApiImpl;
import org.openapitools.vertxweb.server.api.ChatApiHandler;
import org.openapitools.vertxweb.server.api.ChatApiImpl;
import org.openapitools.vertxweb.server.api.CompletionsApiHandler;
import org.openapitools.vertxweb.server.api.CompletionsApiImpl;
import org.openapitools.vertxweb.server.api.DefaultApiHandler;
import org.openapitools.vertxweb.server.api.DefaultApiImpl;
import org.openapitools.vertxweb.server.api.EmbeddingsApiHandler;
import org.openapitools.vertxweb.server.api.EmbeddingsApiImpl;
import org.openapitools.vertxweb.server.api.FilesApiHandler;
import org.openapitools.vertxweb.server.api.FilesApiImpl;
import org.openapitools.vertxweb.server.api.FineTuningApiHandler;
import org.openapitools.vertxweb.server.api.FineTuningApiImpl;
import org.openapitools.vertxweb.server.api.ImagesApiHandler;
import org.openapitools.vertxweb.server.api.ImagesApiImpl;
import org.openapitools.vertxweb.server.api.InvitesApiHandler;
import org.openapitools.vertxweb.server.api.InvitesApiImpl;
import org.openapitools.vertxweb.server.api.ModelsApiHandler;
import org.openapitools.vertxweb.server.api.ModelsApiImpl;
import org.openapitools.vertxweb.server.api.ModerationsApiHandler;
import org.openapitools.vertxweb.server.api.ModerationsApiImpl;
import org.openapitools.vertxweb.server.api.ProjectsApiHandler;
import org.openapitools.vertxweb.server.api.ProjectsApiImpl;
import org.openapitools.vertxweb.server.api.RealtimeApiHandler;
import org.openapitools.vertxweb.server.api.RealtimeApiImpl;
import org.openapitools.vertxweb.server.api.UploadsApiHandler;
import org.openapitools.vertxweb.server.api.UploadsApiImpl;
import org.openapitools.vertxweb.server.api.UsageApiHandler;
import org.openapitools.vertxweb.server.api.UsageApiImpl;
import org.openapitools.vertxweb.server.api.UsersApiHandler;
import org.openapitools.vertxweb.server.api.UsersApiImpl;
import org.openapitools.vertxweb.server.api.VectorStoresApiHandler;
import org.openapitools.vertxweb.server.api.VectorStoresApiImpl;

public class HttpServerVerticle extends AbstractVerticle {

    private static final Logger logger = LoggerFactory.getLogger(HttpServerVerticle.class);
    private static final String specFile = "src/main/resources/openapi.yaml";

    
    private final AssistantsApiHandler assistantsHandler = new AssistantsApiHandler(new AssistantsApiImpl());
    private final AudioApiHandler audioHandler = new AudioApiHandler(new AudioApiImpl());
    private final AuditLogsApiHandler auditLogsHandler = new AuditLogsApiHandler(new AuditLogsApiImpl());
    private final BatchApiHandler batchHandler = new BatchApiHandler(new BatchApiImpl());
    private final ChatApiHandler chatHandler = new ChatApiHandler(new ChatApiImpl());
    private final CompletionsApiHandler completionsHandler = new CompletionsApiHandler(new CompletionsApiImpl());
    private final DefaultApiHandler defaultHandler = new DefaultApiHandler(new DefaultApiImpl());
    private final EmbeddingsApiHandler embeddingsHandler = new EmbeddingsApiHandler(new EmbeddingsApiImpl());
    private final FilesApiHandler filesHandler = new FilesApiHandler(new FilesApiImpl());
    private final FineTuningApiHandler fineTuningHandler = new FineTuningApiHandler(new FineTuningApiImpl());
    private final ImagesApiHandler imagesHandler = new ImagesApiHandler(new ImagesApiImpl());
    private final InvitesApiHandler invitesHandler = new InvitesApiHandler(new InvitesApiImpl());
    private final ModelsApiHandler modelsHandler = new ModelsApiHandler(new ModelsApiImpl());
    private final ModerationsApiHandler moderationsHandler = new ModerationsApiHandler(new ModerationsApiImpl());
    private final ProjectsApiHandler projectsHandler = new ProjectsApiHandler(new ProjectsApiImpl());
    private final RealtimeApiHandler realtimeHandler = new RealtimeApiHandler(new RealtimeApiImpl());
    private final UploadsApiHandler uploadsHandler = new UploadsApiHandler(new UploadsApiImpl());
    private final UsageApiHandler usageHandler = new UsageApiHandler(new UsageApiImpl());
    private final UsersApiHandler usersHandler = new UsersApiHandler(new UsersApiImpl());
    private final VectorStoresApiHandler vectorStoresHandler = new VectorStoresApiHandler(new VectorStoresApiImpl());

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
              auditLogsHandler.mount(builder);
              batchHandler.mount(builder);
              chatHandler.mount(builder);
              completionsHandler.mount(builder);
              defaultHandler.mount(builder);
              embeddingsHandler.mount(builder);
              filesHandler.mount(builder);
              fineTuningHandler.mount(builder);
              imagesHandler.mount(builder);
              invitesHandler.mount(builder);
              modelsHandler.mount(builder);
              moderationsHandler.mount(builder);
              projectsHandler.mount(builder);
              realtimeHandler.mount(builder);
              uploadsHandler.mount(builder);
              usageHandler.mount(builder);
              usersHandler.mount(builder);
              vectorStoresHandler.mount(builder);

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
