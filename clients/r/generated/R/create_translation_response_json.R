#' Create a new CreateTranslationResponseJson
#'
#' @description
#' CreateTranslationResponseJson Class
#'
#' @docType class
#' @title CreateTranslationResponseJson
#' @description CreateTranslationResponseJson Class
#' @format An \code{R6Class} generator object
#' @field text  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateTranslationResponseJson <- R6::R6Class(
  "CreateTranslationResponseJson",
  public = list(
    `text` = NULL,
    #' Initialize a new CreateTranslationResponseJson class.
    #'
    #' @description
    #' Initialize a new CreateTranslationResponseJson class.
    #'
    #' @param text text
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`text`, ...) {
      if (!missing(`text`)) {
        if (!(is.character(`text`) && length(`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", `text`))
        }
        self$`text` <- `text`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateTranslationResponseJson in JSON format
    #' @export
    toJSON = function() {
      CreateTranslationResponseJsonObject <- list()
      if (!is.null(self$`text`)) {
        CreateTranslationResponseJsonObject[["text"]] <-
          self$`text`
      }
      CreateTranslationResponseJsonObject
    },
    #' Deserialize JSON string into an instance of CreateTranslationResponseJson
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateTranslationResponseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranslationResponseJson
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`text`)) {
        self$`text` <- this_object$`text`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateTranslationResponseJson in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of CreateTranslationResponseJson
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateTranslationResponseJson
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateTranslationResponseJson
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`text` <- this_object$`text`
      self
    },
    #' Validate JSON input with respect to CreateTranslationResponseJson
    #'
    #' @description
    #' Validate JSON input with respect to CreateTranslationResponseJson and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `text`
      if (!is.null(input_json$`text`)) {
        if (!(is.character(input_json$`text`) && length(input_json$`text`) == 1)) {
          stop(paste("Error! Invalid data for `text`. Must be a string:", input_json$`text`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateTranslationResponseJson: the required field `text` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateTranslationResponseJson
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `text` is null
      if (is.null(self$`text`)) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `text` is null
      if (is.null(self$`text`)) {
        invalid_fields["text"] <- "Non-nullable required field `text` cannot be null."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateTranslationResponseJson$unlock()
#
## Below is an example to define the print function
# CreateTranslationResponseJson$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateTranslationResponseJson$lock()

