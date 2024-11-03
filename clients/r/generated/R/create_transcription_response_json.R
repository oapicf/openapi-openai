#' Create a new CreateTranscriptionResponseJson
#'
#' @description
#' Represents a transcription response returned by model, based on the provided input.
#'
#' @docType class
#' @title CreateTranscriptionResponseJson
#' @description CreateTranscriptionResponseJson Class
#' @format An \code{R6Class} generator object
#' @field text The transcribed text. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateTranscriptionResponseJson <- R6::R6Class(
  "CreateTranscriptionResponseJson",
  public = list(
    `text` = NULL,

    #' @description
    #' Initialize a new CreateTranscriptionResponseJson class.
    #'
    #' @param text The transcribed text.
    #' @param ... Other optional arguments.
    initialize = function(`text`, ...) {
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateTranscriptionResponseJson in JSON format
    toJSON = function() {
      CreateTranscriptionResponseJsonObject <- list()
      if (!is.null(self$`text`)) {
        CreateTranscriptionResponseJsonObject[["text"]] <-
          self$`text`
      }
      CreateTranscriptionResponseJsonObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateTranscriptionResponseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranscriptionResponseJson
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateTranscriptionResponseJson in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`text`)) {
          sprintf(
          '"text":
            "%s"
                    ',
          self$`text`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateTranscriptionResponseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranscriptionResponseJson
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`text` <- this_object$`text`
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateTranscriptionResponseJson and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranscriptionResponseJson: the required field `text` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateTranscriptionResponseJson
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `text` is null
      if (is.null(self$`text`)) {
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
      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
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
# CreateTranscriptionResponseJson$unlock()
#
## Below is an example to define the print function
# CreateTranscriptionResponseJson$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateTranscriptionResponseJson$lock()

