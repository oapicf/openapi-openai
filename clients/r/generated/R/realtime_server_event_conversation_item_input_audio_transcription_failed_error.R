#' Create a new RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
#'
#' @description
#' Details of the transcription error.
#'
#' @docType class
#' @title RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
#' @description RealtimeServerEventConversationItemInputAudioTranscriptionFailedError Class
#' @format An \code{R6Class} generator object
#' @field type The type of error. character [optional]
#' @field code Error code, if any. character [optional]
#' @field message A human-readable error message. character [optional]
#' @field param Parameter related to the error, if any. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventConversationItemInputAudioTranscriptionFailedError <- R6::R6Class(
  "RealtimeServerEventConversationItemInputAudioTranscriptionFailedError",
  public = list(
    `type` = NULL,
    `code` = NULL,
    `message` = NULL,
    `param` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventConversationItemInputAudioTranscriptionFailedError class.
    #'
    #' @param type The type of error.
    #' @param code Error code, if any.
    #' @param message A human-readable error message.
    #' @param param Parameter related to the error, if any.
    #' @param ... Other optional arguments.
    initialize = function(`type` = NULL, `code` = NULL, `message` = NULL, `param` = NULL, ...) {
      if (!is.null(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!is.null(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`param`)) {
        if (!(is.character(`param`) && length(`param`) == 1)) {
          stop(paste("Error! Invalid data for `param`. Must be a string:", `param`))
        }
        self$`param` <- `param`
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
    #' @return RealtimeServerEventConversationItemInputAudioTranscriptionFailedError as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError (x) to a data frame
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
    #' Convert RealtimeServerEventConversationItemInputAudioTranscriptionFailedError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`code`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`param`)) {
        RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorObject[["param"]] <-
          self$`param`
      }
      return(RealtimeServerEventConversationItemInputAudioTranscriptionFailedErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`param`)) {
        self$`param` <- this_object$`param`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventConversationItemInputAudioTranscriptionFailedError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self$`param` <- this_object$`param`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventConversationItemInputAudioTranscriptionFailedError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
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
# RealtimeServerEventConversationItemInputAudioTranscriptionFailedError$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventConversationItemInputAudioTranscriptionFailedError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventConversationItemInputAudioTranscriptionFailedError$lock()

