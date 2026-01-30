#' Create a new ProjectRateLimitUpdateRequest
#'
#' @description
#' ProjectRateLimitUpdateRequest Class
#'
#' @docType class
#' @title ProjectRateLimitUpdateRequest
#' @description ProjectRateLimitUpdateRequest Class
#' @format An \code{R6Class} generator object
#' @field max_requests_per_1_minute The maximum requests per minute. integer [optional]
#' @field max_tokens_per_1_minute The maximum tokens per minute. integer [optional]
#' @field max_images_per_1_minute The maximum images per minute. Only relevant for certain models. integer [optional]
#' @field max_audio_megabytes_per_1_minute The maximum audio megabytes per minute. Only relevant for certain models. integer [optional]
#' @field max_requests_per_1_day The maximum requests per day. Only relevant for certain models. integer [optional]
#' @field batch_1_day_max_input_tokens The maximum batch input tokens per day. Only relevant for certain models. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectRateLimitUpdateRequest <- R6::R6Class(
  "ProjectRateLimitUpdateRequest",
  public = list(
    `max_requests_per_1_minute` = NULL,
    `max_tokens_per_1_minute` = NULL,
    `max_images_per_1_minute` = NULL,
    `max_audio_megabytes_per_1_minute` = NULL,
    `max_requests_per_1_day` = NULL,
    `batch_1_day_max_input_tokens` = NULL,

    #' @description
    #' Initialize a new ProjectRateLimitUpdateRequest class.
    #'
    #' @param max_requests_per_1_minute The maximum requests per minute.
    #' @param max_tokens_per_1_minute The maximum tokens per minute.
    #' @param max_images_per_1_minute The maximum images per minute. Only relevant for certain models.
    #' @param max_audio_megabytes_per_1_minute The maximum audio megabytes per minute. Only relevant for certain models.
    #' @param max_requests_per_1_day The maximum requests per day. Only relevant for certain models.
    #' @param batch_1_day_max_input_tokens The maximum batch input tokens per day. Only relevant for certain models.
    #' @param ... Other optional arguments.
    initialize = function(`max_requests_per_1_minute` = NULL, `max_tokens_per_1_minute` = NULL, `max_images_per_1_minute` = NULL, `max_audio_megabytes_per_1_minute` = NULL, `max_requests_per_1_day` = NULL, `batch_1_day_max_input_tokens` = NULL, ...) {
      if (!is.null(`max_requests_per_1_minute`)) {
        if (!(is.numeric(`max_requests_per_1_minute`) && length(`max_requests_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_requests_per_1_minute`. Must be an integer:", `max_requests_per_1_minute`))
        }
        self$`max_requests_per_1_minute` <- `max_requests_per_1_minute`
      }
      if (!is.null(`max_tokens_per_1_minute`)) {
        if (!(is.numeric(`max_tokens_per_1_minute`) && length(`max_tokens_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_tokens_per_1_minute`. Must be an integer:", `max_tokens_per_1_minute`))
        }
        self$`max_tokens_per_1_minute` <- `max_tokens_per_1_minute`
      }
      if (!is.null(`max_images_per_1_minute`)) {
        if (!(is.numeric(`max_images_per_1_minute`) && length(`max_images_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_images_per_1_minute`. Must be an integer:", `max_images_per_1_minute`))
        }
        self$`max_images_per_1_minute` <- `max_images_per_1_minute`
      }
      if (!is.null(`max_audio_megabytes_per_1_minute`)) {
        if (!(is.numeric(`max_audio_megabytes_per_1_minute`) && length(`max_audio_megabytes_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_audio_megabytes_per_1_minute`. Must be an integer:", `max_audio_megabytes_per_1_minute`))
        }
        self$`max_audio_megabytes_per_1_minute` <- `max_audio_megabytes_per_1_minute`
      }
      if (!is.null(`max_requests_per_1_day`)) {
        if (!(is.numeric(`max_requests_per_1_day`) && length(`max_requests_per_1_day`) == 1)) {
          stop(paste("Error! Invalid data for `max_requests_per_1_day`. Must be an integer:", `max_requests_per_1_day`))
        }
        self$`max_requests_per_1_day` <- `max_requests_per_1_day`
      }
      if (!is.null(`batch_1_day_max_input_tokens`)) {
        if (!(is.numeric(`batch_1_day_max_input_tokens`) && length(`batch_1_day_max_input_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `batch_1_day_max_input_tokens`. Must be an integer:", `batch_1_day_max_input_tokens`))
        }
        self$`batch_1_day_max_input_tokens` <- `batch_1_day_max_input_tokens`
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
    #' @return ProjectRateLimitUpdateRequest as a base R list.
    #' @examples
    #' # convert array of ProjectRateLimitUpdateRequest (x) to a data frame
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
    #' Convert ProjectRateLimitUpdateRequest to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectRateLimitUpdateRequestObject <- list()
      if (!is.null(self$`max_requests_per_1_minute`)) {
        ProjectRateLimitUpdateRequestObject[["max_requests_per_1_minute"]] <-
          self$`max_requests_per_1_minute`
      }
      if (!is.null(self$`max_tokens_per_1_minute`)) {
        ProjectRateLimitUpdateRequestObject[["max_tokens_per_1_minute"]] <-
          self$`max_tokens_per_1_minute`
      }
      if (!is.null(self$`max_images_per_1_minute`)) {
        ProjectRateLimitUpdateRequestObject[["max_images_per_1_minute"]] <-
          self$`max_images_per_1_minute`
      }
      if (!is.null(self$`max_audio_megabytes_per_1_minute`)) {
        ProjectRateLimitUpdateRequestObject[["max_audio_megabytes_per_1_minute"]] <-
          self$`max_audio_megabytes_per_1_minute`
      }
      if (!is.null(self$`max_requests_per_1_day`)) {
        ProjectRateLimitUpdateRequestObject[["max_requests_per_1_day"]] <-
          self$`max_requests_per_1_day`
      }
      if (!is.null(self$`batch_1_day_max_input_tokens`)) {
        ProjectRateLimitUpdateRequestObject[["batch_1_day_max_input_tokens"]] <-
          self$`batch_1_day_max_input_tokens`
      }
      return(ProjectRateLimitUpdateRequestObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectRateLimitUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectRateLimitUpdateRequest
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`max_requests_per_1_minute`)) {
        self$`max_requests_per_1_minute` <- this_object$`max_requests_per_1_minute`
      }
      if (!is.null(this_object$`max_tokens_per_1_minute`)) {
        self$`max_tokens_per_1_minute` <- this_object$`max_tokens_per_1_minute`
      }
      if (!is.null(this_object$`max_images_per_1_minute`)) {
        self$`max_images_per_1_minute` <- this_object$`max_images_per_1_minute`
      }
      if (!is.null(this_object$`max_audio_megabytes_per_1_minute`)) {
        self$`max_audio_megabytes_per_1_minute` <- this_object$`max_audio_megabytes_per_1_minute`
      }
      if (!is.null(this_object$`max_requests_per_1_day`)) {
        self$`max_requests_per_1_day` <- this_object$`max_requests_per_1_day`
      }
      if (!is.null(this_object$`batch_1_day_max_input_tokens`)) {
        self$`batch_1_day_max_input_tokens` <- this_object$`batch_1_day_max_input_tokens`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return ProjectRateLimitUpdateRequest in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectRateLimitUpdateRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectRateLimitUpdateRequest
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`max_requests_per_1_minute` <- this_object$`max_requests_per_1_minute`
      self$`max_tokens_per_1_minute` <- this_object$`max_tokens_per_1_minute`
      self$`max_images_per_1_minute` <- this_object$`max_images_per_1_minute`
      self$`max_audio_megabytes_per_1_minute` <- this_object$`max_audio_megabytes_per_1_minute`
      self$`max_requests_per_1_day` <- this_object$`max_requests_per_1_day`
      self$`batch_1_day_max_input_tokens` <- this_object$`batch_1_day_max_input_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectRateLimitUpdateRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectRateLimitUpdateRequest
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
# ProjectRateLimitUpdateRequest$unlock()
#
## Below is an example to define the print function
# ProjectRateLimitUpdateRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectRateLimitUpdateRequest$lock()

