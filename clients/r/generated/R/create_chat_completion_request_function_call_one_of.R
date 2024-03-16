#' Create a new CreateChatCompletionRequestFunctionCallOneOf
#'
#' @description
#' CreateChatCompletionRequestFunctionCallOneOf Class
#'
#' @docType class
#' @title CreateChatCompletionRequestFunctionCallOneOf
#' @description CreateChatCompletionRequestFunctionCallOneOf Class
#' @format An \code{R6Class} generator object
#' @field name The name of the function to call. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionRequestFunctionCallOneOf <- R6::R6Class(
  "CreateChatCompletionRequestFunctionCallOneOf",
  public = list(
    `name` = NULL,
    #' Initialize a new CreateChatCompletionRequestFunctionCallOneOf class.
    #'
    #' @description
    #' Initialize a new CreateChatCompletionRequestFunctionCallOneOf class.
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
    #' @return CreateChatCompletionRequestFunctionCallOneOf in JSON format
    #' @export
    toJSON = function() {
      CreateChatCompletionRequestFunctionCallOneOfObject <- list()
      if (!is.null(self$`name`)) {
        CreateChatCompletionRequestFunctionCallOneOfObject[["name"]] <-
          self$`name`
      }
      CreateChatCompletionRequestFunctionCallOneOfObject
    },
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestFunctionCallOneOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestFunctionCallOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionRequestFunctionCallOneOf
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
    #' @return CreateChatCompletionRequestFunctionCallOneOf in JSON format
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
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestFunctionCallOneOf
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionRequestFunctionCallOneOf
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionRequestFunctionCallOneOf
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`name` <- this_object$`name`
      self
    },
    #' Validate JSON input with respect to CreateChatCompletionRequestFunctionCallOneOf
    #'
    #' @description
    #' Validate JSON input with respect to CreateChatCompletionRequestFunctionCallOneOf and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionRequestFunctionCallOneOf: the required field `name` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionRequestFunctionCallOneOf
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
# CreateChatCompletionRequestFunctionCallOneOf$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionRequestFunctionCallOneOf$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionRequestFunctionCallOneOf$lock()

