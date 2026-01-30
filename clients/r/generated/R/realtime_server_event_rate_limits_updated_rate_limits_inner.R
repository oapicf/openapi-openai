#' Create a new RealtimeServerEventRateLimitsUpdatedRateLimitsInner
#'
#' @description
#' RealtimeServerEventRateLimitsUpdatedRateLimitsInner Class
#'
#' @docType class
#' @title RealtimeServerEventRateLimitsUpdatedRateLimitsInner
#' @description RealtimeServerEventRateLimitsUpdatedRateLimitsInner Class
#' @format An \code{R6Class} generator object
#' @field name The name of the rate limit (`requests`, `tokens`). character [optional]
#' @field limit The maximum allowed value for the rate limit. integer [optional]
#' @field remaining The remaining value before the limit is reached. integer [optional]
#' @field reset_seconds Seconds until the rate limit resets. numeric [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventRateLimitsUpdatedRateLimitsInner <- R6::R6Class(
  "RealtimeServerEventRateLimitsUpdatedRateLimitsInner",
  public = list(
    `name` = NULL,
    `limit` = NULL,
    `remaining` = NULL,
    `reset_seconds` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventRateLimitsUpdatedRateLimitsInner class.
    #'
    #' @param name The name of the rate limit (`requests`, `tokens`).
    #' @param limit The maximum allowed value for the rate limit.
    #' @param remaining The remaining value before the limit is reached.
    #' @param reset_seconds Seconds until the rate limit resets.
    #' @param ... Other optional arguments.
    initialize = function(`name` = NULL, `limit` = NULL, `remaining` = NULL, `reset_seconds` = NULL, ...) {
      if (!is.null(`name`)) {
        if (!(`name` %in% c("requests", "tokens"))) {
          stop(paste("Error! \"", `name`, "\" cannot be assigned to `name`. Must be \"requests\", \"tokens\".", sep = ""))
        }
        if (!(is.character(`name`) && length(`name`) == 1)) {
          stop(paste("Error! Invalid data for `name`. Must be a string:", `name`))
        }
        self$`name` <- `name`
      }
      if (!is.null(`limit`)) {
        if (!(is.numeric(`limit`) && length(`limit`) == 1)) {
          stop(paste("Error! Invalid data for `limit`. Must be an integer:", `limit`))
        }
        self$`limit` <- `limit`
      }
      if (!is.null(`remaining`)) {
        if (!(is.numeric(`remaining`) && length(`remaining`) == 1)) {
          stop(paste("Error! Invalid data for `remaining`. Must be an integer:", `remaining`))
        }
        self$`remaining` <- `remaining`
      }
      if (!is.null(`reset_seconds`)) {
        self$`reset_seconds` <- `reset_seconds`
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
    #' @return RealtimeServerEventRateLimitsUpdatedRateLimitsInner as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventRateLimitsUpdatedRateLimitsInner (x) to a data frame
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
    #' Convert RealtimeServerEventRateLimitsUpdatedRateLimitsInner to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventRateLimitsUpdatedRateLimitsInnerObject <- list()
      if (!is.null(self$`name`)) {
        RealtimeServerEventRateLimitsUpdatedRateLimitsInnerObject[["name"]] <-
          self$`name`
      }
      if (!is.null(self$`limit`)) {
        RealtimeServerEventRateLimitsUpdatedRateLimitsInnerObject[["limit"]] <-
          self$`limit`
      }
      if (!is.null(self$`remaining`)) {
        RealtimeServerEventRateLimitsUpdatedRateLimitsInnerObject[["remaining"]] <-
          self$`remaining`
      }
      if (!is.null(self$`reset_seconds`)) {
        RealtimeServerEventRateLimitsUpdatedRateLimitsInnerObject[["reset_seconds"]] <-
          self$`reset_seconds`
      }
      return(RealtimeServerEventRateLimitsUpdatedRateLimitsInnerObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventRateLimitsUpdatedRateLimitsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventRateLimitsUpdatedRateLimitsInner
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`)) {
        if (!is.null(this_object$`name`) && !(this_object$`name` %in% c("requests", "tokens"))) {
          stop(paste("Error! \"", this_object$`name`, "\" cannot be assigned to `name`. Must be \"requests\", \"tokens\".", sep = ""))
        }
        self$`name` <- this_object$`name`
      }
      if (!is.null(this_object$`limit`)) {
        self$`limit` <- this_object$`limit`
      }
      if (!is.null(this_object$`remaining`)) {
        self$`remaining` <- this_object$`remaining`
      }
      if (!is.null(this_object$`reset_seconds`)) {
        self$`reset_seconds` <- this_object$`reset_seconds`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventRateLimitsUpdatedRateLimitsInner in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventRateLimitsUpdatedRateLimitsInner
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventRateLimitsUpdatedRateLimitsInner
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`name`) && !(this_object$`name` %in% c("requests", "tokens"))) {
        stop(paste("Error! \"", this_object$`name`, "\" cannot be assigned to `name`. Must be \"requests\", \"tokens\".", sep = ""))
      }
      self$`name` <- this_object$`name`
      self$`limit` <- this_object$`limit`
      self$`remaining` <- this_object$`remaining`
      self$`reset_seconds` <- this_object$`reset_seconds`
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventRateLimitsUpdatedRateLimitsInner and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventRateLimitsUpdatedRateLimitsInner
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# RealtimeServerEventRateLimitsUpdatedRateLimitsInner$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventRateLimitsUpdatedRateLimitsInner$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventRateLimitsUpdatedRateLimitsInner$lock()

