#' Create a new ChatCompletionTokenLogprob
#'
#' @description
#' ChatCompletionTokenLogprob Class
#'
#' @docType class
#' @title ChatCompletionTokenLogprob
#' @description ChatCompletionTokenLogprob Class
#' @format An \code{R6Class} generator object
#' @field token The token. character
#' @field logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. numeric
#' @field bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. list(integer)
#' @field top_logprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned. list(\link{ChatCompletionTokenLogprobTopLogprobsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionTokenLogprob <- R6::R6Class(
  "ChatCompletionTokenLogprob",
  public = list(
    `token` = NULL,
    `logprob` = NULL,
    `bytes` = NULL,
    `top_logprobs` = NULL,

    #' @description
    #' Initialize a new ChatCompletionTokenLogprob class.
    #'
    #' @param token The token.
    #' @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    #' @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
    #' @param top_logprobs List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
    #' @param ... Other optional arguments.
    initialize = function(`token`, `logprob`, `bytes`, `top_logprobs`, ...) {
      if (!missing(`token`)) {
        if (!(is.character(`token`) && length(`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", `token`))
        }
        self$`token` <- `token`
      }
      if (!missing(`logprob`)) {
        self$`logprob` <- `logprob`
      }
      if (!missing(`bytes`)) {
        stopifnot(is.vector(`bytes`), length(`bytes`) != 0)
        sapply(`bytes`, function(x) stopifnot(is.character(x)))
        self$`bytes` <- `bytes`
      }
      if (!missing(`top_logprobs`)) {
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
    #' @return ChatCompletionTokenLogprob as a base R list.
    #' @examples
    #' # convert array of ChatCompletionTokenLogprob (x) to a data frame
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
    #' Convert ChatCompletionTokenLogprob to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ChatCompletionTokenLogprobObject <- list()
      if (!is.null(self$`token`)) {
        ChatCompletionTokenLogprobObject[["token"]] <-
          self$`token`
      }
      if (!is.null(self$`logprob`)) {
        ChatCompletionTokenLogprobObject[["logprob"]] <-
          self$`logprob`
      }
      if (!is.null(self$`bytes`)) {
        ChatCompletionTokenLogprobObject[["bytes"]] <-
          self$`bytes`
      }
      if (!is.null(self$`top_logprobs`)) {
        ChatCompletionTokenLogprobObject[["top_logprobs"]] <-
          lapply(self$`top_logprobs`, function(x) x$toSimpleType())
      }
      return(ChatCompletionTokenLogprobObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionTokenLogprob
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionTokenLogprob
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`token`)) {
        self$`token` <- this_object$`token`
      }
      if (!is.null(this_object$`logprob`)) {
        self$`logprob` <- this_object$`logprob`
      }
      if (!is.null(this_object$`bytes`)) {
        self$`bytes` <- ApiClient$new()$deserializeObj(this_object$`bytes`, "array[integer]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`top_logprobs`)) {
        self$`top_logprobs` <- ApiClient$new()$deserializeObj(this_object$`top_logprobs`, "array[ChatCompletionTokenLogprobTopLogprobsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ChatCompletionTokenLogprob in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionTokenLogprob
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionTokenLogprob
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`token` <- this_object$`token`
      self$`logprob` <- this_object$`logprob`
      self$`bytes` <- ApiClient$new()$deserializeObj(this_object$`bytes`, "array[integer]", loadNamespace("openapi"))
      self$`top_logprobs` <- ApiClient$new()$deserializeObj(this_object$`top_logprobs`, "array[ChatCompletionTokenLogprobTopLogprobsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionTokenLogprob and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `token`
      if (!is.null(input_json$`token`)) {
        if (!(is.character(input_json$`token`) && length(input_json$`token`) == 1)) {
          stop(paste("Error! Invalid data for `token`. Must be a string:", input_json$`token`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprob: the required field `token` is missing."))
      }
      # check the required field `logprob`
      if (!is.null(input_json$`logprob`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprob: the required field `logprob` is missing."))
      }
      # check the required field `bytes`
      if (!is.null(input_json$`bytes`)) {
        stopifnot(is.vector(input_json$`bytes`), length(input_json$`bytes`) != 0)
        tmp <- sapply(input_json$`bytes`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprob: the required field `bytes` is missing."))
      }
      # check the required field `top_logprobs`
      if (!is.null(input_json$`top_logprobs`)) {
        stopifnot(is.vector(input_json$`top_logprobs`), length(input_json$`top_logprobs`) != 0)
        tmp <- sapply(input_json$`top_logprobs`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprob: the required field `top_logprobs` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionTokenLogprob
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `token` is null
      if (is.null(self$`token`)) {
        return(FALSE)
      }

      # check if the required `logprob` is null
      if (is.null(self$`logprob`)) {
        return(FALSE)
      }

      # check if the required `top_logprobs` is null
      if (is.null(self$`top_logprobs`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `token` is null
      if (is.null(self$`token`)) {
        invalid_fields["token"] <- "Non-nullable required field `token` cannot be null."
      }

      # check if the required `logprob` is null
      if (is.null(self$`logprob`)) {
        invalid_fields["logprob"] <- "Non-nullable required field `logprob` cannot be null."
      }

      # check if the required `top_logprobs` is null
      if (is.null(self$`top_logprobs`)) {
        invalid_fields["top_logprobs"] <- "Non-nullable required field `top_logprobs` cannot be null."
      }

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
# ChatCompletionTokenLogprob$unlock()
#
## Below is an example to define the print function
# ChatCompletionTokenLogprob$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionTokenLogprob$lock()

