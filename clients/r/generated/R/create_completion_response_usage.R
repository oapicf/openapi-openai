#' Create a new CreateCompletionResponseUsage
#'
#' @description
#' CreateCompletionResponseUsage Class
#'
#' @docType class
#' @title CreateCompletionResponseUsage
#' @description CreateCompletionResponseUsage Class
#' @format An \code{R6Class} generator object
#' @field prompt_tokens  integer
#' @field completion_tokens  integer
#' @field total_tokens  integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateCompletionResponseUsage <- R6::R6Class(
  "CreateCompletionResponseUsage",
  public = list(
    `prompt_tokens` = NULL,
    `completion_tokens` = NULL,
    `total_tokens` = NULL,
    #' Initialize a new CreateCompletionResponseUsage class.
    #'
    #' @description
    #' Initialize a new CreateCompletionResponseUsage class.
    #'
    #' @param prompt_tokens prompt_tokens
    #' @param completion_tokens completion_tokens
    #' @param total_tokens total_tokens
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`prompt_tokens`, `completion_tokens`, `total_tokens`, ...) {
      if (!missing(`prompt_tokens`)) {
        if (!(is.numeric(`prompt_tokens`) && length(`prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `prompt_tokens`. Must be an integer:", `prompt_tokens`))
        }
        self$`prompt_tokens` <- `prompt_tokens`
      }
      if (!missing(`completion_tokens`)) {
        if (!(is.numeric(`completion_tokens`) && length(`completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `completion_tokens`. Must be an integer:", `completion_tokens`))
        }
        self$`completion_tokens` <- `completion_tokens`
      }
      if (!missing(`total_tokens`)) {
        if (!(is.numeric(`total_tokens`) && length(`total_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `total_tokens`. Must be an integer:", `total_tokens`))
        }
        self$`total_tokens` <- `total_tokens`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponseUsage in JSON format
    #' @export
    toJSON = function() {
      CreateCompletionResponseUsageObject <- list()
      if (!is.null(self$`prompt_tokens`)) {
        CreateCompletionResponseUsageObject[["prompt_tokens"]] <-
          self$`prompt_tokens`
      }
      if (!is.null(self$`completion_tokens`)) {
        CreateCompletionResponseUsageObject[["completion_tokens"]] <-
          self$`completion_tokens`
      }
      if (!is.null(self$`total_tokens`)) {
        CreateCompletionResponseUsageObject[["total_tokens"]] <-
          self$`total_tokens`
      }
      CreateCompletionResponseUsageObject
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponseUsage
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseUsage
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`prompt_tokens`)) {
        self$`prompt_tokens` <- this_object$`prompt_tokens`
      }
      if (!is.null(this_object$`completion_tokens`)) {
        self$`completion_tokens` <- this_object$`completion_tokens`
      }
      if (!is.null(this_object$`total_tokens`)) {
        self$`total_tokens` <- this_object$`total_tokens`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateCompletionResponseUsage in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`prompt_tokens`)) {
          sprintf(
          '"prompt_tokens":
            %d
                    ',
          self$`prompt_tokens`
          )
        },
        if (!is.null(self$`completion_tokens`)) {
          sprintf(
          '"completion_tokens":
            %d
                    ',
          self$`completion_tokens`
          )
        },
        if (!is.null(self$`total_tokens`)) {
          sprintf(
          '"total_tokens":
            %d
                    ',
          self$`total_tokens`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateCompletionResponseUsage
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateCompletionResponseUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateCompletionResponseUsage
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`prompt_tokens` <- this_object$`prompt_tokens`
      self$`completion_tokens` <- this_object$`completion_tokens`
      self$`total_tokens` <- this_object$`total_tokens`
      self
    },
    #' Validate JSON input with respect to CreateCompletionResponseUsage
    #'
    #' @description
    #' Validate JSON input with respect to CreateCompletionResponseUsage and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `prompt_tokens`
      if (!is.null(input_json$`prompt_tokens`)) {
        if (!(is.numeric(input_json$`prompt_tokens`) && length(input_json$`prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `prompt_tokens`. Must be an integer:", input_json$`prompt_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseUsage: the required field `prompt_tokens` is missing."))
      }
      # check the required field `completion_tokens`
      if (!is.null(input_json$`completion_tokens`)) {
        if (!(is.numeric(input_json$`completion_tokens`) && length(input_json$`completion_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `completion_tokens`. Must be an integer:", input_json$`completion_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseUsage: the required field `completion_tokens` is missing."))
      }
      # check the required field `total_tokens`
      if (!is.null(input_json$`total_tokens`)) {
        if (!(is.numeric(input_json$`total_tokens`) && length(input_json$`total_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `total_tokens`. Must be an integer:", input_json$`total_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateCompletionResponseUsage: the required field `total_tokens` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateCompletionResponseUsage
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
      # check if the required `prompt_tokens` is null
      if (is.null(self$`prompt_tokens`)) {
        return(FALSE)
      }

      # check if the required `completion_tokens` is null
      if (is.null(self$`completion_tokens`)) {
        return(FALSE)
      }

      # check if the required `total_tokens` is null
      if (is.null(self$`total_tokens`)) {
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
      # check if the required `prompt_tokens` is null
      if (is.null(self$`prompt_tokens`)) {
        invalid_fields["prompt_tokens"] <- "Non-nullable required field `prompt_tokens` cannot be null."
      }

      # check if the required `completion_tokens` is null
      if (is.null(self$`completion_tokens`)) {
        invalid_fields["completion_tokens"] <- "Non-nullable required field `completion_tokens` cannot be null."
      }

      # check if the required `total_tokens` is null
      if (is.null(self$`total_tokens`)) {
        invalid_fields["total_tokens"] <- "Non-nullable required field `total_tokens` cannot be null."
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
# CreateCompletionResponseUsage$unlock()
#
## Below is an example to define the print function
# CreateCompletionResponseUsage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateCompletionResponseUsage$lock()

