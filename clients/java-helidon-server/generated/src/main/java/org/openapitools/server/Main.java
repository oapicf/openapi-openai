package org.openapitools.server;

import org.openapitools.server.api.AssistantsServiceImpl;
import org.openapitools.server.api.AudioServiceImpl;
import org.openapitools.server.api.AuditLogsServiceImpl;
import org.openapitools.server.api.BatchServiceImpl;
import org.openapitools.server.api.ChatServiceImpl;
import org.openapitools.server.api.CompletionsServiceImpl;
import org.openapitools.server.api.DefaultServiceImpl;
import org.openapitools.server.api.EmbeddingsServiceImpl;
import org.openapitools.server.api.FilesServiceImpl;
import org.openapitools.server.api.FineTuningServiceImpl;
import org.openapitools.server.api.ImagesServiceImpl;
import org.openapitools.server.api.InvitesServiceImpl;
import org.openapitools.server.api.ModelsServiceImpl;
import org.openapitools.server.api.ModerationsServiceImpl;
import org.openapitools.server.api.ProjectsServiceImpl;
import org.openapitools.server.api.RealtimeServiceImpl;
import org.openapitools.server.api.UploadsServiceImpl;
import org.openapitools.server.api.UsageServiceImpl;
import org.openapitools.server.api.UsersServiceImpl;
import org.openapitools.server.api.VectorStoresServiceImpl;

import io.helidon.logging.common.LogConfig;
import io.helidon.config.Config;
import io.helidon.webserver.http.HttpRouting;
import io.helidon.webserver.WebServer;

/**
* The application main class.
*/
public final class Main {

    /**
    * Cannot be instantiated.
    */
    private Main() {
    }

    /**
    * Application main entry point.
    * @param args command line arguments.
    */
    public static void main(final String[] args) {
        startServer();
    }

    /**
    * Start the server.
    * @return the created {@link WebServer} instance
    */
    static WebServer startServer() {

        // load logging configuration
        LogConfig.configureRuntime();

        // By default this will pick up application.yaml from the classpath
        Config config = Config.create();
        Config.global(config);

        WebServer webserver = WebServer.builder()
                .config(config.get("server"))
                .routing(Main::routing)
                .build()
                .start();

        System.out.println("WEB server is up! https://api.openai.com/v1");

        return webserver;
    }

    /**
     * Updates HTTP routing and implicitly registers observe providers.
     */
    static void routing(HttpRouting.Builder routing) {
        routing
            .register("/", new AssistantsServiceImpl())/* TODO - fix path or operation grouping for better performance */
            .register("/audio", new AudioServiceImpl())
            .register("/organization/audit_logs", new AuditLogsServiceImpl())
            .register("/batches", new BatchServiceImpl())
            .register("/chat/completions", new ChatServiceImpl())
            .register("/completions", new CompletionsServiceImpl())
            .register("/organization/admin_api_keys", new DefaultServiceImpl())
            .register("/embeddings", new EmbeddingsServiceImpl())
            .register("/files", new FilesServiceImpl())
            .register("/fine_tuning/jobs", new FineTuningServiceImpl())
            .register("/images", new ImagesServiceImpl())
            .register("/organization/invites", new InvitesServiceImpl())
            .register("/models", new ModelsServiceImpl())
            .register("/moderations", new ModerationsServiceImpl())
            .register("/organization/projects", new ProjectsServiceImpl())
            .register("/realtime/sessions", new RealtimeServiceImpl())
            .register("/uploads", new UploadsServiceImpl())
            .register("/organization", new UsageServiceImpl())
            .register("/organization/users", new UsersServiceImpl())
            .register("/vector_stores", new VectorStoresServiceImpl());
    }
}
