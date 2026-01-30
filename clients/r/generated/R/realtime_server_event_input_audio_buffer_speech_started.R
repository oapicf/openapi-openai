#' Create a new RealtimeServerEventInputAudioBufferSpeechStarted
#'
#' @description
#' Sent by the server when in `server_vad` mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a `input_audio_buffer.speech_stopped` event  when speech stops. The `item_id` property is the ID of the user message item  that will be created when speech stops and will also be included in the  `input_audio_buffer.speech_stopped` event (unless the client manually commits  the audio buffer during VAD activation). 
#'
#' @docType class
#' @title RealtimeServerEventInputAudioBufferSpeechStarted
#' @description RealtimeServerEventInputAudioBufferSpeechStarted Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `input_audio_buffer.speech_started`. character
#' @field audio_start_ms Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. integer
#' @field item_id The ID of the user message item that will be created when speech stops. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventInputAudioBufferSpeechStarted <- R6::R6Class(
  "RealtimeServerEventInputAudioBufferSpeechStarted",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `audio_start_ms` = NULL,
    `item_id` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventInputAudioBufferSpeechStarted class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `input_audio_buffer.speech_started`.
    #' @param audio_start_ms Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session.
    #' @param item_id The ID of the user message item that will be created when speech stops.
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `audio_start_ms`, `item_id`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("input_audio_buffer.speech_started"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"input_audio_buffer.speech_started\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`audio_start_ms`)) {
        if (!(is.numeric(`audio_start_ms`) && length(`audio_start_ms`) == 1)) {
          stop(paste("Error! Invalid data for `audio_start_ms`. Must be an integer:", `audio_start_ms`))
        }
        self$`audio_start_ms` <- `audio_start_ms`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
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
    #' @return RealtimeServerEventInputAudioBufferSpeechStarted as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventInputAudioBufferSpeechStarted (x) to a data frame
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
    #' Convert RealtimeServerEventInputAudioBufferSpeechStarted to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventInputAudioBufferSpeechStartedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventInputAudioBufferSpeechStartedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventInputAudioBufferSpeechStartedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`audio_start_ms`)) {
        RealtimeServerEventInputAudioBufferSpeechStartedObject[["audio_start_ms"]] <-
          self$`audio_start_ms`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeServerEventInputAudioBufferSpeechStartedObject[["item_id"]] <-
          self$`item_id`
      }
      return(RealtimeServerEventInputAudioBufferSpeechStartedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventInputAudioBufferSpeechStarted
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventInputAudioBufferSpeechStarted
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio_buffer.speech_started"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio_buffer.speech_started\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`audio_start_ms`)) {
        self$`audio_start_ms` <- this_object$`audio_start_ms`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventInputAudioBufferSpeechStarted in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventInputAudioBufferSpeechStarted
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventInputAudioBufferSpeechStarted
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio_buffer.speech_started"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio_buffer.speech_started\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`audio_start_ms` <- this_object$`audio_start_ms`
      self$`item_id` <- this_object$`item_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventInputAudioBufferSpeechStarted and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event_id`
      if (!is.null(input_json$`event_id`)) {
        if (!(is.character(input_json$`event_id`) && length(input_json$`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", input_json$`event_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventInputAudioBufferSpeechStarted: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventInputAudioBufferSpeechStarted: the required field `type` is missing."))
      }
      # check the required field `audio_start_ms`
      if (!is.null(input_json$`audio_start_ms`)) {
        if (!(is.numeric(input_json$`audio_start_ms`) && length(input_json$`audio_start_ms`) == 1)) {
          stop(paste("Error! Invalid data for `audio_start_ms`. Must be an integer:", input_json$`audio_start_ms`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventInputAudioBufferSpeechStarted: the required field `audio_start_ms` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventInputAudioBufferSpeechStarted: the required field `item_id` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventInputAudioBufferSpeechStarted
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `audio_start_ms` is null
      if (is.null(self$`audio_start_ms`)) {
        return(FALSE)
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
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
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        invalid_fields["event_id"] <- "Non-nullable required field `event_id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `audio_start_ms` is null
      if (is.null(self$`audio_start_ms`)) {
        invalid_fields["audio_start_ms"] <- "Non-nullable required field `audio_start_ms` cannot be null."
      }

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
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
# RealtimeServerEventInputAudioBufferSpeechStarted$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventInputAudioBufferSpeechStarted$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventInputAudioBufferSpeechStarted$lock()

