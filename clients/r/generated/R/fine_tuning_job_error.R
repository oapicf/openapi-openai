#' Create a new FineTuningJobError
#'
#' @description
#' For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
#'
#' @docType class
#' @title FineTuningJobError
#' @description FineTuningJobError Class
#' @format An \code{R6Class} generator object
#' @field code A machine-readable error code. character
#' @field message A human-readable error message. character
#' @field param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJobError <- R6::R6Class(
  "FineTuningJobError",
  public = list(
    `code` = NULL,
    `message` = NULL,
    `param` = NULL,

    #' @description
    #' Initialize a new FineTuningJobError class.
    #'
    #' @param code A machine-readable error code.
    #' @param message A human-readable error message.
    #' @param param The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
    #' @param ... Other optional arguments.
    initialize = function(`code`, `message`, `param`, ...) {
      if (!missing(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!missing(`param`)) {
        if (!(is.character(`param`) && length(`param`) == 1)) {
          stop(paste("Error! Invalid data for `param`. Must be a string:", `param`))
        }
        self$`param` <- `param`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobError in JSON format
    toJSON = function() {
      FineTuningJobErrorObject <- list()
      if (!is.null(self$`code`)) {
        FineTuningJobErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        FineTuningJobErrorObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`param`)) {
        FineTuningJobErrorObject[["param"]] <-
          self$`param`
      }
      FineTuningJobErrorObject
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobError
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`param`)) {
        self$`param` <- this_object$`param`
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return FineTuningJobError in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`code`)) {
          sprintf(
          '"code":
            "%s"
                    ',
          self$`code`
          )
        },
        if (!is.null(self$`message`)) {
          sprintf(
          '"message":
            "%s"
                    ',
          self$`message`
          )
        },
        if (!is.null(self$`param`)) {
          sprintf(
          '"param":
            "%s"
                    ',
          self$`param`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobError
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self$`param` <- this_object$`param`
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningJobError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.character(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobError: the required field `code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobError: the required field `message` is missing."))
      }
      # check the required field `param`
      if (!is.null(input_json$`param`)) {
        if (!(is.character(input_json$`param`) && length(input_json$`param`) == 1)) {
          stop(paste("Error! Invalid data for `param`. Must be a string:", input_json$`param`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobError: the required field `param` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJobError
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        return(FALSE)
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
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
      # check if the required `code` is null
      if (is.null(self$`code`)) {
        invalid_fields["code"] <- "Non-nullable required field `code` cannot be null."
      }

      # check if the required `message` is null
      if (is.null(self$`message`)) {
        invalid_fields["message"] <- "Non-nullable required field `message` cannot be null."
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
# FineTuningJobError$unlock()
#
## Below is an example to define the print function
# FineTuningJobError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJobError$lock()

