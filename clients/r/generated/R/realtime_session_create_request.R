#' Create a new RealtimeSessionCreateRequest
#'
#' @description
#' Realtime session object configuration.
#'
#' @docType class
#' @title RealtimeSessionCreateRequest
#' @description RealtimeSessionCreateRequest Class
#' @format An \code{R6Class} generator object
#' @field modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. list(character) [optional]
#' @field model The Realtime model used for this session. character
#' @field instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. character [optional]
#' @field voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. character [optional]
#' @field input_audio_format The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. character [optional]
#' @field output_audio_format The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. character [optional]
#' @field input_audio_transcription  \link{RealtimeSessionInputAudioTranscription} [optional]
#' @field turn_detection  \link{RealtimeSessionCreateRequestTurnDetection} [optional]
#' @field tools Tools (functions) available to the model. list(\link{RealtimeResponseCreateParamsToolsInner}) [optional]
#' @field tool_choice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. character [optional]
#' @field temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. numeric [optional]
#' @field max_response_output_tokens  \link{RealtimeResponseCreateParamsMaxResponseOutputTokens} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeSessionCreateRequest <- R6::R6Class(
  "RealtimeSessionCreateRequest",
  public = list(
    `modalities` = NULL,
    `model` = NULL,
    `instructions` = NULL,
    `voice` = NULL,
    `input_audio_format` = NULL,
    `output_audio_format` = NULL,
    `input_audio_transcription` = NULL,
    `turn_detection` = NULL,
    `tools` = NULL,
    `tool_choice` = NULL,
    `temperature` = NULL,
    `max_response_output_tokens` = NULL,

    #' @description
    #' Initialize a new RealtimeSessionCreateRequest class.
    #'
    #' @param model The Realtime model used for this session.
    #' @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"].
    #' @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.
    #' @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.
    #' @param input_audio_format The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
    #' @param output_audio_format The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.
    #' @param input_audio_transcription input_audio_transcription
    #' @param turn_detection turn_detection
    #' @param tools Tools (functions) available to the model.
    #' @param tool_choice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.
    #' @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.
    #' @param max_response_output_tokens max_response_output_tokens
    #' @param ... Other optional arguments.
    initialize = function(`model`, `modalities` = NULL, `instructions` = NULL, `voice` = NULL, `input_audio_format` = NULL, `output_audio_format` = NULL, `input_audio_transcription` = NULL, `turn_detection` = NULL, `tools` = NULL, `tool_choice` = NULL, `temperature` = NULL, `max_response_output_tokens` = NULL, ...) {
      if (!missing(`model`)) {
        if (!(`model` %in% c("gpt-4o-realtime-preview", "gpt-4o-realtime-preview-2024-10-01", "gpt-4o-realtime-preview-2024-12-17", "gpt-4o-mini-realtime-preview", "gpt-4o-mini-realtime-preview-2024-12-17"))) {
          stop(paste("Error! \"", `model`, "\" cannot be assigned to `model`. Must be \"gpt-4o-realtime-preview\", \"gpt-4o-realtime-preview-2024-10-01\", \"gpt-4o-realtime-preview-2024-12-17\", \"gpt-4o-mini-realtime-preview\", \"gpt-4o-mini-realtime-preview-2024-12-17\".", sep = ""))
        }
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
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
      if (!is.null(`input_audio_format`)) {
        if (!(`input_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
          stop(paste("Error! \"", `input_audio_format`, "\" cannot be assigned to `input_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
        }
        if (!(is.character(`input_audio_format`) && length(`input_audio_format`) == 1)) {
          stop(paste("Error! Invalid data for `input_audio_format`. Must be a string:", `input_audio_format`))
        }
        self$`input_audio_format` <- `input_audio_format`
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
      if (!is.null(`input_audio_transcription`)) {
        stopifnot(R6::is.R6(`input_audio_transcription`))
        self$`input_audio_transcription` <- `input_audio_transcription`
      }
      if (!is.null(`turn_detection`)) {
        stopifnot(R6::is.R6(`turn_detection`))
        self$`turn_detection` <- `turn_detection`
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
    #' @return RealtimeSessionCreateRequest as a base R list.
    #' @examples
    #' # convert array of RealtimeSessionCreateRequest (x) to a data frame
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
    #' Convert RealtimeSessionCreateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeSessionCreateRequestObject <- list()
      if (!is.null(self$`modalities`)) {
        RealtimeSessionCreateRequestObject[["modalities"]] <-
          self$`modalities`
      }
      if (!is.null(self$`model`)) {
        RealtimeSessionCreateRequestObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`instructions`)) {
        RealtimeSessionCreateRequestObject[["instructions"]] <-
          self$`instructions`
      }
      if (!is.null(self$`voice`)) {
        RealtimeSessionCreateRequestObject[["voice"]] <-
          self$`voice`
      }
      if (!is.null(self$`input_audio_format`)) {
        RealtimeSessionCreateRequestObject[["input_audio_format"]] <-
          self$`input_audio_format`
      }
      if (!is.null(self$`output_audio_format`)) {
        RealtimeSessionCreateRequestObject[["output_audio_format"]] <-
          self$`output_audio_format`
      }
      if (!is.null(self$`input_audio_transcription`)) {
        RealtimeSessionCreateRequestObject[["input_audio_transcription"]] <-
          self$`input_audio_transcription`$toSimpleType()
      }
      if (!is.null(self$`turn_detection`)) {
        RealtimeSessionCreateRequestObject[["turn_detection"]] <-
          self$`turn_detection`$toSimpleType()
      }
      if (!is.null(self$`tools`)) {
        RealtimeSessionCreateRequestObject[["tools"]] <-
          lapply(self$`tools`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`tool_choice`)) {
        RealtimeSessionCreateRequestObject[["tool_choice"]] <-
          self$`tool_choice`
      }
      if (!is.null(self$`temperature`)) {
        RealtimeSessionCreateRequestObject[["temperature"]] <-
          self$`temperature`
      }
      if (!is.null(self$`max_response_output_tokens`)) {
        RealtimeSessionCreateRequestObject[["max_response_output_tokens"]] <-
          self$`max_response_output_tokens`$toSimpleType()
      }
      return(RealtimeSessionCreateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionCreateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`modalities`)) {
        self$`modalities` <- ApiClient$new()$deserializeObj(this_object$`modalities`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`model`)) {
        if (!is.null(this_object$`model`) && !(this_object$`model` %in% c("gpt-4o-realtime-preview", "gpt-4o-realtime-preview-2024-10-01", "gpt-4o-realtime-preview-2024-12-17", "gpt-4o-mini-realtime-preview", "gpt-4o-mini-realtime-preview-2024-12-17"))) {
          stop(paste("Error! \"", this_object$`model`, "\" cannot be assigned to `model`. Must be \"gpt-4o-realtime-preview\", \"gpt-4o-realtime-preview-2024-10-01\", \"gpt-4o-realtime-preview-2024-12-17\", \"gpt-4o-mini-realtime-preview\", \"gpt-4o-mini-realtime-preview-2024-12-17\".", sep = ""))
        }
        self$`model` <- this_object$`model`
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
      if (!is.null(this_object$`input_audio_format`)) {
        if (!is.null(this_object$`input_audio_format`) && !(this_object$`input_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
          stop(paste("Error! \"", this_object$`input_audio_format`, "\" cannot be assigned to `input_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
        }
        self$`input_audio_format` <- this_object$`input_audio_format`
      }
      if (!is.null(this_object$`output_audio_format`)) {
        if (!is.null(this_object$`output_audio_format`) && !(this_object$`output_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
          stop(paste("Error! \"", this_object$`output_audio_format`, "\" cannot be assigned to `output_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
        }
        self$`output_audio_format` <- this_object$`output_audio_format`
      }
      if (!is.null(this_object$`input_audio_transcription`)) {
        `input_audio_transcription_object` <- RealtimeSessionInputAudioTranscription$new()
        `input_audio_transcription_object`$fromJSON(jsonlite::toJSON(this_object$`input_audio_transcription`, auto_unbox = TRUE, digits = NA))
        self$`input_audio_transcription` <- `input_audio_transcription_object`
      }
      if (!is.null(this_object$`turn_detection`)) {
        `turn_detection_object` <- RealtimeSessionCreateRequestTurnDetection$new()
        `turn_detection_object`$fromJSON(jsonlite::toJSON(this_object$`turn_detection`, auto_unbox = TRUE, digits = NA))
        self$`turn_detection` <- `turn_detection_object`
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
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeSessionCreateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionCreateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionCreateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`modalities` <- ApiClient$new()$deserializeObj(this_object$`modalities`, "array[character]", loadNamespace("openapi"))
      if (!is.null(this_object$`model`) && !(this_object$`model` %in% c("gpt-4o-realtime-preview", "gpt-4o-realtime-preview-2024-10-01", "gpt-4o-realtime-preview-2024-12-17", "gpt-4o-mini-realtime-preview", "gpt-4o-mini-realtime-preview-2024-12-17"))) {
        stop(paste("Error! \"", this_object$`model`, "\" cannot be assigned to `model`. Must be \"gpt-4o-realtime-preview\", \"gpt-4o-realtime-preview-2024-10-01\", \"gpt-4o-realtime-preview-2024-12-17\", \"gpt-4o-mini-realtime-preview\", \"gpt-4o-mini-realtime-preview-2024-12-17\".", sep = ""))
      }
      self$`model` <- this_object$`model`
      self$`instructions` <- this_object$`instructions`
      if (!is.null(this_object$`voice`) && !(this_object$`voice` %in% c("alloy", "ash", "ballad", "coral", "echo", "sage", "shimmer", "verse"))) {
        stop(paste("Error! \"", this_object$`voice`, "\" cannot be assigned to `voice`. Must be \"alloy\", \"ash\", \"ballad\", \"coral\", \"echo\", \"sage\", \"shimmer\", \"verse\".", sep = ""))
      }
      self$`voice` <- this_object$`voice`
      if (!is.null(this_object$`input_audio_format`) && !(this_object$`input_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
        stop(paste("Error! \"", this_object$`input_audio_format`, "\" cannot be assigned to `input_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
      }
      self$`input_audio_format` <- this_object$`input_audio_format`
      if (!is.null(this_object$`output_audio_format`) && !(this_object$`output_audio_format` %in% c("pcm16", "g711_ulaw", "g711_alaw"))) {
        stop(paste("Error! \"", this_object$`output_audio_format`, "\" cannot be assigned to `output_audio_format`. Must be \"pcm16\", \"g711_ulaw\", \"g711_alaw\".", sep = ""))
      }
      self$`output_audio_format` <- this_object$`output_audio_format`
      self$`input_audio_transcription` <- RealtimeSessionInputAudioTranscription$new()$fromJSON(jsonlite::toJSON(this_object$`input_audio_transcription`, auto_unbox = TRUE, digits = NA))
      self$`turn_detection` <- RealtimeSessionCreateRequestTurnDetection$new()$fromJSON(jsonlite::toJSON(this_object$`turn_detection`, auto_unbox = TRUE, digits = NA))
      self$`tools` <- ApiClient$new()$deserializeObj(this_object$`tools`, "array[RealtimeResponseCreateParamsToolsInner]", loadNamespace("openapi"))
      self$`tool_choice` <- this_object$`tool_choice`
      self$`temperature` <- this_object$`temperature`
      self$`max_response_output_tokens` <- RealtimeResponseCreateParamsMaxResponseOutputTokens$new()$fromJSON(jsonlite::toJSON(this_object$`max_response_output_tokens`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeSessionCreateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeSessionCreateRequest: the required field `model` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeSessionCreateRequest
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `model` is null
      if (is.null(self$`model`)) {
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
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
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
# RealtimeSessionCreateRequest$unlock()
#
## Below is an example to define the print function
# RealtimeSessionCreateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeSessionCreateRequest$lock()

