#' Create a new RunStepObjectLastError
#'
#' @description
#' The last error associated with this run step. Will be `null` if there are no errors.
#'
#' @docType class
#' @title RunStepObjectLastError
#' @description RunStepObjectLastError Class
#' @format An \code{R6Class} generator object
#' @field code One of `server_error` or `rate_limit_exceeded`. character
#' @field message A human-readable description of the error. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunStepObjectLastError <- R6::R6Class(
  "RunStepObjectLastError",
  public = list(
    `code` = NULL,
    `message` = NULL,
    #' Initialize a new RunStepObjectLastError class.
    #'
    #' @description
    #' Initialize a new RunStepObjectLastError class.
    #'
    #' @param code One of `server_error` or `rate_limit_exceeded`.
    #' @param message A human-readable description of the error.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`code`, `message`, ...) {
      if (!missing(`code`)) {
        if (!(`code` %in% c("server_error", "rate_limit_exceeded"))) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be \"server_error\", \"rate_limit_exceeded\".", sep = ""))
        }
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepObjectLastError in JSON format
    #' @export
    toJSON = function() {
      RunStepObjectLastErrorObject <- list()
      if (!is.null(self$`code`)) {
        RunStepObjectLastErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        RunStepObjectLastErrorObject[["message"]] <-
          self$`message`
      }
      RunStepObjectLastErrorObject
    },
    #' Deserialize JSON string into an instance of RunStepObjectLastError
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepObjectLastError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepObjectLastError
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        if (!is.null(this_object$`code`) && !(this_object$`code` %in% c("server_error", "rate_limit_exceeded"))) {
          stop(paste("Error! \"", this_object$`code`, "\" cannot be assigned to `code`. Must be \"server_error\", \"rate_limit_exceeded\".", sep = ""))
        }
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return RunStepObjectLastError in JSON format
    #' @export
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of RunStepObjectLastError
    #'
    #' @description
    #' Deserialize JSON string into an instance of RunStepObjectLastError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunStepObjectLastError
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`) && !(this_object$`code` %in% c("server_error", "rate_limit_exceeded"))) {
        stop(paste("Error! \"", this_object$`code`, "\" cannot be assigned to `code`. Must be \"server_error\", \"rate_limit_exceeded\".", sep = ""))
      }
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },
    #' Validate JSON input with respect to RunStepObjectLastError
    #'
    #' @description
    #' Validate JSON input with respect to RunStepObjectLastError and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `code`
      if (!is.null(input_json$`code`)) {
        if (!(is.character(input_json$`code`) && length(input_json$`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", input_json$`code`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObjectLastError: the required field `code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunStepObjectLastError: the required field `message` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunStepObjectLastError
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
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
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
# RunStepObjectLastError$unlock()
#
## Below is an example to define the print function
# RunStepObjectLastError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunStepObjectLastError$lock()

