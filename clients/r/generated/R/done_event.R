#' Create a new DoneEvent
#'
#' @description
#' Occurs when a stream ends.
#'
#' @docType class
#' @title DoneEvent
#' @description DoneEvent Class
#' @format An \code{R6Class} generator object
#' @field event  character
#' @field data  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
DoneEvent <- R6::R6Class(
  "DoneEvent",
  public = list(
    `event` = NULL,
    `data` = NULL,

    #' @description
    #' Initialize a new DoneEvent class.
    #'
    #' @param event event
    #' @param data data
    #' @param ... Other optional arguments.
    initialize = function(`event`, `data`, ...) {
      if (!missing(`event`)) {
        if (!(`event` %in% c("done"))) {
          stop(paste("Error! \"", `event`, "\" cannot be assigned to `event`. Must be \"done\".", sep = ""))
        }
        if (!(is.character(`event`) && length(`event`) == 1)) {
          stop(paste("Error! Invalid data for `event`. Must be a string:", `event`))
        }
        self$`event` <- `event`
      }
      if (!missing(`data`)) {
        if (!(`data` %in% c("[DONE]"))) {
          stop(paste("Error! \"", `data`, "\" cannot be assigned to `data`. Must be \"[DONE]\".", sep = ""))
        }
        if (!(is.character(`data`) && length(`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", `data`))
        }
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
    #' @return DoneEvent as a base R list.
    #' @examples
    #' # convert array of DoneEvent (x) to a data frame
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
    #' Convert DoneEvent to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      DoneEventObject <- list()
      if (!is.null(self$`event`)) {
        DoneEventObject[["event"]] <-
          self$`event`
      }
      if (!is.null(self$`data`)) {
        DoneEventObject[["data"]] <-
          self$`data`
      }
      return(DoneEventObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of DoneEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of DoneEvent
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`)) {
        if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("done"))) {
          stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"done\".", sep = ""))
        }
        self$`event` <- this_object$`event`
      }
      if (!is.null(this_object$`data`)) {
        if (!is.null(this_object$`data`) && !(this_object$`data` %in% c("[DONE]"))) {
          stop(paste("Error! \"", this_object$`data`, "\" cannot be assigned to `data`. Must be \"[DONE]\".", sep = ""))
        }
        self$`data` <- this_object$`data`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return DoneEvent in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of DoneEvent
    #'
    #' @param input_json the JSON input
    #' @return the instance of DoneEvent
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event`) && !(this_object$`event` %in% c("done"))) {
        stop(paste("Error! \"", this_object$`event`, "\" cannot be assigned to `event`. Must be \"done\".", sep = ""))
      }
      self$`event` <- this_object$`event`
      if (!is.null(this_object$`data`) && !(this_object$`data` %in% c("[DONE]"))) {
        stop(paste("Error! \"", this_object$`data`, "\" cannot be assigned to `data`. Must be \"[DONE]\".", sep = ""))
      }
      self$`data` <- this_object$`data`
      self
    },

    #' @description
    #' Validate JSON input with respect to DoneEvent and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for DoneEvent: the required field `event` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        if (!(is.character(input_json$`data`) && length(input_json$`data`) == 1)) {
          stop(paste("Error! Invalid data for `data`. Must be a string:", input_json$`data`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for DoneEvent: the required field `data` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of DoneEvent
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
# DoneEvent$unlock()
#
## Below is an example to define the print function
# DoneEvent$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# DoneEvent$lock()

