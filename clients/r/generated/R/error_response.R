#' Create a new ErrorResponse
#'
#' @description
#' ErrorResponse Class
#'
#' @docType class
#' @title ErrorResponse
#' @description ErrorResponse Class
#' @format An \code{R6Class} generator object
#' @field error  \link{Error}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ErrorResponse <- R6::R6Class(
  "ErrorResponse",
  public = list(
    `error` = NULL,
    #' Initialize a new ErrorResponse class.
    #'
    #' @description
    #' Initialize a new ErrorResponse class.
    #'
    #' @param error error
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`error`, ...) {
      if (!missing(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ErrorResponse in JSON format
    #' @export
    toJSON = function() {
      ErrorResponseObject <- list()
      if (!is.null(self$`error`)) {
        ErrorResponseObject[["error"]] <-
          self$`error`$toJSON()
      }
      ErrorResponseObject
    },
    #' Deserialize JSON string into an instance of ErrorResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ErrorResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`error`)) {
        `error_object` <- Error$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ErrorResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`error`)) {
          sprintf(
          '"error":
          %s
          ',
          jsonlite::toJSON(self$`error`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ErrorResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ErrorResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ErrorResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`error` <- Error$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ErrorResponse
    #'
    #' @description
    #' Validate JSON input with respect to ErrorResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `error`
      if (!is.null(input_json$`error`)) {
        stopifnot(R6::is.R6(input_json$`error`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ErrorResponse: the required field `error` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ErrorResponse
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
      # check if the required `error` is null
      if (is.null(self$`error`)) {
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
      # check if the required `error` is null
      if (is.null(self$`error`)) {
        invalid_fields["error"] <- "Non-nullable required field `error` cannot be null."
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
# ErrorResponse$unlock()
#
## Below is an example to define the print function
# ErrorResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ErrorResponse$lock()

