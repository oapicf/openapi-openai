#' Create a new MessageStreamEventOneOf1
#'
#' @description
#' Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
#'
#' @docType class
#' @title MessageStreamEventOneOf1
#' @description MessageStreamEventOneOf1 Class
#' @format An \code{R6Class} generator object
#' @field event  character
#' @field data  \link{MessageObject}
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
MessageStreamEventOneOf1 <- R6::R6Class(
  "MessageStreamEventOneOf1",
  public = list(
    `event` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new MessageStreamEventOneOf1 class.
    #'
    #' @param event event
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`event`, `data`, ...) {
      if (!missing(`event`)) {
        if (!(`event` %in% c("thread.message.in_progress"))) {
          stop(paste("Error! \"", `event`, "\" cannot be assigned to `event`. Must be \"thread.message.in_progress\".", sep = ""))
        }
        if (!(is.character(`event`) && length(`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", `event`))
        }
        self$`event` <- `event`
      }
      if (!missing(`data`)) {
        stopifnot(R6::is.R6(`data`))
        self$`data` <- `data`
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
    #' @return MessageStreamEventOneOf1 as a base R list.
    #' @examples
    #' # convert array of MessageStreamEventOneOf1 (x) to a data frame
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
    #' Convert MessageStreamEventOneOf1 to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      MessageStreamEventOneOf1Object <- list()
      if (!is.null(self$`event`)) {
        MessageStreamEventOneOf1Object[["event"]] <-
          self$`event`
      }
      if (!is.null(self$`data`)) {
        MessageStreamEventOneOf1Object[["data"]] <-
          self$`data`$toSimpleType()
      }
      return(MessageStreamEventOneOf1Object)
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageStreamEventOneOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageStreamEventOneOf1
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`)) {
        if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("thread.message.in_progress"))) {
          stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"thread.message.in_progress\".", sep = ""))
        }
        self$`event` <- this_object$`event`
      }
      if (!is.null(this_object$`data`)) {
        `data_object` <- MessageObject$new()
        `data_object`$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
        self$`data` <- `data_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return MessageStreamEventOneOf1 in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of MessageStreamEventOneOf1
    #'
    #' @param input_json the JSON input
    #' @return the instance of MessageStreamEventOneOf1
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("thread.message.in_progress"))) {
        stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"thread.message.in_progress\".", sep = ""))
      }
      self$`event` <- this_object$`event`
      self$`data` <- MessageObject$new()$fromJSON(jsonlite::toJSON(this_object$`data`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to MessageStreamEventOneOf1 and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event`
      if (!is.null(input_json$`event`)) {
        if (!(is.character(input_json$`event`) && length(input_json$`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", input_json$`event`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageStreamEventOneOf1: the required field `event` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(R6::is.R6(input_json$`data`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for MessageStreamEventOneOf1: the required field `data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of MessageStreamEventOneOf1
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `event` is null
      if (is.null(self$`event`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
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
      # check if the required `event` is null
      if (is.null(self$`event`)) {
        invalid_fields["event"] <- "Non-nullable required field `event` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
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
# MessageStreamEventOneOf1$unlock()
#
## Below is an example to define the print function
# MessageStreamEventOneOf1$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# MessageStreamEventOneOf1$lock()

