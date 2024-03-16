#' Create a new CreateChatCompletionResponseChoicesInner
#'
#' @description
#' CreateChatCompletionResponseChoicesInner Class
#'
#' @docType class
#' @title CreateChatCompletionResponseChoicesInner
#' @description CreateChatCompletionResponseChoicesInner Class
#' @format An \code{R6Class} generator object
#' @field index  integer [optional]
#' @field message  \link{ChatCompletionResponseMessage} [optional]
#' @field finish_reason  character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionResponseChoicesInner <- R6::R6Class(
  "CreateChatCompletionResponseChoicesInner",
  public = list(
    `index` = NULL,
    `message` = NULL,
    `finish_reason` = NULL,
    #' Initialize a new CreateChatCompletionResponseChoicesInner class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionResponseChoicesInner class.
    #'
    #' @param index index
    #' @param message message
    #' @param finish_reason finish_reason
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`index` = NULL, `message` = NULL, `finish_reason` = NULL, ...) {
      if (!is.null(`index`)) {
        if (!(is.numeric(`index`) && length(`index`) == 1)) {
          stop(paste("Error! Invalid data for `index`. Must be an integer:", `index`))
        }
        self$`index` <- `index`
      }
      if (!is.null(`message`)) {
        stopifnot(R6::is.R6(`message`))
        self$`message` <- `message`
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
    #' @return CreateChatCompletionResponseChoicesInner in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionResponseChoicesInnerObject <- list()
      if (!is.null(self$`index`)) {
        CreateChatCompletionResponseChoicesInnerObject[["index"]] <-
          self$`index`
      }
      if (!is.null(self$`message`)) {
        CreateChatCompletionResponseChoicesInnerObject[["message"]] <-
          self$`message`$toJSON()
      }
      if (!is.null(self$`finish_reason`)) {
        CreateChatCompletionResponseChoicesInnerObject[["finish_reason"]] <-
          self$`finish_reason`
      }
      CreateChatCompletionResponseChoicesInnerObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInner
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`index`)) {
        self$`index` <- this_object$`index`
      }
      if (!is.null(this_object$`message`)) {
        `message_object` <- ChatCompletionResponseMessage$new()
        `message_object`$fromJSON(jsonlite::toJSON(this_object$`message`, auto_unbox = TRUE, digits = NA))
        self$`message` <- `message_object`
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
    #' @return CreateChatCompletionResponseChoicesInner in JSON format
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
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
          %s
          ',
          jsonlite::toJSON(self$`message`$toJSON(), auto_unbox = TRUE, digits = NA)
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
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInner
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`index` <- this_object$`index`
      self$`message` <- ChatCompletionResponseMessage$new()$fromJSON(jsonlite::toJSON(this_object$`message`, auto_unbox = TRUE, digits = NA))
      if (!is.null(this_object$`finish_reason`) && !(this_object$`finish_reason` %in% c("stop", "length", "function_call"))) {
        stop(paste("Error! \"", this_object$`finish_reason`, "\" cannot be assigned to `finish_reason`. Must be \"stop\", \"length\", \"function_call\".", sep = ""))
      }
      self$`finish_reason` <- this_object$`finish_reason`
      self
    },
    #' Validate JSON input with respect to CreateChatCompletionResponseChoicesInner
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionResponseChoicesInner and throw an exception if invalid
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
    #' @return String representation of CreateChatCompletionResponseChoicesInner
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
# CreateChatCompletionResponseChoicesInner$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionResponseChoicesInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionResponseChoicesInner$lock()

