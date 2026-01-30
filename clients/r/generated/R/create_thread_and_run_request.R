#' Create a new CreateThreadAndRunRequest
#'
#' @description
#' CreateThreadAndRunRequest Class
#'
#' @docType class
#' @title CreateThreadAndRunRequest
#' @description CreateThreadAndRunRequest Class
#' @format An \code{R6Class} generator object
#' @field assistant_id The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run. character
#' @field thread  \link{CreateThreadRequest} [optional]
#' @field model  \link{CreateRunRequestModel} [optional]
#' @field instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis. character [optional]
#' @field tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis. list(\link{CreateThreadAndRunRequestToolsInner}) [optional]
#' @field tool_resources  \link{CreateThreadAndRunRequestToolResources} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @field temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. numeric [optional]
#' @field top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or temperature but not both. numeric [optional]
#' @field stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. character [optional]
#' @field max_prompt_tokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. integer [optional]
#' @field max_completion_tokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. integer [optional]
#' @field truncation_strategy  \link{TruncationObject} [optional]
#' @field tool_choice  \link{AssistantsApiToolChoiceOption} [optional]
#' @field parallel_tool_calls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. character [optional]
#' @field response_format  \link{AssistantsApiResponseFormatOption} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateThreadAndRunRequest <- R6::R6Class(
  "CreateThreadAndRunRequest",
  public = list(
    `assistant_id` = NULL,
    `thread` = NULL,
    `model` = NULL,
    `instructions` = NULL,
    `tools` = NULL,
    `tool_resources` = NULL,
    `metadata` = NULL,
    `temperature` = NULL,
    `top_p` = NULL,
    `stream` = NULL,
    `max_prompt_tokens` = NULL,
    `max_completion_tokens` = NULL,
    `truncation_strategy` = NULL,
    `tool_choice` = NULL,
    `parallel_tool_calls` = NULL,
    `response_format` = NULL,

    #' @description
    #' Initialize a new CreateThreadAndRunRequest class.
    #'
    #' @param assistant_id The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
    #' @param thread thread
    #' @param model model
    #' @param instructions Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
    #' @param tools Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
    #' @param tool_resources tool_resources
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param temperature What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.. Default to 1.
    #' @param top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10\% probability mass are considered.  We generally recommend altering this or temperature but not both.. Default to 1.
    #' @param stream If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.
    #' @param max_prompt_tokens The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.
    #' @param max_completion_tokens The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.
    #' @param truncation_strategy truncation_strategy
    #' @param tool_choice tool_choice
    #' @param parallel_tool_calls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.. Default to TRUE.
    #' @param response_format response_format
    #' @param ... Other optional arguments.
    initialize = function(`assistant_id`, `thread` = NULL, `model` = NULL, `instructions` = NULL, `tools` = NULL, `tool_resources` = NULL, `metadata` = NULL, `temperature` = 1, `top_p` = 1, `stream` = NULL, `max_prompt_tokens` = NULL, `max_completion_tokens` = NULL, `truncation_strategy` = NULL, `tool_choice` = NULL, `parallel_tool_calls` = TRUE, `response_format` = NULL, ...) {
      if (!missing(`assistant_id`)) {
        if (!(is.character(`assistant_id`) && length(`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", `assistant_id`))
        }
        self$`assistant_id` <- `assistant_id`
      }
      if (!is.null(`thread`)) {
        stopifnot(R6::is.R6(`thread`))
        self$`thread` <- `thread`
      }
      if (!is.null(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!is.null(`instructions`)) {
        if (!(is.character(`instructions`) && length(`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", `instructions`))
        }
        self$`instructions` <- `instructions`
      }
      if (!is.null(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!is.null(`tool_resources`)) {
        stopifnot(R6::is.R6(`tool_resources`))
        self$`tool_resources` <- `tool_resources`
      }
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
      if (!is.null(`temperature`)) {
        self$`temperature` <- `temperature`
      }
      if (!is.null(`top_p`)) {
        self$`top_p` <- `top_p`
      }
      if (!is.null(`stream`)) {
        if (!(is.logical(`stream`) && length(`stream`) == 1)) {
          stop(paste("Error! Invalid data for `stream`. Must be a boolean:", `stream`))
        }
        self$`stream` <- `stream`
      }
      if (!is.null(`max_prompt_tokens`)) {
        if (!(is.numeric(`max_prompt_tokens`) && length(`max_prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_prompt_tokens`. Must be an integer:", `max_prompt_tokens`))
        }
        self$`max_prompt_tokens` <- `max_prompt_tokens`
      }
      if (!is.null(`max_completion_tokens`)) {
        if (!(is.numeric(`max_completion_tokens`) && length(`max_completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `max_completion_tokens`. Must be an integer:", `max_completion_tokens`))
        }
        self$`max_completion_tokens` <- `max_completion_tokens`
      }
      if (!is.null(`truncation_strategy`)) {
        stopifnot(R6::is.R6(`truncation_strategy`))
        self$`truncation_strategy` <- `truncation_strategy`
      }
      if (!is.null(`tool_choice`)) {
        stopifnot(R6::is.R6(`tool_choice`))
        self$`tool_choice` <- `tool_choice`
      }
      if (!is.null(`parallel_tool_calls`)) {
        if (!(is.logical(`parallel_tool_calls`) && length(`parallel_tool_calls`) == 1)) {
          stop(paste("Error! Invalid data for `parallel_tool_calls`. Must be a boolean:", `parallel_tool_calls`))
        }
        self$`parallel_tool_calls` <- `parallel_tool_calls`
      }
      if (!is.null(`response_format`)) {
        stopifnot(R6::is.R6(`response_format`))
        self$`response_format` <- `response_format`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateThreadAndRunRequest as a base R list.
    #' @examples
    #' # convert array of CreateThreadAndRunRequest (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateThreadAndRunRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateThreadAndRunRequestObject <- list()
      if (!is.null(self$`assistant_id`)) {
        CreateThreadAndRunRequestObject[["assistant_id"]] <-
          self$`assistant_id`
      }
      if (!is.null(self$`thread`)) {
        CreateThreadAndRunRequestObject[["thread"]] <-
          self$`thread`$toSimpleType()
      }
      if (!is.null(self$`model`)) {
        CreateThreadAndRunRequestObject[["model"]] <-
          self$`model`$toSimpleType()
      }
      if (!is.null(self$`instructions`)) {
        CreateThreadAndRunRequestObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`tools`)) {
        CreateThreadAndRunRequestObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`tool_resources`)) {
        CreateThreadAndRunRequestObject[["tool_resources"]] <-
          self$`tool_resources`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        CreateThreadAndRunRequestObject[["metadata"]] <-
          self$`metadata`
      }
      if (!is.null(self$`temperature`)) {
        CreateThreadAndRunRequestObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`top_p`)) {
        CreateThreadAndRunRequestObject[["top_p"]] <-
          self$`top_p`
      }
      if (!is.null(self$`stream`)) {
        CreateThreadAndRunRequestObject[["stream"]] <-
          self$`stream`
      }
      if (!is.null(self$`max_prompt_tokens`)) {
        CreateThreadAndRunRequestObject[["max_prompt_tokens"]] <-
          self$`max_prompt_tokens`
      }
      if (!is.null(self$`max_completion_tokens`)) {
        CreateThreadAndRunRequestObject[["max_completion_tokens"]] <-
          self$`max_completion_tokens`
      }
      if (!is.null(self$`truncation_strategy`)) {
        CreateThreadAndRunRequestObject[["truncation_strategy"]] <-
          self$`truncation_strategy`$toSimpleType()
      }
      if (!is.null(self$`tool_choice`)) {
        CreateThreadAndRunRequestObject[["tool_choice"]] <-
          self$`tool_choice`$toSimpleType()
      }
      if (!is.null(self$`parallel_tool_calls`)) {
        CreateThreadAndRunRequestObject[["parallel_tool_calls"]] <-
          self$`parallel_tool_calls`
      }
      if (!is.null(self$`response_format`)) {
        CreateThreadAndRunRequestObject[["response_format"]] <-
          self$`response_format`$toSimpleType()
      }
      return(CreateThreadAndRunRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateThreadAndRunRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateThreadAndRunRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`assistant_id`)) {
        self$`assistant_id` <- this_object$`assistant_id`
      }
      if (!is.null(this_object$`thread`)) {
        `thread_object` <- CreateThreadRequest$new()
        `thread_object`$fromJSON(jsonlite::toJSON(this_object$`thread`, auto_unbox = TRUE, digits = NA))
        self$`thread` <- `thread_object`
      }
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateRunRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`instructions`)) {
        self$`instructions` <- this_object$`instructions`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[CreateThreadAndRunRequestToolsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tool_resources`)) {
        `tool_resources_object` <- CreateThreadAndRunRequestToolResources$new()
        `tool_resources_object`$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
        self$`tool_resources` <- `tool_resources_object`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`top_p`)) {
        self$`top_p` <- this_object$`top_p`
      }
      if (!is.null(this_object$`stream`)) {
        self$`stream` <- this_object$`stream`
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
      if (!is.null(this_object$`parallel_tool_calls`)) {
        self$`parallel_tool_calls` <- this_object$`parallel_tool_calls`
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
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateThreadAndRunRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateThreadAndRunRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateThreadAndRunRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`assistant_id` <- this_object$`assistant_id`
      self$`thread` <- CreateThreadRequest$new()$fromJSON(jsonlite::toJSON(this_object$`thread`, auto_unbox = TRUE, digits = NA))
      self$`model` <- CreateRunRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`instructions` <- this_object$`instructions`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[CreateThreadAndRunRequestToolsInner]", loadNamespace("openapi"))
      self$`tool_resources` <- CreateThreadAndRunRequestToolResources$new()$fromJSON(jsonlite::toJSON(this_object$`tool_resources`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self$`temperature` <- this_object$`temperature`
      self$`top_p` <- this_object$`top_p`
      self$`stream` <- this_object$`stream`
      self$`max_prompt_tokens` <- this_object$`max_prompt_tokens`
      self$`max_completion_tokens` <- this_object$`max_completion_tokens`
      self$`truncation_strategy` <- TruncationObject$new()$fromJSON(jsonlite::toJSON(this_object$`truncation_strategy`, auto_unbox = TRUE, digits = NA))
      self$`tool_choice` <- AssistantsApiToolChoiceOption$new()$fromJSON(jsonlite::toJSON(this_object$`tool_choice`, auto_unbox = TRUE, digits = NA))
      self$`parallel_tool_calls` <- this_object$`parallel_tool_calls`
      self$`response_format` <- AssistantsApiResponseFormatOption$new()$fromJSON(jsonlite::toJSON(this_object$`response_format`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateThreadAndRunRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `assistant_id`
      if (!is.null(input_json$`assistant_id`)) {
        if (!(is.character(input_json$`assistant_id`) && length(input_json$`assistant_id`) == 1)) {
          stop(paste("Error! Invalid data for `assistant_id`. Must be a string:", input_json$`assistant_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateThreadAndRunRequest: the required field `assistant_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateThreadAndRunRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `assistant_id` is null
      if (is.null(self$`assistant_id`)) {
        return(FALSE)
      }

      if (length(self$`tools`) > 20) {
        return(FALSE)
      }

      if (self$`temperature` > 2) {
        return(FALSE)
      }
      if (self$`temperature` < 0) {
        return(FALSE)
      }

      if (self$`top_p` > 1) {
        return(FALSE)
      }
      if (self$`top_p` < 0) {
        return(FALSE)
      }

      if (self$`max_prompt_tokens` < 256) {
        return(FALSE)
      }

      if (self$`max_completion_tokens` < 256) {
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
      # check if the required `assistant_id` is null
      if (is.null(self$`assistant_id`)) {
        invalid_fields["assistant_id"] <- "Non-nullable required field `assistant_id` cannot be null."
      }

      if (length(self$`tools`) > 20) {
        invalid_fields["tools"] <- "Invalid length for `tools`, number of items must be less than or equal to 20."
      }

      if (self$`temperature` > 2) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be smaller than or equal to 2."
      }
      if (self$`temperature` < 0) {
        invalid_fields["temperature"] <- "Invalid value for `temperature`, must be bigger than or equal to 0."
      }

      if (self$`top_p` > 1) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be smaller than or equal to 1."
      }
      if (self$`top_p` < 0) {
        invalid_fields["top_p"] <- "Invalid value for `top_p`, must be bigger than or equal to 0."
      }

      if (self$`max_prompt_tokens` < 256) {
        invalid_fields["max_prompt_tokens"] <- "Invalid value for `max_prompt_tokens`, must be bigger than or equal to 256."
      }

      if (self$`max_completion_tokens` < 256) {
        invalid_fields["max_completion_tokens"] <- "Invalid value for `max_completion_tokens`, must be bigger than or equal to 256."
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
# CreateThreadAndRunRequest$unlock()
#
## Below is an example to define the print function
# CreateThreadAndRunRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateThreadAndRunRequest$lock()

