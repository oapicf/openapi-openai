#' Create a new RealtimeServerEventConversationItemInputAudioTranscriptionFailed
#'
#' @description
#' Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  `error` events so that the client can identify the related Item. 
#'
#' @docType class
#' @title RealtimeServerEventConversationItemInputAudioTranscriptionFailed
#' @description RealtimeServerEventConversationItemInputAudioTranscriptionFailed Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `conversation.item.input_audio_transcription.failed`. character
#' @field item_id The ID of the user message item. character
#' @field content_index The index of the content part containing the audio. integer
#' @field error  \link{RealtimeServerEventConversationItemInputAudioTranscriptionFailedError}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationItemInputAudioTranscriptionFailed <- R6::R6Class(
  "RealtimeServerEventConversationItemInputAudioTranscriptionFailed",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `item_id` = NULL,
    `content_index` = NULL,
    `error` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationItemInputAudioTranscriptionFailed class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `conversation.item.input_audio_transcription.failed`.
    #' @param item_id The ID of the user message item.
    #' @param content_index The index of the content part containing the audio.
    #' @param error error
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `item_id`, `content_index`, `error`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("conversation.item.input_audio_transcription.failed"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"conversation.item.input_audio_transcription.failed\".", sep = ""))
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
      if (!missing(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
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
    #' @return RealtimeServerEventConversationItemInputAudioTranscriptionFailed as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationItemInputAudioTranscriptionFailed (x) to a data frame
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
    #' Convert RealtimeServerEventConversationItemInputAudioTranscriptionFailed to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`item_id`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject[["item_id"]] <-
          self$`item_id`
      }
      if (!is.null(self$`content_index`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject[["content_index"]] <-
          self$`content_index`
      }
      if (!is.null(self$`error`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject[["error"]] <-
          self$`error`$toSimpleType()
      }
      return(RealtimeServerEventConversationItemInputAudioTranscriptionFailedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.input_audio_transcription.failed"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.input_audio_transcription.failed\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`item_id`)) {
        self$`item_id` <- this_object$`item_id`
      }
      if (!is.null(this_object$`content_index`)) {
        self$`content_index` <- this_object$`content_index`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- RealtimeServerEventConversationItemInputAudioTranscriptionFailedError$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationItemInputAudioTranscriptionFailed in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailed
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("conversation.item.input_audio_transcription.failed"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"conversation.item.input_audio_transcription.failed\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`item_id` <- this_object$`item_id`
      self$`content_index` <- this_object$`content_index`
      self$`error` <- RealtimeServerEventConversationItemInputAudioTranscriptionFailedError$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationItemInputAudioTranscriptionFailed and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionFailed: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionFailed: the required field `type` is missing."))
      }
      # check the required field `item_id`
      if (!is.null(input_json$`item_id`)) {
        if (!(is.character(input_json$`item_id`) && length(input_json$`item_id`) == 1)) {
          stop(paste("Error! Invalid data for `item_id`. Must be a string:", input_json$`item_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionFailed: the required field `item_id` is missing."))
      }
      # check the required field `content_index`
      if (!is.null(input_json$`content_index`)) {
        if (!(is.numeric(input_json$`content_index`) && length(input_json$`content_index`) == 1)) {
          stop(paste("Error! Invalid data for `content_index`. Must be an integer:", input_json$`content_index`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionFailed: the required field `content_index` is missing."))
      }
      # check the required field `error`
      if (!is.null(input_json$`error`)) {
        stopifnot(R6::is.R6(input_json$`error`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventConversationItemInputAudioTranscriptionFailed: the required field `error` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationItemInputAudioTranscriptionFailed
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

      # check if the required `error` is null
      if (is.null(self$`error`)) {
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

      # check if the required `error` is null
      if (is.null(self$`error`)) {
        invalid_fields["error"] <- "Non-nullable required field `error` cannot be null."
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
# RealtimeServerEventConversationItemInputAudioTranscriptionFailed$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationItemInputAudioTranscriptionFailed$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationItemInputAudioTranscriptionFailed$lock()

