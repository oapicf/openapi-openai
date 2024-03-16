#' Create a new ChatCompletionStreamResponseDelta
#'
#' @description
#' ChatCompletionStreamResponseDelta Class
#'
#' @docType class
#' @title ChatCompletionStreamResponseDelta
#' @description ChatCompletionStreamResponseDelta Class
#' @format An \code{R6Class} generator object
#' @field role The role of the author of this message. character [optional]
#' @field content The contents of the chunk message. character [optional]
#' @field function_call  \link{ChatCompletionRequestMessageFunctionCall} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionStreamResponseDelta <- R6::R6Class(
  "ChatCompletionStreamResponseDelta",
  public = list(
    `role` = NULL,
    `content` = NULL,
    `function_call` = NULL,
    #' Initialize a new ChatCompletionStreamResponseDelta class.
    #'
    #' @description
    #' Initialize a new ChatCompletionStreamResponseDelta class.
    #'
    #' @param role The role of the author of this message.
    #' @param content The contents of the chunk message.
    #' @param function_call function_call
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`role` = NULL, `content` = NULL, `function_call` = NULL, ...) {
      if (!is.null(`role`)) {
        if (!(`role` %in% c("system", "user", "assistant", "function"))) {
          stop(paste("Error! \"", `role`, "\" cannot be assigned to `role`. Must be \"system\", \"user\", \"assistant\", \"function\".", sep = ""))
        }
        if (!(is.character(`role`) && length(`role`) == 1)) {
          stop(paste("Error! Invalid data for `role`. Must be a string:", `role`))
        }
        self$`role` <- `role`
      }
      if (!is.null(`content`)) {
        if (!(is.character(`content`) && length(`content`) == 1)) {
          stop(paste("Error! Invalid data for `content`. Must be a string:", `content`))
        }
        self$`content` <- `content`
      }
      if (!is.null(`function_call`)) {
        stopifnot(R6::is.R6(`function_call`))
        self$`function_call` <- `function_call`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionStreamResponseDelta in JSON format
    #' @export
    toJSON = function() {
      ChatCompletionStreamResponseDeltaObject <- list()
      if (!is.null(self$`role`)) {
        ChatCompletionStreamResponseDeltaObject[["role"]] <-
          self$`role`
      }
      if (!is.null(self$`content`)) {
        ChatCompletionStreamResponseDeltaObject[["content"]] <-
          self$`content`
      }
      if (!is.null(self$`function_call`)) {
        ChatCompletionStreamResponseDeltaObject[["function_call"]] <-
          self$`function_call`$toJSON()
      }
      ChatCompletionStreamResponseDeltaObject
    },
    #' Deserialize JSON string into an instance of ChatCompletionStreamResponseDelta
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionStreamResponseDelta
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionStreamResponseDelta
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`)) {
        if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("system", "user", "assistant", "function"))) {
          stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"system\", \"user\", \"assistant\", \"function\".", sep = ""))
        }
        self$`role` <- this_object$`role`
      }
      if (!is.null(this_object$`content`)) {
        self$`content` <- this_object$`content`
      }
      if (!is.null(this_object$`function_call`)) {
        `function_call_object` <- ChatCompletionRequestMessageFunctionCall$new()
        `function_call_object`$fromJSON(jsonlite::toJSON(this_object$`function_call`, auto_unbox = TRUE, digits = NA))
        self$`function_call` <- `function_call_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionStreamResponseDelta in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`role`)) {
          sprintf(
          '"role":
            "%s"
                    ',
          self$`role`
          )
        },
        if (!is.null(self$`content`)) {
          sprintf(
          '"content":
            "%s"
                    ',
          self$`content`
          )
        },
        if (!is.null(self$`function_call`)) {
          sprintf(
          '"function_call":
          %s
          ',
          jsonlite::toJSON(self$`function_call`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatCompletionStreamResponseDelta
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionStreamResponseDelta
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionStreamResponseDelta
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`role`) && !(this_object$`role` %in% c("system", "user", "assistant", "function"))) {
        stop(paste("Error! \"", this_object$`role`, "\" cannot be assigned to `role`. Must be \"system\", \"user\", \"assistant\", \"function\".", sep = ""))
      }
      self$`role` <- this_object$`role`
      self$`content` <- this_object$`content`
      self$`function_call` <- ChatCompletionRequestMessageFunctionCall$new()$fromJSON(jsonlite::toJSON(this_object$`function_call`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to ChatCompletionStreamResponseDelta
    #'
    #' @description
    #' Validate JSON input with respect to ChatCompletionStreamResponseDelta and throw an exception if invalid
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
    #' @return String representation of ChatCompletionStreamResponseDelta
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
# ChatCompletionStreamResponseDelta$unlock()
#
## Below is an example to define the print function
# ChatCompletionStreamResponseDelta$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionStreamResponseDelta$lock()

