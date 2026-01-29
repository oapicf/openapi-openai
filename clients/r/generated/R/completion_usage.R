#' Create a new CompletionUsage
#'
#' @description
#' Usage statistics for the completion request.
#'
#' @docType class
#' @title CompletionUsage
#' @description CompletionUsage Class
#' @format An \code{R6Class} generator object
#' @field completion_tokens Number of tokens in the generated completion. integer
#' @field prompt_tokens Number of tokens in the prompt. integer
#' @field total_tokens Total number of tokens used in the request (prompt + completion). integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CompletionUsage <- R6::R6Class(
  "CompletionUsage",
  public = list(
    `completion_tokens` = NULL,
    `prompt_tokens` = NULL,
    `total_tokens` = NULL,

    #' @description
    #' Initialize a new CompletionUsage class.
    #'
    #' @param completion_tokens Number of tokens in the generated completion.
    #' @param prompt_tokens Number of tokens in the prompt.
    #' @param total_tokens Total number of tokens used in the request (prompt + completion).
    #' @param ... Other optional arguments.
    initialize = function(`completion_tokens`, `prompt_tokens`, `total_tokens`, ...) {
      if (!missing(`completion_tokens`)) {
        if (!(is.numeric(`completion_tokens`) && length(`completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `completion_tokens`. Must be an integer:", `completion_tokens`))
        }
        self$`completion_tokens` <- `completion_tokens`
      }
      if (!missing(`prompt_tokens`)) {
        if (!(is.numeric(`prompt_tokens`) && length(`prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `prompt_tokens`. Must be an integer:", `prompt_tokens`))
        }
        self$`prompt_tokens` <- `prompt_tokens`
      }
      if (!missing(`total_tokens`)) {
        if (!(is.numeric(`total_tokens`) && length(`total_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `total_tokens`. Must be an integer:", `total_tokens`))
        }
        self$`total_tokens` <- `total_tokens`
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
    #' @return CompletionUsage as a base R list.
    #' @examples
    #' # convert array of CompletionUsage (x) to a data frame
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
    #' Convert CompletionUsage to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CompletionUsageObject <- list()
      if (!is.null(self$`completion_tokens`)) {
        CompletionUsageObject[["completion_tokens"]] <-
          self$`completion_tokens`
      }
      if (!is.null(self$`prompt_tokens`)) {
        CompletionUsageObject[["prompt_tokens"]] <-
          self$`prompt_tokens`
      }
      if (!is.null(self$`total_tokens`)) {
        CompletionUsageObject[["total_tokens"]] <-
          self$`total_tokens`
      }
      return(CompletionUsageObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CompletionUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of CompletionUsage
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`completion_tokens`)) {
        self$`completion_tokens` <- this_object$`completion_tokens`
      }
      if (!is.null(this_object$`prompt_tokens`)) {
        self$`prompt_tokens` <- this_object$`prompt_tokens`
      }
      if (!is.null(this_object$`total_tokens`)) {
        self$`total_tokens` <- this_object$`total_tokens`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CompletionUsage in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CompletionUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of CompletionUsage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`completion_tokens` <- this_object$`completion_tokens`
      self$`prompt_tokens` <- this_object$`prompt_tokens`
      self$`total_tokens` <- this_object$`total_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to CompletionUsage and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `completion_tokens`
      if (!is.null(input_json$`completion_tokens`)) {
        if (!(is.numeric(input_json$`completion_tokens`) && length(input_json$`completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `completion_tokens`. Must be an integer:", input_json$`completion_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CompletionUsage: the required field `completion_tokens` is missing."))
      }
      # check the required field `prompt_tokens`
      if (!is.null(input_json$`prompt_tokens`)) {
        if (!(is.numeric(input_json$`prompt_tokens`) && length(input_json$`prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `prompt_tokens`. Must be an integer:", input_json$`prompt_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CompletionUsage: the required field `prompt_tokens` is missing."))
      }
      # check the required field `total_tokens`
      if (!is.null(input_json$`total_tokens`)) {
        if (!(is.numeric(input_json$`total_tokens`) && length(input_json$`total_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `total_tokens`. Must be an integer:", input_json$`total_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CompletionUsage: the required field `total_tokens` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CompletionUsage
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `completion_tokens` is null
      if (is.null(self$`completion_tokens`)) {
        return(FALSE)
      }

      # check if the required `prompt_tokens` is null
      if (is.null(self$`prompt_tokens`)) {
        return(FALSE)
      }

      # check if the required `total_tokens` is null
      if (is.null(self$`total_tokens`)) {
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
      # check if the required `completion_tokens` is null
      if (is.null(self$`completion_tokens`)) {
        invalid_fields["completion_tokens"] <- "Non-nullable required field `completion_tokens` cannot be null."
      }

      # check if the required `prompt_tokens` is null
      if (is.null(self$`prompt_tokens`)) {
        invalid_fields["prompt_tokens"] <- "Non-nullable required field `prompt_tokens` cannot be null."
      }

      # check if the required `total_tokens` is null
      if (is.null(self$`total_tokens`)) {
        invalid_fields["total_tokens"] <- "Non-nullable required field `total_tokens` cannot be null."
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
# CompletionUsage$unlock()
#
## Below is an example to define the print function
# CompletionUsage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CompletionUsage$lock()

