#' Create a new CreateCompletionResponseChoicesInnerLogprobs
#'
#' @description
#' CreateCompletionResponseChoicesInnerLogprobs Class
#'
#' @docType class
#' @title CreateCompletionResponseChoicesInnerLogprobs
#' @description CreateCompletionResponseChoicesInnerLogprobs Class
#' @format An \code{R6Class} generator object
#' @field text_offset  list(integer) [optional]
#' @field token_logprobs  list(numeric) [optional]
#' @field tokens  list(character) [optional]
#' @field top_logprobs  list(named list(numeric)) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateCompletionResponseChoicesInnerLogprobs <- R6::R6Class(
  "CreateCompletionResponseChoicesInnerLogprobs",
  public = list(
    `text_offset` = NULL,
    `token_logprobs` = NULL,
    `tokens` = NULL,
    `top_logprobs` = NULL,

    #' @description
    #' Initialize a new CreateCompletionResponseChoicesInnerLogprobs class.
    #'
    #' @param text_offset text_offset
    #' @param token_logprobs token_logprobs
    #' @param tokens tokens
    #' @param top_logprobs top_logprobs
    #' @param ... Other optional arguments.
    initialize = function(`text_offset` = NULL, `token_logprobs` = NULL, `tokens` = NULL, `top_logprobs` = NULL, ...) {
      if (!is.null(`text_offset`)) {
        stopifnot(is.vector(`text_offset`), length(`text_offset`) != 0)
        sapply(`text_offset`, function(x) stopifnot(is.character(x)))
        self$`text_offset` <- `text_offset`
      }
      if (!is.null(`token_logprobs`)) {
        stopifnot(is.vector(`token_logprobs`), length(`token_logprobs`) != 0)
        sapply(`token_logprobs`, function(x) stopifnot(is.character(x)))
        self$`token_logprobs` <- `token_logprobs`
      }
      if (!is.null(`tokens`)) {
        stopifnot(is.vector(`tokens`), length(`tokens`) != 0)
        sapply(`tokens`, function(x) stopifnot(is.character(x)))
        self$`tokens` <- `tokens`
      }
      if (!is.null(`top_logprobs`)) {
        stopifnot(is.vector(`top_logprobs`), length(`top_logprobs`) != 0)
        sapply(`top_logprobs`, function(x) stopifnot(R6::is.R6(x)))
        self$`top_logprobs` <- `top_logprobs`
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
    #' @return CreateCompletionResponseChoicesInnerLogprobs as a base R list.
    #' @examples
    #' # convert array of CreateCompletionResponseChoicesInnerLogprobs (x) to a data frame
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
    #' Convert CreateCompletionResponseChoicesInnerLogprobs to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateCompletionResponseChoicesInnerLogprobsObject <- list()
      if (!is.null(self$`text_offset`)) {
        CreateCompletionResponseChoicesInnerLogprobsObject[["text_offset"]] <-
          self$`text_offset`
      }
      if (!is.null(self$`token_logprobs`)) {
        CreateCompletionResponseChoicesInnerLogprobsObject[["token_logprobs"]] <-
          self$`token_logprobs`
      }
      if (!is.null(self$`tokens`)) {
        CreateCompletionResponseChoicesInnerLogprobsObject[["tokens"]] <-
          self$`tokens`
      }
      if (!is.null(self$`top_logprobs`)) {
        CreateCompletionResponseChoicesInnerLogprobsObject[["top_logprobs"]] <-
          lapply(self$`top_logprobs`, function(x) x$toSimpleType())
      }
      return(CreateCompletionResponseChoicesInnerLogprobsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseChoicesInnerLogprobs
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`text_offset`)) {
        self$`text_offset` <- ApiClient$new()$deserializeObj(this_object$`text_offset`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`token_logprobs`)) {
        self$`token_logprobs` <- ApiClient$new()$deserializeObj(this_object$`token_logprobs`, "array[numeric]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`tokens`)) {
        self$`tokens` <- ApiClient$new()$deserializeObj(this_object$`tokens`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`top_logprobs`)) {
        self$`top_logprobs` <- ApiClient$new()$deserializeObj(this_object$`top_logprobs`, "array[map(numeric)]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateCompletionResponseChoicesInnerLogprobs in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseChoicesInnerLogprobs
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`text_offset` <- ApiClient$new()$deserializeObj(this_object$`text_offset`, "array[integer]", loadNamespace("openapi"))
      self$`token_logprobs` <- ApiClient$new()$deserializeObj(this_object$`token_logprobs`, "array[numeric]", loadNamespace("openapi"))
      self$`tokens` <- ApiClient$new()$deserializeObj(this_object$`tokens`, "array[character]", loadNamespace("openapi"))
      self$`top_logprobs` <- ApiClient$new()$deserializeObj(this_object$`top_logprobs`, "array[map(numeric)]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateCompletionResponseChoicesInnerLogprobs and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateCompletionResponseChoicesInnerLogprobs
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
# CreateCompletionResponseChoicesInnerLogprobs$unlock()
#
## Below is an example to define the print function
# CreateCompletionResponseChoicesInnerLogprobs$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateCompletionResponseChoicesInnerLogprobs$lock()

