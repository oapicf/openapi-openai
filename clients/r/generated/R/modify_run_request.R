#' Create a new ModifyRunRequest
#'
#' @description
#' ModifyRunRequest Class
#'
#' @docType class
#' @title ModifyRunRequest
#' @description ModifyRunRequest Class
#' @format An \code{R6Class} generator object
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModifyRunRequest <- R6::R6Class(
  "ModifyRunRequest",
  public = list(
    `metadata` = NULL,

    #' @description
    #' Initialize a new ModifyRunRequest class.
    #'
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`metadata` = NULL, ...) {
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return ModifyRunRequest in JSON format
    toJSON = function() {
      ModifyRunRequestObject <- list()
      if (!is.null(self$`metadata`)) {
        ModifyRunRequestObject[["metadata"]] <-
          self$`metadata`
      }
      ModifyRunRequestObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyRunRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyRunRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ModifyRunRequest in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`metadata`)) {
          sprintf(
          '"metadata":
            "%s"
                    ',
          self$`metadata`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ModifyRunRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyRunRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to ModifyRunRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModifyRunRequest
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
# ModifyRunRequest$unlock()
#
## Below is an example to define the print function
# ModifyRunRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModifyRunRequest$lock()

