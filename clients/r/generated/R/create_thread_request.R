#' Create a new CreateThreadRequest
#'
#' @description
#' CreateThreadRequest Class
#'
#' @docType class
#' @title CreateThreadRequest
#' @description CreateThreadRequest Class
#' @format An \code{R6Class} generator object
#' @field messages A list of [messages](/docs/api-reference/messages) to start the thread with. list(\link{CreateMessageRequest}) [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateThreadRequest <- R6::R6Class(
  "CreateThreadRequest",
  public = list(
    `messages` = NULL,
    `metadata` = NULL,
    #' Initialize a new CreateThreadRequest class.
    #'
    #' @description
    #' Initialize a new CreateThreadRequest class.
    #'
    #' @param messages A list of [messages](/docs/api-reference/messages) to start the thread with.
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`messages` = NULL, `metadata` = NULL, ...) {
      if (!is.null(`messages`)) {
        stopifnot(is.vector(`messages`), length(`messages`) != 0)
        sapply(`messages`, function(x) stopifnot(R6::is.R6(x)))
        self$`messages` <- `messages`
      }
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateThreadRequest in JSON format
    #' @export
    toJSON = function() {
      CreateThreadRequestObject <- list()
      if (!is.null(self$`messages`)) {
        CreateThreadRequestObject[["messages"]] <-
          lapply(self$`messages`, function(x) x$toJSON())
      }
      if (!is.null(self$`metadata`)) {
        CreateThreadRequestObject[["metadata"]] <-
          self$`metadata`
      }
      CreateThreadRequestObject
    },
    #' Deserialize JSON string into an instance of CreateThreadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateThreadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateThreadRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`messages`)) {
        self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[CreateMessageRequest]", loadNamespace("openapi"))
      }
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
    #' @return CreateThreadRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`messages`)) {
          sprintf(
          '"messages":
          [%s]
',
          paste(sapply(self$`messages`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
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
    #' Deserialize JSON string into an instance of CreateThreadRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateThreadRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateThreadRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`messages` <- ApiClient$new()$deserializeObj(this_object$`messages`, "array[CreateMessageRequest]", loadNamespace("openapi"))
      self$`metadata` <- this_object$`metadata`
      self
    },
    #' Validate JSON input with respect to CreateThreadRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateThreadRequest and throw an exception if invalid
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
    #' @return String representation of CreateThreadRequest
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
# CreateThreadRequest$unlock()
#
## Below is an example to define the print function
# CreateThreadRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateThreadRequest$lock()

