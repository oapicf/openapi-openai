#' Create a new RunStepObject
#'
#' @description
#' Represents a step in execution of a run. 
#'
#' @docType class
#' @title RunStepObject
#' @description RunStepObject Class
#' @format An \code{R6Class} generator object
#' @field id The identifier of the run step, which can be referenced in API endpoints. character
#' @field object The object type, which is always `thread.run.step`. character
#' @field created_at The Unix timestamp (in seconds) for when the run step was created. integer
#' @field assistant_id The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. character
#' @field thread_id The ID of the [thread](/docs/api-reference/threads) that was run. character
#' @field run_id The ID of the [run](/docs/api-reference/runs) that this run step is a part of. character
#' @field type The type of run step, which can be either `message_creation` or `tool_calls`. character
#' @field status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. character
#' @field step_details  \link{RunStepObjectStepDetails}
#' @field last_error  \link{RunStepObjectLastError}
#' @field expired_at The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. integer
#' @field cancelled_at The Unix timestamp (in seconds) for when the run step was cancelled. integer
#' @field failed_at The Unix timestamp (in seconds) for when the run step failed. integer
#' @field completed_at The Unix timestamp (in seconds) for when the run step completed. integer
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object
#' @field usage  \link{RunStepCompletionUsage}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepObject <- R6::R6Class(
  "RunStepObject",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `assistant_id` = NULL,
    `thread_id` = NULL,
    `run_id` = NULL,
    `type` = NULL,
    `status` = NULL,
    `step_details` = NULL,
    `last_error` = NULL,
    `expired_at` = NULL,
    `cancelled_at` = NULL,
    `failed_at` = NULL,
    `completed_at` = NULL,
    `metadata` = NULL,
    `usage` = NULL,
    #' Initialize a new RunStepObject class.
    #'
    #' @description
    #' Initialize a new RunStepObject class.
    #'
    #' @param id The identifier of the run step, which can be referenced in API endpoints.
    #' @param object The object type, which is always `thread.run.step`.
    #' @param created_at The Unix timestamp (in seconds) for when the run step was created.
    #' @param assistant_id The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
    #' @param thread_id The ID of the [thread](/docs/api-reference/threads) that was run.
    #' @param run_id The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
    #' @param type The type of run step, which can be either `message_creation` or `tool_calls`.
    #' @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    #' @param step_details step_details
    #' @param last_error last_error
    #' @param expired_at The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
    #' @param cancelled_at The Unix timestamp (in seconds) for when the run step was cancelled.
    #' @param failed_at The Unix timestamp (in seconds) for when the run step failed.
    #' @param completed_at The Unix timestamp (in seconds) for when the run step completed.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param usage usage
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `created_at`, `assistant_id`, `thread_id`, `run_id`, `type`, `status`, `step_details`, `last_error`, `expired_at`, `cancelled_at`, `failed_at`, `completed_at`, `metadata`, `usage`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("thread.run.step"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"thread.run.step\".", sep = ""))
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
      if (!missing(`assistant_id`)) {
        if (!(is.character(`assistant_id`) && length(`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", `assistant_id`))
        }
        self$`assistant_id` <- `assistant_id`
      }
      if (!missing(`thread_id`)) {
        if (!(is.character(`thread_id`) && length(`thread_id`) == 1)) {
          stop(paste("Error! Invalid data for `thread_id`. Must be a string:", `thread_id`))
        }
        self$`thread_id` <- `thread_id`
      }
      if (!missing(`run_id`)) {
        if (!(is.character(`run_id`) && length(`run_id`) == 1)) {
          stop(paste("Error! Invalid data for `run_id`. Must be a string:", `run_id`))
        }
        self$`run_id` <- `run_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("message_creation", "tool_calls"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"message_creation\", \"tool_calls\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("in_progress", "cancelled", "failed", "completed", "expired"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"cancelled\", \"failed\", \"completed\", \"expired\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`step_details`)) {
        stopifnot(R6::is.R6(`step_details`))
        self$`step_details` <- `step_details`
      }
      if (!missing(`last_error`)) {
        stopifnot(R6::is.R6(`last_error`))
        self$`last_error` <- `last_error`
      }
      if (!missing(`expired_at`)) {
        if (!(is.numeric(`expired_at`) && length(`expired_at`) == 1)) {
          stop(paste("Error! Invalid data for `expired_at`. Must be an integer:", `expired_at`))
        }
        self$`expired_at` <- `expired_at`
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
      if (!missing(`metadata`)) {
        self$`metadata` <- `metadata`
      }
      if (!missing(`usage`)) {
        stopifnot(R6::is.R6(`usage`))
        self$`usage` <- `usage`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepObject in JSON format
    #' @export
    toJSON = function() {
      RunStepObjectObject <- list()
      if (!is.null(self$`id`)) {
        RunStepObjectObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        RunStepObjectObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        RunStepObjectObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`assistant_id`)) {
        RunStepObjectObject[["assistant_id"]] <-
          self$`assistant_id`
      }
      if (!is.null(self$`thread_id`)) {
        RunStepObjectObject[["thread_id"]] <-
          self$`thread_id`
      }
      if (!is.null(self$`run_id`)) {
        RunStepObjectObject[["run_id"]] <-
          self$`run_id`
      }
      if (!is.null(self$`type`)) {
        RunStepObjectObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`status`)) {
        RunStepObjectObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`step_details`)) {
        RunStepObjectObject[["step_details"]] <-
          self$`step_details`$toJSON()
      }
      if (!is.null(self$`last_error`)) {
        RunStepObjectObject[["last_error"]] <-
          self$`last_error`$toJSON()
      }
      if (!is.null(self$`expired_at`)) {
        RunStepObjectObject[["expired_at"]] <-
          self$`expired_at`
      }
      if (!is.null(self$`cancelled_at`)) {
        RunStepObjectObject[["cancelled_at"]] <-
          self$`cancelled_at`
      }
      if (!is.null(self$`failed_at`)) {
        RunStepObjectObject[["failed_at"]] <-
          self$`failed_at`
      }
      if (!is.null(self$`completed_at`)) {
        RunStepObjectObject[["completed_at"]] <-
          self$`completed_at`
      }
      if (!is.null(self$`metadata`)) {
        RunStepObjectObject[["metadata"]] <-
          self$`metadata`
      }
      if (!is.null(self$`usage`)) {
        RunStepObjectObject[["usage"]] <-
          self$`usage`$toJSON()
      }
      RunStepObjectObject
    },
    #' Deserialize JSON string into an instance of RunStepObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepObject
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.run.step"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.run.step\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`assistant_id`)) {
        self$`assistant_id` <- this_object$`assistant_id`
      }
      if (!is.null(this_object$`thread_id`)) {
        self$`thread_id` <- this_object$`thread_id`
      }
      if (!is.null(this_object$`run_id`)) {
        self$`run_id` <- this_object$`run_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("message_creation", "tool_calls"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"message_creation\", \"tool_calls\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("in_progress", "cancelled", "failed", "completed", "expired"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"cancelled\", \"failed\", \"completed\", \"expired\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`step_details`)) {
        `step_details_object` <- RunStepObjectStepDetails$new()
        `step_details_object`$fromJSON(jsonlite::toJSON(this_object$`step_details`, auto_unbox = TRUE, digits = NA))
        self$`step_details` <- `step_details_object`
      }
      if (!is.null(this_object$`last_error`)) {
        `last_error_object` <- RunStepObjectLastError$new()
        `last_error_object`$fromJSON(jsonlite::toJSON(this_object$`last_error`, auto_unbox = TRUE, digits = NA))
        self$`last_error` <- `last_error_object`
      }
      if (!is.null(this_object$`expired_at`)) {
        self$`expired_at` <- this_object$`expired_at`
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
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      if (!is.null(this_object$`usage`)) {
        `usage_object` <- RunStepCompletionUsage$new()
        `usage_object`$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
        self$`usage` <- `usage_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepObject in JSON format
    #' @export
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
        if (!is.null(self$`assistant_id`)) {
          sprintf(
          '"assistant_id":
            "%s"
                    ',
          self$`assistant_id`
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
        if (!is.null(self$`run_id`)) {
          sprintf(
          '"run_id":
            "%s"
                    ',
          self$`run_id`
          )
        },
        if (!is.null(self$`type`)) {
          sprintf(
          '"type":
            "%s"
                    ',
          self$`type`
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
        if (!is.null(self$`step_details`)) {
          sprintf(
          '"step_details":
          %s
          ',
          jsonlite::toJSON(self$`step_details`$toJSON(), auto_unbox = TRUE, digits = NA)
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
        if (!is.null(self$`expired_at`)) {
          sprintf(
          '"expired_at":
            %d
                    ',
          self$`expired_at`
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepObject
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepObject
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepObject
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("thread.run.step"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"thread.run.step\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`assistant_id` <- this_object$`assistant_id`
      self$`thread_id` <- this_object$`thread_id`
      self$`run_id` <- this_object$`run_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("message_creation", "tool_calls"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"message_creation\", \"tool_calls\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("in_progress", "cancelled", "failed", "completed", "expired"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"in_progress\", \"cancelled\", \"failed\", \"completed\", \"expired\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`step_details` <- RunStepObjectStepDetails$new()$fromJSON(jsonlite::toJSON(this_object$`step_details`, auto_unbox = TRUE, digits = NA))
      self$`last_error` <- RunStepObjectLastError$new()$fromJSON(jsonlite::toJSON(this_object$`last_error`, auto_unbox = TRUE, digits = NA))
      self$`expired_at` <- this_object$`expired_at`
      self$`cancelled_at` <- this_object$`cancelled_at`
      self$`failed_at` <- this_object$`failed_at`
      self$`completed_at` <- this_object$`completed_at`
      self$`metadata` <- this_object$`metadata`
      self$`usage` <- RunStepCompletionUsage$new()$fromJSON(jsonlite::toJSON(this_object$`usage`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to RunStepObject
    #'
    #' @description
    #' Validate JSON input with respect to RunStepObject and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `created_at` is missing."))
      }
      # check the required field `assistant_id`
      if (!is.null(input_json$`assistant_id`)) {
        if (!(is.character(input_json$`assistant_id`) && length(input_json$`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", input_json$`assistant_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `assistant_id` is missing."))
      }
      # check the required field `thread_id`
      if (!is.null(input_json$`thread_id`)) {
        if (!(is.character(input_json$`thread_id`) && length(input_json$`thread_id`) == 1)) {
          stop(paste("Error! Invalid data for `thread_id`. Must be a string:", input_json$`thread_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `thread_id` is missing."))
      }
      # check the required field `run_id`
      if (!is.null(input_json$`run_id`)) {
        if (!(is.character(input_json$`run_id`) && length(input_json$`run_id`) == 1)) {
          stop(paste("Error! Invalid data for `run_id`. Must be a string:", input_json$`run_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `run_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `type` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `status` is missing."))
      }
      # check the required field `step_details`
      if (!is.null(input_json$`step_details`)) {
        stopifnot(R6::is.R6(input_json$`step_details`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `step_details` is missing."))
      }
      # check the required field `last_error`
      if (!is.null(input_json$`last_error`)) {
        stopifnot(R6::is.R6(input_json$`last_error`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `last_error` is missing."))
      }
      # check the required field `expired_at`
      if (!is.null(input_json$`expired_at`)) {
        if (!(is.numeric(input_json$`expired_at`) && length(input_json$`expired_at`) == 1)) {
          stop(paste("Error! Invalid data for `expired_at`. Must be an integer:", input_json$`expired_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `expired_at` is missing."))
      }
      # check the required field `cancelled_at`
      if (!is.null(input_json$`cancelled_at`)) {
        if (!(is.numeric(input_json$`cancelled_at`) && length(input_json$`cancelled_at`) == 1)) {
          stop(paste("Error! Invalid data for `cancelled_at`. Must be an integer:", input_json$`cancelled_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `cancelled_at` is missing."))
      }
      # check the required field `failed_at`
      if (!is.null(input_json$`failed_at`)) {
        if (!(is.numeric(input_json$`failed_at`) && length(input_json$`failed_at`) == 1)) {
          stop(paste("Error! Invalid data for `failed_at`. Must be an integer:", input_json$`failed_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `failed_at` is missing."))
      }
      # check the required field `completed_at`
      if (!is.null(input_json$`completed_at`)) {
        if (!(is.numeric(input_json$`completed_at`) && length(input_json$`completed_at`) == 1)) {
          stop(paste("Error! Invalid data for `completed_at`. Must be an integer:", input_json$`completed_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `completed_at` is missing."))
      }
      # check the required field `metadata`
      if (!is.null(input_json$`metadata`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `metadata` is missing."))
      }
      # check the required field `usage`
      if (!is.null(input_json$`usage`)) {
        stopifnot(R6::is.R6(input_json$`usage`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObject: the required field `usage` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepObject
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
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

      # check if the required `assistant_id` is null
      if (is.null(self$`assistant_id`)) {
        return(FALSE)
      }

      # check if the required `thread_id` is null
      if (is.null(self$`thread_id`)) {
        return(FALSE)
      }

      # check if the required `run_id` is null
      if (is.null(self$`run_id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `step_details` is null
      if (is.null(self$`step_details`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
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

      # check if the required `assistant_id` is null
      if (is.null(self$`assistant_id`)) {
        invalid_fields["assistant_id"] <- "Non-nullable required field `assistant_id` cannot be null."
      }

      # check if the required `thread_id` is null
      if (is.null(self$`thread_id`)) {
        invalid_fields["thread_id"] <- "Non-nullable required field `thread_id` cannot be null."
      }

      # check if the required `run_id` is null
      if (is.null(self$`run_id`)) {
        invalid_fields["run_id"] <- "Non-nullable required field `run_id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `step_details` is null
      if (is.null(self$`step_details`)) {
        invalid_fields["step_details"] <- "Non-nullable required field `step_details` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# RunStepObject$unlock()
#
## Below is an example to define the print function
# RunStepObject$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepObject$lock()

