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
#' @field refusal A list of message refusal tokens with log probability information. list(\link{ChatCompletionTokenLogprob})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateChatCompletionResponseChoicesInnerLogprobs <- R6::R6Class(
  "CreateChatCompletionResponseChoicesInnerLogprobs",
  public = list(
    `content` = NULL,
    `refusal` = NULL,

    #' @description
    #' Initialize a new CreateChatCompletionResponseChoicesInnerLogprobs class.
    #'
    #' @param content A list of message content tokens with log probability information.
    #' @param refusal A list of message refusal tokens with log probability information.
    #' @param ... Other optional arguments.
    initialize = function(`content`, `refusal`, ...) {
      if (!missing(`content`)) {
        stopifnot(is.vector(`content`), length(`content`) != 0)
        sapply(`content`, function(x) stopifnot(R6::is.R6(x)))
        self$`content` <- `content`
      }
      if (!missing(`refusal`)) {
        stopifnot(is.vector(`refusal`), length(`refusal`) != 0)
        sapply(`refusal`, function(x) stopifnot(R6::is.R6(x)))
        self$`refusal` <- `refusal`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return CreateChatCompletionResponseChoicesInnerLogprobs as a base R list.
    #' @examples
    #' # convert array of CreateChatCompletionResponseChoicesInnerLogprobs (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert CreateChatCompletionResponseChoicesInnerLogprobs to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateChatCompletionResponseChoicesInnerLogprobsObject <- list()
      if (!is.null(self$`content`)) {
        CreateChatCompletionResponseChoicesInnerLogprobsObject[["content"]] <-
          lapply(self$`content`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`refusal`)) {
        CreateChatCompletionResponseChoicesInnerLogprobsObject[["refusal"]] <-
          lapply(self$`refusal`, function(x) x$toSimpleType())
      }
      return(CreateChatCompletionResponseChoicesInnerLogprobsObject)
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
      if (!is.null(this_object$`refusal`)) {
        self$`refusal` <- ApiClient$new()$deserializeObj(this_object$`refusal`, "array[ChatCompletionTokenLogprob]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateChatCompletionResponseChoicesInnerLogprobs in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateChatCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateChatCompletionResponseChoicesInnerLogprobs
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`content` <- ApiClient$new()$deserializeObj(this_object$`content`, "array[ChatCompletionTokenLogprob]", loadNamespace("openapi"))
      self$`refusal` <- ApiClient$new()$deserializeObj(this_object$`refusal`, "array[ChatCompletionTokenLogprob]", loadNamespace("openapi"))
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
      # check the required field `refusal`
      if (!is.null(input_json$`refusal`)) {
        stopifnot(is.vector(input_json$`refusal`), length(input_json$`refusal`) != 0)
        tmp <- sapply(input_json$`refusal`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateChatCompletionResponseChoicesInnerLogprobs: the required field `refusal` is missing."))
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

