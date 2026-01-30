#' Create a new RealtimeResponseCreateParams
#'
#' @description
#' Create a new Realtime response with these parameters
#'
#' @docType class
#' @title RealtimeResponseCreateParams
#' @description RealtimeResponseCreateParams Class
#' @format An \code{R6Class} generator object
#' @field modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. list(character) [optional]
#' @field instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. character [optional]
#' @field voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. character [optional]
#' @field output_audio_format The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. character [optional]
#' @field tools Tools (functions) available to the model. list(\link{RealtimeResponseCreateParamsToolsInner}) [optional]
#' @field tool_choice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. character [optional]
#' @field temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. numeric [optional]
#' @field max_response_output_tokens  \link{RealtimeResponseCreateParamsMaxResponseOutputTokens} [optional]
#' @field conversation  \link{RealtimeResponseCreateParamsConversation} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @field input Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. list(\link{RealtimeConversationItem}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeResponseCreateParams <- R6::R6Class(
  "RealtimeResponseCreateParams",
  public = list(
    `modalities` = NULL,
    `instructions` = NULL,
    `voice` = NULL,
    `output_audio_format` = NULL,
    `tools` = NULL,
    `tool_choice` = NULL,
    `temperature` = NULL,
    `max_response_output_tokens` = NULL,
    `conversation` = NULL,
    `metadata` = NULL,
    `input` = NULL,

    #' @description
    #' Initialize a new RealtimeResponseCreateParams class.
    #'
    #' @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"].
    #' @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.
    #' @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.
    #' @param output_audio_format The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
    #' @param tools Tools (functions) available to the model.
    #' @param tool_choice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`.
    #' @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.
    #' @param max_response_output_tokens max_response_output_tokens
    #' @param conversation conversation
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param input Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.
    #' @param ... Other optional arguments.
    initialize = function(`modalities` = NULL, `instructions` = NULL, `voice` = NULL, `output_audio_format` = NULL, `tools` = NULL, `tool_choice` = NULL, `temperature` = NULL, `max_response_output_tokens` = NULL, `conversation` = NULL, `metadata` = NULL, `input` = NULL, ...) {
      if (!is.null(`modalities`)) {
        stopifnot(is.vector(`modalities`), length(`modalities`) != 0)
        sapply(`modalities`, function(x) stopifnot(is.character(x)))
        self$`modalities` <- `modalities`
      }
      if (!is.null(`instructions`)) {
        if (!(is.character(`instructions`) && length(`instructions`) == 1)) {
          stop(paste("Error! Invalid data for `instructions`. Must be a string:", `instructions`))
        }
        self$`instructions` <- `instructions`
      }
      if (!is.null(`voice`)) {
        if (!(`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
          stop(paste("Error! \"", `voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
        }
        if (!(is.character(`voice`) && length(`voice`) == 1)) {
          stop(paste("Error! Invalid data for `voice`. Must be a string:", `voice`))
        }
        self$`voice` <- `voice`
      }
      if (!is.null(`output_audio_format`)) {
        if (!(`output_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
          stop(paste("Error! \"", `output_audio_format`, "\" cannot be assigned to `output_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
        }
        if (!(is.character(`output_audio_format`) && length(`output_audio_format`) == 1)) {
          stop(paste("Error! Invalid data for `output_audio_format`. Must be a string:", `output_audio_format`))
        }
        self$`output_audio_format` <- `output_audio_format`
      }
      if (!is.null(`tools`)) {
        stopifnot(is.vector(`tools`), length(`tools`) != 0)
        sapply(`tools`, function(x) stopifnot(R6::is.R6(x)))
        self$`tools` <- `tools`
      }
      if (!is.null(`tool_choice`)) {
        if (!(is.character(`tool_choice`) && length(`tool_choice`) == 1)) {
          stop(paste("Error! Invalid data for `tool_choice`. Must be a string:", `tool_choice`))
        }
        self$`tool_choice` <- `tool_choice`
      }
      if (!is.null(`temperature`)) {
        self$`temperature` <- `temperature`
      }
      if (!is.null(`max_response_output_tokens`)) {
        stopifnot(R6::is.R6(`max_response_output_tokens`))
        self$`max_response_output_tokens` <- `max_response_output_tokens`
      }
      if (!is.null(`conversation`)) {
        stopifnot(R6::is.R6(`conversation`))
        self$`conversation` <- `conversation`
      }
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
      if (!is.null(`input`)) {
        stopifnot(is.vector(`input`), length(`input`) != 0)
        sapply(`input`, function(x) stopifnot(R6::is.R6(x)))
        self$`input` <- `input`
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
    #' @return RealtimeResponseCreateParams as a base R list.
    #' @examples
    #' # convert array of RealtimeResponseCreateParams (x) to a data frame
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
    #' Convert RealtimeResponseCreateParams to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeResponseCreateParamsObject <- list()
      if (!is.null(self$`modalities`)) {
        RealtimeResponseCreateParamsObject[["modalities"]] <-
          self$`modalities`
      }
      if (!is.null(self$`instructions`)) {
        RealtimeResponseCreateParamsObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`voice`)) {
        RealtimeResponseCreateParamsObject[["voice"]] <-
          self$`voice`
      }
      if (!is.null(self$`output_audio_format`)) {
        RealtimeResponseCreateParamsObject[["output_audio_format"]] <-
          self$`output_audio_format`
      }
      if (!is.null(self$`tools`)) {
        RealtimeResponseCreateParamsObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`tool_choice`)) {
        RealtimeResponseCreateParamsObject[["tool_choice"]] <-
          self$`tool_choice`
      }
      if (!is.null(self$`temperature`)) {
        RealtimeResponseCreateParamsObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`max_response_output_tokens`)) {
        RealtimeResponseCreateParamsObject[["max_response_output_tokens"]] <-
          self$`max_response_output_tokens`$toSimpleType()
      }
      if (!is.null(self$`conversation`)) {
        RealtimeResponseCreateParamsObject[["conversation"]] <-
          self$`conversation`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        RealtimeResponseCreateParamsObject[["metadata"]] <-
          self$`metadata`
      }
      if (!is.null(self$`input`)) {
        RealtimeResponseCreateParamsObject[["input"]] <-
          lapply(self$`input`, function(x) x$toSimpleType())
      }
      return(RealtimeResponseCreateParamsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseCreateParams
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseCreateParams
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`modalities`)) {
        self$`modalities` <- ApiClient$new()$deserializeObj(this_object$`modalities`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`instructions`)) {
        self$`instructions` <- this_object$`instructions`
      }
      if (!is.null(this_object$`voice`)) {
        if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
          stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
        }
        self$`voice` <- this_object$`voice`
      }
      if (!is.null(this_object$`output_audio_format`)) {
        if (!is.null(this_object$`output_audio_format`) && !(this_object$`output_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
          stop(paste("Error! \"", this_object$`output_audio_format`, "\" cannot be assigned to `output_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
        }
        self$`output_audio_format` <- this_object$`output_audio_format`
      }
      if (!is.null(this_object$`tools`)) {
        self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[RealtimeResponseCreateParamsToolsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tool_choice`)) {
        self$`tool_choice` <- this_object$`tool_choice`
      }
      if (!is.null(this_object$`temperature`)) {
        self$`temperature` <- this_object$`temperature`
      }
      if (!is.null(this_object$`max_response_output_tokens`)) {
        `max_response_output_tokens_object` <- RealtimeResponseCreateParamsMaxResponseOutputTokens$new()
        `max_response_output_tokens_object`$fromJSON(jsonlite::toJSON(this_object$`max_response_output_tokens`, auto_unbox = TRUE, digits = NA))
        self$`max_response_output_tokens` <- `max_response_output_tokens_object`
      }
      if (!is.null(this_object$`conversation`)) {
        `conversation_object` <- RealtimeResponseCreateParamsConversation$new()
        `conversation_object`$fromJSON(jsonlite::toJSON(this_object$`conversation`, auto_unbox = TRUE, digits = NA))
        self$`conversation` <- `conversation_object`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      if (!is.null(this_object$`input`)) {
        self$`input` <- ApiClient$new()$deserializeObj(this_object$`input`, "array[RealtimeConversationItem]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeResponseCreateParams in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeResponseCreateParams
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeResponseCreateParams
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`modalities` <- ApiClient$new()$deserializeObj(this_object$`modalities`, "array[character]", loadNamespace("openapi"))
      self$`instructions` <- this_object$`instructions`
      if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
        stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
      }
      self$`voice` <- this_object$`voice`
      if (!is.null(this_object$`output_audio_format`) && !(this_object$`output_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
        stop(paste("Error! \"", this_object$`output_audio_format`, "\" cannot be assigned to `output_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
      }
      self$`output_audio_format` <- this_object$`output_audio_format`
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[RealtimeResponseCreateParamsToolsInner]", loadNamespace("openapi"))
      self$`tool_choice` <- this_object$`tool_choice`
      self$`temperature` <- this_object$`temperature`
      self$`max_response_output_tokens` <- RealtimeResponseCreateParamsMaxResponseOutputTokens$new()$fromJSON(jsonlite::toJSON(this_object$`max_response_output_tokens`, auto_unbox = TRUE, digits = NA))
      self$`conversation` <- RealtimeResponseCreateParamsConversation$new()$fromJSON(jsonlite::toJSON(this_object$`conversation`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self$`input` <- ApiClient$new()$deserializeObj(this_object$`input`, "array[RealtimeConversationItem]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeResponseCreateParams and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeResponseCreateParams
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# RealtimeResponseCreateParams$unlock()
#
## Below is an example to define the print function
# RealtimeResponseCreateParams$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeResponseCreateParams$lock()

