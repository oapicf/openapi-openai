#' Create a new CreateChatCompletionResponseChoicesInnerLogprobs
#'
#' @description
#' Log probability information for the choice.
#'
#' @docType class
#' @title CreateChatCompletionResponseChoicesInnerLogprobs
#' @description CreateChatCompletionResponseChoicesInnerLogprobs Class
#' @format An \code{R6Class} generator object
#' @field content A list of message content tokens with log probability information. list(\link{ChatCompletionTokenLogprob})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionResponseChoicesInnerLogprobs <- R6::R6Class(
  "CreateChatCompletionResponseChoicesInnerLogprobs",
  public = list(
    `content` = NULL,

    #' @description
    #' Initialize a new CreateChatCompletionResponseChoicesInnerLogprobs class.
    #'
    #' @param content A list of message content tokens with log probability information.
    #' @param ... Other optional arguments.
    initialize = function(`content`, ...) {
      if (!missing(`content`)) {
        stopifnot(is.vector(`content`), length(`content`) != 0)
        sapply(`content`, function(x) stopifnot(R6::is.R6(x)))
        self$`content` <- `content`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionResponseChoicesInnerLogprobs in JSON format
    toJSON = function() {
      CreateChatCompletionResponseChoicesInnerLogprobsObject <- list()
      if (!is.null(self$`content`)) {
        CreateChatCompletionResponseChoicesInnerLogprobsObject[["content"]] <-
          lapply(self$`content`, function(x) x$toJSON())
      }
      CreateChatCompletionResponseChoicesInnerLogprobsObject
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInnerLogprobs
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`content`)) {
        self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[ChatCompletionTokenLogprob]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return CreateChatCompletionResponseChoicesInnerLogprobs in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`content`)) {
          sprintf(
          '"content":
          [%s]
',
          paste(sapply(self$`content`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInnerLogprobs
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[ChatCompletionTokenLogprob]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateChatCompletionResponseChoicesInnerLogprobs and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `content`
      if (!is.null(input_json$`content`)) {
        stopifnot(is.vector(input_json$`content`), length(input_json$`content`) != 0)
        tmp <- sapply(input_json$`content`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionResponseChoicesInnerLogprobs: the required field `content` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateChatCompletionResponseChoicesInnerLogprobs
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
# CreateChatCompletionResponseChoicesInnerLogprobs$unlock()
#
## Below is an example to define the print function
# CreateChatCompletionResponseChoicesInnerLogprobs$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateChatCompletionResponseChoicesInnerLogprobs$lock()

