#' Create a new RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
#'
#' @description
#' This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in `server_vad` mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always `whisper-1`. Thus the transcript may diverge somewhat from  the model's interpretation, and should be treated as a rough guide. 
#'
#' @docType class
#' @title RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
#' @description RealtimeServerEventConversationItemInputAudioTranscriptionCompleted Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `conversation.item.input_audio_transcription.completed`. character
#' @field item_id The ID of the user message item containing the audio. character
#' @field content_index The index of the content part containing the audio. integer
#' @field transcript The transcribed text. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationItemInputAudioTranscriptionCompleted <- R6::R6Class(
  "RealtimeServerEventConversationItemInputAudioTranscriptionCompleted",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `item_id` = NULL,
    `content_index` = NULL,
    `transcript` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationItemInputAudioTranscriptionCompleted class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `conversation.item.input_audio_transcription.completed`.
    #' @param item_id The ID of the user message item containing the audio.
    #' @param content_index The index of the content part containing the audio.
    #' @param transcript The transcribed text.
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `item_id`, `content_index`, `transcript`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.item.input_audio_transcription.completed"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.item.input_audio_transcription.completed\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`item_id`)) {
        if (!(is.character(`item_id`) && length(`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", `item_id`))
        }
        self$`item_id` <- `item_id`
      }
      if (!missing(`content_index`)) {
        if (!(is.numeric(`content_index`) && length(`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", `content_index`))
        }
        self$`content_index` <- `content_index`
      }
      if (!missing(`transcript`)) {
        if (!(is.character(`transcript`) && length(`transcript`) == 1)) {
          stop(paste("Error! Invalid data for `transcript`. Must be a string:", `transcript`))
        }
        self$`transcript` <- `transcript`
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
    #' @return RealtimeServerEventConversationItemInputAudioTranscriptionCompleted as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted (x) to a data frame
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
    #' Convert RealtimeServerEventConversationItemInputAudioTranscriptionCompleted to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`content_index`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject[["content_index"]] <-
          self$`content_index`
      }
      if (!is.null(self$`transcript`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject[["transcript"]] <-
          self$`transcript`
      }
      return(RealtimeServerEventConversationItemInputAudioTranscriptionCompletedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.input_audio_transcription.completed"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.input_audio_transcription.completed\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`content_index`)) {
        self$`content_index` <- this_object$`content_index`
      }
      if (!is.null(this_object$`transcript`)) {
        self$`transcript` <- this_object$`transcript`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationItemInputAudioTranscriptionCompleted in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.input_audio_transcription.completed"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.input_audio_transcription.completed\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`item_id` <- this_object$`item_id`
      self$`content_index` <- this_object$`content_index`
      self$`transcript` <- this_object$`transcript`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationItemInputAudioTranscriptionCompleted and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionCompleted: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionCompleted: the required field `type` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionCompleted: the required field `item_id` is missing."))
      }
      # check the required field `content_index`
      if (!is.null(input_json$`content_index`)) {
        if (!(is.numeric(input_json$`content_index`) && length(input_json$`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", input_json$`content_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionCompleted: the required field `content_index` is missing."))
      }
      # check the required field `transcript`
      if (!is.null(input_json$`transcript`)) {
        if (!(is.character(input_json$`transcript`) && length(input_json$`transcript`) == 1)) {
          stop(paste("Error! Invalid data for `transcript`. Must be a string:", input_json$`transcript`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionCompleted: the required field `transcript` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
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

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        return(FALSE)
      }

      # check if the required `content_index` is null
      if (is.null(self$`content_index`)) {
        return(FALSE)
      }

      # check if the required `transcript` is null
      if (is.null(self$`transcript`)) {
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

      # check if the required `item_id` is null
      if (is.null(self$`item_id`)) {
        invalid_fields["item_id"] <- "Non-nullable required field `item_id` cannot be null."
      }

      # check if the required `content_index` is null
      if (is.null(self$`content_index`)) {
        invalid_fields["content_index"] <- "Non-nullable required field `content_index` cannot be null."
      }

      # check if the required `transcript` is null
      if (is.null(self$`transcript`)) {
        invalid_fields["transcript"] <- "Non-nullable required field `transcript` cannot be null."
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
# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationItemInputAudioTranscriptionCompleted$lock()

