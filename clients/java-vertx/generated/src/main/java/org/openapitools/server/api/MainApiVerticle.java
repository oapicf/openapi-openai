package org.openapitools.server.api;

import java.nio.charset.Charset;

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.github.phiz71.vertx.swagger.router.OperationIdServiceIdResolver;
import com.github.phiz71.vertx.swagger.router.SwaggerRouter;

import io.swagger.models.Swagger;
import io.swagger.parser.SwaggerParser;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.file.FileSystem;
import io.vertx.core.json.Json;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class MainApiVerticle extends AbstractVerticle {
    static final Logger LOGGER = LoggerFactory.getLogger(MainApiVerticle.class);

    private int serverPort = 8080;
    protected Router router;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        router = Router.router(vertx);
    }

    @Override
    public void start(Future<Void> startFuture) throws Exception {
        Json.mapper.registerModule(new JavaTimeModule());
        FileSystem vertxFileSystem = vertx.fileSystem();
        vertxFileSystem.readFile("openapi.json", readFile -> {
            if (readFile.succeeded()) {
                Swagger swagger = new SwaggerParser().parse(readFile.result().toString(Charset.forName("utf-8")));
                Router swaggerRouter = SwaggerRouter.swaggerRouter(router, swagger, vertx.eventBus(), new OperationIdServiceIdResolver());

                deployVerticals(startFuture);

                vertx.createHttpServer()
                    .requestHandler(swaggerRouter::accept)
                    .listen(serverPort, h -> {
                        if (h.succeeded()) {
                            startFuture.complete();
                        } else {
                            startFuture.fail(h.cause());
                        }
                    });
            } else {
                startFuture.fail(readFile.cause());
            }
        });
    }

    public void deployVerticals(Future<Void> startFuture) {
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AssistantsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AssistantsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AssistantsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.AudioApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("AudioApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("AudioApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ChatApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ChatApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ChatApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.CompletionsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("CompletionsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("CompletionsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.EmbeddingsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("EmbeddingsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("EmbeddingsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FilesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FilesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FilesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.FineTuningApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("FineTuningApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("FineTuningApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ImagesApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ImagesApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ImagesApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ModelsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ModelsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ModelsApiVerticle : Deployment failed");
            }
        });
        
        vertx.deployVerticle("org.openapitools.server.api.verticle.ModerationsApiVerticle", res -> {
            if (res.succeeded()) {
                LOGGER.info("ModerationsApiVerticle : Deployed");
            } else {
                startFuture.fail(res.cause());
                LOGGER.error("ModerationsApiVerticle : Deployment failed");
            }
        });
        
    }
}
