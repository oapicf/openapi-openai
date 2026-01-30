#' Create a new RealtimeSessionInputAudioTranscription
#'
#' @description
#' Configuration for input audio transcription, defaults to off and can be  set to `null` to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
#'
#' @docType class
#' @title RealtimeSessionInputAudioTranscription
#' @description RealtimeSessionInputAudioTranscription Class
#' @format An \code{R6Class} generator object
#' @field model The model to use for transcription, `whisper-1` is the only currently  supported model. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeSessionInputAudioTranscription <- R6::R6Class(
  "RealtimeSessionInputAudioTranscription",
  public = list(
    `model` = NULL,

    #' @description
    #' Initialize a new RealtimeSessionInputAudioTranscription class.
    #'
    #' @param model The model to use for transcription, `whisper-1` is the only currently  supported model.
    #' @param ... Other optional arguments.
    initialize = function(`model` = NULL, ...) {
      if (!is.null(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
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
    #' @return RealtimeSessionInputAudioTranscription as a base R list.
    #' @examples
    #' # convert array of RealtimeSessionInputAudioTranscription (x) to a data frame
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
    #' Convert RealtimeSessionInputAudioTranscription to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeSessionInputAudioTranscriptionObject <- list()
      if (!is.null(self$`model`)) {
        RealtimeSessionInputAudioTranscriptionObject[["model"]] <-
          self$`model`
      }
      return(RealtimeSessionInputAudioTranscriptionObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionInputAudioTranscription
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionInputAudioTranscription
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeSessionInputAudioTranscription in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeSessionInputAudioTranscription
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeSessionInputAudioTranscription
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- this_object$`model`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeSessionInputAudioTranscription and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeSessionInputAudioTranscription
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
# RealtimeSessionInputAudioTranscription$unlock()
#
## Below is an example to define the print function
# RealtimeSessionInputAudioTranscription$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeSessionInputAudioTranscription$lock()

