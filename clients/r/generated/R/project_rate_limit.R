#' Create a new ProjectRateLimit
#'
#' @description
#' Represents a project rate limit config.
#'
#' @docType class
#' @title ProjectRateLimit
#' @description ProjectRateLimit Class
#' @format An \code{R6Class} generator object
#' @field object The object type, which is always `project.rate_limit` character
#' @field id The identifier, which can be referenced in API endpoints. character
#' @field model The model this rate limit applies to. character
#' @field max_requests_per_1_minute The maximum requests per minute. integer
#' @field max_tokens_per_1_minute The maximum tokens per minute. integer
#' @field max_images_per_1_minute The maximum images per minute. Only present for relevant models. integer [optional]
#' @field max_audio_megabytes_per_1_minute The maximum audio megabytes per minute. Only present for relevant models. integer [optional]
#' @field max_requests_per_1_day The maximum requests per day. Only present for relevant models. integer [optional]
#' @field batch_1_day_max_input_tokens The maximum batch input tokens per day. Only present for relevant models. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ProjectRateLimit <- R6::R6Class(
  "ProjectRateLimit",
  public = list(
    `object` = NULL,
    `id` = NULL,
    `model` = NULL,
    `max_requests_per_1_minute` = NULL,
    `max_tokens_per_1_minute` = NULL,
    `max_images_per_1_minute` = NULL,
    `max_audio_megabytes_per_1_minute` = NULL,
    `max_requests_per_1_day` = NULL,
    `batch_1_day_max_input_tokens` = NULL,

    #' @description
    #' Initialize a new ProjectRateLimit class.
    #'
    #' @param object The object type, which is always `project.rate_limit`
    #' @param id The identifier, which can be referenced in API endpoints.
    #' @param model The model this rate limit applies to.
    #' @param max_requests_per_1_minute The maximum requests per minute.
    #' @param max_tokens_per_1_minute The maximum tokens per minute.
    #' @param max_images_per_1_minute The maximum images per minute. Only present for relevant models.
    #' @param max_audio_megabytes_per_1_minute The maximum audio megabytes per minute. Only present for relevant models.
    #' @param max_requests_per_1_day The maximum requests per day. Only present for relevant models.
    #' @param batch_1_day_max_input_tokens The maximum batch input tokens per day. Only present for relevant models.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `id`, `model`, `max_requests_per_1_minute`, `max_tokens_per_1_minute`, `max_images_per_1_minute` = NULL, `max_audio_megabytes_per_1_minute` = NULL, `max_requests_per_1_day` = NULL, `batch_1_day_max_input_tokens` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("project.rate_limit"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"project.rate_limit\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`max_requests_per_1_minute`)) {
        if (!(is.numeric(`max_requests_per_1_minute`) && length(`max_requests_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_requests_per_1_minute`. Must be an integer:", `max_requests_per_1_minute`))
        }
        self$`max_requests_per_1_minute` <- `max_requests_per_1_minute`
      }
      if (!missing(`max_tokens_per_1_minute`)) {
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
    #' @return ProjectRateLimit as a base R list.
    #' @examples
    #' # convert array of ProjectRateLimit (x) to a data frame
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
    #' Convert ProjectRateLimit to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      ProjectRateLimitObject <- list()
      if (!is.null(self$`object`)) {
        ProjectRateLimitObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`id`)) {
        ProjectRateLimitObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`model`)) {
        ProjectRateLimitObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`max_requests_per_1_minute`)) {
        ProjectRateLimitObject[["max_requests_per_1_minute"]] <-
          self$`max_requests_per_1_minute`
      }
      if (!is.null(self$`max_tokens_per_1_minute`)) {
        ProjectRateLimitObject[["max_tokens_per_1_minute"]] <-
          self$`max_tokens_per_1_minute`
      }
      if (!is.null(self$`max_images_per_1_minute`)) {
        ProjectRateLimitObject[["max_images_per_1_minute"]] <-
          self$`max_images_per_1_minute`
      }
      if (!is.null(self$`max_audio_megabytes_per_1_minute`)) {
        ProjectRateLimitObject[["max_audio_megabytes_per_1_minute"]] <-
          self$`max_audio_megabytes_per_1_minute`
      }
      if (!is.null(self$`max_requests_per_1_day`)) {
        ProjectRateLimitObject[["max_requests_per_1_day"]] <-
          self$`max_requests_per_1_day`
      }
      if (!is.null(self$`batch_1_day_max_input_tokens`)) {
        ProjectRateLimitObject[["batch_1_day_max_input_tokens"]] <-
          self$`batch_1_day_max_input_tokens`
      }
      return(ProjectRateLimitObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectRateLimit
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectRateLimit
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("project.rate_limit"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"project.rate_limit\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
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
    #' @return ProjectRateLimit in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of ProjectRateLimit
    #'
    #' @param input_json the JSON input
    #' @return the instance of ProjectRateLimit
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("project.rate_limit"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"project.rate_limit\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`id` <- this_object$`id`
      self$`model` <- this_object$`model`
      self$`max_requests_per_1_minute` <- this_object$`max_requests_per_1_minute`
      self$`max_tokens_per_1_minute` <- this_object$`max_tokens_per_1_minute`
      self$`max_images_per_1_minute` <- this_object$`max_images_per_1_minute`
      self$`max_audio_megabytes_per_1_minute` <- this_object$`max_audio_megabytes_per_1_minute`
      self$`max_requests_per_1_day` <- this_object$`max_requests_per_1_day`
      self$`batch_1_day_max_input_tokens` <- this_object$`batch_1_day_max_input_tokens`
      self
    },

    #' @description
    #' Validate JSON input with respect to ProjectRateLimit and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectRateLimit: the required field `object` is missing."))
      }
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectRateLimit: the required field `id` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectRateLimit: the required field `model` is missing."))
      }
      # check the required field `max_requests_per_1_minute`
      if (!is.null(input_json$`max_requests_per_1_minute`)) {
        if (!(is.numeric(input_json$`max_requests_per_1_minute`) && length(input_json$`max_requests_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_requests_per_1_minute`. Must be an integer:", input_json$`max_requests_per_1_minute`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectRateLimit: the required field `max_requests_per_1_minute` is missing."))
      }
      # check the required field `max_tokens_per_1_minute`
      if (!is.null(input_json$`max_tokens_per_1_minute`)) {
        if (!(is.numeric(input_json$`max_tokens_per_1_minute`) && length(input_json$`max_tokens_per_1_minute`) == 1)) {
          stop(paste("Error! Invalid data for `max_tokens_per_1_minute`. Must be an integer:", input_json$`max_tokens_per_1_minute`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ProjectRateLimit: the required field `max_tokens_per_1_minute` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ProjectRateLimit
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `max_requests_per_1_minute` is null
      if (is.null(self$`max_requests_per_1_minute`)) {
        return(FALSE)
      }

      # check if the required `max_tokens_per_1_minute` is null
      if (is.null(self$`max_tokens_per_1_minute`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `max_requests_per_1_minute` is null
      if (is.null(self$`max_requests_per_1_minute`)) {
        invalid_fields["max_requests_per_1_minute"] <- "Non-nullable required field `max_requests_per_1_minute` cannot be null."
      }

      # check if the required `max_tokens_per_1_minute` is null
      if (is.null(self$`max_tokens_per_1_minute`)) {
        invalid_fields["max_tokens_per_1_minute"] <- "Non-nullable required field `max_tokens_per_1_minute` cannot be null."
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
# ProjectRateLimit$unlock()
#
## Below is an example to define the print function
# ProjectRateLimit$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ProjectRateLimit$lock()

