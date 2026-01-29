-module(openapi_router).

-export([get_paths/1]).

-type method() :: binary().
-type operations() :: #{method() => openapi_api:operation_id()}.
-type init_opts()  :: {operations(), module()}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: module()) -> cowboy_router:routes().
get_paths(LogicHandler) ->
    PreparedPaths = maps:fold(
                      fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
                              [{Path, Handler, Operations} | Acc]
                      end, [], group_paths()
                     ),
    [{'_', [{P, H, {O, LogicHandler}} || {P, H, O} <- PreparedPaths]}].

group_paths() ->
    maps:fold(
      fun(OperationID, #{servers := Servers, base_path := BasePath, path := Path,
                         method := Method, handler := Handler}, Acc) ->
              FullPaths = build_full_paths(Servers, BasePath, Path),
              merge_paths(FullPaths, OperationID, Method, Handler, Acc)
      end, #{}, get_operations()).

build_full_paths([], BasePath, Path) ->
    [lists:append([BasePath, Path])];
build_full_paths(Servers, _BasePath, Path) ->
    [lists:append([Server, Path]) || Server <- Servers ].

merge_paths(FullPaths, OperationID, Method, Handler, Acc) ->
    lists:foldl(
      fun(Path, Acc0) ->
              case maps:find(Path, Acc0) of
                  {ok, PathInfo0 = #{operations := Operations0}} ->
                      Operations = Operations0#{Method => OperationID},
                      PathInfo = PathInfo0#{operations => Operations},
                      Acc0#{Path => PathInfo};
                  error ->
                      Operations = #{Method => OperationID},
                      PathInfo = #{handler => Handler, operations => Operations},
                      Acc0#{Path => PathInfo}
              end
      end, Acc, FullPaths).

get_operations() ->
    #{ 
       'cancelRun' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs/:run_id/cancel",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createAssistant' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createAssistantFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id/files",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createMessage' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/messages",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createRun' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createThread' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createThreadAndRun' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/runs",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'deleteAssistant' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id",
            method => <<"DELETE">>,
            handler => 'openapi_assistants_handler'
        },
       'deleteAssistantFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id/files/:file_id",
            method => <<"DELETE">>,
            handler => 'openapi_assistants_handler'
        },
       'deleteThread' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id",
            method => <<"DELETE">>,
            handler => 'openapi_assistants_handler'
        },
       'getAssistant' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'getAssistantFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'getMessage' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/messages/:message_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'getMessageFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/messages/:message_id/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'getRun' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs/:run_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'getRunStep' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs/:run_id/steps/:step_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'getThread' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'listAssistantFiles' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id/files",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'listAssistants' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'listMessageFiles' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/messages/:message_id/files",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'listMessages' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/messages",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'listRunSteps' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs/:run_id/steps",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'listRuns' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs",
            method => <<"GET">>,
            handler => 'openapi_assistants_handler'
        },
       'modifyAssistant' => #{
            servers => [],
            base_path => "/v1",
            path => "/assistants/:assistant_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'modifyMessage' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/messages/:message_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'modifyRun' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs/:run_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'modifyThread' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'submitToolOuputsToRun' => #{
            servers => [],
            base_path => "/v1",
            path => "/threads/:thread_id/runs/:run_id/submit_tool_outputs",
            method => <<"POST">>,
            handler => 'openapi_assistants_handler'
        },
       'createSpeech' => #{
            servers => [],
            base_path => "/v1",
            path => "/audio/speech",
            method => <<"POST">>,
            handler => 'openapi_audio_handler'
        },
       'createTranscription' => #{
            servers => [],
            base_path => "/v1",
            path => "/audio/transcriptions",
            method => <<"POST">>,
            handler => 'openapi_audio_handler'
        },
       'createTranslation' => #{
            servers => [],
            base_path => "/v1",
            path => "/audio/translations",
            method => <<"POST">>,
            handler => 'openapi_audio_handler'
        },
       'createChatCompletion' => #{
            servers => [],
            base_path => "/v1",
            path => "/chat/completions",
            method => <<"POST">>,
            handler => 'openapi_chat_handler'
        },
       'createCompletion' => #{
            servers => [],
            base_path => "/v1",
            path => "/completions",
            method => <<"POST">>,
            handler => 'openapi_completions_handler'
        },
       'createEmbedding' => #{
            servers => [],
            base_path => "/v1",
            path => "/embeddings",
            method => <<"POST">>,
            handler => 'openapi_embeddings_handler'
        },
       'createFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/files",
            method => <<"POST">>,
            handler => 'openapi_files_handler'
        },
       'deleteFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/files/:file_id",
            method => <<"DELETE">>,
            handler => 'openapi_files_handler'
        },
       'downloadFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/files/:file_id/content",
            method => <<"GET">>,
            handler => 'openapi_files_handler'
        },
       'listFiles' => #{
            servers => [],
            base_path => "/v1",
            path => "/files",
            method => <<"GET">>,
            handler => 'openapi_files_handler'
        },
       'retrieveFile' => #{
            servers => [],
            base_path => "/v1",
            path => "/files/:file_id",
            method => <<"GET">>,
            handler => 'openapi_files_handler'
        },
       'cancelFineTuningJob' => #{
            servers => [],
            base_path => "/v1",
            path => "/fine_tuning/jobs/:fine_tuning_job_id/cancel",
            method => <<"POST">>,
            handler => 'openapi_fine_tuning_handler'
        },
       'createFineTuningJob' => #{
            servers => [],
            base_path => "/v1",
            path => "/fine_tuning/jobs",
            method => <<"POST">>,
            handler => 'openapi_fine_tuning_handler'
        },
       'listFineTuningEvents' => #{
            servers => [],
            base_path => "/v1",
            path => "/fine_tuning/jobs/:fine_tuning_job_id/events",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
       'listFineTuningJobCheckpoints' => #{
            servers => [],
            base_path => "/v1",
            path => "/fine_tuning/jobs/:fine_tuning_job_id/checkpoints",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
       'listPaginatedFineTuningJobs' => #{
            servers => [],
            base_path => "/v1",
            path => "/fine_tuning/jobs",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
       'retrieveFineTuningJob' => #{
            servers => [],
            base_path => "/v1",
            path => "/fine_tuning/jobs/:fine_tuning_job_id",
            method => <<"GET">>,
            handler => 'openapi_fine_tuning_handler'
        },
       'createImage' => #{
            servers => [],
            base_path => "/v1",
            path => "/images/generations",
            method => <<"POST">>,
            handler => 'openapi_images_handler'
        },
       'createImageEdit' => #{
            servers => [],
            base_path => "/v1",
            path => "/images/edits",
            method => <<"POST">>,
            handler => 'openapi_images_handler'
        },
       'createImageVariation' => #{
            servers => [],
            base_path => "/v1",
            path => "/images/variations",
            method => <<"POST">>,
            handler => 'openapi_images_handler'
        },
       'deleteModel' => #{
            servers => [],
            base_path => "/v1",
            path => "/models/:model",
            method => <<"DELETE">>,
            handler => 'openapi_models_handler'
        },
       'listModels' => #{
            servers => [],
            base_path => "/v1",
            path => "/models",
            method => <<"GET">>,
            handler => 'openapi_models_handler'
        },
       'retrieveModel' => #{
            servers => [],
            base_path => "/v1",
            path => "/models/:model",
            method => <<"GET">>,
            handler => 'openapi_models_handler'
        },
       'createModeration' => #{
            servers => [],
            base_path => "/v1",
            path => "/moderations",
            method => <<"POST">>,
            handler => 'openapi_moderations_handler'
        }
    }.
