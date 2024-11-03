#' Create a new ChatCompletionTokenLogprobTopLogprobsInner
#'
#' @description
#' ChatCompletionTokenLogprobTopLogprobsInner Class
#'
#' @docType class
#' @title ChatCompletionTokenLogprobTopLogprobsInner
#' @description ChatCompletionTokenLogprobTopLogprobsInner Class
#' @format An \code{R6Class} generator object
#' @field token The token. character
#' @field logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely. numeric
#' @field bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token. list(integer)
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ChatCompletionTokenLogprobTopLogprobsInner <- R6::R6Class(
  "ChatCompletionTokenLogprobTopLogprobsInner",
  public = list(
    `token` = NULL,
    `logprob` = NULL,
    `bytes` = NULL,

    #' @description
    #' Initialize a new ChatCompletionTokenLogprobTopLogprobsInner class.
    #'
    #' @param token The token.
    #' @param logprob The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    #' @param bytes A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
    #' @param ... Other optional arguments.
    initialize = function(`token`, `logprob`, `bytes`, ...) {
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
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionTokenLogprobTopLogprobsInner in JSON format
    toJSON = function() {
      ChatCompletionTokenLogprobTopLogprobsInnerObject <- list()
      if (!is.null(self$`token`)) {
        ChatCompletionTokenLogprobTopLogprobsInnerObject[["token"]] <-
          self$`token`
      }
      if (!is.null(self$`logprob`)) {
        ChatCompletionTokenLogprobTopLogprobsInnerObject[["logprob"]] <-
          self$`logprob`
      }
      if (!is.null(self$`bytes`)) {
        ChatCompletionTokenLogprobTopLogprobsInnerObject[["bytes"]] <-
          self$`bytes`
      }
      ChatCompletionTokenLogprobTopLogprobsInnerObject
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionTokenLogprobTopLogprobsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionTokenLogprobTopLogprobsInner
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
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return ChatCompletionTokenLogprobTopLogprobsInner in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`token`)) {
          sprintf(
          '"token":
            "%s"
                    ',
          self$`token`
          )
        },
        if (!is.null(self$`logprob`)) {
          sprintf(
          '"logprob":
            %d
                    ',
          self$`logprob`
          )
        },
        if (!is.null(self$`bytes`)) {
          sprintf(
          '"bytes":
             [%s]
          ',
          paste(unlist(lapply(self$`bytes`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of ChatCompletionTokenLogprobTopLogprobsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of ChatCompletionTokenLogprobTopLogprobsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`token` <- this_object$`token`
      self$`logprob` <- this_object$`logprob`
      self$`bytes` <- ApiClient$new()$deserializeObj(this_object$`bytes`, "array[integer]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to ChatCompletionTokenLogprobTopLogprobsInner and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprobTopLogprobsInner: the required field `token` is missing."))
      }
      # check the required field `logprob`
      if (!is.null(input_json$`logprob`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprobTopLogprobsInner: the required field `logprob` is missing."))
      }
      # check the required field `bytes`
      if (!is.null(input_json$`bytes`)) {
        stopifnot(is.vector(input_json$`bytes`), length(input_json$`bytes`) != 0)
        tmp <- sapply(input_json$`bytes`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ChatCompletionTokenLogprobTopLogprobsInner: the required field `bytes` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ChatCompletionTokenLogprobTopLogprobsInner
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
# ChatCompletionTokenLogprobTopLogprobsInner$unlock()
#
## Below is an example to define the print function
# ChatCompletionTokenLogprobTopLogprobsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ChatCompletionTokenLogprobTopLogprobsInner$lock()

