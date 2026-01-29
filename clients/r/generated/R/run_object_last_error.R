#' Create a new RunObjectLastError
#'
#' @description
#' The last error associated with this run. Will be `null` if there are no errors.
#'
#' @docType class
#' @title RunObjectLastError
#' @description RunObjectLastError Class
#' @format An \code{R6Class} generator object
#' @field code One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`. character
#' @field message A human-readable description of the error. character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RunObjectLastError <- R6::R6Class(
  "RunObjectLastError",
  public = list(
    `code` = NULL,
    `message` = NULL,

    #' @description
    #' Initialize a new RunObjectLastError class.
    #'
    #' @param code One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
    #' @param message A human-readable description of the error.
    #' @param ... Other optional arguments.
    initialize = function(`code`, `message`, ...) {
      if (!missing(`code`)) {
        if (!(`code` %in% c("server_error", "rate_limit_exceeded", "invalid_prompt"))) {
          stop(paste("Error! \"", `code`, "\" cannot be assigned to `code`. Must be \"server_error\", \"rate_limit_exceeded\", \"invalid_prompt\".", sep = ""))
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
    #' @return RunObjectLastError as a base R list.
    #' @examples
    #' # convert array of RunObjectLastError (x) to a data frame
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
    #' Convert RunObjectLastError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RunObjectLastErrorObject <- list()
      if (!is.null(self$`code`)) {
        RunObjectLastErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        RunObjectLastErrorObject[["message"]] <-
          self$`message`
      }
      return(RunObjectLastErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RunObjectLastError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectLastError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`)) {
        if (!is.null(this_object$`code`) && !(this_object$`code` %in% c("server_error", "rate_limit_exceeded", "invalid_prompt"))) {
          stop(paste("Error! \"", this_object$`code`, "\" cannot be assigned to `code`. Must be \"server_error\", \"rate_limit_exceeded\", \"invalid_prompt\".", sep = ""))
        }
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RunObjectLastError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RunObjectLastError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RunObjectLastError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`code`) && !(this_object$`code` %in% c("server_error", "rate_limit_exceeded", "invalid_prompt"))) {
        stop(paste("Error! \"", this_object$`code`, "\" cannot be assigned to `code`. Must be \"server_error\", \"rate_limit_exceeded\", \"invalid_prompt\".", sep = ""))
      }
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self
    },

    #' @description
    #' Validate JSON input with respect to RunObjectLastError and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for RunObjectLastError: the required field `code` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RunObjectLastError: the required field `message` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RunObjectLastError
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
# RunObjectLastError$unlock()
#
## Below is an example to define the print function
# RunObjectLastError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RunObjectLastError$lock()

