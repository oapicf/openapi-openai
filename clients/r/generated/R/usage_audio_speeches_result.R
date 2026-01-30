#' Create a new UsageAudioSpeechesResult
#'
#' @description
#' The aggregated audio speeches usage details of the specific time bucket.
#'
#' @docType class
#' @title UsageAudioSpeechesResult
#' @description UsageAudioSpeechesResult Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field characters The number of characters processed. integer
#' @field num_model_requests The count of requests made to the model. integer
#' @field project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result. character [optional]
#' @field user_id When `group_by=user_id`, this field provides the user ID of the grouped usage result. character [optional]
#' @field api_key_id When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result. character [optional]
#' @field model When `group_by=model`, this field provides the model name of the grouped usage result. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
UsageAudioSpeechesResult <- R6::R6Class(
  "UsageAudioSpeechesResult",
  public = list(
    `object` = NULL,
    `characters` = NULL,
    `num_model_requests` = NULL,
    `project_id` = NULL,
    `user_id` = NULL,
    `api_key_id` = NULL,
    `model` = NULL,

    #' @description
    #' Initialize a new UsageAudioSpeechesResult class.
    #'
    #' @param object object
    #' @param characters The number of characters processed.
    #' @param num_model_requests The count of requests made to the model.
    #' @param project_id When `group_by=project_id`, this field provides the project ID of the grouped usage result.
    #' @param user_id When `group_by=user_id`, this field provides the user ID of the grouped usage result.
    #' @param api_key_id When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
    #' @param model When `group_by=model`, this field provides the model name of the grouped usage result.
    #' @param ... Other optional arguments.
    initialize = function(`object`, `characters`, `num_model_requests`, `project_id` = NULL, `user_id` = NULL, `api_key_id` = NULL, `model` = NULL, ...) {
      if (!missing(`object`)) {
        if (!(`object` %in% c("organization.usage.audio_speeches.result"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"organization.usage.audio_speeches.result\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`characters`)) {
        if (!(is.numeric(`characters`) && length(`characters`) == 1)) {
          stop(paste("Error! Invalid data for `characters`. Must be an integer:", `characters`))
        }
        self$`characters` <- `characters`
      }
      if (!missing(`num_model_requests`)) {
        if (!(is.numeric(`num_model_requests`) && length(`num_model_requests`) == 1)) {
          stop(paste("Error! Invalid data for `num_model_requests`. Must be an integer:", `num_model_requests`))
        }
        self$`num_model_requests` <- `num_model_requests`
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
    #' @return UsageAudioSpeechesResult as a base R list.
    #' @examples
    #' # convert array of UsageAudioSpeechesResult (x) to a data frame
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
    #' Convert UsageAudioSpeechesResult to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      UsageAudioSpeechesResultObject <- list()
      if (!is.null(self$`object`)) {
        UsageAudioSpeechesResultObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`characters`)) {
        UsageAudioSpeechesResultObject[["characters"]] <-
          self$`characters`
      }
      if (!is.null(self$`num_model_requests`)) {
        UsageAudioSpeechesResultObject[["num_model_requests"]] <-
          self$`num_model_requests`
      }
      if (!is.null(self$`project_id`)) {
        UsageAudioSpeechesResultObject[["project_id"]] <-
          self$`project_id`
      }
      if (!is.null(self$`user_id`)) {
        UsageAudioSpeechesResultObject[["user_id"]] <-
          self$`user_id`
      }
      if (!is.null(self$`api_key_id`)) {
        UsageAudioSpeechesResultObject[["api_key_id"]] <-
          self$`api_key_id`
      }
      if (!is.null(self$`model`)) {
        UsageAudioSpeechesResultObject[["model"]] <-
          self$`model`
      }
      return(UsageAudioSpeechesResultObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageAudioSpeechesResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageAudioSpeechesResult
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.audio_speeches.result"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.audio_speeches.result\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`characters`)) {
        self$`characters` <- this_object$`characters`
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
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return UsageAudioSpeechesResult in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of UsageAudioSpeechesResult
    #'
    #' @param input_json the JSON input
    #' @return the instance of UsageAudioSpeechesResult
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("organization.usage.audio_speeches.result"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"organization.usage.audio_speeches.result\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`characters` <- this_object$`characters`
      self$`num_model_requests` <- this_object$`num_model_requests`
      self$`project_id` <- this_object$`project_id`
      self$`user_id` <- this_object$`user_id`
      self$`api_key_id` <- this_object$`api_key_id`
      self$`model` <- this_object$`model`
      self
    },

    #' @description
    #' Validate JSON input with respect to UsageAudioSpeechesResult and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for UsageAudioSpeechesResult: the required field `object` is missing."))
      }
      # check the required field `characters`
      if (!is.null(input_json$`characters`)) {
        if (!(is.numeric(input_json$`characters`) && length(input_json$`characters`) == 1)) {
          stop(paste("Error! Invalid data for `characters`. Must be an integer:", input_json$`characters`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageAudioSpeechesResult: the required field `characters` is missing."))
      }
      # check the required field `num_model_requests`
      if (!is.null(input_json$`num_model_requests`)) {
        if (!(is.numeric(input_json$`num_model_requests`) && length(input_json$`num_model_requests`) == 1)) {
          stop(paste("Error! Invalid data for `num_model_requests`. Must be an integer:", input_json$`num_model_requests`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for UsageAudioSpeechesResult: the required field `num_model_requests` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of UsageAudioSpeechesResult
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

      # check if the required `characters` is null
      if (is.null(self$`characters`)) {
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

      # check if the required `characters` is null
      if (is.null(self$`characters`)) {
        invalid_fields["characters"] <- "Non-nullable required field `characters` cannot be null."
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
# UsageAudioSpeechesResult$unlock()
#
## Below is an example to define the print function
# UsageAudioSpeechesResult$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# UsageAudioSpeechesResult$lock()

