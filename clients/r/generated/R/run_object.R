#' Create a new RunObject
#'
#' @description
#' Represents an execution run on a [thread](/docs/api-reference/threads).
#'
#' @docType class
#' @title RunObject
#' @description RunObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field object The object type, which is always `thread.run`. character
#' @field created_at The Unix timestamp (in seconds) for when the run was created. integer
#' @field thread_id The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. character
#' @field assistant_id The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. character
#' @field status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`. character
#' @field required_action  \link{RunObjectRequiredAction}
#' @field last_error  \link{RunObjectLastError}
#' @field expires_at The Unix timestamp (in seconds) for when the run will expire. integer
#' @field started_at The Unix timestamp (in seconds) for when the run was started. integer
#' @field cancelled_at The Unix timestamp (in seconds) for when the run was cancelled. integer
#' @field failed_at The Unix timestamp (in seconds) for when the run failed. integer
#' @field completed_at The Unix timestamp (in seconds) for when the run was completed. integer
#' @field incomplete_details  \link{RunObjectIncompleteDetails}
#' @field model The model that the [assistant](/docs/api-reference/assistants) used for this run. character
#' @field instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run. character
#' @field tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. list(\link{AssistantObjectToolsInner})
#' @field file_ids The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. list(character)
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object
#' @field usage  \link{RunCompletionUsage}
#' @field temperature The sampling temperature used for this run. If not set, defaults to 1. numeric [optional]
#' @field max_prompt_tokens The maximum number of prompt tokens specified to have been used over the course of the run. integer
#' @field max_completion_tokens The maximum number of completion tokens specified to have been used over the course of the run. integer
#' @field truncation_strategy  \link{TruncationObject}
#' @field tool_choice  \link{AssistantsApiToolChoiceOption}
#' @field response_format  \link{AssistantsApiResponseFormatOption}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunObject <- R6::R6Class(
  "RunObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `thread_id` = NULL,
    `assistant_id` = NULL,
    `status` = NULL,
    `required_action` = NULL,
    `last_error` = NULL,
    `expires_at` = NULL,
    `started_at` = NULL,
    `cancelled_at` = NULL,
    `failed_at` = NULL,
    `completed_at` = NULL,
    `incomplete_details` = NULL,
    `model` = NULL,
    `instructions` = NULL,
    `tools` = NULL,
    `file_ids` = NULL,
    `metadata` = NULL,
    `usage` = NULL,
    `temperature` = NULL,
    `max_prompt_tokens` = NULL,
    `max_completion_tokens` = NULL,
    `truncation_strategy` = NULL,
    `tool_choice` = NULL,
    `response_format` = NULL,

    #' @description
    #' Initialize a new RunObject class.
    #'
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param object The object type, which is always `thread.run`.
    #' @param created_at The Unix timestamp (in seconds) for when the run was created.
    #' @param thread_id The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
    #' @param assistant_id The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
    #' @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
    #' @param required_action required_action
    #' @param last_error last_error
    #' @param expires_at The Unix timestamp (in seconds) for when the run will expire.
    #' @param started_at The Unix timestamp (in seconds) for when the run was started.
    #' @param cancelled_at The Unix timestamp (in seconds) for when the run was cancelled.
    #' @param failed_at The Unix timestamp (in seconds) for when the run failed.
    #' @param completed_at The Unix timestamp (in seconds) for when the run was completed.
    #' @param incomplete_details incomplete_details
    #' @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
    #' @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
    #' @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
    #' @param file_ids The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param usage usage
    #' @param max_prompt_tokens The maximum number of prompt tokens specified to have been used over the course of the run.
    #' @param max_completion_tokens The maximum number of completion tokens specified to have been used over the course of the run.
    #' @param truncation_strategy truncation_strategy
    #' @param tool_choice tool_choice
    #' @param response_format response_format
    #' @param temperature The sampling temperature used for this run. If not set, defaults to 1.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `created_at`, `thread_id`, `assistant_id`, `status`, `required_action`, `last_error`, `expires_at`, `started_at`, `cancelled_at`, `failed_at`, `completed_at`, `incomplete_details`, `model`, `instructions`, `tools`, `file_ids`, `metadata`, `usage`, `max_prompt_tokens`, `max_completion_tokens`, `truncation_strategy`, `tool_choice`, `response_format`, `temperature` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.run"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.run\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`thread_id`)) {
        if (!(is.character(`thread_id`) && length(`thread_id`) == 1)) {
          stop(paste("Error! Invalid data for `thread_id`. Must be a string:", `thread_id`))
        }
        self$`thread_id` <- `thread_id`
      }
      if (!missing(`assistant_id`)) {
        if (!(is.character(`assistant_id`) && length(`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", `assistant_id`))
        }
        self$`assistant_id` <- `assistant_id`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("queued", "in_progress", "requires_action", "cancelling", "cancelled", "failed", "completed", "expired"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"queued\", \"in_progress\", \"requires_action\", \"cancelling\", \"cancelled\", \"failed\", \"completed\", \"expired\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`required_action`)) {
        stopifnot(R6::is.R6(`required_action`))
        self$`required_action` <- `required_action`
      }
      if (!missing(`last_error`)) {
        stopifnot(R6::is.R6(`last_error`))
        self$`last_error` <- `last_error`
      }
      if (!missing(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
      }
      if (!missing(`started_at`)) {
        if (!(is.numeric(`started_at`) && length(`started_at`) == 1)) {
          stop(paste("Error! Invalid data for `started_at`. Must be an integer:", `started_at`))
        }
        self$`started_at` <- `started_at`
      }
      if (!missing(`cancelled_at`)) {
        if (!(is.numeric(`cancelled_at`) && length(`cancelled_at`) == 1)) {
          stop(paste("Error! Invalid data for `cancelled_at`. Must be an integer:", `cancelled_at`))
        }
        self$`cancelled_at` <- `cancelled_at`
      }
      if (!missing(`failed_at`)) {
        if (!(is.numeric(`failed_at`) && length(`failed_at`) == 1)) {
          stop(paste("Error! Invalid data for `failed_at`. Must be an integer:", `failed_at`))
        }
        self$`failed_at` <- `failed_at`
      }
      if (!missing(`completed_at`)) {
        if (!(is.numeric(`completed_at`) && length(`completed_at`) == 1)) {
          stop(paste("Error! Invalid data for `completed_at`. Must be an integer:", `completed_at`))
        }
        self$`completed_at` <- `completed_at`
      }
      if (!missing(`incomplete_details`)) {
        stopifnot(R6::is.R6(`incomplete_details`))
        self$`incomplete_details` <- `incomplete_details`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`instructions`)) {
        if (!(is.character(`instructions`) && length(`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", `instructions`))
        }
        self$`instructions` <- `instructions`
      }
      if (!missing(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!missing(`file_ids`)) {
        stopifnot(is.vector(`file_ids`), length(`file_ids`) != 0)
        sapply(`file_ids`, function(x) stopifnot(is.character(x)))
        self$`file_ids` <- `file_ids`
      }
      if (!missing(`metadata`)) {
        self$`metadata` <- `metadata`
      }
      if (!missing(`usage`)) {
        stopifnot(R6::is.R6(`usage`))
        self$`usage` <- `usage`
      }
      if (!missing(`max_prompt_tokens`)) {
        if (!(is.numeric(`max_prompt_tokens`) && length(`max_prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_prompt_tokens`. Must be an integer:", `max_prompt_tokens`))
        }
        self$`max_prompt_tokens` <- `max_prompt_tokens`
      }
      if (!missing(`max_completion_tokens`)) {
        if (!(is.numeric(`max_completion_tokens`) && length(`max_completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_completion_tokens`. Must be an integer:", `max_completion_tokens`))
        }
        self$`max_completion_tokens` <- `max_completion_tokens`
      }
      if (!missing(`truncation_strategy`)) {
        stopifnot(R6::is.R6(`truncation_strategy`))
        self$`truncation_strategy` <- `truncation_strategy`
      }
      if (!missing(`tool_choice`)) {
        stopifnot(R6::is.R6(`tool_choice`))
        self$`tool_choice` <- `tool_choice`
      }
      if (!missing(`response_format`)) {
        stopifnot(R6::is.R6(`response_format`))
        self$`response_format` <- `response_format`
      }
      if (!is.null(`temperature`)) {
        self$`temperature` <- `temperature`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunObject in JSON format
    toJSON = function() {
      RunObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        RunObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        RunObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`thread_id`)) {
        RunObjectObject[["thread_id"]] <-
          self$`thread_id`
      }
      if (!is.null(self$`assistant_id`)) {
        RunObjectObject[["assistant_id"]] <-
          self$`assistant_id`
      }
      if (!is.null(self$`status`)) {
        RunObjectObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`required_action`)) {
        RunObjectObject[["required_action"]] <-
          self$`required_action`$toJSON()
      }
      if (!is.null(self$`last_error`)) {
        RunObjectObject[["last_error"]] <-
          self$`last_error`$toJSON()
      }
      if (!is.null(self$`expires_at`)) {
        RunObjectObject[["expires_at"]] <-
          self$`expires_at`
      }
      if (!is.null(self$`started_at`)) {
        RunObjectObject[["started_at"]] <-
          self$`started_at`
      }
      if (!is.null(self$`cancelled_at`)) {
        RunObjectObject[["cancelled_at"]] <-
          self$`cancelled_at`
      }
      if (!is.null(self$`failed_at`)) {
        RunObjectObject[["failed_at"]] <-
          self$`failed_at`
      }
      if (!is.null(self$`completed_at`)) {
        RunObjectObject[["completed_at"]] <-
          self$`completed_at`
      }
      if (!is.null(self$`incomplete_details`)) {
        RunObjectObject[["incomplete_details"]] <-
          self$`incomplete_details`$toJSON()
      }
      if (!is.null(self$`model`)) {
        RunObjectObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`instructions`)) {
        RunObjectObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`tools`)) {
        RunObjectObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toJSON())
      }
      if (!is.null(self$`file_ids`)) {
        RunObjectObject[["file_ids"]] <-
          self$`file_ids`
      }
      if (!is.null(self$`metadata`)) {
        RunObjectObject[["metadata"]] <-
          self$`metadata`
      }
      if (!is.null(self$`usage`)) {
        RunObjectObject[["usage"]] <-
          self$`usage`$toJSON()
      }
      if (!is.null(self$`temperature`)) {
        RunObjectObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`max_prompt_tokens`)) {
        RunObjectObject[["max_prompt_tokens"]] <-
          self$`max_prompt_tokens`
      }
      if (!is.null(self$`max_completion_tokens`)) {
        RunObjectObject[["max_completion_tokens"]] <-
          self$`max_completion_tokens`
      }
      if (!is.null(self$`truncation_strategy`)) {
        RunObjectObject[["truncation_strategy"]] <-
          self$`truncation_strategy`$toJSON()
      }
      if (!is.null(self$`tool_choice`)) {
        RunObjectObject[["tool_choice"]] <-
          self$`tool_choice`$toJSON()
      }
      if (!is.null(self$`response_format`)) {
        RunObjectObject[["response_format"]] <-
          self$`response_format`$toJSON()
      }
      RunObjectObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObject
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.run"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.run\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`thread_id`)) {
        self$`thread_id` <- this_object$`thread_id`
      }
      if (!is.null(this_object$`assistant_id`)) {
        self$`assistant_id` <- this_object$`assistant_id`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("queued", "in_progress", "requires_action", "cancelling", "cancelled", "failed", "completed", "expired"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"queued\", \"in_progress\", \"requires_action\", \"cancelling\", \"cancelled\", \"failed\", \"completed\", \"expired\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`required_action`)) {
        `required_action_object` <- RunObjectRequiredAction$new()
        `required_action_object`$fromJSON(jsonlite::toJSON(this_object$`required_action`, auto_unbox = TRUE, digits = NA))
        self$`required_action` <- `required_action_object`
      }
      if (!is.null(this_object$`last_error`)) {
        `last_error_object` <- RunObjectLastError$new()
        `last_error_object`$fromJSON(jsonlite::toJSON(this_object$`last_error`, auto_unbox = TRUE, digits = NA))
        self$`last_error` <- `last_error_object`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      if (!is.null(this_object$`started_at`)) {
        self$`started_at` <- this_object$`started_at`
      }
      if (!is.null(this_object$`cancelled_at`)) {
        self$`cancelled_at` <- this_object$`cancelled_at`
      }
      if (!is.null(this_object$`failed_at`)) {
        self$`failed_at` <- this_object$`failed_at`
      }
      if (!is.null(this_object$`completed_at`)) {
        self$`completed_at` <- this_object$`completed_at`
      }
      if (!is.null(this_object$`incomplete_details`)) {
        `incomplete_details_object` <- RunObjectIncompleteDetails$new()
        `incomplete_details_object`$fromJSON(jsonlite::toJSON(this_object$`incomplete_details`, auto_unbox = TRUE, digits = NA))
        self$`incomplete_details` <- `incomplete_details_object`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`instructions`)) {
        self$`instructions` <- this_object$`instructions`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`file_ids`)) {
        self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      if (!is.null(this_object$`usage`)) {
        `usage_object` <- RunCompletionUsage$new()
        `usage_object`$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
        self$`usage` <- `usage_object`
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`max_prompt_tokens`)) {
        self$`max_prompt_tokens` <- this_object$`max_prompt_tokens`
      }
      if (!is.null(this_object$`max_completion_tokens`)) {
        self$`max_completion_tokens` <- this_object$`max_completion_tokens`
      }
      if (!is.null(this_object$`truncation_strategy`)) {
        `truncation_strategy_object` <- TruncationObject$new()
        `truncation_strategy_object`$fromJSON(jsonlite::toJSON(this_object$`truncation_strategy`, auto_unbox = TRUE, digits = NA))
        self$`truncation_strategy` <- `truncation_strategy_object`
      }
      if (!is.null(this_object$`tool_choice`)) {
        `tool_choice_object` <- AssistantsApiToolChoiceOption$new()
        `tool_choice_object`$fromJSON(jsonlite::toJSON(this_object$`tool_choice`, auto_unbox = TRUE, digits = NA))
        self$`tool_choice` <- `tool_choice_object`
      }
      if (!is.null(this_object$`response_format`)) {
        `response_format_object` <- AssistantsApiResponseFormatOption$new()
        `response_format_object`$fromJSON(jsonlite::toJSON(this_object$`response_format`, auto_unbox = TRUE, digits = NA))
        self$`response_format` <- `response_format_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return RunObject in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            %d
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`thread_id`)) {
          sprintf(
          '"thread_id":
            "%s"
                    ',
          self$`thread_id`
          )
        },
        if (!is.null(self$`assistant_id`)) {
          sprintf(
          '"assistant_id":
            "%s"
                    ',
          self$`assistant_id`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`required_action`)) {
          sprintf(
          '"required_action":
          %s
          ',
          jsonlite::toJSON(self$`required_action`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`last_error`)) {
          sprintf(
          '"last_error":
          %s
          ',
          jsonlite::toJSON(self$`last_error`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`expires_at`)) {
          sprintf(
          '"expires_at":
            %d
                    ',
          self$`expires_at`
          )
        },
        if (!is.null(self$`started_at`)) {
          sprintf(
          '"started_at":
            %d
                    ',
          self$`started_at`
          )
        },
        if (!is.null(self$`cancelled_at`)) {
          sprintf(
          '"cancelled_at":
            %d
                    ',
          self$`cancelled_at`
          )
        },
        if (!is.null(self$`failed_at`)) {
          sprintf(
          '"failed_at":
            %d
                    ',
          self$`failed_at`
          )
        },
        if (!is.null(self$`completed_at`)) {
          sprintf(
          '"completed_at":
            %d
                    ',
          self$`completed_at`
          )
        },
        if (!is.null(self$`incomplete_details`)) {
          sprintf(
          '"incomplete_details":
          %s
          ',
          jsonlite::toJSON(self$`incomplete_details`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
            "%s"
                    ',
          self$`model`
          )
        },
        if (!is.null(self$`instructions`)) {
          sprintf(
          '"instructions":
            "%s"
                    ',
          self$`instructions`
          )
        },
        if (!is.null(self$`tools`)) {
          sprintf(
          '"tools":
          [%s]
',
          paste(sapply(self$`tools`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`file_ids`)) {
          sprintf(
          '"file_ids":
             [%s]
          ',
          paste(unlist(lapply(self$`file_ids`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`metadata`)) {
          sprintf(
          '"metadata":
            "%s"
                    ',
          self$`metadata`
          )
        },
        if (!is.null(self$`usage`)) {
          sprintf(
          '"usage":
          %s
          ',
          jsonlite::toJSON(self$`usage`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`temperature`)) {
          sprintf(
          '"temperature":
            %d
                    ',
          self$`temperature`
          )
        },
        if (!is.null(self$`max_prompt_tokens`)) {
          sprintf(
          '"max_prompt_tokens":
            %d
                    ',
          self$`max_prompt_tokens`
          )
        },
        if (!is.null(self$`max_completion_tokens`)) {
          sprintf(
          '"max_completion_tokens":
            %d
                    ',
          self$`max_completion_tokens`
          )
        },
        if (!is.null(self$`truncation_strategy`)) {
          sprintf(
          '"truncation_strategy":
          %s
          ',
          jsonlite::toJSON(self$`truncation_strategy`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`tool_choice`)) {
          sprintf(
          '"tool_choice":
          %s
          ',
          jsonlite::toJSON(self$`tool_choice`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`response_format`)) {
          sprintf(
          '"response_format":
          %s
          ',
          jsonlite::toJSON(self$`response_format`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObject
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.run"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.run\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`thread_id` <- this_object$`thread_id`
      self$`assistant_id` <- this_object$`assistant_id`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("queued", "in_progress", "requires_action", "cancelling", "cancelled", "failed", "completed", "expired"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"queued\", \"in_progress\", \"requires_action\", \"cancelling\", \"cancelled\", \"failed\", \"completed\", \"expired\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`required_action` <- RunObjectRequiredAction$new()$fromJSON(jsonlite::toJSON(this_object$`required_action`, auto_unbox = TRUE, digits = NA))
      self$`last_error` <- RunObjectLastError$new()$fromJSON(jsonlite::toJSON(this_object$`last_error`, auto_unbox = TRUE, digits = NA))
      self$`expires_at` <- this_object$`expires_at`
      self$`started_at` <- this_object$`started_at`
      self$`cancelled_at` <- this_object$`cancelled_at`
      self$`failed_at` <- this_object$`failed_at`
      self$`completed_at` <- this_object$`completed_at`
      self$`incomplete_details` <- RunObjectIncompleteDetails$new()$fromJSON(jsonlite::toJSON(this_object$`incomplete_details`, auto_unbox = TRUE, digits = NA))
      self$`model` <- this_object$`model`
      self$`instructions` <- this_object$`instructions`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[AssistantObjectToolsInner]", loadNamespace("openapi"))
      self$`file_ids` <- ApiClient$new()$deserializeObj(this_object$`file_ids`, "array[character]", loadNamespace("openapi"))
      self$`metadata` <- this_object$`metadata`
      self$`usage` <- RunCompletionUsage$new()$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
      self$`temperature` <- this_object$`temperature`
      self$`max_prompt_tokens` <- this_object$`max_prompt_tokens`
      self$`max_completion_tokens` <- this_object$`max_completion_tokens`
      self$`truncation_strategy` <- TruncationObject$new()$fromJSON(jsonlite::toJSON(this_object$`truncation_strategy`, auto_unbox = TRUE, digits = NA))
      self$`tool_choice` <- AssistantsApiToolChoiceOption$new()$fromJSON(jsonlite::toJSON(this_object$`tool_choice`, auto_unbox = TRUE, digits = NA))
      self$`response_format` <- AssistantsApiResponseFormatOption$new()$fromJSON(jsonlite::toJSON(this_object$`response_format`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RunObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `created_at` is missing."))
      }
      # check the required field `thread_id`
      if (!is.null(input_json$`thread_id`)) {
        if (!(is.character(input_json$`thread_id`) && length(input_json$`thread_id`) == 1)) {
          stop(paste("Error! Invalid data for `thread_id`. Must be a string:", input_json$`thread_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `thread_id` is missing."))
      }
      # check the required field `assistant_id`
      if (!is.null(input_json$`assistant_id`)) {
        if (!(is.character(input_json$`assistant_id`) && length(input_json$`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", input_json$`assistant_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `assistant_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `status` is missing."))
      }
      # check the required field `required_action`
      if (!is.null(input_json$`required_action`)) {
        stopifnot(R6::is.R6(input_json$`required_action`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `required_action` is missing."))
      }
      # check the required field `last_error`
      if (!is.null(input_json$`last_error`)) {
        stopifnot(R6::is.R6(input_json$`last_error`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `last_error` is missing."))
      }
      # check the required field `expires_at`
      if (!is.null(input_json$`expires_at`)) {
        if (!(is.numeric(input_json$`expires_at`) && length(input_json$`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", input_json$`expires_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `expires_at` is missing."))
      }
      # check the required field `started_at`
      if (!is.null(input_json$`started_at`)) {
        if (!(is.numeric(input_json$`started_at`) && length(input_json$`started_at`) == 1)) {
          stop(paste("Error! Invalid data for `started_at`. Must be an integer:", input_json$`started_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `started_at` is missing."))
      }
      # check the required field `cancelled_at`
      if (!is.null(input_json$`cancelled_at`)) {
        if (!(is.numeric(input_json$`cancelled_at`) && length(input_json$`cancelled_at`) == 1)) {
          stop(paste("Error! Invalid data for `cancelled_at`. Must be an integer:", input_json$`cancelled_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `cancelled_at` is missing."))
      }
      # check the required field `failed_at`
      if (!is.null(input_json$`failed_at`)) {
        if (!(is.numeric(input_json$`failed_at`) && length(input_json$`failed_at`) == 1)) {
          stop(paste("Error! Invalid data for `failed_at`. Must be an integer:", input_json$`failed_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `failed_at` is missing."))
      }
      # check the required field `completed_at`
      if (!is.null(input_json$`completed_at`)) {
        if (!(is.numeric(input_json$`completed_at`) && length(input_json$`completed_at`) == 1)) {
          stop(paste("Error! Invalid data for `completed_at`. Must be an integer:", input_json$`completed_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `completed_at` is missing."))
      }
      # check the required field `incomplete_details`
      if (!is.null(input_json$`incomplete_details`)) {
        stopifnot(R6::is.R6(input_json$`incomplete_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `incomplete_details` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `model` is missing."))
      }
      # check the required field `instructions`
      if (!is.null(input_json$`instructions`)) {
        if (!(is.character(input_json$`instructions`) && length(input_json$`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", input_json$`instructions`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `instructions` is missing."))
      }
      # check the required field `tools`
      if (!is.null(input_json$`tools`)) {
        stopifnot(is.vector(input_json$`tools`), length(input_json$`tools`) != 0)
        tmp <- sapply(input_json$`tools`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `tools` is missing."))
      }
      # check the required field `file_ids`
      if (!is.null(input_json$`file_ids`)) {
        stopifnot(is.vector(input_json$`file_ids`), length(input_json$`file_ids`) != 0)
        tmp <- sapply(input_json$`file_ids`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `file_ids` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `metadata` is missing."))
      }
      # check the required field `usage`
      if (!is.null(input_json$`usage`)) {
        stopifnot(R6::is.R6(input_json$`usage`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `usage` is missing."))
      }
      # check the required field `max_prompt_tokens`
      if (!is.null(input_json$`max_prompt_tokens`)) {
        if (!(is.numeric(input_json$`max_prompt_tokens`) && length(input_json$`max_prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_prompt_tokens`. Must be an integer:", input_json$`max_prompt_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `max_prompt_tokens` is missing."))
      }
      # check the required field `max_completion_tokens`
      if (!is.null(input_json$`max_completion_tokens`)) {
        if (!(is.numeric(input_json$`max_completion_tokens`) && length(input_json$`max_completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_completion_tokens`. Must be an integer:", input_json$`max_completion_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `max_completion_tokens` is missing."))
      }
      # check the required field `truncation_strategy`
      if (!is.null(input_json$`truncation_strategy`)) {
        stopifnot(R6::is.R6(input_json$`truncation_strategy`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `truncation_strategy` is missing."))
      }
      # check the required field `tool_choice`
      if (!is.null(input_json$`tool_choice`)) {
        stopifnot(R6::is.R6(input_json$`tool_choice`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `tool_choice` is missing."))
      }
      # check the required field `response_format`
      if (!is.null(input_json$`response_format`)) {
        stopifnot(R6::is.R6(input_json$`response_format`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObject: the required field `response_format` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunObject
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `thread_id` is null
      if (is.null(self$`thread_id`)) {
        return(FALSE)
      }

      # check if the required `assistant_id` is null
      if (is.null(self$`assistant_id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `instructions` is null
      if (is.null(self$`instructions`)) {
        return(FALSE)
      }

      # check if the required `tools` is null
      if (is.null(self$`tools`)) {
        return(FALSE)
      }

      if (length(self$`tools`) > 20) {
        return(FALSE)
      }

      # check if the required `file_ids` is null
      if (is.null(self$`file_ids`)) {
        return(FALSE)
      }

      if (self$`max_prompt_tokens` < 256) {
        return(FALSE)
      }

      if (self$`max_completion_tokens` < 256) {
        return(FALSE)
      }

      # check if the required `truncation_strategy` is null
      if (is.null(self$`truncation_strategy`)) {
        return(FALSE)
      }

      # check if the required `tool_choice` is null
      if (is.null(self$`tool_choice`)) {
        return(FALSE)
      }

      # check if the required `response_format` is null
      if (is.null(self$`response_format`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `thread_id` is null
      if (is.null(self$`thread_id`)) {
        invalid_fields["thread_id"] <- "Non-nullable required field `thread_id` cannot be null."
      }

      # check if the required `assistant_id` is null
      if (is.null(self$`assistant_id`)) {
        invalid_fields["assistant_id"] <- "Non-nullable required field `assistant_id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `instructions` is null
      if (is.null(self$`instructions`)) {
        invalid_fields["instructions"] <- "Non-nullable required field `instructions` cannot be null."
      }

      # check if the required `tools` is null
      if (is.null(self$`tools`)) {
        invalid_fields["tools"] <- "Non-nullable required field `tools` cannot be null."
      }

      if (length(self$`tools`) > 20) {
        invalid_fields["tools"] <- "Invalid length for `tools`, number of items must be less than or equal to 20."
      }

      # check if the required `file_ids` is null
      if (is.null(self$`file_ids`)) {
        invalid_fields["file_ids"] <- "Non-nullable required field `file_ids` cannot be null."
      }

      if (self$`max_prompt_tokens` < 256) {
        invalid_fields["max_prompt_tokens"] <- "Invalid value for `max_prompt_tokens`, must be bigger than or equal to 256."
      }

      if (self$`max_completion_tokens` < 256) {
        invalid_fields["max_completion_tokens"] <- "Invalid value for `max_completion_tokens`, must be bigger than or equal to 256."
      }

      # check if the required `truncation_strategy` is null
      if (is.null(self$`truncation_strategy`)) {
        invalid_fields["truncation_strategy"] <- "Non-nullable required field `truncation_strategy` cannot be null."
      }

      # check if the required `tool_choice` is null
      if (is.null(self$`tool_choice`)) {
        invalid_fields["tool_choice"] <- "Non-nullable required field `tool_choice` cannot be null."
      }

      # check if the required `response_format` is null
      if (is.null(self$`response_format`)) {
        invalid_fields["response_format"] <- "Non-nullable required field `response_format` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# RunObject$unlock()
#
## Below is an example to define the print function
# RunObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunObject$lock()

