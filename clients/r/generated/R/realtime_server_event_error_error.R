#' Create a new RealtimeServerEventErrorError
#'
#' @description
#' Details of the error.
#'
#' @docType class
#' @title RealtimeServerEventErrorError
#' @description RealtimeServerEventErrorError Class
#' @format An \code{R6Class} generator object
#' @field type The type of error (e.g., \"invalid_request_error\", \"server_error\"). character
#' @field code Error code, if any. character [optional]
#' @field message A human-readable error message. character
#' @field param Parameter related to the error, if any. character [optional]
#' @field event_id The event_id of the client event that caused the error, if applicable. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventErrorError <- R6::R6Class(
  "RealtimeServerEventErrorError",
  public = list(
    `type` = NULL,
    `code` = NULL,
    `message` = NULL,
    `param` = NULL,
    `event_id` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventErrorError class.
    #'
    #' @param type The type of error (e.g., \"invalid_request_error\", \"server_error\").
    #' @param message A human-readable error message.
    #' @param code Error code, if any.
    #' @param param Parameter related to the error, if any.
    #' @param event_id The event_id of the client event that caused the error, if applicable.
    #' @param ... Other optional arguments.
    initialize = function(`type`, `message`, `code` = NULL, `param` = NULL, `event_id` = NULL, ...) {
      if (!missing(`type`)) {
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`message`)) {
        if (!(is.character(`message`) && length(`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", `message`))
        }
        self$`message` <- `message`
      }
      if (!is.null(`code`)) {
        if (!(is.character(`code`) && length(`code`) == 1)) {
          stop(paste("Error! Invalid data for `code`. Must be a string:", `code`))
        }
        self$`code` <- `code`
      }
      if (!is.null(`param`)) {
        if (!(is.character(`param`) && length(`param`) == 1)) {
          stop(paste("Error! Invalid data for `param`. Must be a string:", `param`))
        }
        self$`param` <- `param`
      }
      if (!is.null(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
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
    #' @return RealtimeServerEventErrorError as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventErrorError (x) to a data frame
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
    #' Convert RealtimeServerEventErrorError to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventErrorErrorObject <- list()
      if (!is.null(self$`type`)) {
        RealtimeServerEventErrorErrorObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`code`)) {
        RealtimeServerEventErrorErrorObject[["code"]] <-
          self$`code`
      }
      if (!is.null(self$`message`)) {
        RealtimeServerEventErrorErrorObject[["message"]] <-
          self$`message`
      }
      if (!is.null(self$`param`)) {
        RealtimeServerEventErrorErrorObject[["param"]] <-
          self$`param`
      }
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventErrorErrorObject[["event_id"]] <-
          self$`event_id`
      }
      return(RealtimeServerEventErrorErrorObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventErrorError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventErrorError
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`type`)) {
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`code`)) {
        self$`code` <- this_object$`code`
      }
      if (!is.null(this_object$`message`)) {
        self$`message` <- this_object$`message`
      }
      if (!is.null(this_object$`param`)) {
        self$`param` <- this_object$`param`
      }
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventErrorError in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventErrorError
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventErrorError
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`type` <- this_object$`type`
      self$`code` <- this_object$`code`
      self$`message` <- this_object$`message`
      self$`param` <- this_object$`param`
      self$`event_id` <- this_object$`event_id`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventErrorError and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventErrorError: the required field `type` is missing."))
      }
      # check the required field `message`
      if (!is.null(input_json$`message`)) {
        if (!(is.character(input_json$`message`) && length(input_json$`message`) == 1)) {
          stop(paste("Error! Invalid data for `message`. Must be a string:", input_json$`message`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventErrorError: the required field `message` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventErrorError
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `type` is null
      if (is.null(self$`type`)) {
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
      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
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
# RealtimeServerEventErrorError$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventErrorError$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventErrorError$lock()

