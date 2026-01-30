#' Create a new RealtimeServerEventRateLimitsUpdated
#'
#' @description
#' Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
#'
#' @docType class
#' @title RealtimeServerEventRateLimitsUpdated
#' @description RealtimeServerEventRateLimitsUpdated Class
#' @format An \code{R6Class} generator object
#' @field event_id The unique ID of the server event. character
#' @field type The event type, must be `rate_limits.updated`. character
#' @field rate_limits List of rate limit information. list(\link{RealtimeServerEventRateLimitsUpdatedRateLimitsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
RealtimeServerEventRateLimitsUpdated <- R6::R6Class(
  "RealtimeServerEventRateLimitsUpdated",
  public = list(
    `event_id` = NULL,
    `type` = NULL,
    `rate_limits` = NULL,

    #' @description
    #' Initialize a new RealtimeServerEventRateLimitsUpdated class.
    #'
    #' @param event_id The unique ID of the server event.
    #' @param type The event type, must be `rate_limits.updated`.
    #' @param rate_limits List of rate limit information.
    #' @param ... Other optional arguments.
    initialize = function(`event_id`, `type`, `rate_limits`, ...) {
      if (!missing(`event_id`)) {
        if (!(is.character(`event_id`) && length(`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", `event_id`))
        }
        self$`event_id` <- `event_id`
      }
      if (!missing(`type`)) {
        if (!(`type` %in% c("rate_limits.updated"))) {
          stop(paste("Error! \"", `type`, "\" cannot be assigned to `type`. Must be \"rate_limits.updated\".", sep = ""))
        }
        if (!(is.character(`type`) && length(`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", `type`))
        }
        self$`type` <- `type`
      }
      if (!missing(`rate_limits`)) {
        stopifnot(is.vector(`rate_limits`), length(`rate_limits`) != 0)
        sapply(`rate_limits`, function(x) stopifnot(R6::is.R6(x)))
        self$`rate_limits` <- `rate_limits`
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
    #' @return RealtimeServerEventRateLimitsUpdated as a base R list.
    #' @examples
    #' # convert array of RealtimeServerEventRateLimitsUpdated (x) to a data frame
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
    #' Convert RealtimeServerEventRateLimitsUpdated to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      RealtimeServerEventRateLimitsUpdatedObject <- list()
      if (!is.null(self$`event_id`)) {
        RealtimeServerEventRateLimitsUpdatedObject[["event_id"]] <-
          self$`event_id`
      }
      if (!is.null(self$`type`)) {
        RealtimeServerEventRateLimitsUpdatedObject[["type"]] <-
          self$`type`
      }
      if (!is.null(self$`rate_limits`)) {
        RealtimeServerEventRateLimitsUpdatedObject[["rate_limits"]] <-
          lapply(self$`rate_limits`, function(x) x$toSimpleType())
      }
      return(RealtimeServerEventRateLimitsUpdatedObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventRateLimitsUpdated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventRateLimitsUpdated
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`event_id`)) {
        self$`event_id` <- this_object$`event_id`
      }
      if (!is.null(this_object$`type`)) {
        if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("rate_limits.updated"))) {
          stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"rate_limits.updated\".", sep = ""))
        }
        self$`type` <- this_object$`type`
      }
      if (!is.null(this_object$`rate_limits`)) {
        self$`rate_limits` <- ApiClient$new()$deserializeObj(this_object$`rate_limits`, "array[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return RealtimeServerEventRateLimitsUpdated in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of RealtimeServerEventRateLimitsUpdated
    #'
    #' @param input_json the JSON input
    #' @return the instance of RealtimeServerEventRateLimitsUpdated
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`event_id` <- this_object$`event_id`
      if (!is.null(this_object$`type`) && !(this_object$`type` %in% c("rate_limits.updated"))) {
        stop(paste("Error! \"", this_object$`type`, "\" cannot be assigned to `type`. Must be \"rate_limits.updated\".", sep = ""))
      }
      self$`type` <- this_object$`type`
      self$`rate_limits` <- ApiClient$new()$deserializeObj(this_object$`rate_limits`, "array[RealtimeServerEventRateLimitsUpdatedRateLimitsInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to RealtimeServerEventRateLimitsUpdated and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `event_id`
      if (!is.null(input_json$`event_id`)) {
        if (!(is.character(input_json$`event_id`) && length(input_json$`event_id`) == 1)) {
          stop(paste("Error! Invalid data for `event_id`. Must be a string:", input_json$`event_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventRateLimitsUpdated: the required field `event_id` is missing."))
      }
      # check the required field `type`
      if (!is.null(input_json$`type`)) {
        if (!(is.character(input_json$`type`) && length(input_json$`type`) == 1)) {
          stop(paste("Error! Invalid data for `type`. Must be a string:", input_json$`type`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventRateLimitsUpdated: the required field `type` is missing."))
      }
      # check the required field `rate_limits`
      if (!is.null(input_json$`rate_limits`)) {
        stopifnot(is.vector(input_json$`rate_limits`), length(input_json$`rate_limits`) != 0)
        tmp <- sapply(input_json$`rate_limits`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for RealtimeServerEventRateLimitsUpdated: the required field `rate_limits` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of RealtimeServerEventRateLimitsUpdated
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        return(FALSE)
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        return(FALSE)
      }

      # check if the required `rate_limits` is null
      if (is.null(self$`rate_limits`)) {
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
      # check if the required `event_id` is null
      if (is.null(self$`event_id`)) {
        invalid_fields["event_id"] <- "Non-nullable required field `event_id` cannot be null."
      }

      # check if the required `type` is null
      if (is.null(self$`type`)) {
        invalid_fields["type"] <- "Non-nullable required field `type` cannot be null."
      }

      # check if the required `rate_limits` is null
      if (is.null(self$`rate_limits`)) {
        invalid_fields["rate_limits"] <- "Non-nullable required field `rate_limits` cannot be null."
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
# RealtimeServerEventRateLimitsUpdated$unlock()
#
## Below is an example to define the print function
# RealtimeServerEventRateLimitsUpdated$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# RealtimeServerEventRateLimitsUpdated$lock()

