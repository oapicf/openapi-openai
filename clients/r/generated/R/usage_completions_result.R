#' Create a new UsageCompletionsResult
#'
#' @description
#' The aggregated completions usage details of the specific time bucket.
#'
#' @docType class
#' @title UsageCompletionsResult
#' @description UsageCompletionsResult Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field input_tokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens. integer
#' @field input_cached_tokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens. integer [optional]
#' @field output_tokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens. integer
#' @field input_audio_tokens The aggregated number of audio input tokens used, including cached tokens. integer [optional]
#' @field output_audio_tokens The aggregated number of audio output tokens used. integer [optional]
#' @field num_model_requests The count of requests made to the model. integer
#' @field project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result. character [optional]
#' @field user_id When `group_by=user_id`, this field provides the user ID of the grouped usage result. character [optional]
#' @field api_key_id When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. character [optional]
#' @field model When `group_by=model`, this field provides the model name of the grouped usage result. character [optional]
#' @field batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageCompletionsResult <- R6::R6Class(
  "UsageCompletionsResult",
  public = list(
    `object` = NULL,
    `input_tokens` = NULL,
    `input_cached_tokens` = NULL,
    `output_tokens` = NULL,
    `input_audio_tokens` = NULL,
    `output_audio_tokens` = NULL,
    `num_model_requests` = NULL,
    `project_id` = NULL,
    `user_id` = NULL,
    `api_key_id` = NULL,
    `model` = NULL,
    `batch` = NULL,

    #' @description
    #' Initialize a new UsageCompletionsResult class.
    #'
    #' @param object object
    #' @param input_tokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
    #' @param output_tokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
    #' @param num_model_requests The count of requests made to the model.
    #' @param input_cached_tokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
    #' @param input_audio_tokens The aggregated number of audio input tokens used, including cached tokens.
    #' @param output_audio_tokens The aggregated number of audio output tokens used.
    #' @param project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    #' @param user_id When `group_by=user_id`, this field provides the user ID of the grouped usage result.
    #' @param api_key_id When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
    #' @param model When `group_by=model`, this field provides the model name of the grouped usage result.
    #' @param batch When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `input_tokens`, `output_tokens`, `num_model_requests`, `input_cached_tokens` = NULL, `input_audio_tokens` = NULL, `output_audio_tokens` = NULL, `project_id` = NULL, `user_id` = NULL, `api_key_id` = NULL, `model` = NULL, `batch` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.usage.completions.result"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.usage.completions.result\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`input_tokens`)) {
        if (!(is.numeric(`input_tokens`) && length(`input_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `input_tokens`. Must be an integer:", `input_tokens`))
        }
        self$`input_tokens` <- `input_tokens`
      }
      if (!missing(`output_tokens`)) {
        if (!(is.numeric(`output_tokens`) && length(`output_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `output_tokens`. Must be an integer:", `output_tokens`))
        }
        self$`output_tokens` <- `output_tokens`
      }
      if (!missing(`num_model_requests`)) {
        if (!(is.numeric(`num_model_requests`) && length(`num_model_requests`) == 1)) {
          stop(paste("Error! Invalid data for `num_model_requests`. Must be an integer:", `num_model_requests`))
        }
        self$`num_model_requests` <- `num_model_requests`
      }
      if (!is.null(`input_cached_tokens`)) {
        if (!(is.numeric(`input_cached_tokens`) && length(`input_cached_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `input_cached_tokens`. Must be an integer:", `input_cached_tokens`))
        }
        self$`input_cached_tokens` <- `input_cached_tokens`
      }
      if (!is.null(`input_audio_tokens`)) {
        if (!(is.numeric(`input_audio_tokens`) && length(`input_audio_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `input_audio_tokens`. Must be an integer:", `input_audio_tokens`))
        }
        self$`input_audio_tokens` <- `input_audio_tokens`
      }
      if (!is.null(`output_audio_tokens`)) {
        if (!(is.numeric(`output_audio_tokens`) && length(`output_audio_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `output_audio_tokens`. Must be an integer:", `output_audio_tokens`))
        }
        self$`output_audio_tokens` <- `output_audio_tokens`
      }
      if (!is.null(`project_id`)) {
        if (!(is.character(`project_id`) && length(`project_id`) == 1)) {
          stop(paste("Error! Invalid data for `project_id`. Must be a string:", `project_id`))
        }
        self$`project_id` <- `project_id`
      }
      if (!is.null(`user_id`)) {
        if (!(is.character(`user_id`) && length(`user_id`) == 1)) {
          stop(paste("Error! Invalid data for `user_id`. Must be a string:", `user_id`))
        }
        self$`user_id` <- `user_id`
      }
      if (!is.null(`api_key_id`)) {
        if (!(is.character(`api_key_id`) && length(`api_key_id`) == 1)) {
          stop(paste("Error! Invalid data for `api_key_id`. Must be a string:", `api_key_id`))
        }
        self$`api_key_id` <- `api_key_id`
      }
      if (!is.null(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!is.null(`batch`)) {
        if (!(is.logical(`batch`) && length(`batch`) == 1)) {
          stop(paste("Error! Invalid data for `batch`. Must be a boolean:", `batch`))
        }
        self$`batch` <- `batch`
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
    #' @return UsageCompletionsResult as a base R list.
    #' @examples
    #' # convert array of UsageCompletionsResult (x) to a data frame
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
    #' Convert UsageCompletionsResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageCompletionsResultObject <- list()
      if (!is.null(self$`object`)) {
        UsageCompletionsResultObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`input_tokens`)) {
        UsageCompletionsResultObject[["input_tokens"]] <-
          self$`input_tokens`
      }
      if (!is.null(self$`input_cached_tokens`)) {
        UsageCompletionsResultObject[["input_cached_tokens"]] <-
          self$`input_cached_tokens`
      }
      if (!is.null(self$`output_tokens`)) {
        UsageCompletionsResultObject[["output_tokens"]] <-
          self$`output_tokens`
      }
      if (!is.null(self$`input_audio_tokens`)) {
        UsageCompletionsResultObject[["input_audio_tokens"]] <-
          self$`input_audio_tokens`
      }
      if (!is.null(self$`output_audio_tokens`)) {
        UsageCompletionsResultObject[["output_audio_tokens"]] <-
          self$`output_audio_tokens`
      }
      if (!is.null(self$`num_model_requests`)) {
        UsageCompletionsResultObject[["num_model_requests"]] <-
          self$`num_model_requests`
      }
      if (!is.null(self$`project_id`)) {
        UsageCompletionsResultObject[["project_id"]] <-
          self$`project_id`
      }
      if (!is.null(self$`user_id`)) {
        UsageCompletionsResultObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`api_key_id`)) {
        UsageCompletionsResultObject[["api_key_id"]] <-
          self$`api_key_id`
      }
      if (!is.null(self$`model`)) {
        UsageCompletionsResultObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`batch`)) {
        UsageCompletionsResultObject[["batch"]] <-
          self$`batch`
      }
      return(UsageCompletionsResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageCompletionsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageCompletionsResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.completions.result"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.completions.result\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`input_tokens`)) {
        self$`input_tokens` <- this_object$`input_tokens`
      }
      if (!is.null(this_object$`input_cached_tokens`)) {
        self$`input_cached_tokens` <- this_object$`input_cached_tokens`
      }
      if (!is.null(this_object$`output_tokens`)) {
        self$`output_tokens` <- this_object$`output_tokens`
      }
      if (!is.null(this_object$`input_audio_tokens`)) {
        self$`input_audio_tokens` <- this_object$`input_audio_tokens`
      }
      if (!is.null(this_object$`output_audio_tokens`)) {
        self$`output_audio_tokens` <- this_object$`output_audio_tokens`
      }
      if (!is.null(this_object$`num_model_requests`)) {
        self$`num_model_requests` <- this_object$`num_model_requests`
      }
      if (!is.null(this_object$`project_id`)) {
        self$`project_id` <- this_object$`project_id`
      }
      if (!is.null(this_object$`user_id`)) {
        self$`user_id` <- this_object$`user_id`
      }
      if (!is.null(this_object$`api_key_id`)) {
        self$`api_key_id` <- this_object$`api_key_id`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`batch`)) {
        self$`batch` <- this_object$`batch`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UsageCompletionsResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageCompletionsResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageCompletionsResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.completions.result"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.completions.result\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`input_tokens` <- this_object$`input_tokens`
      self$`input_cached_tokens` <- this_object$`input_cached_tokens`
      self$`output_tokens` <- this_object$`output_tokens`
      self$`input_audio_tokens` <- this_object$`input_audio_tokens`
      self$`output_audio_tokens` <- this_object$`output_audio_tokens`
      self$`num_model_requests` <- this_object$`num_model_requests`
      self$`project_id` <- this_object$`project_id`
      self$`user_id` <- this_object$`user_id`
      self$`api_key_id` <- this_object$`api_key_id`
      self$`model` <- this_object$`model`
      self$`batch` <- this_object$`batch`
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageCompletionsResult and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UsageCompletionsResult: the required field `object` is missing."))
      }
      # check the required field `input_tokens`
      if (!is.null(input_json$`input_tokens`)) {
        if (!(is.numeric(input_json$`input_tokens`) && length(input_json$`input_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `input_tokens`. Must be an integer:", input_json$`input_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageCompletionsResult: the required field `input_tokens` is missing."))
      }
      # check the required field `output_tokens`
      if (!is.null(input_json$`output_tokens`)) {
        if (!(is.numeric(input_json$`output_tokens`) && length(input_json$`output_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `output_tokens`. Must be an integer:", input_json$`output_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageCompletionsResult: the required field `output_tokens` is missing."))
      }
      # check the required field `num_model_requests`
      if (!is.null(input_json$`num_model_requests`)) {
        if (!(is.numeric(input_json$`num_model_requests`) && length(input_json$`num_model_requests`) == 1)) {
          stop(paste("Error! Invalid data for `num_model_requests`. Must be an integer:", input_json$`num_model_requests`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageCompletionsResult: the required field `num_model_requests` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageCompletionsResult
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

      # check if the required `input_tokens` is null
      if (is.null(self$`input_tokens`)) {
        return(FALSE)
      }

      # check if the required `output_tokens` is null
      if (is.null(self$`output_tokens`)) {
        return(FALSE)
      }

      # check if the required `num_model_requests` is null
      if (is.null(self$`num_model_requests`)) {
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

      # check if the required `input_tokens` is null
      if (is.null(self$`input_tokens`)) {
        invalid_fields["input_tokens"] <- "Non-nullable required field `input_tokens` cannot be null."
      }

      # check if the required `output_tokens` is null
      if (is.null(self$`output_tokens`)) {
        invalid_fields["output_tokens"] <- "Non-nullable required field `output_tokens` cannot be null."
      }

      # check if the required `num_model_requests` is null
      if (is.null(self$`num_model_requests`)) {
        invalid_fields["num_model_requests"] <- "Non-nullable required field `num_model_requests` cannot be null."
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
# UsageCompletionsResult$unlock()
#
## Below is an example to define the print function
# UsageCompletionsResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageCompletionsResult$lock()

