#' Create a new ModifyThreadRequest
#'
#' @description
#' ModifyThreadRequest Class
#'
#' @docType class
#' @title ModifyThreadRequest
#' @description ModifyThreadRequest Class
#' @format An \code{R6Class} generator object
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ModifyThreadRequest <- R6::R6Class(
  "ModifyThreadRequest",
  public = list(
    `metadata` = NULL,
    #' Initialize a new ModifyThreadRequest class.
    #'
    #' @description
    #' Initialize a new ModifyThreadRequest class.
    #'
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`metadata` = NULL, ...) {
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModifyThreadRequest in JSON format
    #' @export
    toJSON = function() {
      ModifyThreadRequestObject <- list()
      if (!is.null(self$`metadata`)) {
        ModifyThreadRequestObject[["metadata"]] <-
          self$`metadata`
      }
      ModifyThreadRequestObject
    },
    #' Deserialize JSON string into an instance of ModifyThreadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModifyThreadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyThreadRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ModifyThreadRequest in JSON format
    #' @export
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
    #' Deserialize JSON string into an instance of ModifyThreadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of ModifyThreadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ModifyThreadRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`metadata` <- this_object$`metadata`
      self
    },
    #' Validate JSON input with respect to ModifyThreadRequest
    #'
    #' @description
    #' Validate JSON input with respect to ModifyThreadRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ModifyThreadRequest
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
# ModifyThreadRequest$unlock()
#
## Below is an example to define the print function
# ModifyThreadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ModifyThreadRequest$lock()

