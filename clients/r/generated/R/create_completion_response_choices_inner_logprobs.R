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
    #' Initialize a new CreateCompletionResponseChoicesInnerLogprobs class.
    #'
    #' @description
    #' Initialize a new CreateCompletionResponseChoicesInnerLogprobs class.
    #'
    #' @param text_offset text_offset
    #' @param token_logprobs token_logprobs
    #' @param tokens tokens
    #' @param top_logprobs top_logprobs
    #' @param ... Other optional arguments.
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponseChoicesInnerLogprobs in JSON format
    #' @export
    toJSON = function() {
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
          lapply(self$`top_logprobs`, function(x) x$toJSON())
      }
      CreateCompletionResponseChoicesInnerLogprobsObject
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseChoicesInnerLogprobs
    #' @export
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
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponseChoicesInnerLogprobs in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`text_offset`)) {
          sprintf(
          '"text_offset":
             [%s]
          ',
          paste(unlist(lapply(self$`text_offset`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`token_logprobs`)) {
          sprintf(
          '"token_logprobs":
             [%s]
          ',
          paste(unlist(lapply(self$`token_logprobs`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`tokens`)) {
          sprintf(
          '"tokens":
             [%s]
          ',
          paste(unlist(lapply(self$`tokens`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        },
        if (!is.null(self$`top_logprobs`)) {
          sprintf(
          '"top_logprobs":
          [%s]
',
          paste(sapply(self$`top_logprobs`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseChoicesInnerLogprobs
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`text_offset` <- ApiClient$new()$deserializeObj(this_object$`text_offset`, "array[integer]", loadNamespace("openapi"))
      self$`token_logprobs` <- ApiClient$new()$deserializeObj(this_object$`token_logprobs`, "array[numeric]", loadNamespace("openapi"))
      self$`tokens` <- ApiClient$new()$deserializeObj(this_object$`tokens`, "array[character]", loadNamespace("openapi"))
      self$`top_logprobs` <- ApiClient$new()$deserializeObj(this_object$`top_logprobs`, "array[map(numeric)]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CreateCompletionResponseChoicesInnerLogprobs
    #'
    #' @description
    #' Validate JSON input with respect to CreateCompletionResponseChoicesInnerLogprobs and throw an exception if invalid
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
    #' @return String representation of CreateCompletionResponseChoicesInnerLogprobs
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
# CreateCompletionResponseChoicesInnerLogprobs$unlock()
#
## Below is an example to define the print function
# CreateCompletionResponseChoicesInnerLogprobs$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateCompletionResponseChoicesInnerLogprobs$lock()

