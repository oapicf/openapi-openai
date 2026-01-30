#' Create a new RealtimeClientEventInputAudioBufferAppend
#'
#' @description
#' Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
#'
#' @docType class
#' @title RealtimeClientEventInputAudioBufferAppend
#' @description RealtimeClientEventInputAudioBufferAppend Class
#' @format An \code{R6Class} generator object
#' @field event_id Optional client-generated ID used to identify this event. character [optional]
#' @field type The event type, must be `input_audio_buffer.append`. character
#' @field audio Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeClientEventInputAudioBufferAppend <- R6::R6Class(
  "RealtimeClientEventInputAudioBufferAppend",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `audio` = NULL,

    #' @description
    #' Initialize a new RealtimeClientEventInputAudioBufferAppend class.
    #'
    #' @param type The event type, must be `input_audio_buffer.append`.
    #' @param audio Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration.
    #' @param event_id Optional client-generated ID used to identify this event.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `audio`, `event_id` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(`type` %in% c("input_audio_buffer.append"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"input_audio_buffer.append\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`audio`)) {
        if (!(is.character(`audio`) && length(`audio`) == 1)) {
          stop(paste("Error! Invalid data for `audio`. Must be a string:", `audio`))
        }
        self$`audio` <- `audio`
      }
      if (!is.null(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
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
    #' @return RealtimeClientEventInputAudioBufferAppend as a base R list.
    #' @examples
    #' # convert array of RealtimeClientEventInputAudioBufferAppend (x) to a data frame
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
    #' Convert RealtimeClientEventInputAudioBufferAppend to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeClientEventInputAudioBufferAppendObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeClientEventInputAudioBufferAppendObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeClientEventInputAudioBufferAppendObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`audio`)) {
        RealtimeClientEventInputAudioBufferAppendObject[["audio"]] <-
          self$`audio`
      }
      return(RealtimeClientEventInputAudioBufferAppendObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventInputAudioBufferAppend
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventInputAudioBufferAppend
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio_buffer.append"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio_buffer.append\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`audio`)) {
        self$`audio` <- this_object$`audio`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeClientEventInputAudioBufferAppend in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeClientEventInputAudioBufferAppend
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeClientEventInputAudioBufferAppend
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("input_audio_buffer.append"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"input_audio_buffer.append\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`audio` <- this_object$`audio`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeClientEventInputAudioBufferAppend and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventInputAudioBufferAppend: the required field `type` is missing."))
      }
      # check the required field `audio`
      if (!is.null(input_json$`audio`)) {
        if (!(is.character(input_json$`audio`) && length(input_json$`audio`) == 1)) {
          stop(paste("Error! Invalid data for `audio`. Must be a string:", input_json$`audio`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeClientEventInputAudioBufferAppend: the required field `audio` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeClientEventInputAudioBufferAppend
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `audio` is null
      if (is.null(self$`audio`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `audio` is null
      if (is.null(self$`audio`)) {
        invalid_fields["audio"] <- "Non-nullable required field `audio` cannot be null."
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
# RealtimeClientEventInputAudioBufferAppend$unlock()
#
## Below is an example to define the print function
# RealtimeClientEventInputAudioBufferAppend$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeClientEventInputAudioBufferAppend$lock()

