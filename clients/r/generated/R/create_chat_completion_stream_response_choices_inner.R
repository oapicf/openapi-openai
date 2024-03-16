#' Create a new CreateChatCompletionStreamResponseChoicesInner
#'
#' @description
#' CreateChatCompletionStreamResponseChoicesInner Class
#'
#' @docType class
#' @title CreateChatCompletionStreamResponseChoicesInner
#' @description CreateChatCompletionStreamResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field index  integer [optional]
#' @field delta  \link{ChatCompletionStreamResponseDelta} [optional]
#' @field finish_reason  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionStreamResponseChoicesInner <- R6::R6Class(
  "CreateChatCompletionStreamResponseChoicesInner",
  public = list(
    `index` = NULL,
    `delta` = NULL,
    `finish_reason` = NULL,
    #' Initialize a new CreateChatCompletionStreamResponseChoicesInner class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionStreamResponseChoicesInner class.
    #'
    #' @param index index
    #' @param delta delta
    #' @param finish_reason finish_reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`index` = NULL, `delta` = NULL, `finish_reason` = NULL, ...) {
      if (!is.null(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!is.null(`delta`)) {
        stopifnot(R6::is.R6(`delta`))
        self$`delta` <- `delta`
      }
      if (!is.null(`finish_reason`)) {
        if (!(`finish_reason` %in% c("stop", "length", "function_call"))) {
          stop(paste("Error! \"", `finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\".", sep = ""))
        }
        if (!(is.character(`finish_reason`) && length(`finish_reason`) == 1)) {
          stop(paste("Error! Invalid data for `finish_reason`. Must be a string:", `finish_reason`))
        }
        self$`finish_reason` <- `finish_reason`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponseChoicesInner in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionStreamResponseChoicesInnerObject <- list()
      if (!is.null(self$`index`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`delta`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["delta"]] <-
          self$`delta`$toJSON()
      }
      if (!is.null(self$`finish_reason`)) {
        CreateChatCompletionStreamResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      CreateChatCompletionStreamResponseChoicesInnerObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponseChoicesInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`delta`)) {
        `delta_object` <- ChatCompletionStreamResponseDelta$new()
        `delta_object`$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
        self$`delta` <- `delta_object`
      }
      if (!is.null(this_object$`finish_reason`)) {
        if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "function_call"))) {
          stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\".", sep = ""))
        }
        self$`finish_reason` <- this_object$`finish_reason`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionStreamResponseChoicesInner in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`index`)) {
          sprintf(
          '"index":
            %d
                    ',
          self$`index`
          )
        },
        if (!is.null(self$`delta`)) {
          sprintf(
          '"delta":
          %s
          ',
          jsonlite::toJSON(self$`delta`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`finish_reason`)) {
          sprintf(
          '"finish_reason":
            "%s"
                    ',
          self$`finish_reason`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionStreamResponseChoicesInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`delta` <- ChatCompletionStreamResponseDelta$new()$fromJSON(jsonlite::toJSON(this_object$`delta`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "function_call"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self
    },
    #' Validate JSON input with respect to CreateChatCompletionStreamResponseChoicesInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionStreamResponseChoicesInner and throw an exception if invalid
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
    #' @return String representation of CreateChatCompletionStreamResponseChoicesInner
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
# CreateChatCompletionStreamResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionStreamResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionStreamResponseChoicesInner$lock()

