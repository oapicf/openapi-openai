#' Create a new ChatCompletionNamedToolChoiceFunction
#'
#' @description
#' ChatCompletionNamedToolChoiceFunction Class
#'
#' @docType class
#' @title ChatCompletionNamedToolChoiceFunction
#' @description ChatCompletionNamedToolChoiceFunction Class
#' @format An \code{R6Class} generator object
#' @field name The name of the function to call. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionNamedToolChoiceFunction <- R6::R6Class(
  "ChatCompletionNamedToolChoiceFunction",
  public = list(
    `name` = NULL,
    #' Initialize a new ChatCompletionNamedToolChoiceFunction class.
    #'
    #' @description
    #' Initialize a new ChatCompletionNamedToolChoiceFunction class.
    #'
    #' @param name The name of the function to call.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`name`, ...) {
      if (!missing(`name`)) {
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionNamedToolChoiceFunction in JSON format
    #' @export
    toJSON = function() {
      ChatCompletionNamedToolChoiceFunctionObject <- list()
      if (!is.null(self$`name`)) {
        ChatCompletionNamedToolChoiceFunctionObject[["name"]] <-
          self$`name`
      }
      ChatCompletionNamedToolChoiceFunctionObject
    },
    #' Deserialize JSON string into an instance of ChatCompletionNamedToolChoiceFunction
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionNamedToolChoiceFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionNamedToolChoiceFunction
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        self$`name` <- this_object$`name`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionNamedToolChoiceFunction in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`name`)) {
          sprintf(
          '"name":
            "%s"
                    ',
          self$`name`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ChatCompletionNamedToolChoiceFunction
    #'
    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionNamedToolChoiceFunction
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionNamedToolChoiceFunction
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to ChatCompletionNamedToolChoiceFunction
    #'
    #' @description
    #' Validate JSON input with respect to ChatCompletionNamedToolChoiceFunction and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `name`
      if (!is.null(input_json$`name`)) {
        if (!(is.character(input_json$`name`) && length(input_json$`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", input_json$`name`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionNamedToolChoiceFunction: the required field `name` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionNamedToolChoiceFunction
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
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
      # check if the required `name` is null
      if (is.null(self$`name`)) {
        invalid_fields["name"] <- "Non-nullable required field `name` cannot be null."
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
# ChatCompletionNamedToolChoiceFunction$unlock()
#
## Below is an example to define the print function
# ChatCompletionNamedToolChoiceFunction$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionNamedToolChoiceFunction$lock()

