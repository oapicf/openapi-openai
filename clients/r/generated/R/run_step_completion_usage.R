#' Create a new RunStepCompletionUsage
#'
#' @description
#' Usage statistics related to the run step. This value will be `null` while the run step's status is `in_progress`.
#'
#' @docType class
#' @title RunStepCompletionUsage
#' @description RunStepCompletionUsage Class
#' @format An \code{R6Class} generator object
#' @field completion_tokens Number of completion tokens used over the course of the run step. integer
#' @field prompt_tokens Number of prompt tokens used over the course of the run step. integer
#' @field total_tokens Total number of tokens used (prompt + completion). integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepCompletionUsage <- R6::R6Class(
  "RunStepCompletionUsage",
  public = list(
    `completion_tokens` = NULL,
    `prompt_tokens` = NULL,
    `total_tokens` = NULL,

    #' @description
    #' Initialize a new RunStepCompletionUsage class.
    #'
    #' @param completion_tokens Number of completion tokens used over the course of the run step.
    #' @param prompt_tokens Number of prompt tokens used over the course of the run step.
    #' @param total_tokens Total number of tokens used (prompt + completion).
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
    #' To JSON String
    #'
    #' @return RunStepCompletionUsage in JSON format
    toJSON = function() {
      RunStepCompletionUsageObject <- list()
      if (!is.null(self$`completion_tokens`)) {
        RunStepCompletionUsageObject[["completion_tokens"]] <-
          self$`completion_tokens`
      }
      if (!is.null(self$`prompt_tokens`)) {
        RunStepCompletionUsageObject[["prompt_tokens"]] <-
          self$`prompt_tokens`
      }
      if (!is.null(self$`total_tokens`)) {
        RunStepCompletionUsageObject[["total_tokens"]] <-
          self$`total_tokens`
      }
      RunStepCompletionUsageObject
    },

    #' @description
    #' Deserialize JSON string into an instance of RunStepCompletionUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepCompletionUsage
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
    #' @return RunStepCompletionUsage in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`completion_tokens`)) {
          sprintf(
          '"completion_tokens":
            %d
                    ',
          self$`completion_tokens`
          )
        },
        if (!is.null(self$`prompt_tokens`)) {
          sprintf(
          '"prompt_tokens":
            %d
                    ',
          self$`prompt_tokens`
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

    #' @description
    #' Deserialize JSON string into an instance of RunStepCompletionUsage
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepCompletionUsage
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`completion_tokens` <- this_object$`completion_tokens`
      self$`prompt_tokens` <- this_object$`prompt_tokens`
      self$`total_tokens` <- this_object$`total_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunStepCompletionUsage and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunStepCompletionUsage: the required field `completion_tokens` is missing."))
      }
      # check the required field `prompt_tokens`
      if (!is.null(input_json$`prompt_tokens`)) {
        if (!(is.numeric(input_json$`prompt_tokens`) && length(input_json$`prompt_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `prompt_tokens`. Must be an integer:", input_json$`prompt_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepCompletionUsage: the required field `prompt_tokens` is missing."))
      }
      # check the required field `total_tokens`
      if (!is.null(input_json$`total_tokens`)) {
        if (!(is.numeric(input_json$`total_tokens`) && length(input_json$`total_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `total_tokens`. Must be an integer:", input_json$`total_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepCompletionUsage: the required field `total_tokens` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepCompletionUsage
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
# RunStepCompletionUsage$unlock()
#
## Below is an example to define the print function
# RunStepCompletionUsage$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepCompletionUsage$lock()

